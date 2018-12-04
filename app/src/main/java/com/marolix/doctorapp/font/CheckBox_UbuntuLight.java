package com.marolix.doctorapp.font;

import android.content.Context;
import android.graphics.Typeface;
import android.support.v7.widget.AppCompatCheckBox;
import android.util.AttributeSet;

public class CheckBox_UbuntuLight extends AppCompatCheckBox {
    public CheckBox_UbuntuLight(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        init();
    }

    public CheckBox_UbuntuLight(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        init();
    }

    public CheckBox_UbuntuLight(Context context) {
        super(context);
        init();
    }

    private void init() {
        if (!isInEditMode()) {
            setTypeface(Typeface.createFromAsset(getContext().getAssets(), "fonts/Ubuntu_Light.ttf"));
        }
    }
}
