package interface1;

import java.util.List;

import base.BeanCallback;
import bean.HomeBean;
import bean.KFCBean;
import bean.ZuiYouHuiBean;

/**
 * Created by Administrator on 2016/12/31.
 */

public interface HomePageParamesHttp {

    void HomePageHttp(BeanCallback<HomeBean.DataBean> callback);
    void HomeDetailRcHttp(int pageindex, String youHuiType, BeanCallback<List<ZuiYouHuiBean.DataBean.RowsBean>> beanCallback);
    void KFCHttp(BeanCallback<List<KFCBean.DataBean.RowsBean>> callback);
}
