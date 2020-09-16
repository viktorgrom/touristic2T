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
        List<item> mlist = new ArrayList<>();
        mlist.add(new item(31,R.drawable.test_cat3_dnister_kan, "Дністровський каньйон", "Верхів'я річки Дністер"));
        mlist.add(new item(32,R.drawable.test_cat3_oleshkivski_pisku, "Олешківські піски", "Олешківський район, Херсонська обл."));
        mlist.add(new item(33,R.drawable.test_cat3_korostushiv_kan, "Коростишівський каньйон", "Коростишів, Житомирська обл."));
        mlist.add(new item(34,R.drawable.test_cat3_vodospad_djyrin, "Водоспад Джурин", "с.Нирків, Тернопільська обл."));
        mlist.add(new item(35,R.drawable.test_cat3_pechera_vetreba, "Печера Ветреба", "c.Більче-Золоте, Тернопільська обл."));
        mlist.add(new item(36,R.drawable.test_cat2_galaganiv, "Червонпад", "Со"));
        mlist.add(new item(37,R.drawable.mp5, "Palace", "fghjklcvbnm,rtyuiop"));
        mlist.add(new item(38,R.drawable.mp5, "Palace", "fghjklcvbnm,rtyuiop"));
        mlist.add(new item(39,R.drawable.mp5, "Palace", "fghjklcvbnm,rtyuiop"));
        mlist.add(new item(310,R.drawable.mp5, "Palace", "fghjklcvbnm,rtyuiop"));
        Adapter_recycler adapter = new Adapter_recycler(this, mlist);
        recyclerView.setAdapter(adapter);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
    }
}

