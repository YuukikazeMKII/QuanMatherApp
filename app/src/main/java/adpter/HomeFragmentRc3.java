package adpter;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import com.bumptech.glide.Glide;
import com.bumptech.glide.load.engine.DiskCacheStrategy;

import java.util.List;

import bean.HomeBean;
import butterknife.BindView;
import butterknife.ButterKnife;
import xiangcuntiandi.quanmather.R;

/**
 * Created by Administrator on 2016/12/31.
 */

public class HomeFragmentRc3 extends RecyclerView.Adapter<HomeFragmentRc3.VH> {


    private final List<HomeBean.DataBean.LittleBannerBean> list;
    private final Context context;
   public HomeFragmentRc3(Context context, List<HomeBean.DataBean.LittleBannerBean>list){
       this.context=context;
       this.list=list;
    }

    @Override
    public VH onCreateViewHolder(ViewGroup parent, int viewType) {
        VH myViewHolder = new VH(LayoutInflater.from(parent.getContext()).inflate(R.layout.home_item3, parent, false));
        return myViewHolder;
    }

    @Override
    public void onBindViewHolder(VH holder, int position) {
        HomeBean.DataBean.LittleBannerBean littleBannerBean = list.get(position);
      //  Log.e("at22",section1Bean.getBanner_pic()+"-------------");
        Glide.with(context).load(littleBannerBean.getBanner_pic()).diskCacheStrategy(DiskCacheStrategy.ALL).into(holder.imvBrand);
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
