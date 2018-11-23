package com.example.bryan.carpooling;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

/**
 * Ventana Amigos_Estudiante: tiene la lista de amigos del Estudiante
 */
public class Amigos_Estudiante extends AppCompatActivity {
    Button menu, anadirAmigo;

    /**
     * Método onCreate: contiene las funciones de los elementos que están dentro de la ventana
     * @param savedInstanceState
     */
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_amigos_estudiante);

        // Botón que lleva al menú del Estudiante
        menu = (Button)findViewById(R.id.btn_menu);
        menu.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent menu = new Intent(Amigos_Estudiante.this, Menu_Estudiante.class);
                startActivity(menu);
            }
        });

        // Botón que lleva al la ventana de Escaner para agregar un amigo
        anadirAmigo = (Button)findViewById(R.id.btn_anadir_amigo);
        anadirAmigo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent anadirAmigo = new Intent(Amigos_Estudiante.this, Registro_Estudiante.class);
                startActivity(anadirAmigo);
            }
        });
    }
}
