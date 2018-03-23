package com.example.zp17_2.calculator;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


    }
    int int_value =0;
    public void button_number(View view) {
        Button button = (Button) findViewById(view.getId()) ;
        String button_value = button.getText().toString();
    int result_int = R.string.value;
            String result = toString().
    if(R.string.value==0)
    {
        result = button_value;

    }
    else {result = R.string.value + button_value;
    }

}
    }

