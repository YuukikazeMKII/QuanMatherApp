package fragment;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.StaggeredGridLayoutManager;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;
import com.superrecycleview.superlibrary.adapter.AnimationType;
import com.superrecycleview.superlibrary.recycleview.SuperRecyclerView;

import java.util.ArrayList;
import java.util.List;

import activity.HomeActivity.HomeWebActivity;
import activity.zhidemaiactivity.ZhiDeMaiActivity;
import activity.zhidemaiactivity.ZhiDeMaiLinkActivity;
import adpter.FuLiAdpter;
import adpter.HomeFragmentRc;
import adpter.HomeFragmentRc1;
import adpter.HomeFragmentRc2;
import adpter.HomeFragmentRc3;
import base.BaseFragment;
import base.BeanCallback;
import bean.HomeBean;
import bean.ZuiYouHuiBean;
import butterknife.BindView;
import butterknife.ButterKnife;
import https.HomePageHttps;
import interface1.HomePageParamesHttp;
import marqueeview.MarqueeView;
import utils.LooperTextView;
import wight.CircleImageView;
import xiangcuntiandi.quanmather.R;

/**
 * Created by Administrator on 2016/12/27.
 */

public class homefragment extends BaseFragment implements SuperRecyclerView.LoadingListener, CircleImageView.ImageCycleViewListener {
    @BindView(R.id.tv_tital)
    TextView tvTital;
    @BindView(R.id.back_tital)
    ImageView backTital;
    CircleImageView civ;
    RecyclerView youhuiquan;
    MarqueeView ltv;
    ImageView imvBrand;
    RecyclerView rvw;
    RecyclerView rvw1;
    @BindView(R.id.srv)
    SuperRecyclerView srv;
    HomePageParamesHttp homePageParamesHttp;
    ArrayList<String> list=new ArrayList<>();
    HomeFragmentRc homeFragmentRc;
    HomeFragmentRc1 homeFragmentRc1;
    private List<HomeBean.DataBean.GuidCategoryBean> listrc=new ArrayList<>();
    private List<HomeBean.DataBean.Section1Bean> liatsec=new ArrayList<>();
    List<HomeBean.DataBean.Section2Bean> section2Been=new ArrayList<>();
    HomeFragmentRc2 homeFragmentRc2;

    @Override
    public int getLayout() {
        Log.e("at22", 1 + "");
        return R.layout.home1_fragment;
    }

    List<String> looplist=new ArrayList<>();

private FuLiAdpter fuLiAdpter;
    @Override
    public void initdata() {
        rowsBeanList.clear();
        homePageParamesHttp=new HomePageHttps();
        homeFragmentRc=new HomeFragmentRc(getActivity(),listrc);
        homeFragmentRc1 =new HomeFragmentRc1(getActivity(),liatsec);
        homeFragmentRc2=new HomeFragmentRc2(getActivity(),section2Been);
        fuLiAdpter=new FuLiAdpter(getActivity(),rowsBeanList);
        doHttps();
        addHeadView();
        LinearLayoutManager layoutManager = new LinearLayoutManager(getActivity());
        srv.setLayoutManager(layoutManager);
        srv.setRefreshEnabled(true);
        srv.setLoadMoreEnabled(true);
        srv.setLoadingListener(this);
        fuLiAdpter.setItemAnimation(AnimationType.SLIDE_FROM_LEFT);//设置显示的动画
        fuLiAdpter.setShowItemAnimationEveryTime(true);
        srv.setAdapter(fuLiAdpter);
        DoHttpDetailList(anInt);
    }
    int anInt=1;
    List<HomeBean.DataBean.RowsBean> rows=new ArrayList<>();
    public void doHttps(){
        homePageParamesHttp.HomePageHttp(new BeanCallback<HomeBean.DataBean>() {
            @Override
            public void onSuccess(HomeBean.DataBean t) {
                listrc.clear();
                liatsec.clear();
                if (t!=null){
                    rows = t.getRows();
                    for (HomeBean.DataBean.RowsBean section2Bean : rows) {
                        String banner_pic = section2Bean.getBanner_pic();
                        list.add(banner_pic);
                    }
                    civ.setImageResources(list,0);

                    List<HomeBean.DataBean.GuidCategoryBean> guid_category = t.getGuid_category();
                    listrc.addAll(guid_category);
                    homeFragmentRc.notifyDataSetChanged();

                    List<HomeBean.DataBean.WelfareBulletinBean> welfare_bulletin = t.getWelfare_bulletin();
                    for (HomeBean.DataBean.WelfareBulletinBean welfareBulletinBean : welfare_bulletin) {
                        String banner_title = welfareBulletinBean.getBanner_title();
                        looplist.add(banner_title);
                        Log.e("at22",banner_title);
                    }
                    ltv.startWithList(looplist);
                    List<HomeBean.DataBean.NewUserBean> new_user = t.getNew_user();
                    HomeBean.DataBean.NewUserBean newUserBean = new_user.get(0);
                    String banner_pic = newUserBean.getBanner_pic();
                    Glide.with(getActivity()).load(banner_pic).into(imvBrand);

                    List<HomeBean.DataBean.Section1Bean> section1 = t.getSection1();
                    liatsec.addAll(section1);
                    homeFragmentRc1.notifyDataSetChanged();
                    List<HomeBean.DataBean.Section2Bean> section21 = t.getSection2();

                    for (int i=1;i<section21.size();i++){
                        section2Been.add(section21.get(i));
                    }

                    homeFragmentRc2.notifyDataSetChanged();
                 //   HomeBean.DataBean.Section2Bean section2Bean = section21.get(0);
                    List<HomeBean.DataBean.LittleBannerBean> little_banner = t.getLittle_banner();

                }
            }

            @Override
            public void onFinish() {

            }
        });
    };
    private void addHeadView() {
        View headView = getActivity().getLayoutInflater().inflate(R.layout.homefragment, (ViewGroup) srv.getParent(), false);
         civ= (CircleImageView) headView.findViewById(R.id.civ);
        youhuiquan= (RecyclerView) headView.findViewById(R.id.youhuiquan);
        ltv= (MarqueeView) headView.findViewById(R.id.ltv);
     //   ltv.setTipList(looplist);
        imvBrand= (ImageView) headView.findViewById(R.id.imv_brand);
        rvw= (RecyclerView) headView.findViewById(R.id.rvw);
        rvw1= (RecyclerView) headView.findViewById(R.id.rvw1);
        youhuiquan.setLayoutManager(new GridLayoutManager(getActivity(),5));
        youhuiquan.setAdapter(homeFragmentRc);
        rvw.setLayoutManager(new GridLayoutManager(getActivity(),3));
        rvw1.setLayoutManager(new GridLayoutManager(getActivity(),2));
        rvw.setAdapter(homeFragmentRc1);
        rvw1.setAdapter(homeFragmentRc2);
        civ.setOnCheckedChanged(this);
        fuLiAdpter.addHeaderView(headView);
    }
    private List<ZuiYouHuiBean.DataBean.RowsBean> rowsBeanList=new ArrayList<>();
    public void DoHttpDetailList(int i){
        homePageParamesHttp.HomeDetailRcHttp(i, "home", new BeanCallback<List<ZuiYouHuiBean.DataBean.RowsBean>>() {
            @Override
            public void onSuccess(List<ZuiYouHuiBean.DataBean.RowsBean> t) {
                if (t!=null){
                    rowsBeanList.addAll(t);
                    fuLiAdpter.notifyDataSetChanged();
                }
            }

            @Override
            public void onFinish() {
                srv.completeRefresh();
                srv.completeLoadMore();
            }
        });
    }

    @Override
    public void onRefresh() {
        anInt++;
        DoHttpDetailList(anInt);
    }

    @Override
    public void onLoadMore() {
             anInt++;
        DoHttpDetailList(anInt);
    }

    @Override
    public void onImageClick(int position, View imageView) {
        String sub_type = rows.get(position).getSub_type();

        if (sub_type.equals("web")){
            Intent intent=new Intent(getActivity(), HomeWebActivity.class);
            intent.putExtra("web",rows.get(position).getSub_value());
            startActivity(intent);
        }else {
            Intent intent=new Intent(getActivity(), ZhiDeMaiActivity.class);
            intent.putExtra("goodsId",Integer.parseInt(rows.get(position).getSub_value()));
            startActivity(intent);
        }
    }
}
