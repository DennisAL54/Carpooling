package com.example.bryan.carpooling;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

/**
 * Ventana Solicitar_Servicio_Estidiante
 */
public class Solicitar_Servicio_Estidiante extends AppCompatActivity {

    Button menu;

    /**
     * Método onCreate: contiene las funciones de los elementos que están dentro de la ventana
     * @param savedInstanceState
     */
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_solicitar_servicio_estidiante);

        // Botón que lleva a la ventana de Menu_Estudiante
        menu = (Button)findViewById(R.id.btn_SS_menu);
        menu.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent menu = new Intent(Solicitar_Servicio_Estidiante.this, Menu_Estudiante.class);
                startActivity(menu);
            }
        });
    }
}
