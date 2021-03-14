package com.example.androidlevel1;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.Switch;
import android.widget.TextView;
import android.widget.ToggleButton;


public class MainActivity extends AppCompatActivity {

    private LinearLayout backGround;
    private TextView text;
    private EditText editText;
    private Button button;
    @SuppressLint("UseSwitchCompatOrMaterialCode")
    private Switch switchBackGrd;
    private ToggleButton toggleButton;
    private CheckBox checkBox;
    private Button checkModule;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initViews();
        changeText();
        changeBackGround();
        whiteBack();
        onClickSecondModule();
    }

    private void initViews() {
        backGround = findViewById(R.id.backGround);
        text = findViewById(R.id.text);
        editText = findViewById(R.id.editText);
        button = findViewById(R.id.button);
        switchBackGrd = findViewById(R.id.switchBackGrd);
        toggleButton = findViewById(R.id.toggleButton);
        checkBox = findViewById(R.id.checkBox);
        checkModule = findViewById(R.id.checkModule);

    }

    private void changeBackGround() {
        switchBackGrd.setOnCheckedChangeListener((buttonView, isChecked) -> {
            if (isChecked) {
                if (toggleButton.isChecked()) {
                    whiteBackGround();
                } else {
                    greenBackGround();
                }
            } else {
                if (toggleButton.isChecked()) {
                    whiteBackGround();
                } else {
                    blueBackGround();
                }
            }
        });
    }

    private void changeText() {
        button.setOnClickListener(v -> {
            text.setText(editText.getText());
            editText.getText().clear();
        });
    }

    private void whiteBack() {
        toggleButton.setOnCheckedChangeListener((buttonView, isChecked) -> {
            if (isChecked) {
                whiteBackGround();
            } else {
                if (switchBackGrd.isChecked()) {
                    greenBackGround();
                } else {
                    blueBackGround();
                }
            }
        });
    }

    private void blueBackGround() {
        backGround.setBackgroundColor(Color.parseColor("#33a0f3"));
        switchBackGrd.setTextColor(Color.parseColor("#ffffff"));
        checkBox.setTextColor(Color.parseColor("#ffffff"));
    }

    private void greenBackGround() {
        backGround.setBackgroundColor(Color.parseColor("#b1fa9a"));
        switchBackGrd.setTextColor(Color.parseColor("#000000"));
        checkBox.setTextColor(Color.parseColor("#000000"));
    }

    private void whiteBackGround() {
        backGround.setBackgroundColor(Color.parseColor("#ffffff"));
        switchBackGrd.setTextColor(Color.parseColor("#000000"));
        checkBox.setTextColor(Color.parseColor("#000000"));
    }

    public void onClickSecondModule() {
        checkModule.setOnClickListener(v -> {
            Intent intent = new Intent(MainActivity.this, SecondModule.class);
            startActivity(intent);
        });

    }
}