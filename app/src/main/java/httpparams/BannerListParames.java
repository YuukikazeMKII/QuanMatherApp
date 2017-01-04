package httpparams;

import org.xutils.http.RequestParams;
import org.xutils.http.annotation.HttpRequest;

import config.MyApp;
import config.ServiceInterface;

/**
 * Created by Administrator on 2016/12/28.
 */
@HttpRequest(host = ServiceInterface.BASEURL,path = ServiceInterface.BaANNERLIAT)
public class BannerListParames extends RequestParams {
   public BannerListParames(){
       addBodyParameter("usertoken", MyApp.getInstance().getUserToken());
       addBodyParameter("youhuitype","1101");
       addBodyParameter("channelrankindex",1+"");
       addBodyParameter("identifier","jinxuan");
       addBodyParameter("sort","15");
   }
}
