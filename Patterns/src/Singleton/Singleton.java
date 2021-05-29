/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Singleton;

/**
 *
 * @author Gabriel
 */
public class Singleton {
    private static Singleton instance;
	
    private Singleton () {
        // empty creator
    }

    public static Singleton getInstance() {
        if (instance == null) {
            instance = new Singleton();
        }
        return instance;
    }

    public void destroyInstance() {
        instance = null;
    }
}
