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

public class PrePlaceInfoActivityReligiini extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.recycler_view_item);

        Window w = getWindow();
        w.setFlags(WindowManager.LayoutParams.FLAG_LAYOUT_NO_LIMITS, WindowManager.LayoutParams.FLAG_LAYOUT_NO_LIMITS);

        RecyclerView recyclerView = findViewById(R.id.rv_list);
        List<ItemCategory> mlist = new ArrayList<>();
        mlist.add(new ItemCategory(51, R.drawable.cat5_pochaiv1, R.string.t_51, R.string.sd_51, R.string.ld_51));
        mlist.add(new ItemCategory(52, R.drawable.cat5_kostel_stara_kotelna1, R.string.t_52, R.string.sd_52, R.string.ld_52));
        mlist.add(new ItemCategory(53, R.drawable.cat5_kremenec_kolegium1, R.string.t_53, R.string.sd_53, R.string.ld_53));
        mlist.add(new ItemCategory(54, R.drawable.cat5_klara1, R.string.t_54, R.string.sd_54, R.string.ld_54));
        mlist.add(new ItemCategory(55, R.drawable.cat5_pidgirzi_kostel, R.string.t_55, R.string.sd_55, R.string.ld_55));
        mlist.add(new ItemCategory(56, R.drawable.cat5_bosi_karmelit_berd1, R.string.t_56, R.string.sd_56, R.string.ld_56));

        Adapter_recycler adapter = new Adapter_recycler(this, mlist);
        recyclerView.setAdapter(adapter);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
    }
}