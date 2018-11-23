package Usuarios

import java.net.*;
import java.io.*;
public class SocketC{
    
    Socket cliente;
    int puerto = 9000;
    String ip = "200.105.99.27";
    public void inicio(){
        try{
            cliente = new Socket(ip, puerto);
            entrada = new BufferedReader(new InputStreamReader(cliente.getInputStream()));
            teclado = new BufferedReader(new InputStreamReader(sistem.in));
            String tec = teclado.readLine();
            salida = new PrintStream(cliente.getOutputStream());
            salida.println(tec);
            String msg = entrada.readLine();
            System.out.println(mag);
            entrada.close();
            salida.close();
            teclado.close();
            cliente.close();
            
        }catch(Exception e){}        
    }
}
