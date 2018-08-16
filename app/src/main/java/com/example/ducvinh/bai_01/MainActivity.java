package com.example.ducvinh.bai_01;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
private EditText txta, txtb,txtkq;
private Button btntong,btnhieu,btnthuong,btntich,btnthoat;
private double a,b,kq;




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        addcontrol();
        addevent();
        
    }

    private void addevent() {
        btntong.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                a=Double.parseDouble(txta.getText().toString());
                b=Double.parseDouble(txtb.getText().toString());
                kq=a+b;
                txtkq.setText(String.valueOf(kq));
                txta.setText("");
                txtb.setText("");
                txta.requestFocus();
            }
        });
        btnhieu.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                a=Double.parseDouble(txta.getText().toString());
                b=Double.parseDouble(txtb.getText().toString());
                kq=a-b;
                txtkq.setText(String.valueOf(kq));
                txta.setText("");
                txtb.setText("");
                txta.requestFocus();
            }
        });
        btntich.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                a=Double.parseDouble(txta.getText().toString());
                b=Double.parseDouble(txtb.getText().toString());
                kq=a*b;
                txtkq.setText(String.valueOf(kq));
                txta.setText("");
                txtb.setText("");
                txta.requestFocus();
            }
        });
        btnthuong.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                a=Double.parseDouble(txta.getText().toString());
                b=Double.parseDouble(txtb.getText().toString());
                kq=a/b;
                txtkq.setText(String.valueOf(kq));
                txta.setText("");
                txtb.setText("");
                txta.requestFocus();

            }
        });   btnthoat.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
               finish();

            }
        });
    }

    private void addcontrol() {
        txta=findViewById(R.id.txta);
        txtb=findViewById(R.id.txtb);
        txtkq=findViewById(R.id.txtkq);
        btntong=findViewById(R.id.btntong);
        btnhieu=findViewById(R.id.btnhieu);
        btntich=findViewById(R.id.btntich);
        btnthuong=findViewById(R.id.btnthuong);
        btnthoat=findViewById(R.id.btnthoat);
    }
}
