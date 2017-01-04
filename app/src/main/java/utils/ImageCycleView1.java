package utils;

import java.util.ArrayList;

import android.annotation.SuppressLint;
import android.content.Context;
import android.os.Handler;
import android.support.v4.view.PagerAdapter;
import android.support.v4.view.ViewPager;
import android.support.v4.view.ViewPager.OnPageChangeListener;
import android.util.AttributeSet;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.ImageView.ScaleType;
import android.widget.LinearLayout;

import com.android.volley.toolbox.ImageLoader;

import xiangcuntiandi.quanmather.R;

/**
 * 轮播图界面
 * 
 */
public class ImageCycleView1 extends LinearLayout {

	private Context mContext;
	/**
	 * 图片轮播视图
	 */
	
	private ArrayList<ImageView> mImageViewCacheList;
	private ViewPager mAdvPager = null;
	/**
	 * 滚动图片视图适配
	 */
	private ImageCycleAdapter mAdvAdapter;
	/**
	 * 图片轮播指示器控
	 */
	private ViewGroup mGroup;
	private ImageLoader imageLoader;
	/**
	 * 图片轮播指示个图
	 */
	private ImageView mImageView = null;

	/**
	 * 滚动图片指示视图列表
	 */
	private ImageView[] mImageViews = null;

	/**
	 * 图片滚动当前图片下标
	 */
	private ImageCycleViewListener1 mImageCycleViewListener;
	private boolean isStop;

	/**
	 * 游标是圆形还是长条，要是设置0是长条，要是1就是圆形 默认是圆
	 */
	public int stype = 0;
	public int index = 0;

	/**
	 * @param context
	 */
	public ImageCycleView1(Context context) {
		super(context);
	}

	/**
	 * @param context
	 * @param
	 */
	@SuppressLint("Recycle")
	public ImageCycleView1(Context context, AttributeSet attrs) {
		super(context, attrs);
		mContext = context;
		LayoutInflater.from(context).inflate(R.layout.ad_cycle_view, this);
		mAdvPager = (ViewPager) findViewById(R.id.adv_pager);
		mAdvPager.setOnPageChangeListener(new GuidePageChangeListener());
		// 滚动图片右下指示器视
		mGroup = (ViewGroup) findViewById(R.id.viewGroup);

	}

	/**
	 * 触摸停止计时器，抬起启动计时
	 */
	@Override
	public boolean dispatchTouchEvent(MotionEvent event) {
		if (event.getAction() == MotionEvent.ACTION_UP) {
			// �??始图片滚�??
			startImageTimerTask();
		} else {
			// 停止图片滚动
			stopImageTimerTask();
		}
		return super.dispatchTouchEvent(event);
	}

	// @Override
	// public boolean onTouchEvent(MotionEvent event) {
	// // TODO Auto-generated method stub
	// if (event.getAction() == MotionEvent.ACTION_UP) {
	// // 始图片滚
	// startImageTimerTask();
	// } else {
	// // 停止图片滚动
	// stopImageTimerTask();
	// }
	//
	// //mAdvPager.getParent().getParent().requestDisallowInterceptTouchEvent(true);
	// return true;
	// }
	// @Override
	// public boolean onInterceptTouchEvent(MotionEvent ev) {
	// // TODO Auto-generated method stub
	// return false;
	// }
	/**
	 * 装填图片数据
	 * 
	 * @param imageUrlList
	 * @param
	 */
	public void setImageResources(ArrayList<String> imageUrlList, int stype) {
		this.stype = stype;
		// 清除
		mGroup.removeAllViews();
		// 图片广告数量
		final int imageCount = imageUrlList.size();
		mImageViews = new ImageView[imageCount];
		for (int i = 0; i < imageCount; i++) {
			mImageView = new ImageView(mContext);
			LayoutParams params = new LayoutParams(15, 15);
			params.leftMargin = 20;
			mImageView.setScaleType(ScaleType.FIT_XY);
			mImageView.setLayoutParams(params);

			mImageViews[i] = mImageView;
			if (i == 0) {

				mImageViews[i].setBackgroundResource(R.drawable.btn_shape_pre);
			} else {

				mImageViews[i].setBackgroundResource(R.drawable.btn_shape);
			}
			if (imageCount > 1) {
				mGroup.addView(mImageViews[i]);
			}

		}
		if (imageUrlList.size() > 0) {
			mAdvAdapter = new ImageCycleAdapter(mContext, imageUrlList);

			mAdvPager.setAdapter(mAdvAdapter);
			mAdvPager.setCurrentItem(imageUrlList.size() * 10);
			startImageTimerTask();
		}
		if (imageUrlList.size() == 1) {
			mAdvAdapter = new ImageCycleAdapter(mContext, imageUrlList);

			mAdvPager.setAdapter(mAdvAdapter);
			mAdvPager.setCurrentItem(0);
			startImageTimerTask();
		}

	}

	/**
	 * 图片轮播(手动控制自动轮播与否，便于资源控件）
	 */
	public void startImageCycle() {
		startImageTimerTask();
	}

	/**
	 * 暂停轮播—用于节省资
	 */
	public void pushImageCycle() {
		stopImageTimerTask();
	}

	/**
	 * 图片滚动任务
	 */
	private void startImageTimerTask() {
		stopImageTimerTask();
		// 图片滚动
		mHandler.postDelayed(mImageTimerTask, 5000);
	}

	/**
	 * 停止图片滚动任务
	 */
	private void stopImageTimerTask() {
		isStop = true;
		mHandler.removeCallbacks(mImageTimerTask);
	}

	private Handler mHandler = new Handler();

	/**
	 * 图片自动轮播Task
	 */
	private Runnable mImageTimerTask = new Runnable() {
		@Override
		public void run() {
			if (mImageViews != null) {
				mAdvPager.setCurrentItem(mAdvPager.getCurrentItem() + 1);
				if (!isStop) {
					mHandler.postDelayed(mImageTimerTask, 5000);
				}

			}
		}
	};
	public String imageUrl = "";

	/**
	 * 轮播图片监听
	 * 
	 * @author minking
	 */
	private final class GuidePageChangeListener implements OnPageChangeListener {
		private int index;

		@Override
		public void onPageScrollStateChanged(int state) {
			if (state == 0)
				startImageTimerTask();
		}

		@Override
		public void onPageScrolled(int arg0, float arg1, int arg2) {
		}

		@Override
		public void onPageSelected(int index) {

			if (mImageViews.length > 1) {

				index = index % mImageViews.length;
				// 设置当前显示的图
				// 设置图片滚动指示器背
				mImageViews[index]
						.setBackgroundResource(R.drawable.btn_shape_pre);
				for (int i = 0; i < mImageViews.length; i++) {
					if (index != i) {
						mImageViews[i]
								.setBackgroundResource(R.drawable.btn_shape);
					}
				}
			}
		}
	}

	private class ImageCycleAdapter extends PagerAdapter {

		/**
		 * 图片视图缓存列表
		 */

		/**
		 * 图片资源列表
		 */
		private ArrayList<String> mAdList = new ArrayList<String>();

		/**
		 * 广告图片点击监听
		 */

		private Context mContext;

		public ImageCycleAdapter(Context context, ArrayList<String> adList) {
			this.mContext = context;
			this.mAdList = adList;
			mImageViewCacheList = new ArrayList<ImageView>();
		}

		@Override
		public int getCount() {
			if (mAdList.size() == 1 ||mAdList.size() == 0 ) {
				return 1;
			}
			return Integer.MAX_VALUE;
		}

		@Override
		public boolean isViewFromObject(View view, Object obj) {
			return view == obj;
		}

		@Override
		public Object instantiateItem(ViewGroup container, final int position) {
			ImageView imageView = null;
			if (mAdList.size() > 0) {
				 imageUrl  = mAdList.get(position % mAdList.size());
				Log.i("imageUrl", imageUrl);
			}
			
			
			
			// if (mImageViewCacheList.isEmpty()) {
			imageView = new ImageView(mContext);
			imageView.setLayoutParams(new LayoutParams(
					LayoutParams.MATCH_PARENT, LayoutParams.MATCH_PARENT));
			imageView.setScaleType(ScaleType.CENTER_CROP);
			// test
//			 imageView.setScaleType(ImageView.ScaleType.CENTER_INSIDE);
			// 设置图片点击监听
			if (mAdList.size() > 0 ) {
				imageView.setOnClickListener(new OnClickListener() {
					@Override
					public void onClick(View v) {
						mImageCycleViewListener.onImageClick1(
								position % mAdList.size(), v);
					}
				});
			}
			
			//
			// } else {
			// imageView = mImageViewCacheList.remove(0);
			// }
			container.addView(imageView);
			
			// mAdvPager.setObjectForPosition(imageView, position);
			return imageView;
		}

		@Override
		public void destroyItem(ViewGroup container, int position, Object object) {
			ImageView view = (ImageView) object;
			mAdvPager.removeView(view);
			// mImageViewCacheList.add(view);

		}

	}

	/*
	 * 轮播控件的监听事
	 * 
	 * @author minking
	 */
	public static interface ImageCycleViewListener1 {

		/**
		 * 单击图片事件
		 * 
		 * @param position
		 * @param imageView
		 */
		public void onImageClick1(int position, View imageView);

	}

	public void setOnCheckedChanged(ImageCycleViewListener1 listener) {
		this.mImageCycleViewListener = listener;
	}

}
