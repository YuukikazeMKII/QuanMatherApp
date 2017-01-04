package fragment;

import android.content.Intent;
import android.os.Bundle;
import android.os.Parcelable;
import android.text.Editable;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;

import com.bumptech.glide.Glide;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import activity.LoginActivity;
import activity.my.HotGameActivity;
import activity.my.KFCQuanActivity;
import activity.my.MyCardQuanActivity;
import activity.my.MyShouCangActivity;
import activity.my.OrderCenter;
import activity.my.SettingActivity;
import base.BaseFragment;
import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;
import config.MyApp;
import wight.CicImageView;
import wight.CircleImageView;
import xiangcuntiandi.quanmather.R;

/**
 * Created by Administrator on 2016/12/27.
 */

public class mefragment extends BaseFragment implements TextWatcher {
    @BindView(R.id.civ)
    CicImageView civ;
    @BindView(R.id.username)
    TextView username;
    @BindView(R.id.login_button)
    Button loginButton;
    private int REQ_CODE=5;

    @Override
    public int getLayout() {
        Log.e("at22", 2 + "");
        return R.layout.mefragment;
    }
    List<String> titleList=new ArrayList<>();
    @Override
    public void initdata() {
              username.addTextChangedListener(this);
    }

    @OnClick({R.id.login_button, R.id.myorder, R.id.mycard, R.id.my_kfc, R.id.game, R.id.commend, R.id.shouchang, R.id.setting})
    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.login_button:
                Intent intent=new Intent(getActivity(), LoginActivity.class);
                startActivityForResult(intent,REQ_CODE);
                break;
            case R.id.myorder:
                Intent orintent=new Intent(getActivity(), OrderCenter.class);
                startActivity(orintent);
                break;
            case R.id.mycard:
                Intent mycardintent=new Intent(getActivity(), MyCardQuanActivity.class);
                mycardintent.putExtra("url1","优惠券url");
                mycardintent.putExtra("url2","礼品券url");
                mycardintent.putExtra("title1","优惠券");
                mycardintent.putExtra("title2","礼品券");
                startActivity(mycardintent);
                break;
            case R.id.my_kfc:
                Intent kfcintent=new Intent(getActivity(), KFCQuanActivity.class);
                startActivity(kfcintent);
                break;
            case R.id.game:
                Intent gameintent=new Intent(getActivity(), HotGameActivity.class);
                startActivity(gameintent);
                break;
            case R.id.commend:
                Intent commend=new Intent(getActivity(), MyCardQuanActivity.class);
                commend.putExtra("url1","收到的评论");
                commend.putExtra("url2","发出的评论");
                commend.putExtra("title1","收到的评论");
                commend.putExtra("title2","发出的评论");
                startActivity(commend);
                break;
            case R.id.shouchang:
                Intent shouchang=new Intent(getActivity(), MyShouCangActivity.class);
                startActivity(shouchang);
                break;
            case R.id.setting:
                Intent setting=new Intent(getActivity(), SettingActivity.class);
                startActivity(setting);
                break;
        }
    }

    @Override
    public void onActivityResult(int requestCode, int resultCode, Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
        if (REQ_CODE==requestCode&&resultCode==getActivity().RESULT_OK)
        if (MyApp.getInstance().getHeadpic()!=null&&!TextUtils.isEmpty(MyApp.getInstance().getUsername())){
            Glide.with(getActivity()).load(MyApp.getInstance().getHeadpic()).into(civ);
            username.setText(MyApp.getInstance().getUsername());
        }

    }

    @Override
    public void beforeTextChanged(CharSequence charSequence, int i, int i1, int i2) {

    }

    @Override
    public void onTextChanged(CharSequence charSequence, int i, int i1, int i2) {
           if (username.getText().toString().length()==0&&TextUtils.isEmpty(username.getText().toString())){
               loginButton.setVisibility(View.VISIBLE);
           }else {
               loginButton.setVisibility(View.GONE);
           }
    }

    @Override
    public void afterTextChanged(Editable editable) {

    }
}
