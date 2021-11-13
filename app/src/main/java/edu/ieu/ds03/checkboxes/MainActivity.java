package edu.ieu.ds03.checkboxes;

import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;


public class MainActivity extends AppCompatActivity {

    private View opcionReporte, opcionZona;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        opcionReporte = findViewById(R.id.opcion_reporte);
        opcionZona = findViewById(R.id.opcion_ajuste_local);

    }

    public void actualizarCuenta(View view) {
        opcionReporte.setEnabled(true);
        opcionZona.setEnabled(true);
    }
}