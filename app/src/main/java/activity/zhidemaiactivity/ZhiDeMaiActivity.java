package activity.zhidemaiactivity;

import android.content.Intent;
import android.graphics.BitmapFactory;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Log;
import android.view.View;
import android.webkit.WebSettings;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.Toast;

import com.bumptech.glide.Glide;
import com.github.lzyzsd.jsbridge.BridgeHandler;
import com.github.lzyzsd.jsbridge.BridgeWebView;
import com.github.lzyzsd.jsbridge.CallBackFunction;
import com.umeng.socialize.media.UMImage;

import activity.LoginActivity;
import base.BaseActivity;
import base.BeanCallback;
import bean.DianZanBean;
import bean.ShouCang;
import bean.ZhiYouHuiDetailBean;
import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;
import config.MyApp;
import https.ZuiYouHuiHttp;
import interface1.ZuiYouHui;
import utils.RemoveString;
import utils.ShareUtils;
import xiangcuntiandi.quanmather.R;

/**
 * Created by Administrator on 2016/12/28.
 */

public class ZhiDeMaiActivity extends BaseActivity implements CompoundButton.OnCheckedChangeListener {
    @BindView(R.id.back_tital)
    ImageView backTital;
    @BindView(R.id.imv_zhidemai)
    ImageView imvZhidemai;
    @BindView(R.id.wv_zhidemai)
    BridgeWebView wvZhidemai;
    @BindView(R.id.dianzan)
    CheckBox dianzan;
    @BindView(R.id.shoucang)
    CheckBox shoucang;

    @Override
    public int getLayout() {
        return R.layout.zhidemaiiten_activity;
    }

    private int goodsId;
    ZuiYouHui zuiYouHui;
    ZhiYouHuiDetailBean.DataBean zhiYou;

    @Override
    public void initView() {
        zuiYouHui = new ZuiYouHuiHttp();
        WebSettings settings = wvZhidemai.getSettings();
        settings.setDefaultTextEncodingName("utf-8");
        settings.setJavaScriptEnabled(true);
        goodsId = getIntent().getIntExtra("goodsId", 0);
        Log.e("at22", goodsId + "");
        doHttps(goodsId + "");
        wvZhidemai.loadUrl("javascript:tagsOnClick(type, value, name)");
        wvZhidemai.registerHandler("submitFromWeb", new BridgeHandler() {

            @Override
            public void handler(String data, CallBackFunction function) {
                function.onCallBack("submitFromWeb exe, response data 中文 from Java");
                Log.e("at22", data);
            }
        });
        dianzan.setOnCheckedChangeListener(this);
        shoucang.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
                if (MyApp.getInstance().getUserToken() != null && !TextUtils.isEmpty(MyApp.getInstance().getUserToken())){
                    if (b){
                        ShouCangdoHttp(101+"");
                    }else {
                        ShouCangdoHttp(100+"");
                    }
                }else {
                    Intent intent = new Intent(ZhiDeMaiActivity.this, LoginActivity.class);
                    startActivity(intent);
                }
            }
        });
    }

    private void doHttps(String goodsId) {
        zuiYouHui.ZuiYouHuiDetail(goodsId, new BeanCallback<ZhiYouHuiDetailBean.DataBean>() {
            @Override
            public void onSuccess(ZhiYouHuiDetailBean.DataBean t) {
                if (t != null && !TextUtils.isEmpty(t.toString())) {
                    Glide.with(ZhiDeMaiActivity.this).load(t.getArticle_pic()).into(imvZhidemai);
                    String remove = RemoveString.remove(t.getArticle_filter_content());
                    // String s = RemoveString.fmtString(remove);
                    String s = RemoveString.RemoveS(remove);
                    String s1 = RemoveString.RemoveHtml(s);
                    zhiYou = t;
                    Log.e("at22", s1);
                    wvZhidemai.loadDataWithBaseURL(null, remove, "text/html", "utf-8", null);
                }
            }

            @Override
            public void onFinish() {

            }
        });
    }

    @OnClick({R.id.share, R.id.commend, R.id.tv_link})
    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.share:
                String url = "http://www.rabbitpre.com/m/ryQFri2";
                UMImage image = new UMImage(ZhiDeMaiActivity.this,
                        BitmapFactory.decodeResource(getResources(), R.drawable.icon));
                ;
                ShareUtils.ShareOpen(ZhiDeMaiActivity.this, "乡镇天地", "乡镇天地展示家乡之美，我的推荐码是" + 15 + ",期待您的加入", url, image);
                break;
            case R.id.commend:
                Intent intentComment = new Intent(ZhiDeMaiActivity.this, CommentActivity.class);
                intentComment.putExtra("goodsId", zhiYou.getArticle_id());
                startActivity(intentComment);
                break;
            case R.id.tv_link:
                 String article_link = zhiYou.getArticle_link();
                String article_mall = zhiYou.getArticle_mall();

                Intent intent = new Intent(ZhiDeMaiActivity.this, ZhiDeMaiLinkActivity.class);

                intent.putExtra("article_link", article_link);
                intent.putExtra("article_mall", article_mall);
                startActivity(intent);

                break;
        }
    }

    private void ShouCangdoHttp(String type) {
        zuiYouHui.ShouCangHttp(zhiYou.getArticle_id() + "", type, new BeanCallback<ShouCang.DataBean>() {
            @Override
            public void onSuccess(ShouCang.DataBean t) {
                if (t != null) {
                    String msg = t.getMsg();
                    Toast.makeText(ZhiDeMaiActivity.this, msg, Toast.LENGTH_SHORT).show();
                }
            }

            @Override
            public void onFinish() {

            }
        });
    }

    @Override
    public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
        if (MyApp.getInstance().getUserToken() != null && !TextUtils.isEmpty(MyApp.getInstance().getUserToken())) {
            if (b) {
                dianZhan(0);
            } else {
                dianZhan(1);
            }
        } else {
            Intent intent = new Intent(ZhiDeMaiActivity.this, LoginActivity.class);
            startActivity(intent);
        }
    }

    private void dianZhan(int type) {
        zuiYouHui.DianZan(zhiYou.getArticle_id() + "", type, new BeanCallback<DianZanBean.DataBean>() {
            @Override
            public void onSuccess(DianZanBean.DataBean t) {
                if (t != null) {
                    Toast.makeText(ZhiDeMaiActivity.this, t.getMsg(), Toast.LENGTH_SHORT).show();
                }
            }

            @Override
            public void onFinish() {

            }
        });
    }
}
