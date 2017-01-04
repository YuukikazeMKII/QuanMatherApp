package activity.FuLiActivity;

import android.os.Bundle;
import android.support.design.widget.TabLayout;
import android.support.v4.app.Fragment;
import android.support.v4.view.ViewPager;

import java.util.ArrayList;
import java.util.List;

import adpter.MyPagerAdpter;
import base.BaseActivity;
import base.BeanCallback;
import bean.FuLiBar;
import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;
import fragment.Fulifragment.FuliFragment;
import https.FuLiHttps;
import interface1.FuLiInterface;
import xiangcuntiandi.quanmather.R;

/**
 * Created by Administrator on 2016/12/31.
 */

public class FuLiActivity extends BaseActivity {
    @BindView(R.id.tb_layout)
    TabLayout tbLayout;
    @BindView(R.id.vp)
    ViewPager vp;
    private List<Fragment> fragmentList=new ArrayList<>();
    private List<String> list=new ArrayList<>();
    private List<Integer> integerslist=new ArrayList<>();
    @Override
    public int getLayout() {
        return R.layout.fuliactivitydetail;
    }
    FuLiInterface fuLiInterface;
    @Override
    public void initView() {
        initFragmet();
        fuLiInterface=new FuLiHttps();
        vp.setAdapter(new MyPagerAdpter(getSupportFragmentManager(), fragmentList, list));
        tbLayout.setupWithViewPager(vp);
        doHttps();
    }
    private void initFragmet() {
        list.add("精选");
        list.add("流量话费");
        list.add("影音会员");
        list.add("电影票");
        list.add("抢红包");
        list.add("购物");
        list.add("金融理财");
        list.add("旅游酒店");
        list.add("生活服务");
        list.add("爱车养车");
       integerslist.add(12);
       integerslist.add(1201);
       integerslist.add(1206);
       integerslist.add(1205);
       integerslist.add(1202);
       integerslist.add(1203);
       integerslist.add(1204);
       integerslist.add(1207);
       integerslist.add(1208);
       integerslist.add(1210);
        for (int i=0;i<integerslist.size();i++) {
            Bundle bundle=new Bundle();
            bundle.putString("TYPE",integerslist.get(i)+"");
            FuliFragment fuliFragment = new FuliFragment();
            fuliFragment.setArguments(bundle);
            fragmentList.add(fuliFragment);
        }
    }


    private void doHttps() {
        fuLiInterface.FuLiBarHttp(new BeanCallback<List<FuLiBar.DataBean.RowsBean>>() {
            @Override
            public void onSuccess(List<FuLiBar.DataBean.RowsBean> t) {
                if (t!=null){
                    for (FuLiBar.DataBean.RowsBean rowsBean : t) {

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
        finish();
    }
}
