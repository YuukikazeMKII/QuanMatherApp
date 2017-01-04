package activity.zhidemaiactivity;

import android.os.Bundle;
import android.support.v7.widget.DefaultItemAnimator;
import android.support.v7.widget.LinearLayoutManager;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;
import com.superrecycleview.superlibrary.adapter.AnimationType;
import com.superrecycleview.superlibrary.recycleview.SuperRecyclerView;

import java.util.ArrayList;
import java.util.List;

import adpter.BrandDetailAdter;
import base.BaseActivity;
import base.BeanCallback;
import bean.BrandDetailBean;
import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;
import https.PaiXuHttps;
import interface1.BrandListPaiXuHttps;
import xiangcuntiandi.quanmather.R;

/**
 * Created by Administrator on 2016/12/31.
 */

public class BrandDetailActivity extends BaseActivity implements SuperRecyclerView.LoadingListener {
    @BindView(R.id.back_tital)
    ImageView backTital;
    @BindView(R.id.imv_sup_rc)
    SuperRecyclerView imvSupRc;
    BrandListPaiXuHttps brandListPaiXuHttps;
    @BindView(R.id.tv_tital)
    TextView tvTital;

    @Override
    public int getLayout() {
        return R.layout.branddetail_detail;
    }

    String catagory;
    List<BrandDetailBean.DataBean.PostlistBean> beanList = new ArrayList<>();
    BrandDetailAdter brandDetailAdter;
    String tital;

    @Override
    public void initView() {
        beanList.clear();
        brandDetailAdter = new BrandDetailAdter(this, beanList);
        brandListPaiXuHttps = new PaiXuHttps();
        catagory = getIntent().getStringExtra("category");
        tital = getIntent().getStringExtra("tital");
        LinearLayoutManager layoutManager = new LinearLayoutManager(this);
        imvSupRc.setLayoutManager(layoutManager);
        imvSupRc.setRefreshEnabled(true);
        imvSupRc.setLoadMoreEnabled(true);
        imvSupRc.setLoadingListener(this);
        imvSupRc.setAdapter(brandDetailAdter);
        brandDetailAdter.setShowItemAnimationEveryTime(true);
        brandDetailAdter.setItemAnimation(AnimationType.SLIDE_FROM_BOTTOM);
        doHttps(anInt);
        tvTital.setText(tital);
        addHeadView();
    }

    int anInt = 1;

    @Override
    public void onRefresh() {
        anInt++;
        doHttps(anInt);
    }

    @Override
    public void onLoadMore() {
        anInt++;
        doHttps(anInt);
    }
    public void doHttps(int i) {
        brandListPaiXuHttps.BrandDetailHttps(i, catagory, new BeanCallback<BrandDetailBean.DataBean>() {
            @Override
            public void onSuccess(BrandDetailBean.DataBean t) {
                beanList.clear();
                if (t != null) {
                    List<BrandDetailBean.DataBean.PostlistBean> postlist = t.getPostlist();
                    beanList.addAll(postlist);
                    brandDetailAdter.notifyDataSetChanged();
                    BrandDetailBean.DataBean.StoreinfoBean storeinfo = t.getStoreinfo();
                    String img = storeinfo.getBackground_img();
                    Glide.with(BrandDetailActivity.this).load(img).into(imageView);
                }
            }

            @Override
            public void onFinish() {
                imvSupRc.completeLoadMore();
                imvSupRc.completeRefresh();
            }
        });
    }

    ImageView imageView;

    private void addHeadView() {
        View headView = getLayoutInflater().inflate(R.layout.activity_ad_header_layout, (ViewGroup) imvSupRc.getParent(), false);
        imageView = (ImageView) headView.findViewById(R.id.imv_content);
        brandDetailAdter.addHeaderView(headView);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        // TODO: add setContentView(...) invocation
        ButterKnife.bind(this);
    }

    @OnClick(R.id.back_tital)
    public void onClick() {
        finish();
    }
}
