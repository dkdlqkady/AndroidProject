package com.example.qwer;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {

        // 하이염 김광순 개바보
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button imageButton = (Button) findViewById(R.id.Button_PNumber);
        imageButton.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), PhoneSetting.class);
                startActivity(intent);
            }
        });
    }
    public void onButton1Clicked(View v) {
    }
    public void onButton2Clicked(View v) {
    }
    public void onButton3Clicked(View v) {

    }
    public void onBackButtonClicked(View v) {
        Toast.makeText(getApplicationContext(), "앱이 종료됩니다.", Toast.LENGTH_LONG).show();
        finish();
    }
}