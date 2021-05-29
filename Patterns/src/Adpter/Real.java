/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Adpter;

/**
 *
 * @author Gabriel
 */
public class Real implements IMoney {
    private double value;

    @Override
    public double getValue() {
        return value;
    }

    @Override
    public IMoney setValue(double value) {
        this.value = value;
        return this;
    }
}
