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

public class PrePlaceInfoActivityZamku extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.recycler_view_item);

        Window w = getWindow();
        w.setFlags(WindowManager.LayoutParams.FLAG_LAYOUT_NO_LIMITS, WindowManager.LayoutParams.FLAG_LAYOUT_NO_LIMITS);

        RecyclerView recyclerView = findViewById(R.id.rv_list);
        List<ItemCategory> mlist = new ArrayList<>();
        mlist.add(new ItemCategory(11, R.drawable.cat1_zbaraj_zamok1, R.string.title_11, R.string.sd_11, R.string.ld_11));
        mlist.add(new ItemCategory(12, R.drawable.cat1_pidgirzi_zamok1, R.string.t_12, R.string.sd_12,R.string.ld_12));
        mlist.add(new ItemCategory(13, R.drawable.cat1_bychach, R.string.t_13, R.string.sd_13, R.string.ld_13));
        mlist.add(new ItemCategory(14, R.drawable.cat1_hotun1, R.string.t_14, R.string.sd_14, R.string.ld_14));
        mlist.add(new ItemCategory(15, R.drawable.cat1_medjib_zamok1, R.string.t_15, R.string.sd_15,  R.string.ld_15));
        mlist.add(new ItemCategory(16, R.drawable.cat1_kam_pod_zamok1, R.string.t_16, R.string.sd_16, R.string.ld_16));
        mlist.add(new ItemCategory(17, R.drawable.cat1_lubart1, R.string.t_17, R.string.sd_17, R.string.ld_17));
        mlist.add(new ItemCategory(18, R.drawable.cat1_bilgoroddnistr1, R.string.t_18, R.string.sd_18,R.string.ld_18));
        mlist.add(new ItemCategory(19, R.drawable.cat1_kremenets1, R.string.t_19, R.string.sd_19,R.string.ld_19));
        mlist.add(new ItemCategory(110, R.drawable.cat1_terebovla1, R.string.t_110, R.string.sd_110,R.string.ld_110));
        mlist.add(new ItemCategory(111, R.drawable.cat1_chervonogrud, R.string.t_111, R.string.sd_111,R.string.ld_111));
        Adapter_recycler adapter = new Adapter_recycler(this, mlist);
        recyclerView.setAdapter(adapter);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));

    }
}