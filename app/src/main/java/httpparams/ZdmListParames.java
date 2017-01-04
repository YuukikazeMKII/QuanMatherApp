package httpparams;

import org.xutils.http.RequestParams;
import org.xutils.http.annotation.HttpRequest;

import config.MyApp;
import config.ServiceInterface;

/**
 * Created by Administrator on 2016/12/31.
 */
@HttpRequest(host = ServiceInterface.BASEURL,path = ServiceInterface.ZDMLIST)
public class ZdmListParames extends RequestParams{
    public ZdmListParames(int pageindex,String category){
        addBodyParameter("usertoken", MyApp.getInstance().getUserToken());
        addBodyParameter("pageindex",pageindex+"");
        addBodyParameter("pagesize",20+"");
        addBodyParameter("category",category);
    }

}
