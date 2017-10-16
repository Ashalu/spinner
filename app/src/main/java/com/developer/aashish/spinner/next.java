package com.developer.aashish.spinner;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

/**
 * Created by Aashish on 10/6/2017.
 */

public class next extends MainActivity {
    Button save;
    EditText name;
    TextView textView;

    @Override
    public void onCreate(Bundle savedInstanceState) {

        /**
         * derived classes that use onCreate() overrides must always call the
         * super constructor
         */
        super.onCreate(savedInstanceState);

        setContentView(R.layout.next);
save=(Button)findViewById(R.id.save);
        name=(EditText)findViewById(R.id.name);
        textView=(TextView)findViewById(R.id.textview);
        save.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String ab=name.getText().toString();
                textView.setText(ab);
            }
        });
    }
}
