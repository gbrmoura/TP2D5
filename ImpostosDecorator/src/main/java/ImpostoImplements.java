/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Gabriel
 */
public class ImpostoImplements implements IImpostos {
    public double valor = 4000.00;
	
    @Override
    public double Calcular() {
    	return valor;
    }
	
    @Override
    public double Imposto() {
	return 0.0;
    }
	
    @Override
    public double Original() {
        return valor;
    }
}
