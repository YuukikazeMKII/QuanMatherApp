package utils.paixu;

import java.util.Comparator;

/**
 * 
 * @author xiaanming
 *
 */
public class PinyinComparator implements Comparator<SortModel.DataBean.MallsBean> {

	public int compare(SortModel.DataBean.MallsBean o1, SortModel.DataBean.MallsBean o2) {
		if (o1.getEname().equals("@")
				|| o2.getEname().equals("#")) {
			return -1;
		} else if (o1.getEname().equals("#")
				|| o2.getEname().equals("@")) {
			return 1;
		} else {
			return o1.getEname().compareTo(o2.getEname());
		}
	}

}
