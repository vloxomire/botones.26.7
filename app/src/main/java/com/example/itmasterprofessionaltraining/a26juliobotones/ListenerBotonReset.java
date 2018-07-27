package com.example.itmasterprofessionaltraining.a26juliobotones;

import android.app.Activity;
import android.view.View;
import android.widget.EditText;

public class ListenerBotonReset implements View.OnClickListener {
    private MainActivity context;

    public ListenerBotonReset(Activity context) {
        this.context = (MainActivity) context;
    }

    @Override
    public void onClick(View view) {
        context.getEditText1().setText("");
        context.getEditText2().setText("");
        context.getEditText3().setText("");

    }
}
