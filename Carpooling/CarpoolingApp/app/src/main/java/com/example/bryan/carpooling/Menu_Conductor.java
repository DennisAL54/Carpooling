package com.example.bryan.carpooling;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

/**
 * Ventana Menu_Conductor: Contiene las opciones del conductor
 */
public class Menu_Conductor extends AppCompatActivity {

    Button iniciarViaje, amigos;

    /**
     * Método onCreate: contiene las funciones de los elementos que están dentro de la ventana
     * @param savedInstanceState
     */
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu_conductor);

        // Botón que lleva a la ventana de Iniciar_Viaje
        iniciarViaje = (Button)findViewById(R.id.btn_iniciar_viaje);
        iniciarViaje.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent iniciarViaje = new Intent(Menu_Conductor.this, Iniciar_Viaje_Conductor.class);
                startActivity(iniciarViaje);
            }
        });

        // Botón que lleva a la ventana de Amigos_Conductor
        amigos = (Button)findViewById(R.id.btn_amigos);
        amigos.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent amigos = new Intent(Menu_Conductor.this, Amigos_Conductor.class);
                startActivity(amigos);
            }
        });


    }
}
