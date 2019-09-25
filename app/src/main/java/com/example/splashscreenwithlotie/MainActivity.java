package com.example.splashscreenwithlotie;

import android.app.Dialog;
import android.os.Bundle;
import android.os.Handler;
import android.view.View;
import android.view.Window;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    Button successBtn;
    Button errorBtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        successBtn = findViewById(R.id.bt_success);
        errorBtn = findViewById(R.id.error);
        final Dialog settingsDialog = new Dialog(MainActivity.this);
        settingsDialog.getWindow().requestFeature(Window.FEATURE_NO_TITLE);
        successBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                settingsDialog.setContentView(getLayoutInflater().inflate(R.layout.success_image_layout
                        , null));
                settingsDialog.show();
                new Handler().postDelayed(new Runnable() {
                    @Override
                    public void run() {
                        settingsDialog.dismiss();
                    }
                }, 4500);
            }
        });

        errorBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                settingsDialog.setContentView(getLayoutInflater().inflate(R.layout.error_image_layout
                        , null));
                settingsDialog.show();
                new Handler().postDelayed(new Runnable() {
                    @Override
                    public void run() {
                        settingsDialog.dismiss();
                    }
                }, 2800);

            }
        });
    }
}
