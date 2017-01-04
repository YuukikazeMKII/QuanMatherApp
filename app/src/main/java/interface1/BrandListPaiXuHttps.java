package interface1;

import java.util.List;

import base.BeanCallback;
import bean.BannerAdsBean;
import bean.BrandDetailBean;
import utils.paixu.SortModel;

/**
 * Created by Administrator on 2016/12/31.
 */

public interface BrandListPaiXuHttps {
    void  PaiXuList(BeanCallback<List<SortModel.DataBean.MallsBean>> callback);
    void  BrandDetailHttps(int i,String goods,BeanCallback<BrandDetailBean.DataBean> callback);
    //精选内容：广告
}
