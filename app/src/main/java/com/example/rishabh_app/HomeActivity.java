package com.example.rishabh_app;

import android.annotation.SuppressLint;
import android.app.Dialog;
import android.app.ProgressDialog;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ProgressBar;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;
import androidx.swiperefreshlayout.widget.SwipeRefreshLayout;

import com.facebook.shimmer.ShimmerFrameLayout;

public class HomeActivity extends AppCompatActivity {
    ProgressBar progressBar;
    Button btnloader,btnpopup;
    SwipeRefreshLayout swipeRefreshLayout;
    TextView tvswipe;
    ShimmerFrameLayout shimmerFrameLayout;
    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_home);
        btnpopup=findViewById(R.id.btnpopup);
        Dialog dialog = new Dialog(HomeActivity.this);

        btnpopup.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(HomeActivity.this,RecyclerListComponent.class);
                startActivity(intent);

  //              CustomBottomSheet bottomSheetFragment = new CustomBottomSheet();
//                bottomSheetFragment.show(getSupportFragmentManager(), bottomSheetFragment.getTag());


//                dialog.setContentView(R.layout.custom_pop_up);
//                dialog.getWindow().setLayout(ViewGroup.LayoutParams.MATCH_PARENT, ViewGroup.LayoutParams.WRAP_CONTENT);
//                dialog.setCancelable(true);
//                dialog.show();

            }
        });


//        shimmerFrameLayout=findViewById(R.id.shimmer_view_container);
//        shimmerFrameLayout.startShimmer();
//        shimmerFrameLayout.stopShimmer();


//        swipeRefreshLayout=findViewById(R.id.swipe_refresh_layout);
//        tvswipe=findViewById(R.id.tvswipeto);
//        swipeRefreshLayout.setOnRefreshListener(new SwipeRefreshLayout.OnRefreshListener() {
//            @Override
//            public void onRefresh() {
//                tvswipe.setText("Refreshed data loaded");
//                swipeRefreshLayout.setRefreshing(false);
//            }
//        });

//        btnloader = findViewById(R.id.btnloader);
//        progressBar = findViewById(R.id.progressBar_cyclic);
//        btnloader.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//
//            }
//        });
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
    }


 // Start the thread

}