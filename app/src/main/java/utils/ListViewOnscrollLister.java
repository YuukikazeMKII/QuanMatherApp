package utils;

import android.support.v7.widget.RecyclerView;
import android.widget.AbsListView;
import android.widget.BaseAdapter;

import adpter.ClassMessageRecAdpter;

/**
 * Created by Administrator on 2016/12/31.
 */

public class ListViewOnscrollLister extends RecyclerView.OnScrollListener {

            // 添加标志位
           public static boolean isLoadImg = true;

            public RecyclerView.Adapter<ClassMessageRecAdpter.MyViewHolder> basedapter;

         public ListViewOnscrollLister(RecyclerView.Adapter<ClassMessageRecAdpter.MyViewHolder> basedapter) {
           this.basedapter = basedapter;
       }


    @Override
    public void onScrollStateChanged(RecyclerView recyclerView, int newState) {

        }


    }
