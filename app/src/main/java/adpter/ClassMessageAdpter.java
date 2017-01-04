package adpter;

import android.content.Context;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

import activity.zhidemaiactivity.ClassActivity;
import bean.ClassMessageBean;
import butterknife.BindView;
import butterknife.ButterKnife;
import utils.ListViewOnscrollLister;
import xiangcuntiandi.quanmather.R;

/**
 * Created by Administrator on 2016/12/30.
 */

public class ClassMessageAdpter extends BaseAdapter {

    private final List<ClassMessageBean.DataBean.TypesBean> type;
    private final Context context;
    ClassMessageRecAdpter classMessageRecAdpter;
    List<ClassMessageBean.DataBean.TypesBean.ShopsBean> typesBeen1=new ArrayList<>();

    public ClassMessageAdpter(Context context, List<ClassMessageBean.DataBean.TypesBean> typesBeen) {
        this.context = context;
        this.type = typesBeen;
        classMessageRecAdpter=new ClassMessageRecAdpter(context);
        onscrollLister=new ListViewOnscrollLister(classMessageRecAdpter);

    }
    public static ListViewOnscrollLister onscrollLister;
    @Override
    public int getCount() {
        return type.size();
    }

    @Override
    public ClassMessageBean.DataBean.TypesBean getItem(int i) {
        return type.get(i);
    }

    @Override
    public long getItemId(int i) {
        return i;
    }

    @Override
    public int getItemViewType(int position) {
        return position;
    }

    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {
        typesBeen1.clear();
        ClassMessageBean.DataBean.TypesBean typesBean = type.get(i);
        String name = typesBean.getName();
        List<ClassMessageBean.DataBean.TypesBean.ShopsBean> shops = typesBean.getShops();
        typesBeen1.addAll(shops);
        ViewHolder viewHolder;
        if (view==null){
            view = View.inflate(context, R.layout.classmessageitem, null);
            viewHolder=new ViewHolder(view);
        }else {
         viewHolder= (ViewHolder) view.getTag();
        }
          viewHolder.rlv.setLayoutManager(new GridLayoutManager(context,3));
          viewHolder.rlv.setAdapter(classMessageRecAdpter);
         classMessageRecAdpter.setData(shops);
          viewHolder.textTitle.setText(name);

        return view;
    }
    static class ViewHolder {
        @BindView(R.id.text_title)
        TextView textTitle;
        @BindView(R.id.rlv)
        RecyclerView rlv;
        ViewHolder(View view) {
            ButterKnife.bind(this, view);
            view.setTag(this);
        }
    }
}
