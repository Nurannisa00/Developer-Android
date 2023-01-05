package com.mi.e020320052.nurannisa.resepmasakan_homework;

import android.support.annotation.DrawableRes;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    RecyclerView myRv;
    Adapter myAdapter;
    RecyclerView.LayoutManager layoutManager;
    ArrayList<Resep> listResep;

    void dataDummy(){
        listResep = new ArrayList<>();
        listResep.add(new Resep("Seblak", "Seblak kuah merupakan makanan khas Bandung yang memiliki rasa segar dan tentunya nikmat",
                R.drawable.seblak, "1 kg kerupuk aci/kerupuk kanji mentah warna putih " +
                " Air panas untuk merendam" +
                " 8 butir telur ayam" +
                " 4 sdm garam " +
                " 1 sdt gula pasir " +
                " 1 sdt kaldu ayam bubuk " +
                " 4 batang daun bawang, iris halus " +
                "8 sdm minyak goreng untuk menumis " +
                "12 buah sosis sapi, potong bulat diameter 1-2 cm " +
                " 10 buah bakso sapi, potong bulat tipis " +
                "Bawang goreng secukupnya untuk taburan  " +
                "20 siung bawang putih " +
                "6 butir bawang merah " +
                "2 cm kencur " +
                " 5 buah cabai keriting " +
                "10 buah cabai rawit" ,
                "Rendam kerupuk dalam air panas hingga berwarna bening. Angkat dan tiriskan. \n " +
                "Rebus kerupuk sebentar hingga lunak. Angkat dan tiriskan. " +
                "Masukkan ke dalam air panas, angkat dan tiriskan. " +
                "Panaskan minyak, tumis bumbu halus hingga harum. " +
                "Masukkan telur, aduk hingga berbutir-butir. " +
                "Tambahkan bakso sapi, sosi sapi, dan kerupuk kanji. Aduk rata." +
                "Masukkan daun bawang, garam, gula, dan kaldu ayam bubuk. Aduk rata." +
                "Tuang air, masak hingga bumbu meresap dan bahan matang. Angkat. " +
                "Dinginkan sejenak, masukkan ke dalam kemasan. Beri taburan bawang goreng." ,R.drawable.seblak));

    }

    void data(){
        myRv = findViewById(R.id.menu);

        myAdapter = new Adapter(this, listResep);
        myRv.setLayoutManager(new GridLayoutManager(this, 1));
        myRv.setAdapter(myAdapter);
    }
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        dataDummy();data();
    }

}