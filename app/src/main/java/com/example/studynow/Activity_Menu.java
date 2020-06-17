package com.example.studynow;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Activity_Menu extends AppCompatActivity {
    private Button btn_toan,btn_ly,btn_hoa,btn_van,btn_anh;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity__menu);
        btn_toan=(Button) findViewById(R.id.btn_toan);
        btn_ly=(Button) findViewById(R.id.btn_ly);
        btn_hoa=(Button) findViewById(R.id.btn_hoa);
        btn_van=(Button) findViewById(R.id.btn_van);
        btn_anh=(Button) findViewById(R.id.btn_anh);
        btn_toan.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(Activity_Menu.this,Activity_Menu_Toan.class);
                startActivity(intent);
            }
        });
        btn_ly.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(Activity_Menu.this,Activity_Menu_Vatly.class);
                startActivity(intent);
            }
        });
        btn_hoa.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(Activity_Menu.this,Activity_Menu_Hoa.class);
                startActivity(intent);
            }
        });
        btn_van.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(Activity_Menu.this,Activity_Menu_Vanhoc.class);
                startActivity(intent);
            }
        });
        btn_anh.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(Activity_Menu.this,Activity_Menu_AnhVan.class);
                startActivity(intent);
            }
        });
    }
}
