package com.example.giovana.teste;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import java.util.jar.Attributes;

public class LoginActivity extends AppCompatActivity {

    private EditText Username;
    private EditText Password;
    private TextView Info;
    private Button login;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        Username = (EditText)findViewById(R.id.etUsername);
        Password = (EditText)findViewById(R.id.etPassword);
        Info = (TextView)findViewById(R.id.tvInfo);
        login = (Button)findViewById(R.id.btnLogin);

        Info.setText("");

        login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                validar(Username.getText().toString(), Password.getText().toString());
            }
        });

    }

    private void validar(String nome, String senha) {
        if ((nome.equals("milho")) && (senha.equals("123"))) {
            Intent intent = new Intent(LoginActivity.this, CalendarioActivity.class);
            startActivity(intent);
        }
        if ((nome.equals("giovana")) && (senha.equals("escoliose"))) {
            Intent intent = new Intent(LoginActivity.this, CalendarioActivity.class);
            startActivity(intent);
        }
        else {
            Info.setText("*username or password is invalid");
        }
    }
}

//public void IrCalendario(View view){
//   Intent it = new Intent(LoginActivity.this, MainActivity.class);
//   startActivity(it);
//  }