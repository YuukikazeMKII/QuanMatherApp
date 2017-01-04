package interface1;

import java.util.List;

import bean.BannerAdsBean;
import bean.CommentBean;
import bean.CommentDataBean;
import bean.DianZanBean;
import base.BeanCallback;
import bean.SearchBean;
import bean.ShouCang;
import bean.ZhiYouHuiDetailBean;
import bean.ZuiYouHuiBean;

/**
 * Created by Administrator on 2016/12/28.
 */

public interface ZuiYouHui  {
    void ZuiYouHui(int pageindex, String youHuiType, String identifier, BeanCallback< List<ZuiYouHuiBean.DataBean.RowsBean>> callback);
    void ZuiYouHuiDetail(String goodsId, BeanCallback<ZhiYouHuiDetailBean.DataBean>callback);
    void DianZan(String goodsId, int type, BeanCallback<DianZanBean.DataBean> callback);
    void CommentHttps(String goodsId, int index, BeanCallback<List<CommentBean.DataBean.RowsBean>> callback);
    void SubComment(String goodsid, String content, BeanCallback<CommentDataBean.DataBean> callback);
    void ShouCangHttp(String goodsid, String content, BeanCallback<ShouCang.DataBean> callback);
    void SearchHttp(BeanCallback<SearchBean.DataBean>callback);
    void BrandListZd(int goodsId,String category ,BeanCallback<List<ZuiYouHuiBean.DataBean.RowsBean>> callback);
    void BrandAdsHttps(BeanCallback<List<BannerAdsBean.DataBean.RowsBean>> callback);

}
