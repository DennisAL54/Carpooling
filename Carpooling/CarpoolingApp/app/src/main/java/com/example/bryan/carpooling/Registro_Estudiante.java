package com.example.bryan.carpooling;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

/**
 * Ventana Registro_Estudiante: Verificación de la identidad del Estudiante
 */
public class Registro_Estudiante extends AppCompatActivity {

    Button menuEstudiante;

    /**
     * Método onCreate: contiene las funciones de los elementos que están dentro de la ventana
     * @param savedInstanceState
     */
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_registro_estudiante);

        // Botón que lleva a la ventana de Menu_Estudiante
        menuEstudiante = (Button)findViewById(R.id.btn_siguiente);
        menuEstudiante.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent menuEstudiante = new Intent(Registro_Estudiante.this, Menu_Estudiante.class);
                startActivity(menuEstudiante);
            }
        });
    }
}
