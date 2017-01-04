package adpter;

import android.content.Context;
import android.content.Intent;
import android.graphics.Color;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.List;

import activity.zhidemaiactivity.HotBrandActivity;
import activity.zhidemaiactivity.SearchDetailActivity;
import bean.SearchBean;
import butterknife.BindView;
import butterknife.ButterKnife;
import xiangcuntiandi.quanmather.R;

/**
 * Created by Administrator on 2016/12/28.
 */

public class HotAdpter extends RecyclerView.Adapter<HotAdpter.MyViewHolder> {

    private final Context context;

    private List<SearchBean.DataBean.TagBean> dataList;

    public HotAdpter(Context context) {
        this.context = context;
    }

    @Override
    public MyViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        MyViewHolder myViewHolder = new MyViewHolder(LayoutInflater.from(parent.getContext()).inflate(R.layout.hotadpetr_item, parent, false));
        return myViewHolder;
    }

    @Override
    public void onBindViewHolder(final MyViewHolder holder, final int position) {
        final SearchBean.DataBean.TagBean tagBean = dataList.get(position);
        String display_title = tagBean.getDisplay_title();
        if (tagBean.getObviously()==0){
            holder.hotadter.setTextColor(Color.RED);
            holder.hotadter.setText(display_title);
        }
        holder.hotadter.setText(display_title);
        holder.hotadter.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (tagBean.getLink_type().equals("keyword")){
                    Intent intent=new Intent(context, SearchDetailActivity.class);
                    intent.putExtra("cate",tagBean.getLink_value());
                    context.startActivity(intent);
                    //其他的跳转

                }
                if (tagBean.getLink_type().equals("category")){
                    Intent intent1=new Intent(context, HotBrandActivity.class);
                    intent1.putExtra("cate",tagBean.getLink_value());
                    context.startActivity(intent1);
                }
            }
        });
    }

    public class MyViewHolder extends RecyclerView.ViewHolder {
        @BindView(R.id.hotadter)
        TextView hotadter;
        public MyViewHolder(View view) {
            super(view);
            ButterKnife.bind(this, view);
        }
    }

    @Override
    public int getItemCount() {
        return (dataList == null || dataList.size() == 0) ? 0 : dataList.size();
    }

    public void setData(List<SearchBean.DataBean.TagBean> dataList) {
        this.dataList = dataList;
    }
}
