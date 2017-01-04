package httpparams;

import org.xutils.http.RequestParams;
import org.xutils.http.annotation.HttpRequest;

import config.MyApp;
import config.ServiceInterface;

/**
 * Created by Administrator on 2016/12/31.
 */
@HttpRequest(host = ServiceInterface.BASEURL,path = ServiceInterface.appFuli)
public class FuLiParames extends RequestParams {
    public FuLiParames(int page,String identifier ){
       // usertoken=&pageindex=1&pagesize=20&identifier=fuli
        addBodyParameter("usertoken", MyApp.getInstance().getUserToken());
        addBodyParameter("pageindex", page+"");
        addBodyParameter("pageindex", 20+"");
        addBodyParameter("identifier", identifier);
    }
}
