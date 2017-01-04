package httpparams;

import org.xutils.http.RequestParams;
import org.xutils.http.annotation.HttpRequest;

import config.MyApp;
import config.ServiceInterface;

/**
 * Created by Administrator on 2016/12/30.
 */
@HttpRequest(host = ServiceInterface.BASEURL,path = ServiceInterface.FAVACYION)
public class ShouCangParames extends RequestParams {
    //?&usertoken=&postSysNo=1882010&favAction=101
  public   ShouCangParames(String goodsId,String type){
      addBodyParameter("usertoken", MyApp.getInstance().getUserToken());
      addBodyParameter("postSysNo",goodsId );
      addBodyParameter("favAction", type);

  }
}
