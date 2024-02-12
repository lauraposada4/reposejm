/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package circunferencia;

/**
 *
 * @author LAURA POSADA
 */
public class CalculosCirculo {
    
    private double radio; 
    private double atri1; 
    

    public CalculosCirculo(double radio) {
        this.radio = radio;
    }

    public CalculosCirculo() {
    }
    
    

    public double getRadio() {
        return radio;
    }

    public void setRadio(double radio) {
        this.radio = radio;
    }
    
    public void crearCircunferencia(double radio){
        this.radio=radio; 
        
    }
    
    public void calcularArea(double radio){
        
        double area; 
        
        area= 3.1416 *  Math.pow(radio, 2); 
        System.out.println("El area de la circunferencia es: "+area);
        
    }
    
    public void calcularPerimetro(double radio){
        
        double perimetro; 
        
        perimetro= 2*3.1416*radio; 
        
        System.out.println("El perimetro de la circunferencia es: "+perimetro);
        
    }
    
}
