package xiangcuntiandi.quanmather;

import android.content.Intent;
import android.os.Bundle;
import android.support.v4.view.PagerAdapter;
import android.support.v4.view.ViewPager;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import java.util.ArrayList;
import java.util.List;

import base.BaseActivity;
import butterknife.BindView;
import butterknife.ButterKnife;

/**
 * Created by Administrator on 2017/1/3.
 */

public class welcomeActivity extends BaseActivity {
    @BindView(R.id.vp)
    ViewPager vp;
    List<ImageView> mListViews=new ArrayList<>();

    int[] image={R.drawable.first_guide_0,R.drawable.first_guide_1,R.drawable.first_guide_2 };

    @Override
    public int getLayout() {
        return R.layout.welcomeactivity;
    }

    @Override
    public void initView() {
        for (int i=0;i<image.length;i++){
            ImageView imageView=new ImageView(this);
            imageView.setImageResource(image[i]);
            mListViews.add(imageView);
        }
        vp.setAdapter(new MyViewPager());
        vp.addOnPageChangeListener(new ViewPager.OnPageChangeListener() {
            @Override
            public void onPageScrolled(int position, float positionOffset, int positionOffsetPixels) {

            }

            @Override
            public void onPageSelected(int position) {
                    ImageView imageView = mListViews.get(image.length-1);
                    imageView.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View view) {
                            Intent intent=new Intent(welcomeActivity.this,MainActivity.class);
                            startActivity(intent);
                            finish();
                        }
                    });

            }

            @Override
            public void onPageScrollStateChanged(int state) {

            }
        });

    }

    class MyViewPager extends PagerAdapter{

        @Override
        public int getCount() {
            return mListViews.size();
        }

        @Override
        public boolean isViewFromObject(View view, Object object) {
            return view==object;
        }
        @Override
        public void destroyItem(ViewGroup container, int position, Object object)   {
            container.removeView(mListViews.get(position));//删除页卡
        }

        @Override
        public Object instantiateItem(ViewGroup container, int position) {  //这个方法用来实例化页卡
            container.addView(mListViews.get(position), 0);//添加页卡
            return mListViews.get(position);
        }

    }
}
