package TokioSchool;

import TokioSchool.domain.*;


public class Principal {
    public static void main(String []args){
        Baraja baraja = new Baraja();
        Mazo mazo = baraja.getMazo();
        System.out.println(mazo.toString());

        System.out.println("----------------------");

        mazo.setAlgoritmo(new OrdPalNumInc());
        mazo.ordenar();
        System.out.println(mazo.toString());

        System.out.println("----------------------");

        mazo.setAlgoritmo(new OrdPalNumDec());
        mazo.ordenar();
        System.out.println(mazo.toString());

        System.out.println("----------------------");

        mazo.setAlgoritmo(new OrdNumIncPal());
        mazo.ordenar();
        System.out.println(mazo.toString());


    }
}
