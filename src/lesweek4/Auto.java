/* *****************************
 * Author: ELvira van der Ven  *
 * Date:   17/12/2021          *                                                                                          *
 *******************************/

package lesweek4;

/**
 * RIJDT IN NEDERLAND!!!!
 */
public class Auto {
    private Stuur aStuur;
    private Motor aMotor;
    private Eigenaar aEigenaar;
    private int snelheid;

    public Auto() {
        this.aStuur = new Stuur();
        this.aMotor = new Motor();
        this.aEigenaar = null;
        this.snelheid = 0;
    }

    public boolean hasEigenaar(){
        return this.aEigenaar != null;
    }

    /**
     * @param aantalGraden -90 voor haakse bocht naar links en
     *                     +90 voor haakse bocht naar rechts
     */
    public void sturen(int aantalGraden){
        this.aStuur.veranderStuurHoek(aantalGraden);
    }

    public void starten(){
        this.aMotor.starten();
    }


    //to do: bedenken wat wij met rijden willen.
    public void rijdenVooruit(int vermogen){
        this.snelheid = (int)this.aMotor.leverVermogen(vermogen);
        System.out.println("Rijd vooruit met " + this.snelheid + " km/h");
    }


    public void remmen(int gewenstteSnelheid){
        System.out.println("Huidige snelheid: " + this.snelheid);
        System.out.println("Remt af tot " + snelheid);
        if(this.snelheid != gewenstteSnelheid) {
            this.snelheid = (int)this.aMotor.minderVermogen();
        }
        System.out.println("Afgeremd tot " + this.snelheid + " km/h");
    }

    public void keren(){
        System.out.println("Keren");
        this.sturen(180);
    }

}