package adpter;

import android.content.Context;
import android.content.Intent;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;
import com.bumptech.glide.load.engine.DiskCacheStrategy;

import java.util.List;

import activity.zhidemaiactivity.SearchDetailActivity;
import bean.ClassMessageBean;
import bean.SearchBean;
import butterknife.BindView;
import butterknife.ButterKnife;
import xiangcuntiandi.quanmather.R;

/**
 * Created by Administrator on 2016/12/28.
 */

public class ClassMessageRecAdpter extends RecyclerView.Adapter<ClassMessageRecAdpter.MyViewHolder> {

    private final Context context;


    private List<ClassMessageBean.DataBean.TypesBean.ShopsBean> dataList;

    public ClassMessageRecAdpter(Context context) {
        this.context = context;
    }

    @Override
    public MyViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        MyViewHolder myViewHolder = new MyViewHolder(LayoutInflater.from(parent.getContext()).inflate(R.layout.classgoods_item, parent, false));
        return myViewHolder;
    }

    @Override
    public void onBindViewHolder(final MyViewHolder holder, final int position) {
        final ClassMessageBean.DataBean.TypesBean.ShopsBean shopsBean = dataList.get(position);
        Glide.with(context).load(shopsBean.getImg()).diskCacheStrategy(DiskCacheStrategy.ALL).into(holder.img);
        holder.tx.setText(shopsBean.getName());
        Log.e("at22",shopsBean.getImg());
        Log.e("at22",shopsBean.getName());
        holder.img.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(context, SearchDetailActivity.class);
                intent.putExtra("category",shopsBean.getId());
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

    public void setData(List<ClassMessageBean.DataBean.TypesBean.ShopsBean> dataList) {
        this.dataList = dataList;
    }
}
