package com.example.user.mypccare;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class DetailActivity extends AppCompatActivity {

    TextView judul;
    ImageView picture;
    TextView detail;
    PcModel pcModel;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);
        judul = (TextView) findViewById(R.id.judul);
        picture = (ImageView) findViewById(R.id.picture);
        detail = (TextView) findViewById(R.id.detail);
        pcModel = (PcModel) getIntent().getSerializableExtra("PC");
        judul.setText(pcModel.getNamaIndo());
        picture.setImageResource(pcModel.getPicture());
        detail.setText(pcModel.getDetail());
    }
}
