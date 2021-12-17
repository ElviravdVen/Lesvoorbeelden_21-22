/* *****************************
 * Author: ELvira van der Ven  *
 * Date:   10/12/2021          *                                                                                          *
 *******************************/

import lesweek4.Auto;
import lesweek4.Motor;
import lesweek4.Stuur;

import java.util.Arrays;

public class App {

    public static void main(String[] args) {

        /**
         * Week 4
         */
//        Auto pausmobiel = new Auto();
//        pausmobiel.starten();
//        pausmobiel.rijdenVooruit(80);
//        pausmobiel.remmen(50);
//        pausmobiel.keren();


        /**
         * Week 3
         */
        Student ard = new Student("Ard", 5);
        Student marijn = new Student("Marijn", 17);

        ard.setNext(marijn);


        ard.print();
        System.out.println(marijn.toString());

        ard.setLeeftijd(23);

        ard.print();


        ard.print();
        marijn.print();
    }
}