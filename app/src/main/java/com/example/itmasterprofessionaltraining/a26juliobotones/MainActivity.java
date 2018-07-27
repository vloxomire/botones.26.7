package com.example.itmasterprofessionaltraining.a26juliobotones;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    private Button botonConfirmar, botonReset;
    private ListenerBotonConfirmar listenerBotonConfirmar;
    private ListenerBotonReset listenerBotonReset;
    private EditText editText1, editText2, editText3;

    public Button getBotonConfirmar() {
        return botonConfirmar;
    }

    public Button getBotonReset() {
        return botonReset;
    }

    public ListenerBotonConfirmar getListenerBotonConfirmar() {
        return listenerBotonConfirmar;
    }

    public ListenerBotonReset getListenerBotonReset() {
        return listenerBotonReset;
    }

    public EditText getEditText1() {
        return editText1;
    }

    public EditText getEditText2() {
        return editText2;
    }

    public EditText getEditText3() {
        return editText3;
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        botonConfirmar = findViewById(R.id.botonConfirmar);
        botonReset = findViewById(R.id.botonReset);
        editText1 = findViewById(R.id.edittext1);
        editText2 = findViewById(R.id.edittext2);
        editText3 = findViewById(R.id.edittext3);


        listenerBotonConfirmar = new ListenerBotonConfirmar(this);
        listenerBotonReset = new ListenerBotonReset(this);
        botonConfirmar.setOnClickListener(listenerBotonConfirmar);
        botonReset.setOnClickListener(listenerBotonReset);





    }
}
