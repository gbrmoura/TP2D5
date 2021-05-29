/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Gabriel
 */
public class ImpostoB extends ImpostoDecorator {
    public ImpostoB(IImpostos imposto) {
        super(imposto);
    }

    public double Original() {
        return super.Original();
    }

    public double Imposto() {
        return 0.10;
    }

    public double Calcular() {
        return super.Original() - super.Calcular();
    } 
}
