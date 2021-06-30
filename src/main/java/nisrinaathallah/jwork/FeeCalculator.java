/**
 * @author Nisrina Athallah - 1806148813
 * @version 27 - 06 -2021
 */

package nisrinaathallah.jwork;
import java.util.ArrayList;

//class untuk menghitung total fee//
public class FeeCalculator implements Runnable{

    /**
     * metod run untuk menghitung
     */
    public void run(){
        ArrayList<Invoice> list = DatabaseInvoice.getInvoiceDatabase();
        for (Invoice i : list){
            System.out.println("calculating invoice id: "+ i.getId());
            i.setTotalFee();
            System.out.println("finished calculating invoice id: "+ i.getId());

        }

    }
}
