package com.example.agrendra.bumbukost_r2;

import android.content.Intent;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

public class ListActivity extends AppCompatActivity {

    Intent intent = new Intent();
    ListView listView;

    String[] itemname = {
            "Cabe Hijau",
            "Cabe Merah",
            "Jahe",
            "Kunyit",
            "Lengkuas"
    };

    Integer[] imgid = {
            R.drawable.cabe_hijau,
            R.drawable.cabe_merah,
            R.drawable.jahe,
            R.drawable.kunyit,
            R.drawable.lengkuas
    };



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list);

        ActionBar actionBar = getSupportActionBar();
        actionBar.hide();

        CustomListAdapter adapter = new CustomListAdapter(this, itemname, imgid);
        listView = (ListView)findViewById(R.id.data);
        listView.setAdapter(adapter);
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int position, long l) {
                switch (position){
                    case 0:
                        intent = new Intent(ListActivity.this, DetailActivity.class);
                        intent.putExtra("judul", "Cabe Hijau");
                        intent.putExtra("detail", "Cabe cabe an lu boy");
                        intent.putExtra("gambar", R.drawable.cabe_hijau);
                        startActivity(intent);
                        break;
                    case 1:
                        intent.putExtra("judul", "Cabe Hijau");
                        intent.putExtra("detail", "Cabe cabe an lu boy merah");
                        intent.putExtra("gambar", R.drawable.cabe_merah);
                        startActivity(intent);
                        break;
                    case 2:
                        intent.putExtra("judul", "Jahe");
                        intent.putExtra("detail", "Jahe merupakan rimpang berbentuk ruas dengan warna kulit coklat muda yang sering digunakan untuk bahan utama minuman hangat dan bumbu tambahan. Selain itu, jahe juga digunakan dalam industri obat-obatan. Jahe memiliki rasa yang pedas dan bau yang menyengat namun menyegarkan. Bau dan rasa pedas pada jahe disebabkan oleh senyawa utamanya, keton yaitu Zingeron.");
                        intent.putExtra("gambar", R.drawable.jahe);
                        startActivity(intent);
                        break;
                    case 3:
                        intent.putExtra("judul", "Kunyit");
                        intent.putExtra("detail", "Laos ditambahkan dalam masakan agar memiliki aroma yang segar, umumnya laos pasti digunakan dalam masakan bersantan, atau masakan yang melibatkan daging seperti ayam, ikan atau sapi.Laos tidak memiliki rasa yang pedas seperti jahe. Ruas pada laos juga berbeda dengan jahe yang dimana laos memiliki ukuran yang relatif besar dengan kulit berwarna coklat tua. Selain itu, serat pada laos lebih banyak bila dibandingkan dengan jahe sehingga menjadikan laos ketika dipotong dengan pisau terasa lebih sulit daripada jahe.");
                        intent.putExtra("gambar", R.drawable.kunyit);
                        startActivity(intent);
                        break;
                    case 4:
                        intent.putExtra("judul", "Lengkuas");
                        intent.putExtra("detail", "Kunyit merupakan bahan utama dalam pembuatan bumbu kuning karena daging kunyit berwarna kuning tua hampir ke jingga. Kunyit digunakan sebagai pewarna alami karena dapat memberikan warna alami kuning pada masakan. Selain itu, kunyit juga memberikan rasa dan aroma segar pada masakan. Satu ruas kelingking kunyit sudah cukup untuk membuat 1 ayam opor kuning.");
                        intent.putExtra("gambar", R.drawable.kunyit);
                        startActivity(intent);
                        break;
                    default:
                        break;
                }
            }
        });

    }
}
