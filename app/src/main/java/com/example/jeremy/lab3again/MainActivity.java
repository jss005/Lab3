package com.example.jeremy.lab3again;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button addButton = (Button) findViewById(R.id.AddButton);
        addButton.setOnClickListener(this);
    }


    public void Add(){
        EditText et1 = (EditText) findViewById(R.id.et1);
        EditText et2 = (EditText) findViewById(R.id.et2);
        TextView et_sum = (TextView) findViewById(R.id.sum);

        int result = sum(Integer.parseInt(et1.getText().toString()),
                Integer.parseInt(et2.getText().toString()));

        String resultString = ""+result;

        et_sum.setText(resultString);
    }

    public int sum(int first, int second){
        return first+second;
    }

    public void onClick(View v){
        Add();
    }


}
