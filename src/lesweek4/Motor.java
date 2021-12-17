/* *****************************
 * Author: ELvira van der Ven  *
 * Date:   17/12/2021          *                                                                                          *
 *******************************/

package lesweek4;

public class Motor {
    private int huidigVermogen;
    public void starten() {
        System.out.println("Motor wordt gestart");
        System.out.println(".....");
        System.out.println("Brum brum brum");
    }

    /**
     * @param vermogen
     * @return snelheid die bij het vermogen hoort
     * 80 PK = 130 km/h
     * Voor het gemak: 130/80 = 1.625 =>
     * per pk komt er 1.6 km/h bij
     */
    public double leverVermogen(int vermogen) {
        this.huidigVermogen = vermogen;
        return vermogen * 1.625;
    }

    public double minderVermogen() {
        return this.leverVermogen(this.huidigVermogen -1);

    }
}