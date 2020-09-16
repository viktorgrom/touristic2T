package com.example.ukrainetouristic;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.example.ukrainetouristic.R;
import com.example.ukrainetouristic.PrePlaceInfoActivityPlaces;
import com.example.ukrainetouristic.PrePlaceInfoActivityPamPrurodu;
import com.example.ukrainetouristic.PrePlaceInfoActivitySadubu;
import com.example.ukrainetouristic.PrePlaceInfoActivityParku;
import com.example.ukrainetouristic.PrePlaceInfoActivityReligiini;
import com.example.ukrainetouristic.PrePlaceInfoActivityZamku;
import com.example.ukrainetouristic.PrePlaceInfoActivityZikaviMista;
import com.example.ukrainetouristic.PrePlaceInfoActivityZikaviMiszia;

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
