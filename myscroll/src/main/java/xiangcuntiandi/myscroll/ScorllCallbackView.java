package xiangcuntiandi.myscroll;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.ScrollView;

/**
 * Created by Administrator on 2016/10/25.
 */
public class ScorllCallbackView extends ScrollView {
    public ScorllCallbackView(Context context) {
        super(context);
    }

    public ScorllCallbackView(Context context, AttributeSet attrs) {
        super(context, attrs);
    }


    @Override
    protected void onScrollChanged(int l, int t, int oldl, int oldt) {
        super.onScrollChanged(l, t, oldl, oldt);
        //返回当前滑动的X Y轴
        if (onScrollYChangedListener != null)
            onScrollYChangedListener.onScrollYChanged(t);
    }


    public void setOnScrollYChangedListener(OnScrollYChangedListener onScrollYChangedListener) {
        this.onScrollYChangedListener = onScrollYChangedListener;
    }

    OnScrollYChangedListener onScrollYChangedListener;

    public interface OnScrollYChangedListener {
        void onScrollYChanged(int y);


    }
}
