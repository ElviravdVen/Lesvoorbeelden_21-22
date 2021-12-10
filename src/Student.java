/* *****************************
 * Author: ELvira van der Ven  *
 * Date:   10/12/2021          *                                                                                          *
 *******************************/

public class Student {
    private String naam;
    private int leeftijd;
    private Student next;

    public Student(String naam, int leeftijd) {
        this.naam = naam;
        this.setLeeftijd(leeftijd);
        this.next = null;
    }


    public Student getNext() {
        return next;
    }

    public void setNext(Student next) {
        this.next = next;
    }

    public String getNaam() {
        return naam;
    }

    public int getLeeftijd() {
        return leeftijd;
    }

    /**
     * @param leeftijd toegestaan tussen 0 en 120.
     */
    public void setLeeftijd(int leeftijd) {
        if (leeftijd > this.leeftijd && leeftijd < 150) {
            this.leeftijd = leeftijd;
        }
    }

    public void print(){
        System.out.println(this.toString());
    }

    @Override
    public String toString() {
        return "Student{" +
                "naam='" + naam + '\'' +
                ", leeftijd=" + leeftijd +
                ", next=" + next.naam +
                '}';
    }
}