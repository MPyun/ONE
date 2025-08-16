package com.huacao.one;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.service.autofill.OnClickAction;
import android.util.Log;
import android.view.MenuItem;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import com.google.android.material.bottomnavigation.BottomNavigationView;
import com.google.android.material.button.MaterialButton;
import com.google.android.material.navigation.NavigationBarMenuView;
import com.google.android.material.navigation.NavigationBarView;

public class MainActivity extends AppCompatActivity implements LeftFragment.Fr {
    private MaterialButton testbt;
    private FirstFM ff;
    private SecFragment sf;
    private TextView tv;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.test);
        ff = new FirstFM();
        sf = new SecFragment();
        showFragment(ff);
   /*     testbt = findViewById(R.id.changefragment);
        tv = findViewById(R.id.tv);*/

 BottomNavigationView bn = findViewById(R.id.navibt);
 bn.setOnItemSelectedListener(new NavigationBarView.OnItemSelectedListener() {
     @Override
     public boolean onNavigationItemSelected(MenuItem item) { 
        int itemId = item.getItemId();
        if (itemId == R.id.menu_item1) {
            showFragment(ff);
            return true;
        } else if (itemId == R.id.menu_item2) {
            showFragment(sf);
            return true;
        } else {
            return false;
}

     }
 }); // 这里删掉多余的}，只保留正确的闭合
    /*    testbt.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View arg0) {
                       // showFragment();
                    Log.d("Tag","显示碎片");
                    }
                });*/
    }

    public void toListView(View v) {
        Intent intent = new Intent(this, MListView.class);
        startActivity(intent);
    }

    public void toBAListView(View v) {
        Intent intent = new Intent(this, BAListView.class);
        startActivity(intent);
    }

    public void toRecyclerView(View v) {
        Intent intent = new Intent(this, MRecyclerView.class);
        startActivity(intent);
    }

    public void showFragment(Fragment f) {
        FragmentManager fm = getSupportFragmentManager();
        // 碎片管理器实例化
        FragmentTransaction transaction = fm.beginTransaction();
        // 开启事务.操作工具
        transaction.replace(R.id.cont,f);
        // 一参容器，二参为碎片对象
        transaction.commit();
        // 提交执行事务
    }

    @Override
    public void sendData(String text) {
        tv.setText(text);
        LeftFragment fragment1 = (LeftFragment) getSupportFragmentManager().findFragmentById(R.id.contp);
        fragment1.atof(text);
    }
    
    
}
