package fragment;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.widget.LinearLayoutManager;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.superrecycleview.superlibrary.adapter.AnimationType;
import com.superrecycleview.superlibrary.recycleview.SuperRecyclerView;

import java.util.ArrayList;
import java.util.List;

import adpter.FuliAdter;
import base.BaseFragment;
import base.BeanCallback;
import bean.FuLiBean;
import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;
import https.FuLiHttps;
import interface1.FuLiInterface;
import xiangcuntiandi.quanmather.R;

/**
 * Created by Administrator on 2016/12/27.
 */

public class fuli extends BaseFragment implements SuperRecyclerView.LoadingListener {
    @BindView(R.id.imv_sup_rc)
    SuperRecyclerView imvSupRc;
    private List<FuLiBean.DataBean.RowsBean> listbean=new ArrayList<>();

    @Override
    public int getLayout() {
        return R.layout.fuli_activity;
    }
    FuliAdter fuliAdter;
    @Override
    public void initdata() {
        fuLiInterface=new FuLiHttps();
        fuliAdter=new FuliAdter(getActivity(),listbean);
        LinearLayoutManager layoutManager = new LinearLayoutManager(getActivity());
        imvSupRc.setLayoutManager(layoutManager);
        imvSupRc.setRefreshEnabled(true);
        imvSupRc.setLoadMoreEnabled(true);
        imvSupRc.setLoadingListener(this);
        imvSupRc.setAdapter(fuliAdter);
        fuliAdter.setShowItemAnimationEveryTime(true);
        fuliAdter.setItemAnimation(AnimationType.SLIDE_FROM_BOTTOM);
        doHttps(1);
    }

    private void doHttps(int i) {
           fuLiInterface.FuLiHttps(i, "fuli", new BeanCallback<List<FuLiBean.DataBean.RowsBean>>() {
               @Override
               public void onSuccess(List<FuLiBean.DataBean.RowsBean> t) {
                   if (t!=null){
                       listbean.addAll(t);
                       fuliAdter.notifyDataSetChanged();
                   }
               }

               @Override
               public void onFinish() {
                    imvSupRc.completeRefresh();
                    imvSupRc.completeLoadMore();
               }
           });
    }

    @Override
    public void onViewCreated(View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

    }
    FuLiInterface fuLiInterface;
    @OnClick(R.id.back_tital)
    public void onClick() {
    }
int anInt=1;
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

}
