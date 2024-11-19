/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package examenpsp;

import java.io.IOException;

import java.net.ServerSocket;
import java.net.Socket;

/**
 *
 * @author 2dami
 */
public class Servidor {
    private static int conections;
    private ServerSocket servidor = null;
    private Socket clienteSocket = null;
    private static final int puerto = 9999;
    private Temperatura temperatura = new Temperatura();
    public static void main(String[] args) {
       
        
        try{
           Servidor servidor = new Servidor();
           servidor.iniciar_server();
       }catch(IOException error){
           System.out.println(error.getMessage());
       }catch(ClassNotFoundException error){
           System.out.println(error.getMessage());
       }
        
    }
    
    public void iniciar_server() throws IOException, ClassNotFoundException{
        System.out.println("Esperando conexion del cliente");
        servidor = new ServerSocket(puerto);
        clienteSocket = servidor.accept();
        System.out.println("Cliente conectado");
        
        while (true){
            clienteSocket = servidor.accept();
            Hilo hilo = new Hilo(servidor, clienteSocket);
            hilo.start();
            
        }
       
    }
    
    
    
    public synchronized void controConections(int i){
        if(i==1){
            
        }
        
    } 
    
}
