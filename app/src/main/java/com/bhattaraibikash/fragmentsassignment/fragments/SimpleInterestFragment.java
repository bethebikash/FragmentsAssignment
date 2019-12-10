package com.bhattaraibikash.fragmentsassignment.fragments;


import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.fragment.app.Fragment;

import com.bhattaraibikash.fragmentsassignment.R;

/**
 * A simple {@link Fragment} subclass.
 */
public class SimpleInterestFragment extends Fragment implements View.OnClickListener {

    private Button btnCalculateSI;
    private TextView tvSI;
    private EditText etAmount, etRate, etTime;


    public SimpleInterestFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_simple_interest, container, false);
        etAmount = view.findViewById(R.id.etAmount);
        etTime = view.findViewById(R.id.etTime);
        etRate = view.findViewById(R.id.etRate);
        tvSI = view.findViewById(R.id.tvSI);
        btnCalculateSI = view.findViewById(R.id.btnCalculateSI);

        btnCalculateSI.setOnClickListener(this);
        return view;
    }

    @Override
    public void onClick(View v) {
        if (etAmount.getText().toString().isEmpty()) {
            etAmount.setError("enter the amount!");
        } else if (etTime.getText().toString().isEmpty()) {
            etTime.setError("enter the time!");
        } else if (etRate.getText().toString().isEmpty()) {
            etRate.setError("enter the rate!");
        } else {
            float p = Float.parseFloat(etAmount.getText().toString());
            float t = Float.parseFloat(etTime.getText().toString());
            float r = Float.parseFloat(etRate.getText().toString());

            float si = (p * t * r) / 100;

            tvSI.setText("Simple Interest is : " + si);
        }
    }
}
