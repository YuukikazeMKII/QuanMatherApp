package fragment.youhuiquanfragment;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.superrecycleview.superlibrary.adapter.AnimationType;
import com.superrecycleview.superlibrary.recycleview.SuperRecyclerView;

import java.util.ArrayList;
import java.util.List;

import adpter.YouHuiQuanAdpter1;
import base.BaseFragment;
import base.BeanCallback;
import bean.YouHuiBean;
import butterknife.BindView;
import https.YouHuiQuanHt;
import interface1.YouHuiQuanHttps;
import utils.FullyLinearLayoutManager;
import xiangcuntiandi.quanmather.R;

/**
 * Created by Administrator on 2017/1/3.
 */

public class YouHuiFragment1 extends Fragment implements SuperRecyclerView.LoadingListener {

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view=View.inflate(getActivity(),R.layout.youhuiquanfragment,null);
        lv= (SuperRecyclerView) view.findViewById(R.id.lv);
        initdata();
        return view;
    }


    SuperRecyclerView lv ;
    private List<YouHuiBean.DataBean.RowsBean> list=new ArrayList<>();

    public YouHuiFragment1() {
        // Required empty public constructor
    }

    public static YouHuiFragment1 newInstance(String YouHuiID) {
        YouHuiFragment1 fragment = new YouHuiFragment1();
        Bundle args = new Bundle();
        args.putString("YOUHUIID", YouHuiID);
        fragment.setArguments(args);
        return fragment;
    }
    YouHuiQuanAdpter1 zuiHuaSuanadpter1;
    YouHuiQuanHttps youHuiQuanHttps;
     String type;
    public void initdata() {
        zuiHuaSuanadpter1=new YouHuiQuanAdpter1(getActivity(),list);
        youHuiQuanHttps=new YouHuiQuanHt();
        lv.setLayoutManager(new LinearLayoutManager(getActivity()));
      //  LinearLayoutManager layoutManager = new LinearLayoutManager(getActivity());
    //    lv.setLayoutManager(layoutManager);
        lv.setRefreshEnabled(true);
        lv.setLoadMoreEnabled(true);
        lv.setLoadingListener(this);
        zuiHuaSuanadpter1.setItemAnimation(AnimationType.SLIDE_FROM_BOTTOM);//设置显示的动画
        zuiHuaSuanadpter1.setShowItemAnimationEveryTime(true);
        if (getArguments() != null) {
            type = getArguments().getString("YOUHUIID");
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
