package https;

import android.util.Log;

import com.google.gson.Gson;

import org.json.JSONException;
import org.json.JSONObject;
import org.xutils.x;

import java.util.List;

import base.BeanCallback;
import base.HttpCallback;
import bean.BrandDetailBean;
import bean.FuLiBar;
import bean.FuLiBean;
import bean.ZuiYouHuiBean;
import httpparams.BrandDetailParames;
import httpparams.FuLiParames;
import httpparams.FuLibarParames;
import httpparams.FuliDetailParames;
import interface1.FuLiInterface;

/**
 * Created by Administrator on 2016/12/31.
 */

public class FuLiHttps implements FuLiInterface {
    @Override
    public void FuLiHttps(int page, String identifier, final BeanCallback<List<FuLiBean.DataBean.RowsBean>> beanCallback) {
        x.http().get(new FuLiParames(page,identifier), new HttpCallback() {
            @Override
            public void onSuccess(String result) {
                JSONObject jsonObject= null;
                try {
                    jsonObject = new JSONObject(result);
                } catch (JSONException e) {
                    e.printStackTrace();
                }
                if (jsonObject.optString("error_code").equals("0")){
                    Gson gson=new Gson();
                    FuLiBean fuLiBean = gson.fromJson(result, FuLiBean.class);
                    List<FuLiBean.DataBean.RowsBean> rows = fuLiBean.getData().getRows();
                   beanCallback.onSuccess(rows);
                }
            }

            @Override
            public void onFinished() {

                beanCallback.onFinish();
            }
        });
    }

    @Override
    public void FuLiBarHttp(final BeanCallback<List<FuLiBar.DataBean.RowsBean>> callback) {
        x.http().get(new FuLibarParames(), new HttpCallback() {
            @Override
            public void onSuccess(String result) {
                JSONObject jsonObject= null;
                try {
                    jsonObject = new JSONObject(result);
                } catch (JSONException e) {
                    e.printStackTrace();
                }
                if (jsonObject.optString("error_code").equals("0")){
                    Gson gson=new Gson();
                    FuLiBar fuLiBar = gson.fromJson(result, FuLiBar.class);
                    List<FuLiBar.DataBean.RowsBean> rows = fuLiBar.getData().getRows();
                   callback.onSuccess(rows);
                }
            }

            @Override
            public void onFinished() {

               callback.onFinish();
            }
        });

    }

    @Override
    public void FULiDetail(int pageindex, String youHuiType, final BeanCallback<List<ZuiYouHuiBean.DataBean.RowsBean>> callback) {
        x.http().get(new FuliDetailParames(pageindex,youHuiType), new HttpCallback() {
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
                    List<ZuiYouHuiBean.DataBean.RowsBean> rows = zuiYouHuiBean.getData().getRows();
                    callback.onSuccess(rows);
                }
            }

            @Override
            public void onFinished() {

                callback.onFinish();
            }
        });
    }
}
