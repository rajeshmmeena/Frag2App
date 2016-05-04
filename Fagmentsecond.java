package com.example.meena.frag2app;



import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

/**
 * Created by meena on 5/4/2016.
 */
public class Fagmentsecond extends Fragment {
TextView textView;
    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
         View view=inflater.inflate(R.layout.second, container, false);
        textView= (TextView) view.findViewById(R.id.textView);
        return view;
    }
    public void send(String s)
    {
        textView.setText(s);
    }
}
