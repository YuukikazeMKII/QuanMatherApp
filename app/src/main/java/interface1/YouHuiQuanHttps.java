package interface1;

import java.util.List;

import base.BeanCallback;
import bean.YouHuiBean;
import bean.YouHuiFragmentBean;
import bean.ZuiYouHuiBean;

/**
 * Created by Administrator on 2016/12/31.
 */

public interface YouHuiQuanHttps {
    void YouHuiQuanHttps(BeanCallback<YouHuiFragmentBean.DataBean>beanCallback);
    void DoYouHuiHttps(int page, String youhuitype, BeanCallback<List<YouHuiBean.DataBean.RowsBean>> callback);

}
