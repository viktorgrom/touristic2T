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

public class PrePlaceInfoActivityPalacu extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.recycler_view_item);

        Window w = getWindow();
        w.setFlags(WindowManager.LayoutParams.FLAG_LAYOUT_NO_LIMITS, WindowManager.LayoutParams.FLAG_LAYOUT_NO_LIMITS);

        RecyclerView recyclerView = findViewById(R.id.rv_list);
        List<ItemCategory> mlist = new ArrayList<>();
        mlist.add(new ItemCategory(21,R.drawable.cat2_vishnivez1, R.string.t_21, R.string.sd_21,R.string.t_21));
        mlist.add(new ItemCategory(22,R.drawable.cat2_sangushko_izaslav, R.string.t_22, R.string.sd_22,R.string.ld_22));
        mlist.add(new ItemCategory(23,R.drawable.cat2_badeni, R.string.t_23, R.string.sd_23,R.string.ld_23));
        mlist.add(new ItemCategory(24,R.drawable.cat2_rymianzev1, R.string.t_24, R.string.sd_24,R.string.ld_24));
        mlist.add(new ItemCategory(25,R.drawable.cat2_kachanivka1, R.string.t_25, R.string.sd_25,R.string.ld_25));
        mlist.add(new ItemCategory(26,R.drawable.cat2_galaganiv1, R.string.t_26, R.string.sd_26,R.string.ld_26));
        mlist.add(new ItemCategory(27,R.drawable.cat2_bilokrunucki1, R.string.t_27, R.string.sd_27,R.string.ld_27));
        mlist.add(new ItemCategory(28,R.drawable.cat2_betrginski_tereschenki1, R.string.t_28, R.string.sd_28,R.string.ld_28));
        mlist.add(new ItemCategory(29,R.drawable.cat2_rozumovski, R.string.t_29, R.string.sd_29,R.string.ld_29));
        mlist.add(new ItemCategory(210,R.drawable.cat2_chervone_tereschenki, R.string.t_210,  R.string.sd_210, R.string.ld_210));
        Adapter_recycler adapter = new Adapter_recycler(this, mlist);
        recyclerView.setAdapter(adapter);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
    }
}
