package com.example.user.mypccare;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    TextView mNama;
    RecyclerView recyclerView;
    PcModel pcModel;
    PcAdapter pcAdapter;
    List<PcModel> pcModelList = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mNama = (TextView) findViewById(R.id.mTextNama);

        String namadarifront = getIntent().getStringExtra("NAMA");

        mNama.setText("Hello "+namadarifront);


        recyclerView = (RecyclerView) findViewById(R.id.recyclerView);

        pcAdapter = new PcAdapter(this, pcModelList);

        RecyclerView.LayoutManager lm = new LinearLayoutManager(getApplicationContext());

        recyclerView.setLayoutManager(lm);
        recyclerView.setAdapter(pcAdapter);

        persiapanData();

    }



    void persiapanData(){
        String [] namaIndo = {"Processor", "Cooler Fan", "Motherboard", "RAM", "VGA", "Hard Drive", "Power Supply",};
        String [] detail = {getString(R.string.prosesor), getString(R.string.cooler_fan), getString(R.string.motherboard), getString(R.string.ram), getString(R.string.vga), getString(R.string.hdd), getString(R.string.psu)};
        int [] gambar = {R.drawable.chipicon, R.drawable.coolericon, R.drawable.motherboardicon, R.drawable.rammemoryicon, R.drawable.videocardicon, R.drawable.harddiskicon, R.drawable.powersupplyicon};
        int [] picture = {R.drawable.prosesor, R.drawable.coolerfan, R.drawable.motherboard, R.drawable.ram, R.drawable.vga, R.drawable.harddrive, R.drawable.psu};

        for(int i=0; i<namaIndo.length;i++){
            pcModel = new PcModel(namaIndo[i], detail[i], gambar[i], picture[i]);
            pcModelList.add(pcModel);
        }


    }




}