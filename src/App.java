/* *****************************
 * Author: ELvira van der Ven  *
 * Date:   10/12/2021          *                                                                                          *
 *******************************/

import java.util.Arrays;

public class App {

    public static void main(String[] args) {
        Student ard = new Student("Ard", 5);
        Student marijn = new Student("Marijn", 17);

        ard.setNext(marijn);
        marijn.setNext(ard);

        ard.print();
        System.out.println(marijn.toString());

        ard.setLeeftijd(23);

        ard.print();


        ard.print();
        marijn.print();
    }
}