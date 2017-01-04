package fragment.zhidemaiFragment;

import android.os.Bundle;
import android.support.v4.widget.SwipeRefreshLayout;
import android.support.v7.widget.DefaultItemAnimator;
import android.support.v7.widget.LinearLayoutManager;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.superrecycleview.superlibrary.adapter.AnimationType;
import com.superrecycleview.superlibrary.recycleview.SuperRecyclerView;

import java.util.ArrayList;
import java.util.List;

import adpter.ZuiHuaShuanAdter;
import adpter.ZuiHuaSuanadpter1;
import base.BaseFragment;
import base.BeanCallback;
import bean.ZuiYouHuiBean;
import butterknife.BindView;
import butterknife.ButterKnife;
import https.ClassNameHttps;
import https.ZuiYouHuiHttp;
import interface1.ClassNameHttpInteface;
import interface1.ZuiYouHui;
import utils.ImageCycleView1;
import utils.RefreshRecyclerView;
import wight.CircleImageView;
import xiangcuntiandi.quanmather.R;

/**
 * Created by Administrator on 2016/12/28.
 */

public class SearchFragment extends BaseFragment implements  SuperRecyclerView.LoadingListener {
    @BindView(R.id.rv)
    SuperRecyclerView rv;


    public SearchFragment() {
        // Required empty public constructor
    }
    public static SearchFragment newInstance(String channelType, String YouHuiID, int id) {
        SearchFragment fragment = new SearchFragment();
        Bundle args = new Bundle();
        args.putString("TYPE", channelType);
        args.putString("YOUHUIID", YouHuiID);
        args.putInt("ID", id);
        fragment.setArguments(args);
        return fragment;
    }

    List<ZuiYouHuiBean.DataBean.RowsBean> list = new ArrayList<>();
    private ClassNameHttpInteface zuiYouHui;
    {
        zuiYouHui = new ClassNameHttps();
    }
    ZuiHuaSuanadpter1 zuiHuaSuanadpter1;
    @Override
    public int getLayout() {
        return R.layout.guoneifragment;
    }

    private String type;
    private String youhuiID;
    private int id;
    String category;
    String cate;
    @Override
    public void initdata() {
        list.clear();
        category = getActivity().getIntent().getStringExtra("category");
        cate= getActivity().getIntent().getStringExtra("cate");
        list.clear();
        zuiHuaSuanadpter1=new ZuiHuaSuanadpter1(getActivity(),list);
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
doHttpFrgment(i);
    }

    private void doHttps(int pageindex, String youHuiType, String identifier) {
        zuiYouHui.ClassSearchHttp(pageindex, youHuiType, identifier, new BeanCallback<List<ZuiYouHuiBean.DataBean.RowsBean>>() {
            @Override
            public void onSuccess(List<ZuiYouHuiBean.DataBean.RowsBean> t) {
                for (ZuiYouHuiBean.DataBean.RowsBean rowsBean : t) {
                    String article_title = rowsBean.getArticle_title();
                    Log.e("at22", article_title);
                }
                list.addAll(t);
               zuiHuaSuanadpter1.notifyDataSetChanged();

                //设置新数据
            }

            @Override
            public void onFinish() {
                rv.completeLoadMore();
                rv.completeRefresh();
            }
        });

    }

    public void doKeyHttps(int pageindex, String youHuiType, String identifier){

        zuiYouHui.ClassSearchKeyHttp(pageindex, youHuiType, identifier, new BeanCallback<List<ZuiYouHuiBean.DataBean.RowsBean>>() {
            @Override
            public void onSuccess(List<ZuiYouHuiBean.DataBean.RowsBean> t) {
                for (ZuiYouHuiBean.DataBean.RowsBean rowsBean : t) {
                    String article_title = rowsBean.getArticle_title();
                    Log.e("at22", article_title);
                }
                list.addAll(t);
                zuiHuaSuanadpter1.notifyDataSetChanged();
                //设置新数据
            }

            @Override
            public void onFinish() {
                rv.completeLoadMore();
                rv.completeRefresh();
            }
        });
    }
    int i = 1;
    @Override
    public void onRefresh() {
        i++;
        doHttpFrgment(i);
    }

    @Override
    public void onLoadMore() {
        i++;
          doHttpFrgment(i);
    }
   public void doHttpFrgment(int i){
       if (youhuiID.equals("10")){
           if (cate!=null&&cate.length()>0){
               doKeyHttps(i,cate ,youhuiID);
           }else {
               doHttps(i,category ,youhuiID);
           }


       }
       if (youhuiID.equals("1101")) {
           if (cate!=null&&cate.length()>0){
               doKeyHttps(i,cate ,youhuiID);
           }else {
               doHttps(i,category ,youhuiID);
           }


       }
       if (youhuiID.equals("110101")) {
           if (cate!=null&&cate.length()>0){
               doKeyHttps(i,cate ,youhuiID);
           }else {
               doHttps(i,category ,youhuiID);
           }


       }
       if (youhuiID.equals("110102")) {
           if (cate!=null&&cate.length()>0){
               doKeyHttps(i,cate ,youhuiID);
           }else {
               doHttps(i,category ,youhuiID);
           }


       }
       if (youhuiID.equals("11102")) {
           if (cate!=null&&cate.length()>0){
               doKeyHttps(i,cate ,youhuiID);
           }else {
               doHttps(i,category ,youhuiID);
           }


       }
       if (youhuiID.equals("110103")) {
           if (cate!=null&&cate.length()>0){
               doKeyHttps(i,cate ,youhuiID);
           }else {
               doHttps(i,category ,youhuiID);
           }
       }
   };
}
