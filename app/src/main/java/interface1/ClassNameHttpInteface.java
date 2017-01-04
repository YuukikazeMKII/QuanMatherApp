package interface1;

import java.util.List;

import base.BeanCallback;
import bean.BannerListBean;
import bean.ClassMessageBean;
import bean.ClassNameBean;
import bean.ZuiYouHuiBean;

/**
 * Created by Administrator on 2016/12/30.
 */

public interface ClassNameHttpInteface  {
void ClassName(BeanCallback<List<ClassNameBean.DataBean.CategoryOneBean>> callback);
 void ClassMessage(String goodsid,BeanCallback<List<ClassMessageBean.DataBean.TypesBean>>callback);
 void ClassSearchHttp(int pageindex, String category, String youHuiType, BeanCallback<List<ZuiYouHuiBean.DataBean.RowsBean>> callback);
 void ClassSearchKeyHttp(int pageindex, String category, String youHuiType, BeanCallback<List<ZuiYouHuiBean.DataBean.RowsBean>> callback);
 void BrandListHttp(String goodid, BeanCallback<List<BannerListBean.DataBean.HotMallsBean>> callback);
}
