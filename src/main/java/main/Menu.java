/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package main;

import javax.swing.JOptionPane;

/**
 *
 * @author kathe
 */
public class Menu {
    private int opcion;
    
    public void menuPrincipal(){
        do{
            opcion = Integer.parseInt(JOptionPane.showInputDialog("""
                                                              --- Ingrese una opcion: ---
                                                              1. Capitulo 1
                                                              2. Capitulo 2
                                                              3. Capitulo 3
                                                              4. Ejercicios y ejemplos
                                                              5. Salir
                                                              ---------------------------
                                                              """));
            
            switch(opcion){
                case 1:
                    break;
                case 2:
                    break;
                case 3:
                    break;
                case 4:
                    break;
                case 5:
                    break;
                default:
                    JOptionPane.showMessageDialog(null, "Opcion incorrecta");
                    break;
            }// fin de switch
        } while (opcion!= 5);
    }// fin del metodo menuPrincipal
}//fin de la clase menu
