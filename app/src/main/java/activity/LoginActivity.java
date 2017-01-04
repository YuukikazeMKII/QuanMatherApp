package activity;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Toast;

import com.umeng.socialize.UMAuthListener;
import com.umeng.socialize.UMShareAPI;
import com.umeng.socialize.bean.SHARE_MEDIA;

import java.util.Map;

import base.BaseActivity;
import butterknife.ButterKnife;
import butterknife.OnClick;
import config.MyApp;
import xiangcuntiandi.quanmather.R;

/**
 * Created by Administrator on 2016/12/27.
 */

public class LoginActivity extends BaseActivity {

   private SHARE_MEDIA[] list = {SHARE_MEDIA.QQ,SHARE_MEDIA.SINA,SHARE_MEDIA.WEIXIN};
 private  UMShareAPI mShareApi;
    @Override
    public int getLayout() {
        return R.layout.sharelogin;

    }

    @Override
    public void initView() {
        mShareApi=UMShareAPI.get(this);
        mShareApi.getPlatformInfo(LoginActivity.this, SHARE_MEDIA.QQ, new UMAuthListener() {
            @Override
            public void onComplete(SHARE_MEDIA share_media, int i, Map<String, String> map) {
                String uid = map.get("uid");
                String screen_name = map.get("screen_name");
                String profile_image_url = map.get("profile_image_url");
                MyApp.getInstance().setHeadpic(profile_image_url);
                MyApp.getInstance().setUsername(screen_name);
                Log.e("at22",uid+screen_name+profile_image_url);
                Intent intent=new Intent();
                setResult(RESULT_OK,intent);
                finish();
            }

            @Override
            public void onError(SHARE_MEDIA share_media, int i, Throwable throwable) {
              finish();
            }

            @Override
            public void onCancel(SHARE_MEDIA share_media, int i) {

            }
        });
    }
    @OnClick({R.id.wx, R.id.qq, R.id.sine})
    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.wx:
                UMShareAPI.get(this).doOauthVerify(this,SHARE_MEDIA.WEIXIN,authListener);
                break;
            case R.id.qq:
                UMShareAPI.get(this).doOauthVerify(this,SHARE_MEDIA.QQ,authListener);
                break;
            case R.id.sine:
                UMShareAPI.get(this).doOauthVerify(this,SHARE_MEDIA.SINA,authListener);
                break;
        }
    }



    UMAuthListener authListener = new UMAuthListener() {
        @Override
        public void onComplete(SHARE_MEDIA platform, int action, Map<String, String> data) {
            Toast.makeText(LoginActivity.this,"成功了",Toast.LENGTH_LONG).show();
        }

        @Override
        public void onError(SHARE_MEDIA platform, int action, Throwable t) {
            Toast.makeText(LoginActivity.this,"失败："+t.getMessage(),Toast.LENGTH_LONG).show();
        }

        @Override
        public void onCancel(SHARE_MEDIA platform, int action) {
            Toast.makeText(LoginActivity.this,"取消了",Toast.LENGTH_LONG).show();
        }
    };
    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
        UMShareAPI.get(this).onActivityResult(requestCode,resultCode,data);

    }
}
