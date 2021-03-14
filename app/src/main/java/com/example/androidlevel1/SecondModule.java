package com.example.androidlevel1;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class SecondModule extends AppCompatActivity {
    private Button mainModule;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.second_module);
        initViews();
        onClickMainModule(mainModule);
    }

    private void initViews() {
        mainModule = findViewById(R.id.mainModule);
    }

    public void onClickMainModule(View view) {
        mainModule.setOnClickListener(v -> {
            Intent intent = new Intent(SecondModule.this, MainActivity.class);
            startActivity(intent);
        });
    }
}
