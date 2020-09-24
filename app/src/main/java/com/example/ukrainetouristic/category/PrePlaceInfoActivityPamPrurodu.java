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
        mlist.add(new ItemCategory(31, R.drawable.test_cat3_dnister_kan, R.string.t_31, R.string.sd_31, R.string.ld_31));
        mlist.add(new ItemCategory(32, R.drawable.test_cat3_oleshkivski_pisku, R.string.t_32, R.string.sd_32, R.string.ld_32));
        mlist.add(new ItemCategory(33, R.drawable.test_cat3_korostushiv_kan, R.string.t_33, R.string.sd_33, R.string.ld_33));
        mlist.add(new ItemCategory(34, R.drawable.test_cat3_vodospad_djyrin, R.string.t_34, R.string.sd_34, R.string.ld_34));
        mlist.add(new ItemCategory(35, R.drawable.test_cat3_pechera_vetreba, R.string.t_35, R.string.sd_35, R.string.ld_35));
        mlist.add(new ItemCategory(36, R.drawable.cat3_uzefin, R.string.t_36, R.string.sd_36, R.string.ld_36));
        mlist.add(new ItemCategory(37, R.drawable.cat3_vasilkiv_karpatu, R.string.t_37, R.string.sd_37, R.string.ld_37));
        mlist.add(new ItemCategory(38, R.drawable.cat3_vitachiv, R.string.t_38, R.string.sd_38, R.string.ld_38));
        Adapter_recycler adapter = new Adapter_recycler(this, mlist);
        recyclerView.setAdapter(adapter);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
    }
}

