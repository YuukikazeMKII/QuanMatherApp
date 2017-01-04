package activity.HomeActivity;

import android.os.Bundle;
import android.webkit.WebView;
import android.widget.ImageView;

import base.BaseActivity;
import base.BaseWebView;
import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;
import xiangcuntiandi.quanmather.R;

/**
 * Created by Administrator on 2017/1/3.
 */

public class HomeWebActivity extends BaseActivity {
    @BindView(R.id.back_tital)
    ImageView backTital;
    @BindView(R.id.web_content)
    WebView webContent;

    @Override
    public int getLayout() {
        return R.layout.home_web;
    }

    @Override
    public void initView() {
        String web = getIntent().getStringExtra("web");
        BaseWebView.initWebView(this,webContent,web);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        // TODO: add setContentView(...) invocation
        ButterKnife.bind(this);
    }

    @OnClick(R.id.back_tital)
    public void onClick() {
        finish();
    }
}
