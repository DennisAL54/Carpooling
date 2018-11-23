package com.example.bryan.carpooling;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

/**
 * Ventana Registro_Conductor: Verificación de la identidad del Conductor
 */
public class Registro_Conductor extends AppCompatActivity {

    Button siguiente;

    /**
     * Método onCreate: contiene las funciones de los elementos que están dentro de la ventana
     * @param savedInstanceState
     */
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_registro_conductor);

        // Botón que lleva a la ventana de Menu_Conductor
        siguiente = (Button)findViewById(R.id.btn_siguiente);
        siguiente.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent siguiente = new Intent(Registro_Conductor.this, Menu_Conductor.class);
                startActivity(siguiente);
            }
        });
    }
}
