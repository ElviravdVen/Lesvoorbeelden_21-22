/* *****************************
 * Author: ELvira van der Ven  *
 * Date:   10/12/2021          *                                                                                          *
 *******************************/

public class Student {
    private String naam;
    private int leeftijd;

    public Student(String naam, int leeftijd) {
        this.naam = naam;
        this.setLeeftijd(leeftijd);
    }

    public String getNaam() {
        return naam;
    }

    public int getLeeftijd() {
        return leeftijd;
    }

    /**
     * @param leeftijd toegestaan tussen 0 en 120. Default is -1;
     */
    public void setLeeftijd(int leeftijd) {
        this.leeftijd = -1;
        if(leeftijd > 0 && leeftijd <120){
            this.leeftijd = leeftijd;
        }
    }

    public void print(){
        System.out.println(this.toString());
    }

    @Override
    public String toString() {
        return "Student{" +
                "naam = '" + naam + '\'' +
                ", leeftijd = " + leeftijd +
                '}';
    }
}