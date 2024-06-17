package com.example.rishabh_app;

import android.annotation.SuppressLint;
import android.app.ProgressDialog;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ProgressBar;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class HomeActivity extends AppCompatActivity {
    ProgressBar progressBar;
    Button btnloader;
    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_home);
        btnloader = findViewById(R.id.btnloader);
        progressBar = findViewById(R.id.progressBar_cyclic);
        btnloader.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                thread.start();

            }
        });
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
    }

    Thread thread = new Thread(new Runnable() {
        @Override
        public void run() {
            // Code that runs on the background thread
            // For example, perform network operations or heavy computations

            // Update UI on the main thread using runOnUiThread or Handler
            runOnUiThread(new Runnable() {
                @Override
                public void run() {
                    progressBar.setVisibility(View.VISIBLE);
                    // Update UI components
                }
            });
        }
    });
 // Start the thread

}