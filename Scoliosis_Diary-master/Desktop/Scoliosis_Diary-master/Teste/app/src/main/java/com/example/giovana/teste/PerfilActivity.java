package com.example.giovana.teste;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

import com.example.giovana.teste.R;

public class PerfilActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_perfil);
    }

    public void VoltarPerfil(View view)
    {Intent it = new Intent(PerfilActivity.this, CalendarioActivity.class);
        startActivity(it);
    }
}
