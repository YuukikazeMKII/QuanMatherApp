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

import activity.zhidemaiactivity.BrandDetailActivity;
import bean.SearchBean;
import butterknife.BindView;
import butterknife.ButterKnife;
import xiangcuntiandi.quanmather.R;

/**
 * Created by Administrator on 2016/12/28.
 */

public class BrandAdpter extends RecyclerView.Adapter<BrandAdpter.MyViewHolder> {

    private final Context context;


    private List<SearchBean.DataBean.MallBean.GuoneiBean> dataList;

    public BrandAdpter(Context context) {
        this.context = context;
    }

    @Override
    public MyViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        MyViewHolder myViewHolder = new MyViewHolder(LayoutInflater.from(parent.getContext()).inflate(R.layout.brand_item, parent, false));
        return myViewHolder;
    }

    @Override
    public void onBindViewHolder(final MyViewHolder holder, final int position) {
        final SearchBean.DataBean.MallBean.GuoneiBean guoneiBean = dataList.get(position);
        Log.e("at22",guoneiBean.getBackground_img());
        Glide.with(context).load(guoneiBean.getImg()).diskCacheStrategy(DiskCacheStrategy.ALL).into(holder.imvBrand);
           holder.imvBrand.setOnClickListener(new View.OnClickListener() {
               @Override
               public void onClick(View view) {
                   Intent intent=new Intent(context,BrandDetailActivity.class);
                   intent.putExtra("category",guoneiBean.getSite());
                   intent.putExtra("tital",guoneiBean.getName());
                   context.startActivity(intent);
               }
           });
    }

    public class MyViewHolder extends RecyclerView.ViewHolder {
        @BindView(R.id.imv_brand)
        ImageView imvBrand;

        public MyViewHolder(View view) {
            super(view);
            ButterKnife.bind(this, view);
        }
    }

    @Override
    public int getItemCount() {
        return (dataList == null || dataList.size() == 0) ? 0 : dataList.size();
    }

    public void setData(List<SearchBean.DataBean.MallBean.GuoneiBean> dataList) {
        this.dataList = dataList;
    }
}
