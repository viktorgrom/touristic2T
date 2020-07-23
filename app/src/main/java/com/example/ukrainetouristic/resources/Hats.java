package com.example.ukrainetouristic.resources;

import com.example.ukrainetouristic.R;
import com.example.ukrainetouristic.models.Hat;


public class Hats {

    public static Hat[] getHats(){
        return SNAPBACKS;
    }

    public static final Hat SNAPBACK_BLACK = new Hat("Маріїнський палац", R.drawable.mp2,
            "Klasne misce");
    public static final Hat SNAPBACK_CAMO = new Hat("Маріїнський палац", R.drawable.mp3,
            "Klasne misce");
    public static final Hat SNAPBACK_GREY = new Hat("Маріїнський палац", R.drawable.mp4,
            "Klasne misce");
    public static final Hat SNAPBACK_NAVY = new Hat("Маріїнський палац", R.drawable.mp1,
            "Klasne misce");
    public static final Hat SNAPBACK_RED = new Hat("Маріїнський палац", R.drawable.mp5,
            "Klasne misce");
    public static final Hat SNAPBACK_TEAL = new Hat("Маріїнський палац", R.drawable.mp1,
            "Klasne misce");

    public static final Hat[] SNAPBACKS = {SNAPBACK_NAVY, SNAPBACK_BLACK, SNAPBACK_CAMO, SNAPBACK_GREY, SNAPBACK_RED, SNAPBACK_TEAL};



}
