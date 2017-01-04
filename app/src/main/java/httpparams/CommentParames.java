package httpparams;

import org.xutils.http.RequestParams;
import org.xutils.http.annotation.HttpRequest;

import config.MyApp;
import config.ServiceInterface;

/**
 * Created by Administrator on 2016/12/29.
 */
@HttpRequest(host = ServiceInterface.BASEURL,path = ServiceInterface.COMMENTLIST)
public class CommentParames extends RequestParams {
    //postSysNo=1881576&pagesize=20&pageindex=1
    public CommentParames(String goodsId,int index){
        addBodyParameter("usertoken",MyApp.getInstance().getUserToken());
        addBodyParameter("postSysNo",goodsId);
        addBodyParameter("pagesize",20+"");
        addBodyParameter("pageindex",index+"");
    }
}
