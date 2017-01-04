package adpter;

import android.content.Context;
import android.content.Intent;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import com.bumptech.glide.Glide;
import com.bumptech.glide.load.engine.DiskCacheStrategy;

import java.util.List;

import activity.HomeActivity.HomeWebActivity;
import bean.HomeBean;
import butterknife.BindView;
import butterknife.ButterKnife;
import xiangcuntiandi.quanmather.R;

/**
 * Created by Administrator on 2016/12/31.
 */

public class HomeFragmentRc2 extends RecyclerView.Adapter<HomeFragmentRc2.VH> {


    private final List<HomeBean.DataBean.Section2Bean> list;
    private final Context context;
   public HomeFragmentRc2(Context context, List<HomeBean.DataBean.Section2Bean>list){
       this.context=context;
       this.list=list;
    }

    @Override
    public VH onCreateViewHolder(ViewGroup parent, int viewType) {
        VH myViewHolder = new VH(LayoutInflater.from(parent.getContext()).inflate(R.layout.home_item, parent, false));
        return myViewHolder;
    }

    @Override
    public void onBindViewHolder(VH holder, int position) {
        final HomeBean.DataBean.Section2Bean section1Bean = list.get(position);
        Log.e("at22",section1Bean.getBanner_pic()+"-------------");
        Glide.with(context).load(section1Bean.getBanner_pic()).diskCacheStrategy(DiskCacheStrategy.ALL).into(holder.imvBrand);
        holder.imvBrand.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (section1Bean.getSub_type().equals("web")){
                    Intent intent=new Intent(context, HomeWebActivity.class);
                    intent.putExtra("web",section1Bean.getSub_value());
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

        @BindView(R.id.imv_brand)
        ImageView imvBrand;

        public VH(View itemView) {
            super(itemView);
            ButterKnife.bind(this, itemView);
        }
    }



}
