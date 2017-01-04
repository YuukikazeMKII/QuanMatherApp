package activity.zhidemaiactivity;

import android.content.Intent;
import android.os.Bundle;
import android.webkit.WebView;
import android.widget.TextView;

import base.BaseActivity;
import base.BaseWebView;
import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;
import xiangcuntiandi.quanmather.R;

/**
 * Created by Administrator on 2016/12/29.
 */

public class ZhiDeMaiLinkActivity extends BaseActivity {
    @BindView(R.id.tv_title)
    TextView tvTitle;
    @BindView(R.id.web_content)
    WebView webContent;

    @Override
    public int getLayout() {
        return R.layout.hidemailink_activity;
    }
    String article_link;
    @Override
    public void initView() {
        Intent intent = getIntent();
         article_link= intent.getStringExtra("article_link");
        String article_mall = intent.getStringExtra("article_mall");
        tvTitle.setText(article_mall);
        BaseWebView.initWebView(ZhiDeMaiLinkActivity.this,webContent,article_link);

    }
    @OnClick(R.id.back_tital)
    public void onClick() {
        finish();
    }
}
