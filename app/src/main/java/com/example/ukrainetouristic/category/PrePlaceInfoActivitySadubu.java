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

public class PrePlaceInfoActivitySadubu extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.recycler_view_item);

        Window w = getWindow();
        w.setFlags(WindowManager.LayoutParams.FLAG_LAYOUT_NO_LIMITS, WindowManager.LayoutParams.FLAG_LAYOUT_NO_LIMITS);

        RecyclerView recyclerView = findViewById(R.id.rv_list);
        List<ItemCategory> mlist = new ArrayList<>();
        mlist.add(new ItemCategory(71,R.drawable.cat7_fon_mekk1, R.string.t_71, R.string.sd_71, R.string.ld_71));
        mlist.add(new ItemCategory(72,R.drawable.cat7_zabotin1, R.string.t_72, R.string.sd_72, R.string.ld_72));
        mlist.add(new ItemCategory(73,R.drawable.cat7_bobroviza1, R.string.t_73, R.string.sd_73, R.string.ld_73));
        mlist.add(new ItemCategory(74,R.drawable.cat7_mejigirria1, R.string.t_74, R.string.sd_74, R.string.ld_74));

        Adapter_recycler adapter = new Adapter_recycler(this, mlist);
        recyclerView.setAdapter(adapter);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
    }
}