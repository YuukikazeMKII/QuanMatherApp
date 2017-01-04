package activity.my;

import android.os.Bundle;
import android.webkit.WebView;
import android.widget.ImageView;

import base.BaseActivity;
import base.BaseWebView;
import butterknife.BindView;
import butterknife.ButterKnife;
import xiangcuntiandi.quanmather.R;

/**
 * Created by Administrator on 2016/12/28.
 */

public class HotGameActivity extends BaseActivity {
    @BindView(R.id.back_tital)
    ImageView backTital;
    @BindView(R.id.wv)
    WebView wv;

    @Override
    public int getLayout() {
        return R.layout.hotgame_activity;
    }

    @Override
    public void initView() {
        BaseWebView.initWebView(HotGameActivity.this,wv,"http://wx.1758.com/game/openpf/aiquyou154/index");
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        // TODO: add setContentView(...) invocation
        ButterKnife.bind(this);
    }
}
