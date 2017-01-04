package httpparams;

import org.xutils.http.RequestParams;
import org.xutils.http.annotation.HttpRequest;

import config.MyApp;
import config.ServiceInterface;

/**
 * Created by Administrator on 2016/12/28.
 */
@HttpRequest(host = ServiceInterface.BASEURL,path = ServiceInterface.ZDMLIST)
public class YouHuiDetailParames extends RequestParams {
    //http://www.quanmama.com:8000/apios/v4/appZdmList.ashx?&usertoken=&pageindex=1&pagesize=20&channelrankindex=1&youhuitype=10010201
   public YouHuiDetailParames(int page,String youhuitype ){
       addBodyParameter("usertoken", MyApp.getInstance().getUserToken());
       addBodyParameter("pageindex",page+"");
       addBodyParameter("pagesize",20+"");
       addBodyParameter("channelrankindex","1");
       addBodyParameter("youhuitype",youhuitype);
   }
}
