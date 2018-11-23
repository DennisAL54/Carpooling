package com.example.bryan.carpooling;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

/**
 * Ventana de Inicio, selección de usuario si se es Conductor del automóvil
 * o un Estudiante que solicita transporte
 */
public class Inicio extends AppCompatActivity {

    Button registroEstudiante, registroConductor;

    /**
     * Método onCreate: contiene las funciones de los elementos que están dentro de la ventana
     * @param savedInstanceState
     */
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_inicio);

        // Botón que lleva al menú del Estudiante
        registroEstudiante = (Button)findViewById(R.id.btn_estudiante);
        registroEstudiante.setOnClickListener(new View.OnClickListener() {
            // Al presionar el botón lleva de la ventana de Registro al Menú del Estudiante
            @Override
            public void onClick(View v) {
                Intent registroEstudiante = new Intent(Inicio.this, Registro_Estudiante.class);
                startActivity(registroEstudiante);
            }
        });

        // Botón que lleva al menú del Conductor
        registroConductor = (Button)findViewById(R.id.btn_conductor);
        registroConductor.setOnClickListener(new View.OnClickListener() {
            // Al presionar el botón lleva de la ventana de Registro al Menú del Conductor
            @Override
            public void onClick(View v) {
                Intent registroConductor = new Intent(Inicio.this, Registro_Conductor.class);
                startActivity(registroConductor);
            }
        });
    }
}
