package com.example.unitconvert;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private Button button;
    private TextView textview;
    private EditText editText;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        button=findViewById(R.id.button);
        textview = findViewById(R.id.textView2);
        editText=findViewById(R.id.editText);
////        View image = findViewById(R.id.imageView1);
//          button.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
////                Toast.makeText(MainActivity.this, "processing", Toast.LENGTH_SHORT).show();
//               String s= editText.getText().toString();
//               int kg=Integer.parseInt(s);
//               double pound =kg*2.405;
//                textview.setText("The corresponding value of pound "+pound);
//
//
//            }
//        });


    }
    public void calculate (View view ){
        String s= editText.getText().toString();
        int kg=Integer.parseInt(s);
        double pound =kg*2.405;
        String s1=String.valueOf(pound);
        textview.setText("The corresponding value of pound  "+String.format("%.2f",pound));
        Toast.makeText(this, "Thanks for this app", Toast.LENGTH_SHORT).show();

    }