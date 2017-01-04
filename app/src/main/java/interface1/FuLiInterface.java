package interface1;

import java.util.List;

import base.BeanCallback;
import bean.FuLiBar;
import bean.FuLiBean;
import bean.ZuiYouHuiBean;
import httpparams.FuLiParames;

/**
 * Created by Administrator on 2016/12/31.
 */

public interface FuLiInterface {
    void FuLiHttps(int page, String identifier , BeanCallback<List<FuLiBean.DataBean.RowsBean>> beanCallback);
    void FuLiBarHttp(BeanCallback<List<FuLiBar.DataBean.RowsBean>> callback);
    void FULiDetail(int pageindex, String youHuiType ,BeanCallback<List<ZuiYouHuiBean.DataBean.RowsBean>> callback);
}
