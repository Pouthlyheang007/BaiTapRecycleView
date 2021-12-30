package com.example.baitaprecyclerview;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TableLayout;
import android.widget.TextView;

public class DetailActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);

        Bundle bundle = getIntent().getExtras();
        if (bundle == null){
            return;
        }

        User user = (User) bundle.get("object_user");

        ImageView imgUser = findViewById(R.id.image_1);
        TextView tvNameUser = findViewById(R.id.name_1);
        TextView tvEmailUser = findViewById(R.id.email_1);
        TextView tvAddressUser = findViewById(R.id.address_1);
        TextView tvPhoneUser = findViewById(R.id.phone_1);
        TextView tvCompanyUser = findViewById(R.id.company_1);

        imgUser.setImageResource(user.getResourceId());
        tvNameUser.setText(user.getName());
        tvEmailUser.setText(user.getEmail());
        tvAddressUser.setText(user.getAddress());
        tvPhoneUser.setText(user.getPhone());
        tvCompanyUser.setText(user.getCompany());
    }
}