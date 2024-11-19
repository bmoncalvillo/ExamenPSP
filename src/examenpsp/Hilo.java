/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package examenpsp;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.ServerSocket;
import java.net.Socket;

/**
 *
 * @author 2dami
 */
public class Hilo extends Thread {

    private ServerSocket servidor = null;
    private Socket clienteSocket = null;

    public Hilo(ServerSocket servidor, Socket clienteSocket) {
        this.servidor = servidor;
        this.clienteSocket = clienteSocket;
    }

    @Override
    public void run() {

        try {
            ObjectOutputStream enviar = new ObjectOutputStream(clienteSocket.getOutputStream());
            ObjectInputStream recivir = new ObjectInputStream(clienteSocket.getInputStream());

            //Recivir 1
            String men = (String) recivir.readObject();

            System.out.println(men);

        }catch(IOException error){
            System.out.println(error.toString());
        }catch(ClassNotFoundException error){
            System.out.println(error.toString());
        }

        /*temperatura= (Temperatura) recivir.readObject();
        System.out.println(temperatura.getValor());*/
        //temperatura.setValor(calcular_F(temperatura.getValor()));
    }
    
    public int calcular_F(int celsisus) {
        int farenheit  = 0;
        
        
        farenheit = (9/5*celsisus)+32;
        
        System.out.println("La temperatura en farenheit es: "+farenheit);
        
        
        return farenheit;
        
    }
}
