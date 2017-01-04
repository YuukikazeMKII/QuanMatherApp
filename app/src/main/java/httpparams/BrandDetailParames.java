package httpparams;

import org.xutils.http.RequestParams;
import org.xutils.http.annotation.HttpRequest;

import config.MyApp;
import config.ServiceInterface;

/**
 * Created by Administrator on 2016/12/29.
 */
@HttpRequest(host = ServiceInterface.BASEURL,path = ServiceInterface.PAIXULIAT)
public class BrandDetailParames extends RequestParams {
    //usertoken=&postsysno=1881745&actiontype=0
    //http://www.quanmama.com:8000/apios/v2/appZdmStore.ashx?&usertoken=&code=20&type=detail&pagesize=20&pageindex=1&site=beibei.com
   public BrandDetailParames(int i,String goodsId){
       addBodyParameter("usertoken", MyApp.getInstance().getUserToken());
       addBodyParameter("type", "detail");
       addBodyParameter("pageindex" ,i+"");
       addBodyParameter("pagesize" ,20+"");
       addBodyParameter("site" ,goodsId);

   }
}
