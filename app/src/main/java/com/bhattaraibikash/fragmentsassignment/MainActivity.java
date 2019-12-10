package com.bhattaraibikash.fragmentsassignment;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.bhattaraibikash.fragmentsassignment.fragments.AreaFragment;
import com.bhattaraibikash.fragmentsassignment.fragments.ArmstrongFragment;
import com.bhattaraibikash.fragmentsassignment.fragments.AutomorphicFragment;
import com.bhattaraibikash.fragmentsassignment.fragments.PalindromeFragment;
import com.bhattaraibikash.fragmentsassignment.fragments.SimpleInterestFragment;
import com.bhattaraibikash.fragmentsassignment.fragments.SwapFragment;

public class MainActivity extends AppCompatActivity {

    private Button btnArea, btnPalindrome, btnSI, btnArmstrong, btnAutomorphic, btnSwap;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnArea = findViewById(R.id.btnArea);
        btnPalindrome = findViewById(R.id.btnPalindrome);
        btnSI = findViewById(R.id.btnSI);
        btnArmstrong = findViewById(R.id.btnArmstrong);
        btnAutomorphic = findViewById(R.id.btnAutomorphic);
        btnSwap = findViewById(R.id.btnSwap);


        btnArea.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                FragmentManager fragmentManager = getSupportFragmentManager();
                FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();

                AreaFragment areaFragment = new AreaFragment();
                fragmentTransaction.replace(R.id.displayArea, areaFragment);
                fragmentTransaction.commit();
            }
        });

        btnPalindrome.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                FragmentManager fragmentManager = getSupportFragmentManager();
                FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();

                PalindromeFragment palindromeFragment = new PalindromeFragment();
                fragmentTransaction.replace(R.id.displayArea, palindromeFragment);
                fragmentTransaction.commit();
            }
        });

        btnSI.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                FragmentManager fragmentManager = getSupportFragmentManager();
                FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();

                SimpleInterestFragment simpleInterestFragment = new SimpleInterestFragment();
                fragmentTransaction.replace(R.id.displayArea, simpleInterestFragment);
                fragmentTransaction.commit();
            }
        });

        btnArmstrong.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                FragmentManager fragmentManager = getSupportFragmentManager();
                FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();

                ArmstrongFragment armstrongFragment = new ArmstrongFragment();
                fragmentTransaction.replace(R.id.displayArea, armstrongFragment);
                fragmentTransaction.commit();
            }
        });

        btnAutomorphic.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                FragmentManager fragmentManager = getSupportFragmentManager();
                FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();

                AutomorphicFragment automorphicFragment = new AutomorphicFragment();
                fragmentTransaction.replace(R.id.displayArea, automorphicFragment);
                fragmentTransaction.commit();
            }
        });

        btnSwap.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                FragmentManager fragmentManager = getSupportFragmentManager();
                FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();

                SwapFragment swapFragment = new SwapFragment();
                fragmentTransaction.replace(R.id.displayArea, swapFragment);
                fragmentTransaction.commit();
            }
        });
    }
}
