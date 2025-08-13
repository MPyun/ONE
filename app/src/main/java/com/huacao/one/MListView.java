package com.huacao.one;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;
import java.util.ArrayList;

public class MListView extends Activity {
	ArrayList<String> data = new ArrayList<String>();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_listview);
		for (int i = 1; i < 51; i++) {
			data.add("目录." + i);
		}
        ListView listview = findViewById(R.id.activitylistviewListView1);
		ArrayAdapter<String> adapter = new ArrayAdapter<String>(this, android.R.layout.simple_expandable_list_item_1, data);
		//上下文，item样式，数据
		listview.setAdapter(adapter);
		listview.setOnItemClickListener(new AdapterView.OnItemClickListener() {

				@Override
				public void onItemClick(AdapterView<?> parent, View view, int position, long itemId) {
					position=position+1;
					Toast.makeText(getApplication(), "点击"+position, Toast.LENGTH_SHORT).show();
				}
			});//列表点击事件
		listview.setOnItemLongClickListener(new AdapterView.OnItemLongClickListener() {

				@Override
				public boolean onItemLongClick(AdapterView<?> parent, View view, int position, long itemId) {
					position=position+1;
					Toast.makeText(getApplication(), "长按"+position, Toast.LENGTH_SHORT).show();
					return true;
				}
			});//列表长按事件
	}
}
