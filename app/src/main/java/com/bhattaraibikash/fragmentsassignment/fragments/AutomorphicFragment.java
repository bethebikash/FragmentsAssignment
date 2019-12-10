package com.bhattaraibikash.fragmentsassignment.fragments;


import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import androidx.fragment.app.Fragment;

import com.bhattaraibikash.fragmentsassignment.R;

/**
 * A simple {@link Fragment} subclass.
 */
public class AutomorphicFragment extends Fragment implements View.OnClickListener {

    private EditText etNumberAu;
    private Button btnCheckAutomorphic;
    private TextView tvAutomorphic;

    public AutomorphicFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_automorphic, container, false);
        etNumberAu = view.findViewById(R.id.etNumberAu);
        tvAutomorphic = view.findViewById(R.id.tvAutomorphic);
        btnCheckAutomorphic = view.findViewById(R.id.btnCheckAutomorphic);

        btnCheckAutomorphic.setOnClickListener(this);
        return view;
    }

    @Override
    public void onClick(View v) {

        if(etNumberAu.getText().toString().isEmpty()){
            etNumberAu.setError("enter the number!");
        } else {
            int num = Integer.parseInt(etNumberAu.getText().toString());
            int sqNum = num * num;

            String strNum = Integer.toString(num);
            String strSqNumber = Integer.toString(sqNum);

            if (strSqNumber.endsWith(strNum)) {
                tvAutomorphic.setText(num+" is an Automorphic Number");
            } else {
                tvAutomorphic.setText(num+" is not an Automorphic Number");
            }
        }
    }
}
