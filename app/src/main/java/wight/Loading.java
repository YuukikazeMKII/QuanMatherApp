package wight;

import android.app.Dialog;
import android.content.Context;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.RelativeLayout;

import com.ldoublem.loadingviewlib.LVCircularCD;
import com.ldoublem.loadingviewlib.view.LVBlazeWood;

import xiangcuntiandi.quanmather.R;

/**
 * Created by Administrator on 2016/12/29.
 */

public class Loading extends Dialog {

    public Loading(Context context) {
        super(context,R.style.PublishDialogTheme);
    }
    LVBlazeWood view;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        RelativeLayout layout = new RelativeLayout(getContext());
        view= new LVBlazeWood(getContext());
        layout.addView(view);
        RelativeLayout.LayoutParams params = new RelativeLayout.LayoutParams(-2, -2);
        params.addRule(RelativeLayout.CENTER_IN_PARENT, RelativeLayout.TRUE);
        view.setLayoutParams(params);
        setContentView(layout);
        //不允许用户关闭
//        setCancelable(false);
    }

    @Override
    public void show() {
        super.show();
        view.startAnim();
    }

    @Override
    public void dismiss() {
        super.dismiss();
        view.stopAnim();
    }
}
