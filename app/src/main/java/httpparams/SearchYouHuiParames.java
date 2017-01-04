package httpparams;

import org.xutils.http.RequestParams;
import org.xutils.http.annotation.HttpRequest;

import config.MyApp;
import config.ServiceInterface;

/**
 * Created by Administrator on 2016/12/28.
 */
@HttpRequest(host = ServiceInterface.BASEURL,path = ServiceInterface.ZDMLIST)
public class SearchYouHuiParames extends RequestParams {
    //pageindex=1&pagesize=20&category=13&sort=15&youhuitype=110103//发现
   public SearchYouHuiParames(int pageindex, String category, String youHuiType){
       addBodyParameter("usertoken", MyApp.getInstance().getUserToken());
       addBodyParameter("pageindex",pageindex+"");
       addBodyParameter("pagesize",20+"");
       addBodyParameter("category",category);
       addBodyParameter("sort","15");
       addBodyParameter("youhuitype",youHuiType);
   }
}
