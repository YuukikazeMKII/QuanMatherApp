package adpter;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import com.bumptech.glide.Glide;
import com.bumptech.glide.load.engine.DiskCacheStrategy;

import java.util.List;

import bean.YouHuiFragmentBean;
import butterknife.BindView;
import butterknife.ButterKnife;
import xiangcuntiandi.quanmather.R;

/**
 * Created by Administrator on 2016/12/31.
 */

public class YouHUiFragmentQuanItem extends RecyclerView.Adapter<YouHUiFragmentQuanItem.VH> {


    private final List<YouHuiFragmentBean.DataBean.Section2Bean> list;
    private final Context context;
   public YouHUiFragmentQuanItem(Context context, List<YouHuiFragmentBean.DataBean.Section2Bean>list){

       this.context=context;
       this.list=list;
    }

    @Override
    public VH onCreateViewHolder(ViewGroup parent, int viewType) {
        VH myViewHolder = new VH(LayoutInflater.from(parent.getContext()).inflate(R.layout.brand_item, parent, false));
        return myViewHolder;
    }

    @Override
    public void onBindViewHolder(VH holder, int position) {
        YouHuiFragmentBean.DataBean.Section2Bean section2Bean = list.get(position);
        Glide.with(context).load(section2Bean.getBanner_pic()).diskCacheStrategy(DiskCacheStrategy.ALL).into(holder.imvBrand);
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
