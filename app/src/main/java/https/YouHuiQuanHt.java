package https;

import android.util.Log;

import com.google.gson.Gson;

import org.json.JSONException;
import org.json.JSONObject;
import org.xutils.x;

import java.util.List;

import base.BeanCallback;
import base.HttpCallback;
import bean.YouHuiBean;
import bean.YouHuiFragmentBean;
import bean.ZuiYouHuiBean;
import httpparams.YouHuiDetailParames;
import httpparams.YouHuiQuanParames;
import httpparams.ZuiYouHuiParames;
import interface1.YouHuiQuanHttps;

import static android.R.attr.data;

/**
 * Created by Administrator on 2016/12/31.
 */

public class YouHuiQuanHt implements YouHuiQuanHttps {
    @Override
    public void YouHuiQuanHttps(final BeanCallback<YouHuiFragmentBean.DataBean> beanCallback) {
        x.http().get(new YouHuiQuanParames(), new HttpCallback() {
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
                    YouHuiFragmentBean youHuiFragmentBean = gson.fromJson(result, YouHuiFragmentBean.class);
                    YouHuiFragmentBean.DataBean data = youHuiFragmentBean.getData();
                    beanCallback.onSuccess(data);
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
    public void DoYouHuiHttps(int page, String youhuitype, final BeanCallback<List<YouHuiBean.DataBean.RowsBean>> callback) {
        YouHuiDetailParames youHuiDetailParames = new YouHuiDetailParames(page, youhuitype);
        String string = youHuiDetailParames.toString();
        Log.e("at22","-----------------------"+string);
        x.http().get(youHuiDetailParames, new HttpCallback() {
            @Override
            public void onSuccess(String result) {
                Log.e("at22","------------------"+result);
                JSONObject jsonObject= null;
                try {
                    jsonObject = new JSONObject(result);
                } catch (JSONException e) {
                    e.printStackTrace();
                }
                if (jsonObject.optString("error_code").equals("0")){
                    Gson gson=new Gson();
                    YouHuiBean youHuiBean = gson.fromJson(result, YouHuiBean.class);
                    List<YouHuiBean.DataBean.RowsBean> rows = youHuiBean.getData().getRows();
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
