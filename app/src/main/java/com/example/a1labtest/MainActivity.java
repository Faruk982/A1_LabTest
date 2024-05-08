package com.example.a1labtest;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {
    public EditText edit1,edit2;
    public Button btn;
    public TextView textView;
    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
        edit1=findViewById(R.id.InputShape);
        edit2=findViewById(R.id.InputColor);
        btn=findViewById(R.id.btn);
        textView=findViewById(R.id.ShowShape);
        btn.setOnClickListener(v->{
            String s=edit1.getText().toString();
            String se=edit2.getText().toString();
            String fshape="Invalid Shape";
            String fcolor="Invalid Color";
            String ff;
            if(s.equals("Square")){
                Square square=new Square();
                fshape=square.name+" "+square.area(4)+" "+square.perimeter(4);
            }
            else if(s.equals("Triangle")){
                Triangle triangle=new Triangle();
                fshape=triangle.name+" "+triangle.area(4,4)+" "+triangle.perimeter(4);
            }
            else if(s.equals("Circle")){
                Circle circle=new Circle();
                fshape=circle.name+" "+circle.area(4)+" "+circle.preimeter(4.0F);
            }
            if(se.equals("Blue")){
                Blue blue=new Blue();
                fcolor = blue.Showcolor();
            }
            else if(se.equals("Green")){
                Green green=new Green();
                fcolor = green.Showcolor();
            }
            else if(se.equals("Red")){
                Red red=new Red();
                fcolor =red.Showcolor();
            }
            ff=fcolor+" "+fshape;
            textView.setText(ff);
        });
    }
}