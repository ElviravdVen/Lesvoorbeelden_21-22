/* *****************************
 * Author: ELvira van der Ven  *
 * Date:   17/12/2021          *                                                                                          *
 *******************************/

package lesweek4;

public class Stuur {
    private Wiel wiel_linksVoor = null;
    private Wiel wiel_rechtsVoor = null;

    public void veranderStuurHoek(int aantalGraden) {
        wiel_linksVoor.veranderStuurhoek(aantalGraden);
        wiel_rechtsVoor.veranderStuurhoek(aantalGraden);
    }
}