package activity.zhidemaiactivity;

import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Log;
import android.view.View;
import android.webkit.WebSettings;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;
import com.github.lzyzsd.jsbridge.BridgeHandler;
import com.github.lzyzsd.jsbridge.BridgeWebView;
import com.github.lzyzsd.jsbridge.CallBackFunction;

import base.BaseActivity;
import base.BeanCallback;
import bean.ZhiYouHuiDetailBean;
import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;
import https.ZuiYouHuiHttp;
import interface1.ZuiYouHui;
import utils.RemoveString;
import xiangcuntiandi.quanmather.R;

/**
 * Created by Administrator on 2016/12/28.
 */

public class DianJiLingQuanActivity extends BaseActivity {


    @BindView(R.id.imv_zhidemai)
    ImageView imvZhidemai;
    @BindView(R.id.wv_zhidemai)
    BridgeWebView wvZhidemai;
    @BindView(R.id.chakanrenshu)
    TextView chakanrenshu;
    @BindView(R.id.jiezhiriqi)
    TextView jiezhiriqi;

    @Override
    public int getLayout() {
        return R.layout.dianjilingquan_activity;
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

    }
    private void doHttps(String goodsId) {
        zuiYouHui.ZuiYouHuiDetail(goodsId, new BeanCallback<ZhiYouHuiDetailBean.DataBean>() {
            @Override
            public void onSuccess(ZhiYouHuiDetailBean.DataBean t) {
                if (t != null && !TextUtils.isEmpty(t.toString())) {
                    Glide.with(DianJiLingQuanActivity.this).load(t.getArticle_pic()).into(imvZhidemai);
                    String remove = RemoveString.remove(t.getArticle_filter_content());
                    // String s = RemoveString.fmtString(remove);
                    String s = RemoveString.RemoveS(remove);
                    String s1 = RemoveString.RemoveHtml(s);
                    zhiYou = t;
                    Log.e("at22", s1);
                    wvZhidemai.loadDataWithBaseURL(null, remove, "text/html", "utf-8", null);
                    chakanrenshu.setText("查看人数"+t.getArticle_read_count());
                    jiezhiriqi.setText("截止日期"+t.getArticle_endtime());

                }
            }

            @Override
            public void onFinish() {

            }
        });
    }


    @OnClick({R.id.back_tital, R.id.tv_link})
    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.back_tital:
                break;
            case R.id.tv_link:
                String article_mall = zhiYou.getArticle_mall();
                String actionParamsForAndroid = zhiYou.getArticle_pageaction().getActionParamsForAndroid();
                Intent intent = new Intent(DianJiLingQuanActivity.this, ZhiDeMaiLinkActivity.class);
                intent.putExtra("article_link", actionParamsForAndroid);
                intent.putExtra("article_mall", article_mall);
                startActivity(intent);
                break;
        }
    }
}
