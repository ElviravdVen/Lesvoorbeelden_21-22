/* *****************************
 * Author: ELvira van der Ven  *
 * Date:   17/12/2021          *                                                                                          *
 *******************************/

package lesweek4;

public class Eigenaar {
    private String naamEigenaar;

    public Eigenaar(String naamEigenaar) {
        this.naamEigenaar = naamEigenaar;
    }

    @Override
    public String toString() {
        return "Eigenaar{" + naamEigenaar + '\'' +
                '}';
    }
}