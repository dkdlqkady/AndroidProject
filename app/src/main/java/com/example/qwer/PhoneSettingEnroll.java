package com.example.qwer;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

public class PhoneSettingEnroll extends Activity implements View.OnClickListener{

    FirebaseDatabase database;
    DatabaseReference myRef;

    @Override

    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.phone_setting_enroll);
        init();
    }

    void init(){
        Button button1 = (Button) this.findViewById(R.id.button1);
        button1.setOnClickListener(this);
        database = FirebaseDatabase.getInstance();
        myRef = database.getReference("users");
    }

    public void onClick(View v) {
        if (v.getId() == R.id.button1) {
            UserData data = new UserData();
            EditText ak = (EditText) this.findViewById(R.id.name);
            data.setName(ak.getText().toString());
            ak = (EditText) this.findViewById(R.id.relation);
            data.setRelation(ak.getText().toString());
            ak = (EditText) this.findViewById(R.id.number);
            data.setHp(ak.getText().toString());
            myRef.push().setValue(data);
        }
    }
}
