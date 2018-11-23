package ca.server.Communication;
import java.net.*;
import java.io.*;


public class socketR {
    ServerSocket server;
    Socket socket;
    int puerto = 9000;
    DataOutputStream salida;
    BufferedReader entrada;
    public void iniciar()
    {
        try{
            try {
                server = new ServerSocket();
            } catch (IOException e) {
                e.printStackTrace();
            }
            socket = new Socket();
            try {
                socket = server.accept();
            } catch (IOException e) {
                e.printStackTrace();
            }
            entrada = new BufferedReader(new InputStreamReader(socket.getInputStream()));
            String mensaje = entrada.readLine();
            salida = new DataOutputStream(socket.getOutputStream());
            socket.close();

        }catch(Exception e){};

    }


}
