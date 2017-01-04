package com.byzk.www.recyclerviewpackage;

import android.os.Bundle;
import android.os.Handler;
import android.support.v4.widget.SwipeRefreshLayout;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.DefaultItemAnimator;
import android.support.v7.widget.LinearLayoutManager;
import android.widget.ScrollView;

import java.util.ArrayList;
import java.util.List;

import jp.wasabeef.recyclerview.animators.adapters.AlphaInAnimationAdapter;
import jp.wasabeef.recyclerview.animators.adapters.ScaleInAnimationAdapter;
import jp.wasabeef.recyclerview.animators.adapters.SlideInBottomAnimationAdapter;

public class MainActivity extends AppCompatActivity {

    private List<String> dataList = new ArrayList<>();
    private RefreshRecyclerView rv;
    private MyAdapter myAdapter;
    private SwipeRefreshLayout srl;
    private ScollView1 scrollView;
    private boolean isSvToBottom;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        init();

    }

    private void init() {
        initView();
        initData();
        initListener();
    }


    private void initView() {
        srl = (SwipeRefreshLayout) findViewById(R.id.sr1);
        scrollView= (ScollView1) findViewById(R.id.scr);
        srl.setColorSchemeResources(android.R.color.holo_red_light, android.R.color.holo_blue_light, android.R.color.holo_green_light);
        rv = (RefreshRecyclerView) findViewById(R.id.rv);
        rv.setLayoutManager(new LinearLayoutManager(this));
        rv.setItemAnimator(new DefaultItemAnimator());
        rv.setLoadMoreEnable(true);
        rv.setFooterResource(R.layout.item_footer);
        myAdapter = new MyAdapter();
        rv.setAdapter(myAdapter);
         rv.setEnabled(isSvToBottom);
        scrollView.setScrollToBottomListener(new ScollView1.OnScrollToBottomListener() {
            @Override
            public void onScrollToBottom() {
                isSvToBottom = true;
            }

            @Override
            public void onNotScrollToBottom() {
                isSvToBottom = false;
            }
        });
    }

    private void initData() {
        for (int i = 0; i < 20; i++) {
            dataList.add("数据" + i);
        }
        myAdapter.setData(dataList);
        rv.notifyNewData();
    }

    private void initListener() {
        rv.setOnLoadDataListener(new RefreshRecyclerView.OnLoadDataListener() {
            @Override
            public void pullUpRefresh() {
                handler.postDelayed(new Runnable() {
                    @Override
                    public void run() {
                        for (int i = 0; i < 10; i++) {
                            dataList.add("更多数据" + i);
                        }
                        myAdapter.setData(dataList);//设置新数据
                        rv.notifyMoreData();//刷新数据
                    }
                }, 2000);
            }
        });
        srl.setOnRefreshListener(new SwipeRefreshLayout.OnRefreshListener() {
            @Override
            public void onRefresh() {
                handler.postDelayed(new Runnable() {
                    @Override
                    public void run() {
                        srl.setRefreshing(false);
                        myAdapter.setData(dataList);//设置新数据
                        rv.notifyNewData();//刷新数据
                    }
                }, 2000);
            }
        });
    }


    private Handler handler = new Handler();


}
