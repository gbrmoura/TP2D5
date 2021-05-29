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
public class Red implements ILed {

    @Override
    public String getColor() {
        return "#ff1500";
    }

    @Override
    public void turnLigths(int type) {
        if(type == 1) {
            System.out.println("Turning on the lights with the color " + getColor());
            System.out.println("...\n");
        } else {
            System.out.println("Turning off the lights with the color " + getColor());
            System.out.println("...\n");
        }
    }
    
}
