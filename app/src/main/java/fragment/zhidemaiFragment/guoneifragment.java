package fragment.zhidemaiFragment;

import android.os.Bundle;
import android.support.v4.widget.SwipeRefreshLayout;
import android.support.v7.widget.DefaultItemAnimator;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.LinearLayoutManager;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.widget.ScrollView;

import com.superrecycleview.superlibrary.adapter.AnimationType;
import com.superrecycleview.superlibrary.recycleview.SuperRecyclerView;

import java.util.ArrayList;
import java.util.List;

import adpter.ZuiHuaShuanAdter;
import adpter.ZuiHuaSuanadpter1;
import base.BaseFragment;
import base.BeanCallback;
import bean.BannerAdsBean;
import bean.ZuiYouHuiBean;
import butterknife.BindView;
import butterknife.ButterKnife;
import https.ZuiYouHuiHttp;
import interface1.ZuiYouHui;
import utils.ImageCycleView1;
import utils.RefreshRecyclerView;
import wight.CircleImageView;
import wight.ScrollRecycle;
import xiangcuntiandi.quanmather.R;

/**
 * Created by Administrator on 2016/12/28.
 */

public class guoneifragment extends BaseFragment implements SwipeRefreshLayout.OnRefreshListener, SuperRecyclerView.LoadingListener {

    @BindView(R.id.rv)
    SuperRecyclerView rv;
    public guoneifragment() {
        // Required empty public constructor
    }
    public static guoneifragment newInstance(String channelType, String YouHuiID, int id) {
        guoneifragment fragment = new guoneifragment();
        Bundle args = new Bundle();
        args.putString("TYPE", channelType);
        args.putString("YOUHUIID", YouHuiID);
        args.putInt("ID", id);
        fragment.setArguments(args);
        return fragment;
    }

    List<ZuiYouHuiBean.DataBean.RowsBean> list = new ArrayList<>();
    private ZuiYouHui zuiYouHui;
    ZuiHuaSuanadpter1 zuiHuaSuanadpter1;

    {
        zuiYouHui = new ZuiYouHuiHttp();
    }

    @Override
    public int getLayout() {
        return R.layout.guoneifragment;
    }

    private String type;
    private String youhuiID;
    private int id;

    @Override
    public void initdata() {
        list.clear();
        zuiHuaSuanadpter1=new ZuiHuaSuanadpter1(getActivity(),list);
        rv.setLayoutManager(new LinearLayoutManager(getActivity()));
        LinearLayoutManager layoutManager = new LinearLayoutManager(getActivity());
        rv.setLayoutManager(layoutManager);
        rv.setRefreshEnabled(true);
        rv.setLoadMoreEnabled(true);
        rv.setLoadingListener(this);
        zuiHuaSuanadpter1.setItemAnimation(AnimationType.SLIDE_FROM_BOTTOM);//设置显示的动画
        zuiHuaSuanadpter1.setShowItemAnimationEveryTime(true);
        rv.setAdapter(zuiHuaSuanadpter1);
        if (getArguments() != null) {
            type = getArguments().getString("TYPE");
            youhuiID = getArguments().getString("YOUHUIID");
            id = getArguments().getInt("ID");
        }
      doHttpFrgment();
    }

    private void doHttps(int pageindex, String youHuiType, String identifier) {
        zuiYouHui.ZuiYouHui(pageindex, youHuiType, identifier, new BeanCallback<List<ZuiYouHuiBean.DataBean.RowsBean>>() {
            @Override
            public void onSuccess(List<ZuiYouHuiBean.DataBean.RowsBean> t) {
                for (ZuiYouHuiBean.DataBean.RowsBean rowsBean : t) {
                    String article_title = rowsBean.getArticle_title();
                    Log.e("at22", article_title);
                }
                list.addAll(t);
                zuiHuaSuanadpter1.notifyDataSetChanged();
            }

            @Override
            public void onFinish() {
                rv.completeLoadMore();
                rv.completeRefresh();
            }
        });
    }

    CircleImageView circleImageView;

    private void addHeadView() {
        View headView = getActivity().getLayoutInflater().inflate(R.layout.addcircimage_zhi, (ViewGroup) rv.getParent(), false);
        circleImageView= (CircleImageView) headView.findViewById(R.id.civ);
        zuiHuaSuanadpter1.addHeaderView(headView);
    }

    int i = 1;

    @Override
    public void onRefresh() {
        i++;
        doHttpsImv();
        doHttpFrgment();
    }
   private ArrayList<String> listString=new ArrayList<>();
    private void doHttpsImv() {

        zuiYouHui.BrandAdsHttps(new BeanCallback<List<BannerAdsBean.DataBean.RowsBean>>() {
            @Override
            public void onSuccess(List<BannerAdsBean.DataBean.RowsBean> t) {
                listString.clear();
                if (t!=null){
                    for (BannerAdsBean.DataBean.RowsBean rowsBean : t) {
                        String banner_pic = rowsBean.getBanner_pic();
                        listString.add(banner_pic);
                        Log.e("at22",banner_pic);
                    }
                    circleImageView.setImageResources(listString,0);
                }

            }
            @Override
            public void onFinish() {

            }
        });
    }

    @Override
    public void onLoadMore() {
        i++;
        doHttpFrgment();
    }


   public void doHttpFrgment(){
       if (youhuiID.equals("1101")) {
           addHeadView();
           doHttpsImv();
           doHttps(i, youhuiID, type);
       }
       if (youhuiID.equals("110101")) {
           doHttps(i, youhuiID, type);

       }
       if (youhuiID.equals("110102")) {
           doHttps(i, youhuiID, type);

       }
       if (youhuiID.equals("11102")) {
           doHttps(i, youhuiID, type);

       }
       if (youhuiID.equals("110103")) {
           doHttps(i, youhuiID, type);
       }
   };
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        // TODO: inflate a fragment view
        View rootView = super.onCreateView(inflater, container, savedInstanceState);
        ButterKnife.bind(this, rootView);
        return rootView;
    }

}
