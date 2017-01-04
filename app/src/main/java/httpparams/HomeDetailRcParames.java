package httpparams;

import org.xutils.http.RequestParams;
import org.xutils.http.annotation.HttpRequest;

import config.MyApp;
import config.ServiceInterface;

/**
 * Created by Administrator on 2016/12/31.
 */
@HttpRequest(host = ServiceInterface.BASEURL,path = ServiceInterface.ZDMLIST)
public class HomeDetailRcParames extends RequestParams {
    public HomeDetailRcParames(int page, String identifier ){
       // usertoken=&pageindex=1&pagesize=20&identifier=fuli
        //http://www.quanmama.com:8000/apios/v4/appzdmbannerlist.ashx?&usertoken=&code=20&identifier=home&sort=1&apphomerankindex=1
        addBodyParameter("usertoken", MyApp.getInstance().getUserToken());
        addBodyParameter("pageindex", page+"");
        addBodyParameter("pageindex", 20+"");
        addBodyParameter("identifier", identifier);
    }
}
