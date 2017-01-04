package httpparams;

import org.xutils.http.RequestParams;
import org.xutils.http.annotation.HttpRequest;

import config.MyApp;
import config.ServiceInterface;

/**
 * Created by Administrator on 2016/12/31.
 */
@HttpRequest(host = ServiceInterface.BASEURL,path = ServiceInterface.FULIBAR)
public class FuLibarParames extends RequestParams {
    public FuLibarParames(){
        addBodyParameter("usertoken", MyApp.getInstance().getUserToken());
        addBodyParameter("bar", "fulibar");
    }
}
