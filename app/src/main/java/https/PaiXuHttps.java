package https;

import com.google.gson.Gson;

import org.json.JSONException;
import org.json.JSONObject;
import org.xutils.x;

import java.util.List;

import base.BeanCallback;
import base.HttpCallback;
import bean.BannerAdsBean;
import bean.BrandDetailBean;
import bean.ClassNameBean;
import httpparams.BannerListParames;
import httpparams.BrandDetailParames;
import httpparams.BrandListParames;
import httpparams.BrandPaixuParames;
import httpparams.ClassNameParames;
import interface1.BrandListPaiXuHttps;
import utils.paixu.SortModel;

/**
 * Created by Administrator on 2016/12/31.
 */

public class PaiXuHttps implements BrandListPaiXuHttps {
    @Override
    public void PaiXuList(final BeanCallback<List<SortModel.DataBean.MallsBean>> callback) {
        x.http().get(new BrandPaixuParames(), new HttpCallback() {
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
                    SortModel sortModel = gson.fromJson(result, SortModel.class);
                    List<SortModel.DataBean.MallsBean> malls = sortModel.getData().getMalls();
                    callback.onSuccess(malls);
                }
            }

            @Override
            public void onFinished() {
                callback.onFinish();
            }
        });
    }

    @Override
    public void BrandDetailHttps(int i, final String goods, final BeanCallback<BrandDetailBean.DataBean> callback) {
        x.http().get(new BrandDetailParames(i,goods), new HttpCallback() {
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
                    BrandDetailBean brandDetailBean = gson.fromJson(result, BrandDetailBean.class);
                    BrandDetailBean.DataBean data = brandDetailBean.getData();
                    callback.onSuccess(data);
                }
            }

            @Override
            public void onFinished() {
                callback.onFinish();
            }
        });
    }


}
