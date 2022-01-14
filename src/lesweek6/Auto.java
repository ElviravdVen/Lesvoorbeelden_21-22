/* *****************************
 * Author: ELvira van der Ven  *
 * Date:   14/01/2022          *                                                                                          *
 *******************************/

package lesweek6;

public class Auto {
    private Auto next;
    private  int framenummer;


    public Auto(int framenummer) {
        this.framenummer = framenummer;
        this.next = null;
    }

    public Auto getNext() {
        return next;
    }

    public void setNext(Auto next) {
        this.next = next;
    }
}