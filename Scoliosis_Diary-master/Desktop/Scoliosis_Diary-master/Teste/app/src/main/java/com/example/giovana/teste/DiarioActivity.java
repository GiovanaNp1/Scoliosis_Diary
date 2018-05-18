package com.example.giovana.teste;

import android.content.Context;
import android.content.Intent;
import android.support.constraint.ConstraintLayout;
import android.support.design.widget.FloatingActionButton;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;


public class DiarioActivity extends AppCompatActivity {
    private EditText txtDiario;
    private FloatingActionButton btnEnviar ;
    private TextView TextoDoDiario;
    private String TXTDIARIO, ESCREVER;



        @Override
        protected void onCreate(Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);
            setContentView(R.layout.activity_diario);
            txtDiario = (EditText) findViewById(R.id.Diario_Dia);
            TextoDoDiario = (TextView) findViewById(R.id.Texto_Diario);
            btnEnviar = (FloatingActionButton) findViewById(R.id.Enviar_Diario);
            TextoDoDiario = (TextView) findViewById(R.id.Texto_Diario);
            btnEnviar.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    TXTDIARIO = txtDiario.getText().toString();
                TextoDoDiario.setText(txtDiario.getText());
                if (TXTDIARIO.contentEquals("")){
                    TXTDIARIO = "UNTAILED";
                }
                 ESCREVER =  txtDiario.getText().toString();

                    try {
                        FileOutputStream fos = openFileOutput(TXTDIARIO, Context.MODE_PRIVATE);
                        fos.write(ESCREVER.getBytes());
                        fos.close();
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                }

            });
        }
}

/*
public class Exemplo { public static void main(String[] args) { System.out.println("Digite a palavra desejada: "); Scanner scanner = new Scanner(System.in); String palavra = scanner.nextLine(); System.out.println("Você digitou: " + palavra); }
 */