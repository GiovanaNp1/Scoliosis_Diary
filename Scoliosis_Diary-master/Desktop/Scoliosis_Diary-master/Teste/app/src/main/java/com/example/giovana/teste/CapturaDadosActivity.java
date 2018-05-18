package com.example.giovana.teste;
import java.util.Date;

import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.support.design.widget.Snackbar;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class CapturaDadosActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_captura_dados);
    }
    public void IrDiario(View view){
        Intent it = new Intent(CapturaDadosActivity.this, DiarioActivity.class);
        startActivity(it);
    }
}
