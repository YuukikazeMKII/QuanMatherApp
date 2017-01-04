package activity.zhidemaiactivity;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.widget.GridLayoutManager;
import android.view.KeyEvent;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

import adpter.BrandAdpter;
import adpter.ClassAdpter;
import adpter.HaiWaiAdpter;
import adpter.HotAdpter;
import base.BaseActivity;
import base.BeanCallback;
import bean.SearchBean;
import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;
import https.ZuiYouHuiHttp;
import interface1.ZuiYouHui;
import wight.ScrollRecycle;
import xiangcuntiandi.quanmather.R;

/**
 * Created by Administrator on 2016/12/30.
 */

public class SearchActivity extends BaseActivity implements TextView.OnEditorActionListener {
    @BindView(R.id.hot)
    ScrollRecycle hot;
    @BindView(R.id.classhot)
    ScrollRecycle classhot;
    @BindView(R.id.guoneigoods)
    ScrollRecycle guoneigoods;
    @BindView(R.id.haiwaigoods)
    ScrollRecycle haiwaigoods;
    ZuiYouHui zuiYouHui;
    HotAdpter hotAdpter;
    ClassAdpter classAdpter;
    BrandAdpter brandAdpter;
    HaiWaiAdpter haiWaiAdpter;
    @BindView(R.id.tv_title)
    EditText tvTitle;
    private List<SearchBean.DataBean.TagBean> tagBean = new ArrayList<>();
    private List<SearchBean.DataBean.CategoryBean> categoryBeen = new ArrayList<>();
    private List<SearchBean.DataBean.MallBean.GuoneiBean> guoneiBeanList = new ArrayList<>();
    private List<SearchBean.DataBean.MallBean.HaiwaiBean> haiwaiBeanList = new ArrayList<>();

    @Override
    public int getLayout() {
        return R.layout.search_activity;
    }

    @Override
    public void initView() {
        zuiYouHui = new ZuiYouHuiHttp();
        tagBean.clear();
        categoryBeen.clear();
        guoneiBeanList.clear();
        haiwaiBeanList.clear();
        classAdpter = new ClassAdpter(SearchActivity.this);
        hotAdpter = new HotAdpter(SearchActivity.this);
        brandAdpter = new BrandAdpter(SearchActivity.this);

        haiWaiAdpter = new HaiWaiAdpter(SearchActivity.this);
        hot.setLayoutManager(new GridLayoutManager(SearchActivity.this, 4));
        classhot.setLayoutManager(new GridLayoutManager(SearchActivity.this, 4));
        guoneigoods.setLayoutManager(new GridLayoutManager(SearchActivity.this, 4));
        haiwaigoods.setLayoutManager(new GridLayoutManager(SearchActivity.this, 4));
        hot.setAdapter(hotAdpter);
        classhot.setAdapter(classAdpter);
        guoneigoods.setAdapter(brandAdpter);
        haiwaigoods.setAdapter(haiWaiAdpter);
        haiWaiAdpter.setData(haiwaiBeanList);
        brandAdpter.setData(guoneiBeanList);
        classAdpter.setData(categoryBeen);
        hotAdpter.setData(tagBean);
        doHttps();
        tvTitle.setOnEditorActionListener(this);
    }

    private void doHttps() {
        zuiYouHui.SearchHttp(new BeanCallback<SearchBean.DataBean>() {
            @Override
            public void onSuccess(SearchBean.DataBean t) {
                if (t != null) {
                    List<SearchBean.DataBean.TagBean> tag = t.getTag();

                    List<SearchBean.DataBean.CategoryBean> category = t.getCategory();
                    List<SearchBean.DataBean.MallBean.GuoneiBean> guonei = t.getMall().getGuonei();
                    List<SearchBean.DataBean.MallBean.HaiwaiBean> haiwai = t.getMall().getHaiwai();
                    haiwaiBeanList.addAll(haiwai);
                    guoneiBeanList.addAll(guonei);
                    categoryBeen.addAll(category);
                    tagBean.addAll(tag);
                    classAdpter.notifyDataSetChanged();
                    hotAdpter.notifyDataSetChanged();
                    haiWaiAdpter.notifyDataSetChanged();
                    brandAdpter.notifyDataSetChanged();
                }
            }

            @Override
            public void onFinish() {

            }
        });
    }

    @OnClick({R.id.back_tital, R.id.moreclass, R.id.moreshangcheng})
    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.back_tital:
                finish();
                break;
            case R.id.moreclass:
                Intent intent = new Intent(SearchActivity.this, ClassActivity.class);
                startActivity(intent);
                break;
            case R.id.moreshangcheng:
                Intent inten = new Intent(SearchActivity.this, BrandListPaiXu.class);
                startActivity(inten);
                break;
        }
    }

    @Override
    public boolean onEditorAction(TextView textView, int i, KeyEvent keyEvent) {


            if (tvTitle.getText().length()==0){
                Toast.makeText(SearchActivity.this,"请输入内容",Toast.LENGTH_SHORT).show();
            }else {
                Intent intent=new Intent(SearchActivity.this,SearchDetailActivity.class);
                intent.putExtra("cate",tvTitle.getText().toString());
                startActivity(intent);
            }

        return false;
    }
}
