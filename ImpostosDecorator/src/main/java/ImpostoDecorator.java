/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Gabriel
 */
public class ImpostoDecorator  implements IImpostos {
    
    private IImpostos imposto;
    
    public ImpostoDecorator(IImpostos imposto){
        this.imposto = imposto;
    }
    
    @Override
    public double Calcular() {
        return imposto.Calcular();
    }

    @Override
    public double Original() {
        return imposto.Original();
    }

    @Override
    public double Imposto() {
        return imposto.Imposto();
    }
    
}
