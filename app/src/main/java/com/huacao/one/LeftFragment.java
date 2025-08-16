package com.huacao.one;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.view.ViewGroup;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;
import androidx.fragment.app.Fragment;
import com.google.android.material.button.MaterialButton;

public class LeftFragment extends Fragment {

    public interface Fr{
        void sendData(String text);
        //回调方法
    }
    private EditText edittext;
    private TextView fmtv;
    private MaterialButton sendbt;
    private Fr fr;
    @Override
    public android.view.View onCreateView(LayoutInflater arg0, ViewGroup arg1, Bundle arg2) {
       View view = arg0.inflate(R.layout.fragl,arg1,false);
        edittext = view.findViewById(R.id.et);
        sendbt = view.findViewById(R.id.sendbt);
        fmtv = view.findViewById(R.id.fmtv);
        sendbt.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View arg0) {
             fr.sendData(edittext.getText().toString());
             
            }
            
        });
        return view;
    }
    
    public void atof(String activityt) {
    	fmtv.setText(activityt);
    }

    @Override
    public void onAttach(Context arg0) {
        super.onAttach(arg0);
        try {
        	fr = (Fr) arg0;
        } catch(ClassCastException err) {
        	throw new ClassCastException(arg0.toString()+"未实现接口");
        }    
    
}
}
