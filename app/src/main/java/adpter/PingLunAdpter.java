package adpter;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;

import com.bumptech.glide.Glide;
import com.bumptech.glide.load.engine.DiskCacheStrategy;

import java.util.List;

import bean.CommentBean;
import butterknife.BindView;
import butterknife.ButterKnife;
import wight.CicImageView;
import wight.CircleImageView;
import xiangcuntiandi.quanmather.R;

/**
 * Created by Administrator on 2016/12/28.
 */

public class PingLunAdpter extends RecyclerView.Adapter<PingLunAdpter.MyViewHolder> {

    private final Context context;
    private List<CommentBean.DataBean.RowsBean> dataList;

    public PingLunAdpter(Context context) {
        this.context = context;
    }

    @Override
    public MyViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        MyViewHolder myViewHolder = new MyViewHolder(LayoutInflater.from(parent.getContext()).inflate(R.layout.comment_item, parent, false));
        return myViewHolder;
    }

    @Override
    public void onBindViewHolder(final MyViewHolder holder, final int position) {
        CommentBean.DataBean.RowsBean rowsBean = dataList.get(position);
        Glide.with(context).load(rowsBean.getHead()).diskCacheStrategy(DiskCacheStrategy.ALL).into(holder.civ);
        holder.tvShafa.setText(rowsBean.getFloor());
        holder.username.setText(rowsBean.getComment_author());
        holder.content.setText(rowsBean.getComment_content());
        holder.textTime.setText(rowsBean.getFormat_date_client());
        //  "support_count": "1",
      //  "oppose_count": "0",
        holder.dingcai.setText("顶("+rowsBean.getSupport_count()+")踩("+rowsBean.getOppose_count()+")");
    }

    public class MyViewHolder extends RecyclerView.ViewHolder {
        @BindView(R.id.civ)
        CicImageView civ;
        @BindView(R.id.tv_shafa)
        TextView tvShafa;
        @BindView(R.id.username)
        TextView username;
        @BindView(R.id.text_time)
        TextView textTime;
        @BindView(R.id.content)
        TextView content;
        @BindView(R.id.dingcai)
        TextView dingcai;
        @BindView(R.id.lv)
        LinearLayout lv;
        public MyViewHolder(View view) {
            super(view);
            ButterKnife.bind(this, view);
        }
    }

    @Override
    public int getItemCount() {
        return (dataList == null || dataList.size() == 0) ? 0 : dataList.size();
    }

    public void setData(List<CommentBean.DataBean.RowsBean> dataList) {
        this.dataList = dataList;
    }
}
