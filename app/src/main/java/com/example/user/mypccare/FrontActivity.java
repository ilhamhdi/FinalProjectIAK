package com.example.user.mypccare;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class FrontActivity extends AppCompatActivity {

    EditText mNama;
    Button mMasuk;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_front);
        mNama = (EditText) findViewById(R.id.mEditTextNama);
        mMasuk = (Button) findViewById(R.id.mBtnMasuk);

        mMasuk.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i= new Intent(FrontActivity.this, MainActivity.class);
                i.putExtra("NAMA", mNama.getText().toString());

                startActivity(i);
                finish();

            }
        });

    }
}