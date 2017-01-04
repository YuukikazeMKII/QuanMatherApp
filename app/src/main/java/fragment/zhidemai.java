package fragment;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.TabLayout;
import android.support.v4.app.Fragment;
import android.support.v4.view.ViewPager;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.ArrayList;
import java.util.List;

import activity.zhidemaiactivity.SearchActivity;
import adpter.MyPagerAdpter;
import base.BaseFragment;
import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;
import fragment.zhidemaiFragment.guoneifragment;
import xiangcuntiandi.quanmather.R;

/**
 * Created by Administrator on 2016/12/27.
 */

public class zhidemai extends BaseFragment {
    @BindView(R.id.tb_layout)
    TabLayout tbLayout;
    @BindView(R.id.vp)
    ViewPager vp;

    @Override
    public int getLayout() {
        Log.e("at22", 4 + "");
        return R.layout.zhidemaifragment;
    }

    List<Fragment> fragmentList = new ArrayList<>();
    List<String> list = new ArrayList<>();

    @Override
    public void initdata() {
        list.add("精选");
        list.add("国内");
        list.add("海淘");
        list.add("发现");
        list.add("资讯");
        fragmentList.add(guoneifragment.newInstance("jinxuan", "1101", 1));
        fragmentList.add(guoneifragment.newInstance("guonei", "110101", 1));
        fragmentList.add(guoneifragment.newInstance("haitao", "110102", 2));
        fragmentList.add(guoneifragment.newInstance("faxian", "11102", 1));
        fragmentList.add(guoneifragment.newInstance("zixun", "110103", 1));
        vp.setAdapter(new MyPagerAdpter(getChildFragmentManager(), fragmentList, list));
        tbLayout.setupWithViewPager(vp);
    }

    @OnClick(R.id.back_tital)
    public void onClick() {
        Intent intent=new Intent(getActivity(), SearchActivity.class);
        startActivity(intent);
    }
}
