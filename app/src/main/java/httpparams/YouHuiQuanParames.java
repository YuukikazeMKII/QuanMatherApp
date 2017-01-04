package httpparams;

import org.xutils.http.RequestParams;
import org.xutils.http.annotation.HttpRequest;

import config.MyApp;
import config.ServiceInterface;

/**
 * Created by Administrator on 2016/12/31.
 */
@HttpRequest(host = ServiceInterface.BASEURL,path = ServiceInterface.BaANNERLIAT)
public class YouHuiQuanParames extends RequestParams {
    //usertoken=&youhuitype=10&identifier=youhui
    public YouHuiQuanParames(){
        addBodyParameter("usertoken", MyApp.getInstance().getUserToken());
        addBodyParameter("youhuitype",10+"");
        addBodyParameter("identifier","youhui");
    }
}
