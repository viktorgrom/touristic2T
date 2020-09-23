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

public class PrePlaceInfoActivityZikaviMiszia extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.recycler_view_item);

        Window w = getWindow();
        w.setFlags(WindowManager.LayoutParams.FLAG_LAYOUT_NO_LIMITS, WindowManager.LayoutParams.FLAG_LAYOUT_NO_LIMITS);

        RecyclerView recyclerView = findViewById(R.id.rv_list);
        List<ItemCategory> mlist = new ArrayList<>();
        mlist.add(new ItemCategory(41, R.drawable.cat4_zmievi_valu1, R.string.t_41, R.string.sd_41, R.string.ld_41));
        mlist.add(new ItemCategory(42, R.drawable.cat4_zentr_europa1, R.string.t_42, R.string.sd_42, R.string.ld_42));
        mlist.add(new ItemCategory(43, R.drawable.cat4_zalischiki, R.string.t_43, R.string.sd_43, R.string.ld_43));
        mlist.add(new ItemCategory(44, R.drawable.cat4_zalischiki, R.string.t_44, R.string.sd_44, R.string.ld_44));
        mlist.add(new ItemCategory(45, R.drawable.cat4_nosivka, R.string.t_45, R.string.sd_45, R.string.ld_45));
        mlist.add(new ItemCategory(46, R.drawable.cat4_plebanivskii_viaduk, R.string.t_46, R.string.sd_46, R.string.ld_46));
        mlist.add(new ItemCategory(47, R.drawable.cat4_nosivka, R.string.t_47, R.string.sd_47, R.string.ld_47));
        Adapter_recycler adapter = new Adapter_recycler(this, mlist);
        recyclerView.setAdapter(adapter);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
    }
}