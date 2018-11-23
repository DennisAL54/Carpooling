package com.example.bryan.carpooling;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.View;
import android.widget.Button;

/**
 * Ventana Iniciar_Viaje_Conductor: Opciones de viaje del Conductor
 */
public class Iniciar_Viaje_Conductor extends AppCompatActivity {

    Button menu, sin_desvios, de_amigos;

    /**
     * Método onCreate: contiene las funciones de los elementos que están dentro de la ventana
     * @param savedInstanceState
     */
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_iniciar_viaje_conductor);

        // Botón que lleva al menú del Conductor
        menu = (Button)findViewById(R.id.btn_menu);
        menu.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent menu = new Intent(Iniciar_Viaje_Conductor.this, Menu_Conductor.class);
                startActivity(menu);
            }
        });

        // Botón que lleva al mapa del Conductor en modo sin desvios
        sin_desvios = (Button)findViewById(R.id.btn_sin_desvios);
        sin_desvios.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent sin_desvios = new Intent(Iniciar_Viaje_Conductor.this, Maps_Conductor.class);
                startActivity(sin_desvios);
            }
        });

        // Botón que lleva al mapa del Conductor en modo amigos
        de_amigos = (Button)findViewById(R.id.btn_de_amigos);
        de_amigos.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent de_amigos = new Intent(Iniciar_Viaje_Conductor.this, Maps_Conductor.class);
                startActivity(de_amigos);
            }
        });
    }
}
