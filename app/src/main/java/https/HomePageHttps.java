package https;

import android.util.Log;

import com.google.gson.Gson;

import org.json.JSONException;
import org.json.JSONObject;
import org.xutils.x;

import java.util.List;

import base.BeanCallback;
import base.HttpCallback;
import bean.HomeBean;
import bean.KFCBean;
import bean.YouHuiFragmentBean;
import bean.ZuiYouHuiBean;
import httpparams.HomeDetailRcParames;
import httpparams.HomePageListParames;
import httpparams.KfcParames;
import httpparams.YouHuiQuanParames;
import interface1.HomePageParamesHttp;

/**
 * Created by Administrator on 2016/12/31.
 */

public class HomePageHttps implements HomePageParamesHttp {
    @Override
    public void HomePageHttp(final BeanCallback<HomeBean.DataBean> callback) {
        x.http().get(new HomePageListParames(), new HttpCallback() {
            @Override
            public void onSuccess(String result) {
                Log.e("at22",result);
                JSONObject jsonObject= null;
                try {
                    jsonObject = new JSONObject(result);
                } catch (JSONException e) {
                    e.printStackTrace();
                }
                if (jsonObject.optString("error_code").equals("0")){
                    Gson gson=new Gson();
                    HomeBean homeBean = gson.fromJson(result, HomeBean.class);
                    HomeBean.DataBean data = homeBean.getData();
                    callback.onSuccess(data);
                }else {
                    callback.onSuccess(null);
                }

            }

            @Override
            public void onFinished() {
               callback.onFinish();
            }
        });
    }

    @Override
    public void HomeDetailRcHttp(int pageindex, String youHuiType, final BeanCallback<List<ZuiYouHuiBean.DataBean.RowsBean>> beanCallback) {
        x.http().get(new HomeDetailRcParames(pageindex,youHuiType), new HttpCallback() {
            @Override
            public void onSuccess(String result) {
                Log.e("at22",result);
                JSONObject jsonObject= null;
                try {
                    jsonObject = new JSONObject(result);
                } catch (JSONException e) {
                    e.printStackTrace();
                }
                if (jsonObject.optString("error_code").equals("0")){
                    Gson gson=new Gson();
                    ZuiYouHuiBean zuiYouHuiBean = gson.fromJson(result, ZuiYouHuiBean.class);
                    ZuiYouHuiBean.DataBean data = zuiYouHuiBean.getData();
                    List<ZuiYouHuiBean.DataBean.RowsBean> rows = data.getRows();
                    beanCallback.onSuccess(rows);
                }else {
                    beanCallback.onSuccess(null);
                }

            }

            @Override
            public void onFinished() {
                beanCallback.onFinish();
            }
        });
    }

    @Override
    public void KFCHttp(final BeanCallback<List<KFCBean.DataBean.RowsBean>> callback) {
        x.http().get(new KfcParames(), new HttpCallback() {
            @Override
            public void onSuccess(String result) {
                Log.e("at22",result);
                JSONObject jsonObject= null;
                try {
                    jsonObject = new JSONObject(result);
                } catch (JSONException e) {
                    e.printStackTrace();
                }
                if (jsonObject.optString("error_code").equals("0")){
                    Gson gson=new Gson();
                    KFCBean kfcBean = gson.fromJson(result, KFCBean.class);
                    List<KFCBean.DataBean.RowsBean> rows = kfcBean.getData().getRows();
                   callback.onSuccess(rows);
                }else {
                   callback.onSuccess(null);
                }

            }

            @Override
            public void onFinished() {
                callback.onFinish();
            }
        });
    }
}
