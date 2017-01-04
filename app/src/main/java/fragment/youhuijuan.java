package fragment;

import android.os.Bundle;
import android.support.design.widget.TabLayout;
import android.support.v4.app.Fragment;
import android.support.v4.view.ViewPager;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RelativeLayout;
import android.widget.TableLayout;

import java.util.ArrayList;
import java.util.List;

import adpter.MyPagerAdpter;
import adpter.YouHUiFragmentBrand;
import adpter.YouHUiFragmentQuanItem;
import base.BaseFragment;
import base.BeanCallback;
import bean.YouHuiFragmentBean;
import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;
import fragment.youhuiquanfragment.YouHuiFragment;
import fragment.youhuiquanfragment.YouHuiFragment1;
import fragment.zhidemaiFragment.guoneifragment;
import https.YouHuiQuanHt;
import interface1.YouHuiQuanHttps;
import wight.CircleImageView;
import wight.ScorllCallbackView;
import xiangcuntiandi.quanmather.R;

/**
 * Created by Administrator on 2016/12/27.
 */

public class youhuijuan extends BaseFragment {
    @BindView(R.id.civ)
    CircleImageView civ;
    @BindView(R.id.youhuiquan)
    RecyclerView youhuiquan;
    @BindView(R.id.rv)
    RecyclerView rv;
    @BindView(R.id.vp)
    ViewPager vp;
    @BindView(R.id.tb_layout)
    TabLayout tbLayoutInv;
    @BindView(R.id.rlv)
    RelativeLayout rlv;
    private List<YouHuiFragmentBean.DataBean.Section2Bean> list = new ArrayList<>();
    private List<YouHuiFragmentBean.DataBean.HotMallsBean> youlist = new ArrayList<>();
    private List<Fragment> listfragment=new ArrayList<>();
    private List<String> liststring=new ArrayList<>();

    @Override
    public int getLayout() {
        Log.e("at22", 3 + "");
        return R.layout.youhui_fragment1;
    }
    YouHUiFragmentQuanItem youHUiFragmentQuanItem;
    YouHUiFragmentBrand youHUiFragmentBrand;
    YouHuiQuanHttps youHuiQuanHttps;
    int bottom;

    @Override
    public void initdata() {

        youHuiQuanHttps = new YouHuiQuanHt();
        youHUiFragmentQuanItem = new YouHUiFragmentQuanItem(getActivity(), list);
        youHUiFragmentBrand = new YouHUiFragmentBrand(getActivity(), youlist);
        youhuiquan.setLayoutManager(new GridLayoutManager(getActivity(), 2));
        rv.setLayoutManager(new GridLayoutManager(getActivity(), 4));
        youhuiquan.setAdapter(youHUiFragmentQuanItem);
        rv.setAdapter(youHUiFragmentBrand);
        initFrgment();
        vp.setAdapter(new MyPagerAdpter(getFragmentManager(),listfragment,liststring));
        tbLayoutInv.setupWithViewPager(vp);
        doHttps();
    }
    private void initFrgment() {
      liststring.add("精选");
      liststring.add("网购");
      liststring.add("打车出租");
      liststring.add("外卖");
      liststring.add("电影票");
      liststring.add("旅游酒店");
      listfragment.add(YouHuiFragment1.newInstance("1001"));
      listfragment.add(YouHuiFragment1.newInstance("100101"));
      listfragment.add(YouHuiFragment1.newInstance("10010201"));
      listfragment.add(YouHuiFragment1.newInstance("10010202"));
      listfragment.add(YouHuiFragment1.newInstance("10010203"));
      listfragment.add(YouHuiFragment1.newInstance("10010204"));

    }

    ArrayList<String> imglist = new ArrayList<>();


    List<YouHuiFragmentBean.DataBean.HotYouhuiBean> hotYouhuiBeen=new ArrayList<>();
    public void doHttps() {
        youHuiQuanHttps.YouHuiQuanHttps(new BeanCallback<YouHuiFragmentBean.DataBean>() {
            @Override
            public void onSuccess(YouHuiFragmentBean.DataBean t) {
                if (t != null) {
                    List<YouHuiFragmentBean.DataBean.Section2Bean> section2 = t.getSection2();
                    list.addAll(section2);
                    youHUiFragmentQuanItem.notifyDataSetChanged();
                    List<YouHuiFragmentBean.DataBean.HotMallsBean> hot_malls = t.getHot_malls();
                    for (YouHuiFragmentBean.DataBean.HotMallsBean hot_mall : hot_malls) {
                        String img = hot_mall.getImg();
                        Log.e("at22", img);
                    }
                    youlist.addAll(hot_malls);
                    youHUiFragmentBrand.notifyDataSetChanged();
                    List<YouHuiFragmentBean.DataBean.RowsBean> rows = t.getRows();
                    for (YouHuiFragmentBean.DataBean.RowsBean row : rows) {
                        String banner_pic = row.getBanner_pic();
                        imglist.add(banner_pic);
                    }
                    civ.setImageResources(imglist, 0);

                    List<YouHuiFragmentBean.DataBean.HotYouhuiBean> hot_youhui = t.getHot_youhui();
                    hotYouhuiBeen.addAll(hot_youhui);
                    for (YouHuiFragmentBean.DataBean.HotYouhuiBean hotYouhuiBean : hot_youhui) {
                        String banner_title = hotYouhuiBean.getBanner_title();
                        liststring.add(banner_title);
                    }

                }
            }

            @Override
            public void onFinish() {

            }
        });
    }
    @OnClick(R.id.back_tital)
    public void onClick() {
    }
}
