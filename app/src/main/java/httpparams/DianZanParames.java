package httpparams;

import org.xutils.http.RequestParams;
import org.xutils.http.annotation.HttpRequest;

import config.MyApp;
import config.ServiceInterface;

/**
 * Created by Administrator on 2016/12/29.
 */
@HttpRequest(host = ServiceInterface.BASEURL,path = ServiceInterface.USERACTION)
public class DianZanParames extends RequestParams {
    //usertoken=&postsysno=1881745&actiontype=0
   public DianZanParames(String goodsId,int type){
       addBodyParameter("usertoken", MyApp.getInstance().getUserToken());
       addBodyParameter("postsysno", goodsId);
       addBodyParameter("actiontype", type+"");
   }
}
