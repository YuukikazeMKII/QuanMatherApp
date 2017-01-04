package activity.zhidemaiactivity;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.text.Editable;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.view.View;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

import base.BeanCallback;
import https.PaiXuHttps;
import interface1.BrandListPaiXuHttps;
import utils.paixu.CharacterParser;
import utils.paixu.ClearEditText;
import utils.paixu.PinyinComparator;
import utils.paixu.SideBar;
import utils.paixu.SortAdapter;
import utils.paixu.SortModel;
import xiangcuntiandi.quanmather.R;

public class BrandListPaiXu extends AppCompatActivity  {
	private ListView sortListView;
	private SideBar sideBar;
	private TextView dialog;
	private SortAdapter adapter;
	private EditText mClearEditText;

	/**
	 * ����ת����ƴ������
	 */
	private CharacterParser characterParser;
	private List<SortModel.DataBean.MallsBean> SourceDateList=new ArrayList<>();
	private List<SortModel.DataBean.MallsBean> DateList=new ArrayList<>();

	/**
	 * ����ƴ��������ListView�����������
	 */
	private PinyinComparator pinyinComparator;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		SourceDateList.clear();
		setContentView(R.layout.brandlistpaixu);
		brandListPaiXu=new PaiXuHttps();
		initViews();
		doHttps();
	}

	private void initViews() {
		//ʵ��������תƴ����
		characterParser = CharacterParser.getInstance();

		pinyinComparator = new PinyinComparator();

		sideBar = (SideBar) findViewById(R.id.sidrbar);
		dialog = (TextView) findViewById(R.id.dialog);
		sideBar.setTextView(dialog);

		//�����Ҳഥ������
		sideBar.setOnTouchingLetterChangedListener(new SideBar.OnTouchingLetterChangedListener() {
			@Override
			public void onTouchingLetterChanged(String s) {
				int position = adapter.getPositionForSection(s.charAt(0));
				if (position != -1) {
					sortListView.setSelection(position);
				}
			}
		});

		sortListView = (ListView) findViewById(R.id.country_lvcountry);
		sortListView.setOnItemClickListener(new OnItemClickListener() {

			@Override
			public void onItemClick(AdapterView<?> parent, View view,
									int position, long id) {
				//����Ҫ����adapter.getItem(position)����ȡ��ǰposition����Ӧ�Ķ���
				//	Toast.makeText(getApplication(), ((SortModel)adapter.getItem(position)).getName(), Toast.LENGTH_SHORT).show();
			}
		});
		// ����a-z��������Դ����
		Collections.sort(SourceDateList, pinyinComparator);
		adapter = new SortAdapter(this, SourceDateList);
		sortListView.setAdapter(adapter);


		mClearEditText = (EditText) findViewById(R.id.tv_title);

		//�������������ֵ�ĸı�����������
		mClearEditText.addTextChangedListener(new TextWatcher() {

			@Override
			public void onTextChanged(CharSequence s, int start, int before, int count) {
				//������������ֵΪ�գ�����Ϊԭ�����б�����Ϊ���������б�
				String string = mClearEditText.getText().toString();
				DateList.addAll(SourceDateList);
				List<SortModel.DataBean.MallsBean> list=new ArrayList<SortModel.DataBean.MallsBean>();
				for (SortModel.DataBean.MallsBean mallsBean : DateList) {
					list.clear();
					String ename = mallsBean.getEname();
					if (ename.contains(string)||ename.equalsIgnoreCase(string)){
						list.add(mallsBean);
					}
				}
				if (list!=null&&list.size()>0){
					adapter = new SortAdapter(BrandListPaiXu.this, list);
					sortListView.setAdapter(adapter);
					adapter.notifyDataSetChanged();
				}
			}

			@Override
			public void beforeTextChanged(CharSequence s, int start, int count,
										  int after) {




			}

			@Override
			public void afterTextChanged(Editable s) {
			}
		});
	}
	BrandListPaiXuHttps brandListPaiXu;
	public void doHttps(){

		brandListPaiXu.PaiXuList(new BeanCallback<List<SortModel.DataBean.MallsBean>>() {
			@Override
			public void onSuccess(List<SortModel.DataBean.MallsBean> t) {
				if (t!=null){
					SourceDateList.addAll(t);
					adapter.notifyDataSetChanged();
				}
			}

			@Override
			public void onFinish() {

			}
		});
	}
	public Runnable searchTask;

}
