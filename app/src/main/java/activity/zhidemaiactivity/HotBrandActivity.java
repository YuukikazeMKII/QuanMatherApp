package activity.zhidemaiactivity;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.widget.DefaultItemAnimator;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.LinearLayoutManager;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.RelativeLayout;

import com.superrecycleview.superlibrary.adapter.AnimationType;
import com.superrecycleview.superlibrary.recycleview.SuperRecyclerView;

import java.util.ArrayList;
import java.util.List;

import adpter.BrandListAdpter;
import adpter.BrandListAdter;
import base.BaseActivity;
import base.BeanCallback;
import bean.BannerListBean;
import bean.ZuiYouHuiBean;
import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;
import https.ClassNameHttps;
import https.ZuiYouHuiHttp;
import interface1.ClassNameHttpInteface;
import wight.ScrollRecycle;
import xiangcuntiandi.quanmather.R;

/**
 * Created by Administrator on 2016/12/30.
 */

public class HotBrandActivity extends BaseActivity implements SuperRecyclerView.LoadingListener {
    @BindView(R.id.classhot)
    SuperRecyclerView classhot;
    @BindView(R.id.rl)
    RelativeLayout rl;
    ScrollRecycle scrollRecycle;
    BrandListAdter brandListAdter;
    @BindView(R.id.back_tital)
    ImageView backTital;
    private List<ZuiYouHuiBean.DataBean.RowsBean> list = new ArrayList<>();

    @Override
    public int getLayout() {
        return R.layout.hotbrandactivity;
    }

    String catagroy;
    BrandListAdpter brandListAdpter;
    ClassNameHttpInteface classNameHttpInteface;
    List<BannerListBean.DataBean.HotMallsBean> hotMallsBeen = new ArrayList<>();
    ZuiYouHuiHttp zuiYouHuiHttp;

    @Override
    public void initView() {
        list.clear();
        zuiYouHuiHttp = new ZuiYouHuiHttp();
        brandListAdter = new BrandListAdter(this, list);
        catagroy = getIntent().getStringExtra("cate");
        brandListAdpter = new BrandListAdpter(this);
        classNameHttpInteface = new ClassNameHttps();
        LinearLayoutManager layoutManager = new LinearLayoutManager(this);
        classhot.setLayoutManager(layoutManager);
        classhot.setRefreshEnabled(true);
        classhot.setLoadMoreEnabled(true);
        classhot.setLoadingListener(this);
        brandListAdter.setItemAnimation(AnimationType.SLIDE_FROM_LEFT);//设置显示的动画
        brandListAdter.setShowItemAnimationEveryTime(true);//
        doHttps(catagroy);
        addHeadView();
        classhot.setAdapter(brandListAdter);
        doContent(anInt, catagroy);
    }

    private void doHttps(String catagroy) {
        classNameHttpInteface.BrandListHttp(catagroy, new BeanCallback<List<BannerListBean.DataBean.HotMallsBean>>() {
            @Override
            public void onSuccess(List<BannerListBean.DataBean.HotMallsBean> t) {
                if (t != null) {
                    for (BannerListBean.DataBean.HotMallsBean hotMallsBean : t) {
                        Log.e("at22", "----------" + hotMallsBean.getImg());
                    }
                    hotMallsBeen.addAll(t);
                    brandListAdpter.setData(hotMallsBeen);
                    brandListAdpter.notifyDataSetChanged();
                }
            }

            @Override
            public void onFinish() {

            }
        });
    }

    // List<ZuiYouHuiBean.DataBean.RowsBean> rowsBeanList=new ArrayList<>();
    public void doContent(int id, String catagroy) {
        zuiYouHuiHttp.BrandListZd(id, catagroy, new BeanCallback<List<ZuiYouHuiBean.DataBean.RowsBean>>() {
            @Override
            public void onSuccess(List<ZuiYouHuiBean.DataBean.RowsBean> t) {
                if (t != null) {
                    list.addAll(t);
                    brandListAdter.notifyDataSetChanged();
                }
            }

            @Override
            public void onFinish() {
                classhot.completeRefresh();
                classhot.completeLoadMore();
            }
        });

    }

//    @OnClick(R.id.moreclass)
//    public void onClick() {
//        Intent intent = new Intent(HotBrandActivity.this, BrandListPaiXu.class);
//        startActivity(intent);
//    }

    int anInt = 1;

    private void addHeadView() {
        View headView = getLayoutInflater().inflate(R.layout.brandlistrecycleview, (ViewGroup) classhot.getParent(), false);
        scrollRecycle = (ScrollRecycle) headView.findViewById(R.id.sc_brand_list);
        scrollRecycle.setLayoutManager(new GridLayoutManager(this, 4));
        scrollRecycle.setAdapter(brandListAdpter);
        brandListAdter.addHeaderView(headView);
    }

    @Override
    public void onRefresh() {
        anInt++;
        doContent(anInt, catagroy);
    }

    @Override
    public void onLoadMore() {
        anInt++;
        doContent(anInt, catagroy);
    }




    @OnClick({R.id.back_tital, R.id.moreclass})
    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.back_tital:
                Intent inten=new Intent(HotBrandActivity.this, SearchActivity.class);
                startActivity(inten);
                break;
            case R.id.moreclass:
                Intent intent = new Intent(HotBrandActivity.this, BrandListPaiXu.class);
                startActivity(intent);
                break;
        }
    }
}
