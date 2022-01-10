/* *****************************
 * Author: ELvira van der Ven  *
 * Date:   10/01/2022          *                                                                                          *
 *******************************/

package lesweek6;

public class Element {
    private int data;
    private Element next;

    public int getData() {
        return data;
    }

    public void setData(int data) {
        this.data = data;
    }

    public Element getNext() {
        return next;
    }

    public void setNext(Element next) {
        this.next = next;
    }
}