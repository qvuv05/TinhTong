package com.example.vuqv.tinhtong;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    EditText edtSo1, edtSo2;
    Button btnTong;
    TextView txtvKQ;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        edtSo1 = (EditText) findViewById(R.id.editTextSo1);
        edtSo2 = (EditText) findViewById(R.id.editTextSo2);
        btnTong = (Button) findViewById(R.id.buttonTong);
        txtvKQ = (TextView) findViewById(R.id.textViewKQ);

        btnTong.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String chuoiSo1 = edtSo1.getText().toString();
                String chuoiSo2 = edtSo2.getText().toString();
                int res = Integer.parseInt(chuoiSo1)+ Integer.parseInt(chuoiSo2);

                txtvKQ.setText(String.valueOf(res));
            }
        });
    }
}
