package adpter;

import android.content.Context;
import android.content.Intent;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;
import com.bumptech.glide.load.engine.DiskCacheStrategy;

import java.util.List;

import activity.zhidemaiactivity.SearchDetailActivity;
import bean.SearchBean;
import butterknife.BindView;
import butterknife.ButterKnife;
import xiangcuntiandi.quanmather.R;

/**
 * Created by Administrator on 2016/12/28.
 */

public class ClassAdpter extends RecyclerView.Adapter<ClassAdpter.MyViewHolder> {

    private final Context context;


    private List<SearchBean.DataBean.CategoryBean> dataList;

    public ClassAdpter(Context context) {
        this.context = context;
    }

    @Override
    public MyViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        MyViewHolder myViewHolder = new MyViewHolder(LayoutInflater.from(parent.getContext()).inflate(R.layout.classgoods_item, parent, false));
        return myViewHolder;
    }

    @Override
    public void onBindViewHolder(final MyViewHolder holder, final int position) {
        final SearchBean.DataBean.CategoryBean categoryBean = dataList.get(position);
        Glide.with(context).load(categoryBean.getImg()).diskCacheStrategy(DiskCacheStrategy.ALL).into(holder.img);
        holder.tx.setText(categoryBean.getName());
        holder.img.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(context, SearchDetailActivity.class);
                intent.putExtra("category",categoryBean.getId());
                context.startActivity(intent);
            }
        });
    }

    public class MyViewHolder extends RecyclerView.ViewHolder {
        @BindView(R.id.img)
        ImageView img;
        @BindView(R.id.tx)
        TextView tx;
        public MyViewHolder(View view) {
            super(view);
            ButterKnife.bind(this, view);
        }
    }

    @Override
    public int getItemCount() {
        return (dataList == null || dataList.size() == 0) ? 0 : dataList.size();
    }

    public void setData(List<SearchBean.DataBean.CategoryBean> dataList) {
        this.dataList = dataList;
    }
}
