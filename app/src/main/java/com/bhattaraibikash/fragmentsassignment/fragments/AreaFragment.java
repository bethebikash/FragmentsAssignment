package com.bhattaraibikash.fragmentsassignment.fragments;


import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import com.bhattaraibikash.fragmentsassignment.R;

/**
 * A simple {@link Fragment} subclass.
 */
public class AreaFragment extends Fragment implements View.OnClickListener {

    private Button btnCalculateArea;
    private EditText etRadius;
    private TextView tvArea;

    public AreaFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_area, container, false);

        etRadius = view.findViewById(R.id.etRadius);
        tvArea = view.findViewById(R.id.tvArea);
        btnCalculateArea = view.findViewById(R.id.btnCalculateArea);

        btnCalculateArea.setOnClickListener(this);

        return view;
    }

    @Override
    public void onClick(View v) {
        if(etRadius.getText().toString().isEmpty()){
            etRadius.setError("enter the radius!");
        } else {
            float radius = Float.parseFloat(etRadius.getText().toString());
            float area = 3.141f * radius * radius;

            tvArea.setText("Area of circle is "+area);
        }
    }
}
