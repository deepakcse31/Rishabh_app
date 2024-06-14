package com.example.rishabh_app;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {
    EditText edtinputone,edtinputtwo,edtname;
    TextView tvresult;
    Button btncalculate,btnnext;
    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
        btnnext=findViewById(R.id.btnnext);
        edtname=findViewById(R.id.edtname);
        btnnext.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String name=edtname.getText().toString();
                Intent intent=new Intent(MainActivity.this,LoginActivity.class);
                intent.putExtra("name",name);
                startActivity(intent);

            }
        });
        Log.d("LifeCycle","onCreate");


//        edtinputone=findViewById(R.id.inputone);
//        edtinputtwo=findViewById(R.id.inputtwo);
//        tvresult=findViewById(R.id.tvresult);
//        btncalculate=findViewById(R.id.btnadd);
//        SharedPreferences sh = getSharedPreferences("MySharedPref", MODE_PRIVATE);
//        String s1 = sh.getString("name", "");
//        Log.e("Data--->","Data--->"+s1);
//        btncalculate.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                String one=edtinputone.getText().toString();
//                String two=edtinputtwo.getText().toString();
//                if (Integer.parseInt(one)>Integer.parseInt(two))
//                {
//                    int result=Integer.parseInt(one)-Integer.parseInt(two);
//                    tvresult.setText(String.valueOf(result));
//
//                    SharedPreferences sharedPreferences = getSharedPreferences("MySharedPref", MODE_PRIVATE);
//                    SharedPreferences.Editor myEdit = sharedPreferences.edit();
//
//                    // write all the data entered by the user in SharedPreference and apply
//                    myEdit.putString("name","Deepak");
//                    myEdit.apply();
//
//                }else {
//                    Toast.makeText(getApplicationContext(),"Invalid Input",Toast.LENGTH_LONG).show();
//                }
//            }
//        });

        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.d("LifeCycle","onStart");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.d("LifeCycle","onResume");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.d("LifeCycle","onPause");

    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.d("LifeCycle","onStop");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.d("LifeCycle","onDestroy");
    }
}