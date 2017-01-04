package httpparams;

import org.xutils.http.RequestParams;
import org.xutils.http.annotation.HttpRequest;

import bean.ClassMessageBean;
import config.MyApp;
import config.ServiceInterface;

/**
 * Created by Administrator on 2016/12/30.
 */
@HttpRequest(host = ServiceInterface.BASEURL,path =ServiceInterface.CLASSNAMEMeaage)
public class ClassMessageParames extends RequestParams {
    public ClassMessageParames(String goodsid){
        addBodyParameter("usertoken", MyApp.getInstance().getUserToken());
        addBodyParameter("categoryID", goodsid);
    }
}
