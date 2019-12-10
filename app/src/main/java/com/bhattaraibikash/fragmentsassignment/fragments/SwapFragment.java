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
public class SwapFragment extends Fragment implements View.OnClickListener {

    private EditText etFirstNum, etSecondNum;
    private TextView tvSwap;
    private Button btnSwap;

    public SwapFragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_swap, container, false);
        tvSwap = view.findViewById(R.id.tvSwap);
        etFirstNum = view.findViewById(R.id.etFirstNum);
        etSecondNum = view.findViewById(R.id.etSecondNum);
        btnSwap = view.findViewById(R.id.btnSwap);

        btnSwap.setOnClickListener(this);
        return view;
    }

    @Override
    public void onClick(View v) {
        if (etFirstNum.getText().toString().isEmpty()) {
            etFirstNum.setError("enter first number!");
        } else if (etSecondNum.getText().toString().isEmpty()) {
            etSecondNum.setError("enter second number!");
        } else {
            int fNum = Integer.parseInt(etFirstNum.getText().toString());
            int sNum = Integer.parseInt(etSecondNum.getText().toString());

            fNum = fNum + sNum;
            sNum = fNum - sNum;
            fNum = fNum - sNum;

            tvSwap.setText("First Number is :" + fNum + "\nSecond Number is :" + sNum);

        }
    }
}
