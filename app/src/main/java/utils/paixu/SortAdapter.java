package utils.paixu;

import java.util.List;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.SectionIndexer;
import android.widget.TextView;

import com.bumptech.glide.Glide;

import activity.zhidemaiactivity.BrandDetailActivity;
import activity.zhidemaiactivity.BrandListPaiXu;
import xiangcuntiandi.quanmather.R;

public class SortAdapter extends BaseAdapter implements SectionIndexer{
	private List<SortModel.DataBean.MallsBean> list;
	private Context mContext;
	
	public SortAdapter(Context mContext, List<SortModel.DataBean.MallsBean> list) {
		this.mContext = mContext;
		this.list = list;
	}
	

	public void updateListView(List<SortModel.DataBean.MallsBean> list){
		this.list = list;
		notifyDataSetChanged();
	}

	public int getCount() {
		return this.list.size();
	}

	public Object getItem(int position) {
		return list.get(position);
	}

	public long getItemId(int position) {
		return position;
	}

	public View getView(final int position, View view, ViewGroup arg2) {
		ViewHolder viewHolder = null;
		SortModel.DataBean.MallsBean mallsBean = list.get(position);
		if (view == null) {
			viewHolder = new ViewHolder();
			view = LayoutInflater.from(mContext).inflate(R.layout.paixuitem, null);
			viewHolder.tvTitle = (TextView) view.findViewById(R.id.title);
			viewHolder.tvLetter = (TextView) view.findViewById(R.id.catalog);
			viewHolder.imageView= (ImageView) view.findViewById(R.id.imv_brand);
			viewHolder.lv = (LinearLayout) view.findViewById(R.id.lv);
			view.setTag(viewHolder);
		} else {
			viewHolder = (ViewHolder) view.getTag();
		}
		

		int section = getSectionForPosition(position);
		

		if(position == getPositionForSection(section)){
			viewHolder.tvLetter.setVisibility(View.VISIBLE);
			viewHolder.tvLetter.setText(mallsBean.getEname());
		}else{
			viewHolder.tvLetter.setVisibility(View.GONE);
		}
		viewHolder.tvTitle.setText(this.list.get(position).getName());
		Glide.with(mContext).load(list.get(position).getImg()).into(viewHolder.imageView);
		viewHolder.lv.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View view) {
				String site = list.get(position).getSite();
				Intent intent=new Intent(mContext,BrandDetailActivity.class);
				intent.putExtra("category",site);
				intent.putExtra("tital",list.get(position).getName());
				mContext.startActivity(intent);
			}
		});


		return view;
	}
	


	final static class ViewHolder {
		TextView tvLetter;
		TextView tvTitle;
		ImageView imageView;
		LinearLayout lv;
	}


	/**
	 *
	 */
	public int getSectionForPosition(int position) {
		return list.get(position).getEname().charAt(0);
	}

	/**
	 *
	 */
	public int getPositionForSection(int section) {
		for (int i = 0; i < getCount(); i++) {
			String sortStr = list.get(i).getEname();
			char firstChar = sortStr.toUpperCase().charAt(0);
			if (firstChar == section) {
				return i;
			}
		}
		return -1;
	}
	/**
	 *
	 * 
	 * @param str
	 * @return
	 */
	private String getAlpha(String str) {
		String  sortStr = str.trim().substring(0, 1).toUpperCase();
		if (sortStr.matches("[A-Z]")) {
			return sortStr;
		} else {
			return "#";
		}
	}

	@Override
	public Object[] getSections() {
		return null;
	}
}