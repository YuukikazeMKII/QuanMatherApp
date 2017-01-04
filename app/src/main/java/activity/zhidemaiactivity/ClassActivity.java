package activity.zhidemaiactivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ImageView;
import android.widget.ListView;

import com.superrecycleview.superlibrary.recycleview.SuperRecyclerView;

import java.util.ArrayList;
import java.util.List;

import adpter.ClassHeadAdpter;
import adpter.ClassMessageAdpter;
import adpter.ClassMessageRecAdpter;
import base.BaseActivity;
import base.BeanCallback;
import bean.ClassMessageBean;
import bean.ClassNameBean;
import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;
import https.ClassNameHttps;
import interface1.ClassNameHttpInteface;
import utils.ListViewOnscrollLister;
import xiangcuntiandi.quanmather.R;

/**
 * Created by Administrator on 2016/12/30.
 */

public class ClassActivity extends BaseActivity implements AdapterView.OnItemClickListener {
    @BindView(R.id.back_tital)
    ImageView backTital;
    @BindView(R.id.list_view)
    ListView listView;
    @BindView(R.id.lv_content)
    ListView lvContent;
    ClassNameHttpInteface classNameHttpInteface;
    List<ClassNameBean.DataBean.CategoryOneBean> categoryOneBeen=new ArrayList<>();
    ClassHeadAdpter classHeadAdpter;

    List<ClassMessageBean.DataBean.TypesBean> typesBeen=new ArrayList<>();
    ClassMessageAdpter classMessageRecAdpter;

    @Override
    public int getLayout() {
        return R.layout.class_activity;
    }

    @Override
    public void initView() {
        classMessageRecAdpter=new ClassMessageAdpter(this,typesBeen);
        classNameHttpInteface=new ClassNameHttps();
        classHeadAdpter=new ClassHeadAdpter(ClassActivity.this,categoryOneBeen);
        listView.setAdapter(classHeadAdpter);
        listView.setOnItemClickListener(this);
        lvContent.setAdapter(classMessageRecAdpter);
        doHttp();
    }

    private void doHttp() {
        classNameHttpInteface.ClassName(new BeanCallback<List<ClassNameBean.DataBean.CategoryOneBean>>() {
            @Override
            public void onSuccess(List<ClassNameBean.DataBean.CategoryOneBean> t) {
                if (t!=null){
                    categoryOneBeen.addAll(t);
                    classHeadAdpter.notifyDataSetChanged();
                }
            }

            @Override
            public void onFinish() {

            }
        });
    }

    @OnClick(R.id.back_tital)
    public void onClick() {

    }

    @Override
    public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
        ClassNameBean.DataBean.CategoryOneBean categoryOneBean = categoryOneBeen.get(i);
        String id = categoryOneBean.getId();
        doClassMessage(id);
    }
     public  void doClassMessage(final String id){
      classNameHttpInteface.ClassMessage(id, new BeanCallback<List<ClassMessageBean.DataBean.TypesBean>>() {
          @Override
          public void onSuccess(List<ClassMessageBean.DataBean.TypesBean> t) {
              typesBeen.clear();
              if (t!=null){
                  typesBeen.addAll(t);
                  classMessageRecAdpter.notifyDataSetChanged();
                  for (ClassMessageBean.DataBean.TypesBean typesBean : t) {
                      String url = typesBean.getUrl();
                      Log.e("at22",url.toString());
                  }

              }
          }

          @Override
          public void onFinish() {

          }
      });
  }
}
