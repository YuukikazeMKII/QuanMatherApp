package base;

import android.content.Context;
import android.webkit.WebChromeClient;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;

import com.ldoublem.loadingviewlib.view.LVEatBeans;

import wight.Loading;

/**
 * Created by Administrator on 2016/12/28.
 */

public class BaseWebView  {
    public static void initWebView(Context context,WebView webView, String url){
        webView.loadUrl(url);
        final Loading loading=new Loading(context);
        WebSettings settings = webView.getSettings();
        settings.setJavaScriptEnabled(true);
        settings.setAppCacheEnabled(true);
        settings.setBlockNetworkImage(true);

        loading.show();
        //覆盖WebView默认使用第三方或系统默认浏览器打开网页的行为，使网页用WebView打开
        webView.setWebViewClient(new WebViewClient(){
            @Override
            public boolean shouldOverrideUrlLoading(WebView view, String url) {
                // TODO Auto-generated method stub
                //返回值是true的时候控制去WebView打开，为false调用系统浏览器或第三方浏览器
                view.loadUrl(url);
                return true;
            }
        });
        webView.setWebChromeClient(new WebChromeClient() {
            @Override
            public void onProgressChanged(WebView view, int newProgress) {
                // TODO Auto-generated method stub
                if (newProgress == 100) {
                    // 网页加载完成
                      loading.dismiss();

                } else {
                    // 加载中
                    loading.show();
                }

            }
        });
    }
}
