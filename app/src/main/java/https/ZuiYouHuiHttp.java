package https;

import android.util.Log;

import com.google.gson.Gson;

import org.json.JSONException;
import org.json.JSONObject;
import org.xutils.http.RequestParams;
import org.xutils.x;

import java.util.List;

import bean.BannerAdsBean;
import bean.CommentBean;
import bean.CommentDataBean;
import bean.DianZanBean;
import base.BeanCallback;
import base.HttpCallback;
import bean.SearchBean;
import bean.ShouCang;
import bean.ZhiYouHuiDetailBean;
import bean.ZuiYouHuiBean;
import httpparams.BannerListParames;
import httpparams.BrandListParames;
import httpparams.CommentParames;
import httpparams.DianZanParames;
import httpparams.SearchParames;
import httpparams.ShouCangParames;
import httpparams.SubCommentParames;
import httpparams.ZdmListParames;
import httpparams.ZuiYouHuiDetailParames;
import httpparams.ZuiYouHuiParames;
import interface1.ZuiYouHui;

/**
 * Created by Administrator on 2016/12/28.
 */

public class ZuiYouHuiHttp implements ZuiYouHui {
    @Override
    public void ZuiYouHui(int pageindex, String youHuiType, String identifier, final BeanCallback< List<ZuiYouHuiBean.DataBean.RowsBean>> callback) {
        x.http().get(new ZuiYouHuiParames(pageindex, youHuiType, identifier), new HttpCallback() {
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
    public void ZuiYouHuiDetail(String goodsId, final BeanCallback<ZhiYouHuiDetailBean.DataBean> callback) {
        x.http().get(new ZuiYouHuiDetailParames(goodsId), new HttpCallback() {
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
                    ZhiYouHuiDetailBean zhiYouHuiDetailBean = gson.fromJson(result, ZhiYouHuiDetailBean.class);
                    ZhiYouHuiDetailBean.DataBean data = zhiYouHuiDetailBean.getData();
                    String article_filter_content = data.getArticle_filter_content();
                    Log.e("at22",article_filter_content);
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
    public void DianZan(String goodsId, int type, final BeanCallback<DianZanBean.DataBean> callback) {
        x.http().get(new DianZanParames(goodsId, type), new HttpCallback() {
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
                    DianZanBean dianZanBean = gson.fromJson(result, DianZanBean.class);
                    DianZanBean.DataBean data = dianZanBean.getData();
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
    public void CommentHttps(String goodsId, int index, final BeanCallback<List<CommentBean.DataBean.RowsBean>> callback) {
        x.http().get(new CommentParames(goodsId, index), new HttpCallback() {
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
                    CommentBean commentBean = gson.fromJson(result, CommentBean.class);
                    CommentBean.DataBean data = commentBean.getData();
                    List<CommentBean.DataBean.RowsBean> rows = data.getRows();
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
    public void SubComment(String goodsid, String content, final BeanCallback<CommentDataBean.DataBean> callback) {
        x.http().get(new SubCommentParames(goodsid, content), new HttpCallback() {
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
                    CommentDataBean commentDataBean = gson.fromJson(result, CommentDataBean.class);
                    CommentDataBean.DataBean data = commentDataBean.getData();
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
    public void ShouCangHttp(final String goodsid, String content, final BeanCallback<ShouCang.DataBean> callback) {



        x.http().get(new ShouCangParames(goodsid, content), new HttpCallback() {
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
                    ShouCang shouCang = gson.fromJson(result, ShouCang.class);
                    ShouCang.DataBean data = shouCang.getData();
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
    private RequestParams Re=new RequestParams("http://www.quanmama.com:8000//apios/appzdmsearchpage.ashx");
    @Override
    public void SearchHttp(final BeanCallback<SearchBean.DataBean> callback) {

        x.http().get(Re, new HttpCallback() {
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
                    SearchBean searchBean = gson.fromJson(result, SearchBean.class);
                    SearchBean.DataBean data = searchBean.getData();
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
    public void BrandListZd(final int goodsId, String category, final BeanCallback<List<ZuiYouHuiBean.DataBean.RowsBean>> callback) {
        x.http().get(new ZdmListParames(goodsId,category), new HttpCallback() {
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
    public void BrandAdsHttps(final BeanCallback<List<BannerAdsBean.DataBean.RowsBean>> callback) {
        x.http().get(new BannerListParames(), new HttpCallback() {
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
                    BannerAdsBean bannerAdsBean = gson.fromJson(result, BannerAdsBean.class);
                    BannerAdsBean.DataBean data = bannerAdsBean.getData();
                    List<BannerAdsBean.DataBean.RowsBean> rows = data.getRows();
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
