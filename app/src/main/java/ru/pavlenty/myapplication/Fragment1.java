package ru.pavlenty.myapplication;

import android.os.Bundle;
import androidx.fragment.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton;
import com.google.android.material.snackbar.Snackbar;


public class Fragment1 extends Fragment {

    private View view;

    public Fragment1() {
    }

   @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        view = inflater.inflate(R.layout.fragment_fragment1, container, false);
        ExtendedFloatingActionButton btn = view.findViewById(R.id.floatingFragment);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view,R.string.hello_blank_fragment,Snackbar.LENGTH_LONG).show();
            }
        });

        return view;
    }


}
