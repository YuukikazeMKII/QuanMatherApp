package httpparams;

import org.xutils.http.RequestParams;
import org.xutils.http.annotation.HttpRequest;

import config.MyApp;
import config.ServiceInterface;

/**
 * Created by Administrator on 2016/12/31.
 */
@HttpRequest(host = ServiceInterface.BASEURL,path = ServiceInterface.BANNERLIAT)
public class HomePageListParames extends RequestParams {
    //http://www.quanmama.com:8000/apios/v4/appzdmbannerlist.ashx?&usertoken=&code=20&identifier=home&sort=1&apphomerankindex=1
    public HomePageListParames(){
        addBodyParameter("usertoken", MyApp.getInstance().getUserToken());
        addBodyParameter("identifier","home" );
        addBodyParameter("sort","1" );
        addBodyParameter("apphomerankindex", 1+"");
    }
}
