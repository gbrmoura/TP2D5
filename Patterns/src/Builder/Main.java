/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Builder;

/**
 *
 * @author Gabriel
 */
public class Main {
    public static void main(String[] args) {

        Builder example = Builder.Build()
            .setPropertyOne("Not Found")
            .setPropertyTwo(404);

        System.out.println("object --- ");
        System.out.println(" Property One - " + example.getPropertyOne());
        System.out.println(" Property Two - " + example.getPropertyTwo());

        // The constructor method is private
        // "new Builder();" can't exist because
        // we use the design pattern build to
        // encapsulate the logic of the construction
    }
}
