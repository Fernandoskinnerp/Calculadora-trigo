/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package micalculadora;

/**
 *
 * @author Estudiantes
 */
public class Calculadora {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    }
    
    protected float x;
    private float y;
    private float r;

    void sumar() {
        r = x + y;
    }

    void restar() {
         r = x - y;
       
        }  
    public void setX(double operando1) {
        this.x = (float) operando1;
        
                
    }
    public double getX(){
            return x;
}
    
    
 public void setY(double operando2) {
        this.y = (float) operando2;
 }   
              
       public double getY(){
            return y;
}
    
    
    public void setR() {
      
        this r=r;
    }
          
    public double getR(){
            
           
            return r;
    }
}