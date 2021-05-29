/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Gabriel
 */
public class Main {
    
    public static void main(String[] args) {
		
        // instancing first class
        IImpostos imposto = new ImpostoImplements();

        System.out.println("Calculador de Imposto generico \n");
        System.out.println("-----------------------------------------");
        System.out.println("Valor Original : " + imposto.Calcular());
        System.out.println("----------------------------------------- \n");

        IImpostos calculaA = new ImpostoA(imposto);

        System.out.println("-----------------------------------------");
        System.out.println("O imposto A calcula sobre o bruto");
        System.out.println("Valor : " + calculaA.Calcular());
        System.out.println("----------------------------------------- \n");

        IImpostos calculaB = new ImpostoB(calculaA);

        System.out.println("-----------------------------------------");
        System.out.println("O imposto B calcula sobre o valor original");
        System.out.println("	menos o imposto A.");
        System.out.println("Valor : " + calculaB.Calcular());
        System.out.println("----------------------------------------- \n");

        IImpostos calculaC = new ImpostoC(calculaB);

        System.out.println("-----------------------------------------");
        System.out.println("O imposto C calcula sobre o bruto.");
        System.out.println("Valor : " + calculaC.Calcular());
        System.out.println("----------------------------------------- \n");

        IImpostos calculaD = new ImpostoD(calculaB);


        System.out.println("-----------------------------------------");
        System.out.println("O imposto D calcula sobre o bruto menos o ");
        System.out.println("	imposto B, menos o imposto C.");
        System.out.println("Valor : " + (calculaD.Calcular() - calculaC.Calcular()));
        System.out.println("----------------------------------------- \n");
			
    }
    
}
