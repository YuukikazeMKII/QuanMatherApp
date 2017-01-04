package https;

import com.google.gson.Gson;

import org.json.JSONException;
import org.json.JSONObject;
import org.xutils.x;

import java.util.List;

import base.BeanCallback;
import base.HttpCallback;
import bean.BannerListBean;
import bean.ClassMessageBean;
import bean.ClassNameBean;
import bean.ZuiYouHuiBean;
import httpparams.BrandListParames;
import httpparams.ClassMessageParames;
import httpparams.ClassNameParames;
import httpparams.SearchKeyParames;
import httpparams.SearchYouHuiParames;
import interface1.ClassNameHttpInteface;

/**
 * Created by Administrator on 2016/12/30.
 */

public class ClassNameHttps implements ClassNameHttpInteface {
    @Override
    public void ClassName(final BeanCallback<List<ClassNameBean.DataBean.CategoryOneBean>> callback) {
        x.http().get(new ClassNameParames(), new HttpCallback() {
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
                    ClassNameBean classNameBean = gson.fromJson(result, ClassNameBean.class);
                    List<ClassNameBean.DataBean.CategoryOneBean> category_one = classNameBean.getData().getCategory_one();

                    callback.onSuccess(category_one);
                }
            }

            @Override
            public void onFinished() {
                callback.onFinish();
            }
        });
    }

    @Override
    public void ClassMessage(String goodsid, final BeanCallback<List<ClassMessageBean.DataBean.TypesBean>> callback) {
        x.http().get(new ClassMessageParames(goodsid), new HttpCallback() {
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
                    ClassMessageBean classMessageBean = gson.fromJson(result, ClassMessageBean.class);
                    List<ClassMessageBean.DataBean.TypesBean> types = classMessageBean.getData().getTypes();
                    callback.onSuccess(types);

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
    public void ClassSearchHttp(int pageindex, String category, String youHuiType, final BeanCallback<List<ZuiYouHuiBean.DataBean.RowsBean>> callback) {
        x.http().get(new SearchYouHuiParames(pageindex, category, youHuiType), new HttpCallback() {
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
                    ZuiYouHuiBean zuiYouHuiBean = gson.fromJson(result, ZuiYouHuiBean.class);
                    ZuiYouHuiBean.DataBean data = zuiYouHuiBean.getData();
                    List<ZuiYouHuiBean.DataBean.RowsBean> rows = data.getRows();

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

    @Override
    public void ClassSearchKeyHttp(int pageindex, String category, String youHuiType, final BeanCallback<List<ZuiYouHuiBean.DataBean.RowsBean>> callback) {
        x.http().get(new SearchKeyParames(pageindex, category, youHuiType), new HttpCallback() {
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
                    ZuiYouHuiBean zuiYouHuiBean = gson.fromJson(result, ZuiYouHuiBean.class);
                    ZuiYouHuiBean.DataBean data = zuiYouHuiBean.getData();
                    List<ZuiYouHuiBean.DataBean.RowsBean> rows = data.getRows();

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

    @Override
    public void BrandListHttp(String goodid, final BeanCallback<List<BannerListBean.DataBean.HotMallsBean>> callback) {
        x.http().get(new BrandListParames(goodid), new HttpCallback() {
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
                    BannerListBean bannerListBean = gson.fromJson(result, BannerListBean.class);
                    List<BannerListBean.DataBean.HotMallsBean> hot_malls = bannerListBean.getData().getHot_malls();
                    callback.onSuccess(hot_malls);
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
