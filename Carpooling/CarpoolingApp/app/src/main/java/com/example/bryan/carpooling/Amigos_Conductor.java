package com.example.bryan.carpooling;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

/**
 * Ventana Amigos_Conductor: tiene la lista de amigos del Conductor
 */
public class Amigos_Conductor extends AppCompatActivity {

    Button menu, anadirAmigo;

    /**
     * Método onCreate: contiene las funciones de los elementos que están dentro de la ventana
     * @param savedInstanceState
     */
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_amigos_conductor);

        // Botón que lleva al menú del Conductor
        menu = (Button)findViewById(R.id.btn_menu);
        menu.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent menu = new Intent(Amigos_Conductor.this, Menu_Conductor.class);
                startActivity(menu);
            }
        });

        // Botón que lleva al la ventana de Escaner para agregar un amigo
        anadirAmigo = (Button)findViewById(R.id.btn_menu);
        anadirAmigo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent anadirAmigo = new Intent(Amigos_Conductor.this, Menu_Conductor.class);
                startActivity(anadirAmigo);
            }
        });
    }
}
