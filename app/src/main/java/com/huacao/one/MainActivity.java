package com.huacao.one;
 
import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {
     
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        
    }
	public void toListView(View v){
		Intent intent = new Intent(this,MListView.class);
		startActivity(intent);
		}
	public void toBAListView(View v){
		Intent intent = new Intent(this,BAListView.class);
		startActivity(intent);
	}
	public void toRecyclerView(View v){
		Intent intent = new Intent(this,MRecyclerView.class);
		startActivity(intent);
	}
}
