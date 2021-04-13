package com.example.tugas3;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        List<com.example.card_view.HewanData> data = fill_with_data();
        RecyclerView rv = (RecyclerView) findViewById(R.id.rv);
        HewanAdapter rva = new HewanAdapter(data,getApplication());
        rv.setAdapter(rva);
        rv.setLayoutManager(new LinearLayoutManager(this));
    }
    public List<com.example.card_view.HewanData> fill_with_data(){
        List<com.example.card_view.HewanData> data = new ArrayList<>();
        data.add(new com.example.card_view.HewanData("Anjing","Omnivora", "Anjing merupakan hewan yang manis dan menjengkelkan",R.mipmap.ic_anjing_foreground));
        data.add(new com.example.card_view.HewanData("Babi","Omnivora", "Babi merupakan hewan yang menjengkelkan",R.mipmap.ic_babi_foreground));
        data.add(new com.example.card_view.HewanData("Beruang","Karnivora", "Beruang iconic masha and the bear",R.mipmap.ic_beruang_foreground));
        data.add(new com.example.card_view.HewanData("Elang","Karnivora", "Elang itu terbang diudara kadang di darat",R.mipmap.ic_elang_foreground));
        data.add(new com.example.card_view.HewanData("Gajah","Herbivora", "Gajah punya telalai",R.mipmap.ic_gajah_foreground));
        data.add(new com.example.card_view.HewanData("Hiu","Karnivora", "Hiu itu ganas grrrr.... takut",R.mipmap.ic_hiu_foreground));
        data.add(new com.example.card_view.HewanData("Kelinci","Herbivora", "Kelinci gigi inya lucu imut dan mempesona siapapun suka padanya eheh",R.mipmap.ic_kelinci_foreground));
        data.add(new com.example.card_view.HewanData("Kodok","Omnivora", "Bisa di darat dan di Air, suka melompat  gajelas",R.mipmap.ic_kodok_foreground));
        data.add(new com.example.card_view.HewanData("Kucing","Omnivora", "Bermata dua lucu imut mempesona aku suka, kamu?",R.mipmap.ic_kucing_foreground));
        data.add(new com.example.card_view.HewanData("Kuda","Herbivora", "Kudah aw kuda larinya kencang sekali ",R.mipmap.ic_kuda_foreground));
           return data;
    }
}