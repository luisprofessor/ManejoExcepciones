/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package manejoexcepciones;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author usuario2
 */
public class ManejoExcepciones {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Robot tim=new Robot();
        tim.despertar();
        
        try {
            tim.avanzar(150000);
        } catch (MiExcepcion ex) {
            System.out.println(ex.getMessage());
        }
        
    }
    
}
