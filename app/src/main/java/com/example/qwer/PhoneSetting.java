package com.example.qwer;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

public class PhoneSetting extends AppCompatActivity {
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.phone_setting);

        Button imageButton = (Button) findViewById(R.id.Number_enroll);
        imageButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), PhoneSettingEnroll.class);
                startActivity(intent);
            }
        });
    }
    public void onButton1Clicked(View v) {

    }
    public void onButton2Clicked(View v) {

    }
    public void onButton3Clicked(View v) {
        Intent it = new Intent(this,PhoneListPrintActivity.class);
        startActivity(it);
    }
}
