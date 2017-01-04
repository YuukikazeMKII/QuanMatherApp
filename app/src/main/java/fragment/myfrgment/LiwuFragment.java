package fragment.myfrgment;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RelativeLayout;
import android.widget.TextView;
import android.widget.Toast;

import base.BaseFragment;
import butterknife.BindView;
import butterknife.ButterKnife;
import xiangcuntiandi.quanmather.R;

/**
 * Created by Administrator on 2016/12/28.
 */

public class LiwuFragment extends BaseFragment {


    @BindView(R.id.rl_no_content)
    RelativeLayout rlNoContent;
    @BindView(R.id.tv_liwu)
    TextView tvLiwu;

    @Override
    public int getLayout() {
        return R.layout.mycard_fragment;
    }

    @Override
    public void initdata() {
        if (getArguments() != null) {
            String url = getArguments().getString("url");
            tvLiwu.setText(url);
        }
    }

}
