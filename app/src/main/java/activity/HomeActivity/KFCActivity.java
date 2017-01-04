package activity.HomeActivity;

import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;

import com.superrecycleview.superlibrary.adapter.AnimationType;
import com.superrecycleview.superlibrary.recycleview.SuperRecyclerView;

import java.util.ArrayList;
import java.util.List;

import adpter.FuLiAdpter;
import adpter.HomeFragmentRc;
import adpter.HomeFragmentRc1;
import adpter.HomeFragmentRc2;
import adpter.KFCAdter;
import base.BaseActivity;
import base.BeanCallback;
import bean.KFCBean;
import butterknife.BindView;
import butterknife.ButterKnife;
import https.HomePageHttps;
import interface1.HomePageParamesHttp;
import xiangcuntiandi.quanmather.R;

/**
 * Created by Administrator on 2017/1/3.
 */

public class KFCActivity extends BaseActivity implements SuperRecyclerView.LoadingListener {
    HomePageParamesHttp homePageParamesHttp;
    @BindView(R.id.kfc_activity)
    SuperRecyclerView kfcActivity;
    KFCAdter adter;
    private List<KFCBean.DataBean.RowsBean> list=new ArrayList<>();

    @Override
    public int getLayout() {
        return R.layout.kfc_activity;
    }

    @Override
    public void initView() {
        homePageParamesHttp = new HomePageHttps();
        adter=new KFCAdter(this,list);
        LinearLayoutManager layoutManager = new LinearLayoutManager(this);
        kfcActivity.setLayoutManager(layoutManager);
        kfcActivity.setRefreshEnabled(true);
        kfcActivity.setLoadMoreEnabled(true);
        kfcActivity.setLoadingListener(this);
        adter.setItemAnimation(AnimationType.SLIDE_FROM_LEFT);//设置显示的动画
        adter.setShowItemAnimationEveryTime(true);
        kfcActivity.setAdapter(adter);
        doHttps();
    }
    public void doHttps(){
        homePageParamesHttp.KFCHttp(new BeanCallback<List<KFCBean.DataBean.RowsBean>>() {
            @Override
            public void onSuccess(List<KFCBean.DataBean.RowsBean> t) {
                if (t!=null){
                    list.addAll(t);

                    adter.notifyDataSetChanged();
                }
            }

            @Override
            public void onFinish() {
                kfcActivity.completeLoadMore();
                kfcActivity.completeRefresh();
            }
        });
    }

    @Override
    public void onRefresh() {

    }

    @Override
    public void onLoadMore() {

    }
}
