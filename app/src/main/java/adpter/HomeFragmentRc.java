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

import activity.FuLiActivity.FuLiActivity;
import activity.HomeActivity.KFCActivity;
import activity.zhidemaiactivity.HotBrandActivity;
import bean.HomeBean;
import bean.YouHuiFragmentBean;
import butterknife.BindView;
import butterknife.ButterKnife;
import xiangcuntiandi.quanmather.R;

/**
 * Created by Administrator on 2016/12/31.
 */

public class HomeFragmentRc extends RecyclerView.Adapter<HomeFragmentRc.VH> {


    private final List<HomeBean.DataBean.GuidCategoryBean> list;
    private final Context context;
   public HomeFragmentRc(Context context, List<HomeBean.DataBean.GuidCategoryBean>list){

       this.context=context;
       this.list=list;
    }

    @Override
    public VH onCreateViewHolder(ViewGroup parent, int viewType) {
        VH myViewHolder = new VH(LayoutInflater.from(parent.getContext()).inflate(R.layout.classgoods_item, parent, false));
        return myViewHolder;
    }

    @Override
    public void onBindViewHolder(VH holder, int position) {
        final HomeBean.DataBean.GuidCategoryBean guidCategoryBean = list.get(position);
        Glide.with(context).load(guidCategoryBean.getBanner_pic()).diskCacheStrategy(DiskCacheStrategy.ALL).into(holder.imvBrand);
        holder.textView.setText(guidCategoryBean.getBanner_title());

        holder.imvBrand.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (guidCategoryBean.getSub_type().equals("kdj")){
                    Intent intent=new Intent(context, KFCActivity.class);
                    context.startActivity(intent);
                }
                if (guidCategoryBean.getSub_type().equals("category")){
                    Intent intent=new Intent(context, HotBrandActivity.class);
                    intent.putExtra("cate",guidCategoryBean.getSub_value());
                    context.startActivity(intent);
                }
                if (guidCategoryBean.getSub_type().equals("channel")){
                    Intent intent=new Intent(context, FuLiActivity.class);
                    intent.putExtra("cate",guidCategoryBean.getSub_value());
                    context.startActivity(intent);
                }
            }
        });

    }
    @Override
    public int getItemCount() {
        return list.size();
    }

    class VH extends RecyclerView.ViewHolder {

        @BindView(R.id.tx)
        TextView textView;
        @BindView(R.id.img)
        ImageView imvBrand;

        public VH(View itemView) {
            super(itemView);
            ButterKnife.bind(this, itemView);
        }
    }



}
