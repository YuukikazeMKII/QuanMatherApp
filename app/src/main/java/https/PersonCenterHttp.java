package https;

import org.xutils.x;

import base.BeanCallback;
import base.HttpCallback;
import httpparams.MyOrderParames;
import interface1.MyInterface;

/**
 * Created by Administrator on 2016/12/28.
 */

public class PersonCenterHttp implements MyInterface {
    @Override
    public void MyOrder(final BeanCallback<String> callback) {
        x.http().get(new MyOrderParames(), new HttpCallback() {
            @Override
            public void onSuccess(String result) {
                   callback.onSuccess(result);
            }

            @Override
            public void onFinished() {
                  callback.onFinish();
            }
        });
    }
}
