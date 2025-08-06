package com.huacao.one;
 
import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends Activity {
     
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        
    }
	public void toListView(View v){
		Intent intent = new Intent(this,ListView.class);
		startActivity(intent);
		}
	public void toBAListView(View v){
		Intent intent = new Intent(this,BAListView.class);
		startActivity(intent);
	}
}
