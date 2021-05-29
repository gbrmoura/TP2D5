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
public interface ILed {
    
    /**
     * 
     * @return 
     */
    
    public String getColor();
    
    /**
     * @param type 
     * 1 - turn On
     * 0 - turn Off
     */
    public void turnLigths(int type);
    
}
