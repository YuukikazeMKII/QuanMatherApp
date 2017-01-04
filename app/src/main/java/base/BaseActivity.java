package base;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;

import butterknife.ButterKnife;
import config.MyApp;

/**
 * Created by Administrator on 2016/12/27.
 */

public abstract class BaseActivity extends AppCompatActivity {

    {
        MyApp.getInstance().AddActivity(this);
    }
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(getLayout());
        ButterKnife.bind(this);
        initView();
    }

    public abstract int getLayout();
    public abstract void initView();
}
