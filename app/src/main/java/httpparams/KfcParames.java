package httpparams;

import org.xutils.http.RequestParams;
import org.xutils.http.annotation.HttpRequest;

import config.MyApp;
import config.ServiceInterface;

/**
 * Created by Administrator on 2016/12/28.
 */
@HttpRequest(host = ServiceInterface.BASEURL,path = ServiceInterface.KFC)
public class KfcParames extends RequestParams {
   public KfcParames(){
       addBodyParameter("usertoken", MyApp.getInstance().getUserToken());
   }
}
