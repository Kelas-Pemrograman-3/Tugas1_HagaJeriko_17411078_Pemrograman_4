package com.haga.latihankocu;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    EditText npm;
    EditText nama;
    EditText prodi;
    EditText alamat;
    Button btn;
    TextView tampilkan;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        npm =(EditText) findViewById(R.id.npm);
        nama =(EditText) findViewById(R.id.nama);
        prodi = (EditText) findViewById(R.id.prodi);
        alamat = (EditText) findViewById(R.id.alamat);
        btn = (Button) findViewById(R.id.btn);
        tampilkan = (TextView) findViewById(R.id.tampilkan);

        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            String strnpm = npm.getText().toString();
            String strnama = nama.getText().toString();
            String stralamat = alamat.g etText().toString();
            String strprodi = prodi.getText().toString();

            tampilkan.setText(strnpm +"\n"+ strnama +"\n"+ stralamat +"\n"+ strprodi);
            }
        });
    }
}
