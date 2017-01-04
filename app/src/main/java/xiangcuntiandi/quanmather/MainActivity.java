package xiangcuntiandi.quanmather;

import android.content.Intent;
import android.os.Bundle;
import android.os.PersistableBundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentTransaction;
import android.util.Log;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;

import com.bumptech.glide.Glide;

import java.io.File;

import base.BaseActivity;
import butterknife.BindView;
import butterknife.OnClick;
import config.MyApp;

public class MainActivity extends BaseActivity {


    @BindView(R.id.home_fl_content)
    FrameLayout homeFlContent;
    @BindView(R.id.Rg)
    LinearLayout Rg;
    @BindView(R.id.activity_main)
    RelativeLayout activityMain;

    public int getLayout() {
        return R.layout.activity_main;
    }

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        File photoCacheDir = Glide.getPhotoCacheDir(this);
        String absolutePath = photoCacheDir.getAbsolutePath();

        Log.e("at22",absolutePath);

        if (savedInstanceState!=null){
           tag= savedInstanceState.getString("TAG");
           int i = Integer.parseInt(tag);
           fragmentTransaction.remove(fragments[i]);
       }
    }

    @Override
    public void onSaveInstanceState(Bundle outState, PersistableBundle outPersistentState) {
        super.onSaveInstanceState(outState, outPersistentState);
        outState.putString("TAG",tag);
    }

    @Override
    protected void onRestoreInstanceState(Bundle savedInstanceState) {
        super.onRestoreInstanceState(savedInstanceState);
    }

    @Override
    public void initView() {
        Rg.getChildAt(0).setSelected(true);
        showFragment(0);
    }
    FragmentTransaction fragmentTransaction;
    private Fragment[] fragments = new Fragment[5];
    int currrentindex = -1;

    private void showFragment(int index) {

        if (index == currrentindex)
            return;
        fragmentTransaction = getSupportFragmentManager().beginTransaction();
        if (currrentindex != -1) {
            fragmentTransaction.hide(fragments[currrentindex]);
        }
        if (fragments[index] == null) {

            createFragment(index);

            fragmentTransaction.add(R.id.home_fl_content, fragments[index], index + "");

        } else {
            fragmentTransaction.show(fragments[index]);
        }
        fragmentTransaction.commit();

        if (currrentindex != -1)

            Rg.getChildAt(currrentindex).setSelected(false);

        Rg.getChildAt(index).setSelected(true);
        currrentindex = index;
    }

    String[] fragmentName = {"homefragment", "youhuijuan", "fuli", "zhidemai", "mefragment"};

    private void createFragment(int index) {
        try {
            fragments[index] = (Fragment) Class.forName("fragment." + fragmentName[index]).newInstance();
        } catch (InstantiationException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
    String tag;
    @OnClick({R.id.radio_home, R.id.radio_youhui, R.id.radio_fuli, R.id.radio_zhidemai, R.id.radio_me})
    public void onClick(View view) {
       tag = (String) view.getTag();
        showFragment(Integer.parseInt(tag));
    }
}
