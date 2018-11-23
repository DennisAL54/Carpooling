package com.example.bryan.carpooling;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

/**
 * Ventana Menu_Estudiante: Contiene las opciones del estudiante
 */
public class Menu_Estudiante extends AppCompatActivity {

    Button solicitarServicio, gMapa, lamigos;

    /**
     * Método onCreate: contiene las funciones de los elementos que están dentro de la ventana
     * @param savedInstanceState
     */
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu_estudiante);

        // Botón que lleva a la ventana de Solicitar_Servicio_Estidiante
        solicitarServicio = (Button)findViewById(R.id.btn_solicitar_servicio);
        solicitarServicio.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent solicitarServicio = new Intent(Menu_Estudiante.this, Solicitar_Servicio_Estidiante.class);
                startActivity(solicitarServicio);
            }
        });

        // Botón que lleva a la ventana de Maps_Estudiante
        gMapa = (Button)findViewById(R.id.btn_mapa);
        gMapa.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent gMapa = new Intent(Menu_Estudiante.this, Maps_Estudiante.class);
                startActivity(gMapa);
            }
        });

        // Botón que lleva a la ventana de Amigos_Estudiante
        lamigos = (Button)findViewById(R.id.btn_amigos);
        lamigos.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent lamigos = new Intent(Menu_Estudiante.this, Amigos_Estudiante.class);
                startActivity(lamigos);
            }
        });
    }
}
