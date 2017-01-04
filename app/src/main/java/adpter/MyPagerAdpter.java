package adpter;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

import java.util.List;

/**
 * Created by Administrator on 2016/12/28.
 */

public class MyPagerAdpter extends FragmentPagerAdapter {
    private final List<Fragment> list;
    private final List<String> stringlist;

    public MyPagerAdpter(FragmentManager fm, List<Fragment> list,List<String> stringlist) {
        super(fm);
        this.list=list;
        this.stringlist=stringlist;
    }
    @Override
    public Fragment getItem(int position) {
        return list.get(position);
    }

    @Override
    public int getCount() {
        return list.size();
    }

    @Override
    public CharSequence getPageTitle(int position) {
        return stringlist.get(position);
    }
}
