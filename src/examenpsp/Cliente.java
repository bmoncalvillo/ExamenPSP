/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package examenpsp;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.Socket;
import java.util.ResourceBundle;
import java.util.Scanner;


/**
 *
 * @author 2dami
 */
public class Cliente {

    private Socket cliente = null;
    //ResourceBundle bundle = new ResourceBundle("C:/Users/2dami/Documents/NetBeansProjects/reto1---grupo4/ExamenPSP/src/examenpsp/properties/conexion.properties");
    private static final int puerto = 9999; //cambiar por el properties
    private static final String ip = "127.0.0.1"; 
    
    public static void main(String[] args) {
        Cliente cliente = new Cliente();
        
        try{
            cliente.iniciar_temp();
        }catch(IOException error){
           System.out.println(error.getMessage());
        }
        
        
    }
    
    public  void iniciar_temp() throws IOException{
        
        
        cliente = new Socket(ip,puerto);
        
        
        ObjectOutputStream enviar = new ObjectOutputStream(cliente.getOutputStream());
        ObjectInputStream recivir = new ObjectInputStream(cliente.getInputStream());
        
        
        Temperatura temperatura = new Temperatura();
        
                
        System.out.println("Introduaca la temperatura en Celsius");
        
        enviar.writeObject("prueba");
        
        /*temperatura.setValor(86);
        
        enviar.writeObject(temperatura);*/
        
        
    }
    
}
