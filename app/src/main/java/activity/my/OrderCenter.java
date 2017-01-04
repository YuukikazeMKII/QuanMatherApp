package activity.my;

import android.os.Bundle;
import android.view.View;
import android.webkit.WebChromeClient;
import android.webkit.WebView;
import android.webkit.WebViewClient;

import base.BaseActivity;
import base.BaseWebView;
import base.BeanCallback;
import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;
import https.PersonCenterHttp;
import interface1.MyInterface;
import xiangcuntiandi.quanmather.R;

/**
 * Created by Administrator on 2016/12/28.
 */

public class OrderCenter extends BaseActivity {
    @BindView(R.id.web_order)
    WebView webOrder;
     MyInterface myInterface;
    @Override
    public int getLayout() {
        return R.layout.ordercenter_activity;
    }

    @Override
    public void initView() {
             myInterface=new PersonCenterHttp();
             init();
    }
    private void doGetHttp(){
        myInterface.MyOrder(new BeanCallback<String>() {
            @Override
            public void onSuccess(String t) {

            }

            @Override
            public void onFinish() {

            }
        });
    }
    @OnClick({R.id.back_tital, R.id.refreshion})
    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.back_tital:
                finish();
                break;
            case R.id.refreshion:
                init();
                break;
        }
    }

    private void init() {

        //WebView加载web资源
        BaseWebView.initWebView(OrderCenter.this,webOrder,"http://www.quanmama.com:8000/t/cardCoupon/myOrder.aspx?usertoken=3BAE791A2A61FA2176D5CF1BFF6D5BB39B43C794F25B3529185BC971A97FD246B1D29C636D9C380908FE0224D3D9D48621072C3004D0FBE0F22396837F477A420654CD3F558D9777E78E15B16BF8B3D338B432F78FDC3BF2F40C8834696340B97095B125CCA1166FDA3F56F9A0637ED49ECDBF89329956DB33A7479A718F3F29031E7429CB1E9D5E8EE8CAED3588301DBA9C58694395686BA50617074A4199F5F65EFA221F0E322A3C29C64559981CE3DBB4B9CBA1E311D010290FEFC371B191");
    }
}
