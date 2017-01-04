package httpparams;

import org.xutils.http.RequestParams;
import org.xutils.http.annotation.HttpRequest;

import config.MyApp;
import config.ServiceInterface;

/**
 * Created by Administrator on 2016/12/30.
 */
@HttpRequest(host = ServiceInterface.BASEURL,path = ServiceInterface.CLASSNAME)
public class ClassNameParames extends RequestParams {
   public ClassNameParames(){
       addBodyParameter("usertoken", MyApp.getInstance().getUserToken());
   }
}
