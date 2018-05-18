package com.example.giovana.teste;

        import android.content.Intent;
        import android.support.v7.app.AppCompatActivity;
        import android.os.Bundle;
        import android.view.View;

public class CadastroActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cadastro);
    }

    public void Criar_Conta(View view) {
        Intent it = new Intent(CadastroActivity.this, MainActivity.class);
        startActivity(it);

    }
}
