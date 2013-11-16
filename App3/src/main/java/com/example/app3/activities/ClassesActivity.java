package com.example.app3.activities;

import android.support.v7.app.ActionBarActivity;
import android.support.v7.app.ActionBar;
import android.support.v4.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.os.Build;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.SimpleAdapter;
import android.widget.TextView;

import com.example.app3.NJCTLClass;
import com.example.app3.R;

import java.util.ArrayList;
import java.util.List;

public class ClassesActivity extends ActionBarActivity {

    private List<NJCTLClass> classes;

    private ArrayList<NJCTLClass> createMockData() {
        ArrayList<NJCTLClass> mock = new ArrayList<NJCTLClass>();
        mock.add(new NJCTLClass("Kinematics"));
        mock.add(new NJCTLClass("Dynamics"));
        mock.add(new NJCTLClass("Kinematics ajk"));
        mock.add(new NJCTLClass("Kinematics b"));
        return mock;
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_classes);

        classes = createMockData();


    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.classes, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        switch (item.getItemId()) {
            case R.id.action_settings:
                return true;
        }
        return super.onOptionsItemSelected(item);
    }

    /**
     * A placeholder fragment containing a simple view.
     */
    public static class PlaceholderFragment extends Fragment {

        public PlaceholderFragment() {
        }

        @Override
        public View onCreateView(LayoutInflater inflater, ViewGroup container,
                Bundle savedInstanceState) {
            View rootView = inflater.inflate(R.layout.activity_classes, container, false);
            return rootView;
        }
    }

//    public static class MyClassesAdapter extends SimpleAdapter {
//        class ViewHolder {
//            TextView text;
//            ImageView image;
//        }
//        @Override
//        public View getView(int position, View convertView, ViewGroup parent) {
//            View view = convertView;
//            ViewHolder holder;
//            if (view == null) {
//                // Inflate view
//                view = inflater.inflate();
//                holder = new ViewHolder();
//                holder.image = (ImageView) view.findViewById(R.id.image);
//                holder.text = (TextView) view.findViewById(R.id.image);
//                view.setTag(holder);
//            } else {
//                holder = (ViewHolder) view.getTag();
//            }
//
//            return view;
//        }
//    }
}

