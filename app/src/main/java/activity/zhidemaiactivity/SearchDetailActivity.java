package activity.zhidemaiactivity;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.TabLayout;
import android.support.v4.app.Fragment;
import android.support.v4.view.ViewPager;
import android.view.KeyEvent;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

import adpter.MyPagerAdpter;
import base.BaseActivity;
import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;
import fragment.zhidemaiFragment.SearchFragment;
import fragment.zhidemaiFragment.guoneifragment;
import xiangcuntiandi.quanmather.R;

/**
 * Created by Administrator on 2016/12/30.
 */

public class SearchDetailActivity extends BaseActivity implements TextView.OnEditorActionListener {
    @BindView(R.id.tv_title)
    EditText tvTitle;
    @BindView(R.id.tb_layout)
    TabLayout tbLayout;
    @BindView(R.id.vp)
    ViewPager vp;

    @Override
    public int getLayout() {
        return R.layout.searchdetail_activity;
    }
    List<Fragment> fragmentList = new ArrayList<>();
    List<String> list = new ArrayList<>();
    @Override
    public void initView() {
        list.add("精选");
        list.add("优惠券");
        list.add("国内");
        list.add("海淘");
        list.add("发现");
        list.add("资讯");
        fragmentList.add(SearchFragment.newInstance("jinxuan", "1101", 1));
        fragmentList.add(SearchFragment.newInstance("youhuiquan", "10", 1));
        fragmentList.add(SearchFragment.newInstance("guonei", "110101", 1));
        fragmentList.add(SearchFragment.newInstance("haitao", "110102", 2));
        fragmentList.add(SearchFragment.newInstance("faxian", "11102", 1));
        fragmentList.add(SearchFragment.newInstance("zixun", "110103", 1));
        vp.setAdapter(new MyPagerAdpter(getSupportFragmentManager(), fragmentList, list));
        tbLayout.setupWithViewPager(vp);
        tvTitle.setOnEditorActionListener(this);
    }
    @OnClick(R.id.back_tital)
    public void onClick() {
        finish();
    }

    @Override
    public boolean onEditorAction(TextView textView, int i, KeyEvent keyEvent) {
        if (tvTitle.getText().length()==0){
            Toast.makeText(SearchDetailActivity.this,"请输入内容",Toast.LENGTH_SHORT).show();
        }else {
            Intent intent=new Intent(SearchDetailActivity.this,SearchDetailActivity.class);
            intent.putExtra("cate",tvTitle.getText().toString());
            startActivity(intent);
            finish();
        }
        return false;
    }
}
