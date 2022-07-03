package com.smithyan.combobox;

import android.annotation.SuppressLint;
import android.content.Context;
import android.widget.EditText;
import android.widget.RelativeLayout;
import android.widget.Spinner;

public class ComboBox extends RelativeLayout {
    EditText ET ;
    Spinner SP;
    @SuppressLint("SetTextI18n")
    public ComboBox(Context context) {
        super(context);
        ET = findViewById(R.id.edittext);
        SP = findViewById(R.id.spinner);
        ET.setText("hello");
    }
}
