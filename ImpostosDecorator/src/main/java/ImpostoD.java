/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Gabriel
 */
public class ImpostoD extends ImpostoDecorator {
    public ImpostoD(IImpostos imposto) {
        super(imposto);
    }

    @Override
    public double Original() {
        return super.Original();
    }

    @Override
    public double Imposto() {
        return 0.50;
    }

    @Override
    public double Calcular() {
        return super.Calcular() - (super.Calcular() * super.Imposto());
    }    
}
