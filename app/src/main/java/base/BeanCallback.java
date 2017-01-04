package base;

/**
 * Created by Administrator on 2016/9/30.
 */
public interface BeanCallback<Bean> {
    public void onSuccess(Bean t);

    public void onFinish();

}
