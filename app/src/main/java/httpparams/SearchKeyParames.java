package httpparams;

import org.xutils.http.RequestParams;
import org.xutils.http.annotation.HttpRequest;

import config.MyApp;
import config.ServiceInterface;

/**
 * Created by Administrator on 2016/12/28.
 */
@HttpRequest(host = ServiceInterface.BASEURL,path = ServiceInterface.ZDMLIST)
public class SearchKeyParames extends RequestParams {
    //pageindex=1&pagesize=20&category=13&sort=15&youhuitype=110103//发现
    //pageindex=1&pagesize=20&keyword=%E7%94%B5%E8%84%91&sort=15&youhuitype=1101
    //http://www.quanmama.com:8000/apios/v4/appZdmList.ashx?pageindex=1&pagesize=20&keyword=%E6%89%8B%E6%9C%BA&sort=15&youhuitype=1101
   public SearchKeyParames(int pageindex,String key, String youHuiType){
       addBodyParameter("usertoken", MyApp.getInstance().getUserToken());
       addBodyParameter("pageindex",pageindex+"");
       addBodyParameter("pagesize",20+"");
       addBodyParameter("keyword",key);
       addBodyParameter("sort","15");
       addBodyParameter("youhuitype",youHuiType);

   }
}
