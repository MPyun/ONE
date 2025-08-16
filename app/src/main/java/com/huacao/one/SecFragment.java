package com.huacao.one;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.view.View;
import androidx.fragment.app.Fragment;

public class SecFragment extends Fragment {

    @Override
    public android.view.View onCreateView(LayoutInflater arg0, ViewGroup arg1, Bundle arg2) {
        View view = arg0.inflate(R.layout.se_frag,arg1,false);
        return view;
    }
}
