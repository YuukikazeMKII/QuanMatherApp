package httpparams;

import org.xutils.http.RequestParams;
import org.xutils.http.annotation.HttpRequest;

import config.MyApp;
import config.ServiceInterface;

/**
 * Created by Administrator on 2016/12/29.
 */
@HttpRequest(host = ServiceInterface.BASEURL,path = ServiceInterface.SUBCOMMENT)
public class SubCommentParames extends RequestParams {
    public SubCommentParames(String goodsId,String content){
        //&postsysno=1875384&content=1111111
        addBodyParameter("usertoken", MyApp.getInstance().getUserToken());
        addBodyParameter("postsysno",goodsId);
        addBodyParameter("content",content);
    }
}
