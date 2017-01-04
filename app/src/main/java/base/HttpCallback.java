package base;

import android.util.Log;


import org.xutils.common.Callback;

/**
 * Created by Administrator on 2016/9/30.
 */
public abstract class HttpCallback implements Callback.CommonCallback<String> {


    @Override
    public void onError(Throwable ex, boolean isOnCallback) {
//        Log.e("at22",ex.getMessage());
    }

    @Override
    public void onCancelled(CancelledException cex) {

    }

}
