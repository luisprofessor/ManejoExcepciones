/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package manejoexcepciones;

/**
 *
 * @author usuario2
 */
public class Robot {
    private int bateria=1000;
    private boolean despierto;
    
    public int energiaActual(){
    
        return bateria;
    }
    
    public void despertar(){
    
        despierto=true;
    }
    
    public void dormir(){
    
        despierto=false;
    }
    
    public void avanzar(int pasos) throws MiExcepcion{
    
        int consumo=pasos*10/100;
        if(despierto){
        
            if(bateria>=consumo){
            
                bateria-=consumo;
            } else {
            
                throw new MiExcepcion();
            }
          
        
        }
    
    }
    
      public void retroceder(int pasos) throws MiExcepcion{
    
        int consumo=pasos*10/100;
        if(despierto){
        
            if(bateria>=consumo){
            
                bateria-=consumo;
            } else {
            
                throw new MiExcepcion();
            }
          
        
        }
    
    }
    
}
