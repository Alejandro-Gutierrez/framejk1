/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package distancia_punto;

/**
 *
 * @Luis Alejandro Gutierrez Pimienta
 */
public class Distancia_punto {
   public Distancia_punto(){
    
        
    }
    
    public String Resultado(double x1, double x2, double y1, double y2){
       
        double resultado;
        String resultado1="";
        
        double Dx, Dy, D;
        
        Dx=Math.pow((x2-x1),2);
        Dy=Math.pow((y2-y1),2);
        
        D=Math.sqrt((Dx+Dy));
        
        
        resultado1="La distancia el punto A y el punto B es igual " + Double.toString(D)+ " U";
        
        
        return resultado1;
    }
 
}
