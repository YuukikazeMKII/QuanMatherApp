package activity.zhidemaiactivity;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.widget.DefaultItemAnimator;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.text.TextUtils;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

import activity.LoginActivity;
import adpter.PingLunAdpter;
import base.BaseActivity;
import base.BeanCallback;
import bean.CommentBean;
import bean.CommentDataBean;
import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;
import config.MyApp;
import https.ZuiYouHuiHttp;
import interface1.ZuiYouHui;
import utils.RefreshRecyclerView;
import xiangcuntiandi.quanmather.R;

/**
 * Created by Administrator on 2016/12/29.
 */

public class CommentActivity extends BaseActivity {
    @BindView(R.id.back_tital)
    ImageView backTital;
    @BindView(R.id.Rv)
    RelativeLayout Rv;
    @BindView(R.id.et_comment)
    EditText etComment;
    @BindView(R.id.LL)
    LinearLayout LL;
    @BindView(R.id.rv)
    RecyclerView rv;
    PingLunAdpter pingLunAdpter;
    ZuiYouHui zuiYouHui;
    @Override
    public int getLayout() {
        return R.layout.comment_activity;
    }
    int goodsId;
    List<CommentBean.DataBean.RowsBean> rowsBeanList=new ArrayList<>();
    @Override
    public void initView() {
        rowsBeanList.clear();
        goodsId = getIntent().getIntExtra("goodsId",1);
        pingLunAdpter=new PingLunAdpter(this);
        zuiYouHui=new ZuiYouHuiHttp();
        rv.setLayoutManager(new LinearLayoutManager(this));
        rv.setItemAnimator(new DefaultItemAnimator());
        rv.setAdapter(pingLunAdpter);
        doHttps(i);
    }
    int i=1;
    private void doHttps(int index) {
           zuiYouHui.CommentHttps("1875384", index, new BeanCallback<List<CommentBean.DataBean.RowsBean>>() {
               @Override
               public void onSuccess(List<CommentBean.DataBean.RowsBean> t) {
                   if (t!=null){

                         rowsBeanList.addAll(t);
                         pingLunAdpter.setData(rowsBeanList);
                         pingLunAdpter.notifyDataSetChanged();
                   }
               }

               @Override
               public void onFinish() {

               }
           });

    }

    @OnClick({R.id.back_tital, R.id.biaoqing, R.id.select})
    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.back_tital:
                finish();
                break;
            case R.id.biaoqing:
                break;
            case R.id.select:
                if (MyApp.getInstance().getUserToken()!=null&& !TextUtils.isEmpty(MyApp.getInstance().getUserToken())){
                    String string = etComment.getText().toString();
                    zuiYouHui.SubComment(goodsId + "", string, new BeanCallback<CommentDataBean.DataBean>() {
                        @Override
                        public void onSuccess(CommentDataBean.DataBean t) {
                            if (t!=null){
                                String msg = t.getMsg();
                                Toast.makeText(CommentActivity.this,msg,Toast.LENGTH_SHORT).show();
                            }
                        }

                        @Override
                        public void onFinish() {

                        }
                    });
                }else {
                    Intent intent=new Intent(CommentActivity.this, LoginActivity.class);
                    startActivity(intent);
                }

                break;
        }
    }
}
