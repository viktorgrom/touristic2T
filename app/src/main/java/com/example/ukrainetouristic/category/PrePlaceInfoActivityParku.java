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

public class PrePlaceInfoActivityParku extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.recycler_view_item);

        Window w = getWindow();
        w.setFlags(WindowManager.LayoutParams.FLAG_LAYOUT_NO_LIMITS, WindowManager.LayoutParams.FLAG_LAYOUT_NO_LIMITS);

        RecyclerView recyclerView = findViewById(R.id.rv_list);
        List<ItemCategory> mlist = new ArrayList<>();
        mlist.add(new ItemCategory(61,R.drawable.cat6_trahtemiriv1, R.string.t_61, R.string.sd_61, R.string.ld_61));
        mlist.add(new ItemCategory(62,R.drawable.cat6_sofiivka1, R.string.t_62, R.string.sd_62, R.string.ld_62));
        mlist.add(new ItemCategory(63,R.drawable.cat6_kreminski_lisu1, R.string.t_63, R.string.sd_63, R.string.ld_63));

        Adapter_recycler adapter = new Adapter_recycler(this, mlist);
        recyclerView.setAdapter(adapter);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
    }
}
