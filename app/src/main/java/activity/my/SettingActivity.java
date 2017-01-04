package activity.my;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Toast;

import base.BaseActivity;
import butterknife.ButterKnife;
import butterknife.OnClick;
import config.MyApp;
import utils.ImageCatchUtil;
import xiangcuntiandi.quanmather.R;

/**
 * Created by Administrator on 2016/12/28.
 */

public class SettingActivity extends BaseActivity {
    @Override
    public int getLayout() {
        return R.layout.setting_activity;
    }


    @Override
    public void initView() {



    }

    @OnClick({R.id.back_tital, R.id.tuisong, R.id.my_cach, R.id.qingchulishi, R.id.commend, R.id.shouchang, R.id.unLogin})
    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.back_tital:
                break;
            case R.id.tuisong:
                break;
            case R.id.my_cach:
                break;
            case R.id.qingchulishi:
                String cacheSize = ImageCatchUtil.getInstance().getCacheSize(SettingActivity.this);
                ImageCatchUtil.getInstance().clearImageAllCache();
                Toast.makeText(SettingActivity.this,"已清除缓存"+cacheSize
                        ,Toast.LENGTH_SHORT).show();
                Log.e("at22",cacheSize+"---------");
                break;
            case R.id.commend:
                break;
            case R.id.shouchang:
                break;
            case R.id.unLogin:
                MyApp.getInstance().finishActivity();
                break;
        }
    }
}
