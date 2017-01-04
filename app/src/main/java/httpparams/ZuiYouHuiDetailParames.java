package httpparams;

import org.xutils.http.RequestParams;
import org.xutils.http.annotation.HttpRequest;

import config.MyApp;
import config.ServiceInterface;

/**
 * Created by Administrator on 2016/12/28.
 */
@HttpRequest(host = ServiceInterface.BASEURL,path = ServiceInterface.ZUIDETAIL)
public class ZuiYouHuiDetailParames extends RequestParams {
    public ZuiYouHuiDetailParames(String id){
        addBodyParameter("usertoken", MyApp.getInstance().getUserToken());
        addBodyParameter("postSysNo",id);
    }
}
