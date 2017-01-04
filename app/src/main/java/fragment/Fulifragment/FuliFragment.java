package fragment.Fulifragment;

import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.superrecycleview.superlibrary.adapter.AnimationType;
import com.superrecycleview.superlibrary.recycleview.SuperRecyclerView;

import java.util.ArrayList;
import java.util.List;

import adpter.FuLiAdpter;
import adpter.FuliAdter;
import adpter.ZuiHuaSuanadpter1;
import base.BaseFragment;
import base.BeanCallback;
import bean.FuLiBean;
import bean.ZuiYouHuiBean;
import butterknife.BindView;
import butterknife.ButterKnife;
import https.FuLiHttps;
import interface1.FuLiInterface;
import xiangcuntiandi.quanmather.R;


/**
 * Created by Administrator on 2016/12/31.
 */

public class FuliFragment extends BaseFragment implements SuperRecyclerView.LoadingListener {

    @BindView(R.id.sc_brand_list)
    SuperRecyclerView scBrandList;

    public FuliFragment() {
        // Required empty public constructor
    }

    public static FuliFragment newInstance(String channelType) {
        FuliFragment fragment = new FuliFragment();
        Bundle args = new Bundle();
        args.putString("TYPE", channelType);
        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public int getLayout() {
        return R.layout.fulifragment;
    }
    FuLiAdpter adter;
    FuLiInterface fuLiInterface;
    @Override
    public void initdata() {
        fuLiInterface=new FuLiHttps();
        adter=new FuLiAdpter(getActivity(),rowsBeanList);
        LinearLayoutManager layoutManager = new LinearLayoutManager(getActivity());
        scBrandList.setLayoutManager(layoutManager);
        scBrandList.setRefreshEnabled(true);
        scBrandList.setLoadMoreEnabled(true);
        scBrandList.setLoadingListener(this);
        adter.setItemAnimation(AnimationType.SLIDE_FROM_LEFT);//设置显示的动画
        adter.setShowItemAnimationEveryTime(true);
        scBrandList.setAdapter(adter);
        if (getArguments() != null) {
          type = getArguments().getString("TYPE");

        }
        doHttps(1);

    }
    List<ZuiYouHuiBean.DataBean.RowsBean> rowsBeanList=new ArrayList<>();
   private String  type;
    private void doHttps(int i) {
        fuLiInterface.FULiDetail(i, type, new BeanCallback<List<ZuiYouHuiBean.DataBean.RowsBean>>() {
            @Override
            public void onSuccess(List<ZuiYouHuiBean.DataBean.RowsBean> t) {
                if (t!=null){
                    rowsBeanList.addAll(t);
                }
                adter.notifyDataSetChanged();
            }

            @Override
            public void onFinish() {
                scBrandList.completeLoadMore();
                scBrandList.completeRefresh();
            }
        });
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
