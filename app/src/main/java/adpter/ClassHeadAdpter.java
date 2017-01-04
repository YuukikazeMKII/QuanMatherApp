package adpter;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import java.util.List;

import bean.ClassNameBean;
import xiangcuntiandi.quanmather.R;

/**
 * Created by Administrator on 2016/12/30.
 */

public class ClassHeadAdpter extends BaseAdapter {


    private final List<ClassNameBean.DataBean.CategoryOneBean> list;
    private final Context context;

    public ClassHeadAdpter(Context context, List<ClassNameBean.DataBean.CategoryOneBean> list){
       this.context=context;
       this.list=list;
   }

    @Override
    public int getCount() {
        return list.size();
    }

    @Override
    public ClassNameBean.DataBean.CategoryOneBean getItem(int i) {
        return list.get(i);
    }

    @Override
    public long getItemId(int i) {
        return 0;
    }

    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {

            view=View.inflate(context, R.layout.classinametem,null);
            TextView viewById = (TextView) view.findViewById(R.id.tv_name);
            ClassNameBean.DataBean.CategoryOneBean categoryOneBean = list.get(i);
            viewById.setText(categoryOneBean.getName());
        return view;
    }
}
