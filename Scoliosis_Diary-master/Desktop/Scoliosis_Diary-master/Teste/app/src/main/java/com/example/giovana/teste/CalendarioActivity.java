package com.example.giovana.teste;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.Snackbar;
import android.view.View;
import android.widget.Button;
import android.widget.CalendarView;
import android.widget.CalendarView.OnDateChangeListener;

public class CalendarioActivity extends Activity {

    /*public int[] Mensagens_atualização = {
            R.string.Mensgam_atualização,
    };*/

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_calendario);

        final CalendarView calendarView = (CalendarView) findViewById(R.id.calendarView1);

        // quando selecionado alguma data diferente da padrão
        calendarView.setOnDateChangeListener(new OnDateChangeListener() {

            @Override
            public void onSelectedDayChange(CalendarView view, int year,
                                            int month, int dayOfMonth) {
                Intent intent = new Intent(CalendarioActivity.this,
                        CapturaDadosActivity.class);
                intent.putExtra("dataLongMiliseconds",
                        (Long) calendarView.getDate());
                startActivity(intent);
            }
        });
    }

    public void IR_PERFIL(View view) {
        Intent it = new Intent(CalendarioActivity.this, PerfilActivity.class);
        startActivity(it);
    }
}

     /*public class MyUndoListener implements View.OnClickListener {

        @Override
        public void onClick(View v) {
            Snackbar mySnackbar = Snackbar.make(findViewById(R.id.btnperfil),
                    R.string.Mensgam_atualização, Snackbar.LENGTH_SHORT);
            mySnackbar.setAction(R.string.Mensgam_atualização, new MyUndoListener());
            mySnackbar.show();
        }*/

