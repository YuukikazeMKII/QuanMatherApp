package httpparams;

import org.xutils.http.RequestParams;
import org.xutils.http.annotation.HttpRequest;

import config.MyApp;
import config.ServiceInterface;

/**
 * Created by Administrator on 2016/12/28.
 */
@HttpRequest(host = ServiceInterface.BASEURL,path = ServiceInterface.ZDMLIST)
public class ZuiYouHuiParames extends RequestParams {
    //usertoken=&code=20&pageindex=2&pagesize=20&channelrankindex=1&sort=15&youhuitype=1101&identifier=jinxuan
   public ZuiYouHuiParames(int pageindex,String youHuiType,String identifier){
       addBodyParameter("usertoken", MyApp.getInstance().getUserToken());
       addBodyParameter("pageindex",pageindex+"");
       addBodyParameter("pagesize",20+"");
       addBodyParameter("sort","15");
       addBodyParameter("youhuitype",youHuiType);
       addBodyParameter("identifier",identifier);
   }
}
