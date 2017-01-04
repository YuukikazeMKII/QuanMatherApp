    package activity.my;

    import android.os.Bundle;
    import android.support.design.widget.TabLayout;
    import android.support.v4.app.Fragment;
    import android.support.v4.view.ViewPager;

    import java.util.ArrayList;
    import java.util.List;

    import adpter.MyPagerAdpter;
    import base.BaseActivity;
    import butterknife.BindView;
    import butterknife.ButterKnife;
    import butterknife.OnClick;
    import fragment.myfrgment.LiwuFragment;
    import fragment.myfrgment.cardFragment;
    import xiangcuntiandi.quanmather.R;

    /**
     * Created by Administrator on 2016/12/28.
     */

    public class MyCardQuanActivity extends BaseActivity {
        @BindView(R.id.tb_layout)
        TabLayout tbLayout;
        @BindView(R.id.vp)
        ViewPager vp;
        private List<String> titleList=new ArrayList<>();

        @Override
        public int getLayout() {
            return R.layout.mycardquan_activity;
        }
         List<Fragment> list=new ArrayList<>();
        @Override
        public void initView() {
            //得到标题和地址
            String url1=  getIntent().getStringExtra("url1");
            String url2=  getIntent().getStringExtra("url2");
            String title1=  getIntent().getStringExtra("title1");
            String title2=  getIntent().getStringExtra("title2");

              Bundle bundle=new Bundle();
              bundle.putString("url",url1);
              cardFragment cardFragment=new cardFragment();
              cardFragment.setArguments(bundle);
              Bundle bundle1=new Bundle();
              bundle1.putString("url",url2);
              LiwuFragment liwuFragment=new LiwuFragment();
              liwuFragment.setArguments(bundle1);
              list.add(cardFragment);
              list.add(liwuFragment);
              titleList.clear();

              titleList.add(title1);
              titleList.add(title2);
              vp.setAdapter(new MyPagerAdpter(getSupportFragmentManager(),list,titleList));
              tbLayout.setupWithViewPager(vp);
        }

        @OnClick(R.id.back_tital)
        public void onClick() {
            finish();
        }
    }
