package fragment.youhuiquanfragment;

import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import com.superrecycleview.superlibrary.adapter.AnimationType;
import com.superrecycleview.superlibrary.recycleview.SuperRecyclerView;

import java.util.ArrayList;
import java.util.List;

import adpter.YouHuiQuanAdpter1;
import adpter.ZuiHuaSuanadpter1;
import base.BaseFragment;
import base.BeanCallback;
import bean.YouHuiBean;
import bean.ZuiYouHuiBean;
import butterknife.BindView;
import butterknife.ButterKnife;
import https.YouHuiQuanHt;
import interface1.YouHuiQuanHttps;
import utils.FullyLinearLayoutManager;
import wight.ScollListView;
import xiangcuntiandi.quanmather.R;

/**
 * Created by Administrator on 2017/1/3.
 */

public class YouHuiFragment extends BaseFragment implements SuperRecyclerView.LoadingListener {
    @BindView(R.id.lv)
    SuperRecyclerView lv;
    private List<YouHuiBean.DataBean.RowsBean> list=new ArrayList<>();

    public YouHuiFragment() {
        // Required empty public constructor
    }

    public static YouHuiFragment newInstance(String YouHuiID) {
        YouHuiFragment fragment = new YouHuiFragment();
        Bundle args = new Bundle();
        args.putString("YOUHUIID", YouHuiID);
        fragment.setArguments(args);
        return fragment;
    }
    YouHuiQuanAdpter1 zuiHuaSuanadpter1;
    YouHuiQuanHttps youHuiQuanHttps;
    @Override
    public int getLayout() {
        return R.layout.youhuiquanfragment;
    }
     String type;
    @Override
    public void initdata() {
        zuiHuaSuanadpter1=new YouHuiQuanAdpter1(getActivity(),list);
        youHuiQuanHttps=new YouHuiQuanHt();
        lv.setLayoutManager(new FullyLinearLayoutManager(getActivity()));
      //  LinearLayoutManager layoutManager = new LinearLayoutManager(getActivity());
    //    lv.setLayoutManager(layoutManager);
        lv.setRefreshEnabled(true);
        lv.setLoadMoreEnabled(true);
        lv.setLoadingListener(this);
        zuiHuaSuanadpter1.setItemAnimation(AnimationType.SLIDE_FROM_BOTTOM);//设置显示的动画
        zuiHuaSuanadpter1.setShowItemAnimationEveryTime(true);
        if (getArguments() != null) {
            type = getArguments().getString("YOUHUIID");
            Log.e("at22",type);
        }
        dohttps(i);
        Log.e("at22",2+"");
    }

    int i=1;
    private void dohttps(int i) {
        youHuiQuanHttps.DoYouHuiHttps(i, type, new BeanCallback<List<YouHuiBean.DataBean.RowsBean>>() {
            @Override
            public void onSuccess(List<YouHuiBean.DataBean.RowsBean> t) {
                if (t!=null){
                    list.addAll(t);
                    for (YouHuiBean.DataBean.RowsBean rowsBean : t) {
                        Log.e("at22",rowsBean.getArticle_title());
                    }
                    zuiHuaSuanadpter1.notifyDataSetChanged();
                    lv.setAdapter(zuiHuaSuanadpter1);
                }
            }

            @Override
            public void onFinish() {

                lv.completeRefresh();
                lv.completeLoadMore();
            }
        });
    }


    @Override
    public void onRefresh() {

        i++;
        dohttps(i);
    }

    @Override
    public void onLoadMore() {

        i++;
        dohttps(i);
    }
}
