/* *****************************
 * Author: ELvira van der Ven  *
 * Date:   17/12/2021          *                                                                                          *
 *******************************/

package lesweek4;

public class Wiel {
    private int stuurhoek = 0;
    public void veranderStuurhoek(int aantalGraden) {
        this.stuurhoek = stuurhoek;
        if(stuurhoek < 0) {
            System.out.println("Gestuurd " + stuurhoek * -1 + " naar links");
        }
        else{
            System.out.println("Gestuurd " + stuurhoek + " naar rechts");
        }
    }
}