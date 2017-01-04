package xiangcuntiandi.myscroll;

import android.os.Build;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.RelativeLayout;
import android.widget.ScrollView;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity implements ScorllCallbackView.OnScrollYChangedListener {
    TextView textView;
    TextView tview;
    ScorllCallbackView callbackView;
    TextView relativeLayout;

   ScollListView listView;

    private void initStr() {
        for (int i=0;i<100;i++){
            list.add(i+"");
        }
    }

    List<String> list=new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
initStr();
        textView= (TextView) findViewById(R.id.tv);
        tview= (TextView) findViewById(R.id.tv1);
        relativeLayout= (TextView) findViewById(R.id.rv);
        callbackView= (ScorllCallbackView) findViewById(R.id.lscr);
        listView= (ScollListView) findViewById(R.id.lv);
        ArrayAdapter adapter=new ArrayAdapter<String>(this,android.R.layout.simple_list_item_1,list);
        listView.setAdapter(adapter);
        relativeLayout.post(new Runnable() {
            @Override
            public void run() {
                if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.HONEYCOMB) {
                    tview.setTranslationY(500);
                }

            }
        });

        callbackView.setOnScrollYChangedListener(this);

    }

    @Override
    public void onScrollYChanged(int y) {

    }
}
