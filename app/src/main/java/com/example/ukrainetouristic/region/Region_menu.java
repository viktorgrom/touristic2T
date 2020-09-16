package com.example.ukrainetouristic.region;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.example.ukrainetouristic.R;
import com.example.ukrainetouristic.category.PrePlaceInfoActivityPlaces;
import com.example.ukrainetouristic.category.PrePlaceInfoActivityPamPrurodu;
import com.example.ukrainetouristic.category.PrePlaceInfoActivitySadubu;
import com.example.ukrainetouristic.category.PrePlaceInfoActivityParku;
import com.example.ukrainetouristic.category.PrePlaceInfoActivityReligiini;
import com.example.ukrainetouristic.category.PrePlaceInfoActivityZamku;
import com.example.ukrainetouristic.category.PrePlaceInfoActivityZikaviMista;
import com.example.ukrainetouristic.category.PrePlaceInfoActivityZikaviMiszia;

public class Region_menu extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_region_menu);
    }
    public void process_region(View view) {
        Intent intent = null;
        if (view.getId() == R.id.place_category1) {
            intent = new Intent(this, PrePlaceInfoActivityZamku.class);

            startActivity(intent);
        }
        else if (view.getId() == R.id.place_category2) {
            intent = new Intent(this, PrePlaceInfoActivityPlaces.class);

            startActivity(intent);
        }
        else if (view.getId() == R.id.place_category3) {
            intent = new Intent(this, PrePlaceInfoActivityPamPrurodu.class);

            startActivity(intent);
        }
        else if (view.getId() == R.id.place_category4) {
            intent = new Intent(this, PrePlaceInfoActivityZikaviMiszia.class);

            startActivity(intent);
        }
        else if (view.getId() == R.id.place_category5) {
            intent = new Intent(this, PrePlaceInfoActivityReligiini.class);

            startActivity(intent);
        }
        else if (view.getId() == R.id.place_category6) {
            intent = new Intent(this, PrePlaceInfoActivityParku.class);

            startActivity(intent);
        }
        else if (view.getId() == R.id.place_category7) {
            intent = new Intent(this, PrePlaceInfoActivitySadubu.class);

            startActivity(intent);
        }
        else if(view.getId() == R.id.place_category8) {
            intent = new Intent(this, PrePlaceInfoActivityZikaviMista.class);

            startActivity(intent);
        }

    }
}
