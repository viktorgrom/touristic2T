package com.example.ukrainetouristic.category;

import android.os.Bundle;
import android.view.Window;
import android.view.WindowManager;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.example.ukrainetouristic.R;

import java.util.ArrayList;
import java.util.List;

public class PrePlaceInfoActivityZikaviMista extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.recycler_view_item);

        Window w = getWindow();
        w.setFlags(WindowManager.LayoutParams.FLAG_LAYOUT_NO_LIMITS, WindowManager.LayoutParams.FLAG_LAYOUT_NO_LIMITS);

        RecyclerView recyclerView = findViewById(R.id.rv_list);
        List<ItemCategory> mlist = new ArrayList<>();
        mlist.add(new ItemCategory(81,R.drawable.test_cat8_kremenets, "Кременець","Тернопільська обл.","12"));
        mlist.add(new ItemCategory(82,R.drawable.test_cat8_buchach, "Бучач","Тернопільська обл.","12"));
        mlist.add(new ItemCategory(83,R.drawable.test_cat1_bychach_zamok, "Бучацький замок","Бучач, Тернопільська обл. 16ст.","12"));
        mlist.add(new ItemCategory(84,R.drawable.test_cat1_pidgirzi, "Хотинська фортеця","Хотин, Чернівецька обл. 13-17ст.","12"));
        mlist.add(new ItemCategory(85,R.drawable.test_cat1_medjib_zamok, "Меджибі́зький замок","Меджибіж, Хмельницька обл. 16ст.","12"));
        mlist.add(new ItemCategory(86,R.drawable.test_cat1_kam_pod_zamok, "Кам'яне́ць-Поді́льська форте́ця","Кам'яне́ць-Поді́льськ, Хмельницька обл. 16ст.","12"));

        Adapter_recycler adapter = new Adapter_recycler(this, mlist);
        recyclerView.setAdapter(adapter);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
    }
}