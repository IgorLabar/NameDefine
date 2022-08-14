package com.example.namedefine;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Spinner;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {


    private Spinner spinnerNames;
    private TextView textViewTranslate;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        spinnerNames = findViewById(R.id.spinnerNames);
        textViewTranslate = findViewById(R.id.textViewTranslate);
    }

    public void showMeTranslateName(View view) {
        int position = spinnerNames.getSelectedItemPosition();
        String defineNames = translateNames(position);
        textViewTranslate.setText(defineNames);
    }
    private String translateNames(int position) {
        String[] translates = getResources().getStringArray(R.array.translate_names);
        return translates[position];
    }
}