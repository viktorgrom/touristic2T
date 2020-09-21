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

public class PrePlaceInfoActivityPamPrurodu extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.recycler_view_item);

        Window w = getWindow();
        w.setFlags(WindowManager.LayoutParams.FLAG_LAYOUT_NO_LIMITS, WindowManager.LayoutParams.FLAG_LAYOUT_NO_LIMITS);

        RecyclerView recyclerView = findViewById(R.id.rv_list);
        List<ItemCategory> mlist = new ArrayList<>();
        mlist.add(new ItemCategory(31,R.drawable.test_cat3_dnister_kan, "Дністровський каньйон", "Верхів'я річки Дністер","12"));
        mlist.add(new ItemCategory(32,R.drawable.test_cat3_oleshkivski_pisku, "Олешківські піски", "Олешківський район, Херсонська обл.","12"));
        mlist.add(new ItemCategory(33,R.drawable.test_cat3_korostushiv_kan, "Коростишівський каньйон", "Коростишів, Житомирська обл.","12"));
        mlist.add(new ItemCategory(34,R.drawable.test_cat3_vodospad_djyrin, "Водоспад Джурин", "с.Нирків, Тернопільська обл.","12"));
        mlist.add(new ItemCategory(35,R.drawable.test_cat3_pechera_vetreba, "Печера Ветреба", "c.Більче-Золоте, Тернопільська обл.","12"));
        mlist.add(new ItemCategory(36,R.drawable.test_cat2_galaganiv, "Червонпад", "Со","12"));
        mlist.add(new ItemCategory(37,R.drawable.mp5, "Palace", "fghjklcvbnm,rtyuiop","12"));
        mlist.add(new ItemCategory(38,R.drawable.mp5, "Palace", "fghjklcvbnm,rtyuiop","12"));
        mlist.add(new ItemCategory(39,R.drawable.mp5, "Palace", "fghjklcvbnm,rtyuiop","12"));
        mlist.add(new ItemCategory(310,R.drawable.mp5, "Palace", "fghjklcvbnm,rtyuiop","12"));
        Adapter_recycler adapter = new Adapter_recycler(this, mlist);
        recyclerView.setAdapter(adapter);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
    }
}

