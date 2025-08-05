package com.huacao.one;

import android.app.Activity;
import android.os.Bundle;
import android.widget.ListView;
import android.widget.ArrayAdapter;

public class ListView extends Activity {
	String[] data = {
		"华为","小米","OPPO","VIVO","苹果"
	};
    
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_listview);
        ListView listview = findViewById(R.id.activitylistviewListView1);
		ArrayAdapter<String> adapter = new ArrayAdapter<String>(this,android.R.layout.simple_expandable_list_item_1,data);
		//上下文，item样式，数据
		listview.setAdapter(adapter);
    }
    
}
