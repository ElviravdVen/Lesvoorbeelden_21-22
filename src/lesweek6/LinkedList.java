/* *****************************
 * Author: ELvira van der Ven  *
 * Date:   10/01/2022          *                                                                                          *
 *******************************/

package lesweek6;


public class LinkedList {
    public Element first;

    /**
     * @return index waarop element te vinden is.
     * Bij ontbrekende element wordt waarde -1 geretourneerd
     * @param e element die geziocht wordt
     */
    public int peek(Element e){
        int teller = 0;
//        Element toLoop = first;
//        if(toLoop.equals(e)){
//            return teller;
//        }
//        else(toLoop = toLoop.getNext()){
//            teller++;
//        }
//
//        for(Auto current = first; current != null; current = current.getNext())
//        {
//            //doe iets
//        }

        for(Element currentElement = first; currentElement != null; currentElement = currentElement.getNext()){
            if(currentElement.equals(e)){
                return teller;
            }
            teller++;
        }
        return -1;
    }
}