/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Facade;

/**
 *
 * @author Gabriel
 */
public class ManageRGB {
    private ILed green;
    private ILed blue; 
    private ILed red;
    
    public ManageRGB(){
        green = new Green();
        blue = new Blue();
        red = new Red();
    }
    
    public void BlinkLights(){
        for(int contador = 0; contador < 10; contador++){
            // Bliking de green ligth
            green.turnLigths(1);
            green.turnLigths(0);
          
            // Bliking de blue ligth
            blue.turnLigths(1);
            blue.turnLigths(0);
            
            // Bliking de red ligth
            red.turnLigths(1);
            red.turnLigths(0);
        }
    }
}
