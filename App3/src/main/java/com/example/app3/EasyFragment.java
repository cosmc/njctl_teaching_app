package com.example.app3;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.app.Fragment;
import android.view.View;


/**
 * Created by ying on 10/27/13.
 */
public class EasyFragment extends android.support.v4.app.Fragment {
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        System.out.println("well HELLO THERE");
        return inflater.inflate(R.layout.easy_fragment, container, false);
    }
}
