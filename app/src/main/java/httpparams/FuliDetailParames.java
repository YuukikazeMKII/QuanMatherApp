package httpparams;

import org.xutils.http.RequestParams;
import org.xutils.http.annotation.HttpRequest;

import config.MyApp;
import config.ServiceInterface;

/**
 * Created by Administrator on 2016/12/28.
 */
@HttpRequest(host = ServiceInterface.BASEURL,path = ServiceInterface.ZDMLIST)
public class FuliDetailParames extends RequestParams {
  //usertoken=&pageindex=1&pagesize=20&channelrankindex=10&sort=15&youhuitype=12
   public FuliDetailParames(int pageindex, String youHuiType){
       addBodyParameter("usertoken", MyApp.getInstance().getUserToken());
       addBodyParameter("pageindex",pageindex+"");
       addBodyParameter("pagesize",20+"");
       addBodyParameter("youhuitype",youHuiType);
       addBodyParameter("apphomerankindex",1+"");
   }
}
