/**
 * @author: Nisrina Athallah - 1806148813
 * @version: Modul 8 - Case Study - 20 Mei 2021
 */

package nisrinaathallah.jwork;

import java.util.ArrayList;

public class FeeCalculator implements runnable{

    public void run(){
        ArrayList<Invoice> list = DatabaseInvoice.getInvoiceDatabase();
        for (Invoice i : list){
            System.out.println("calculating invoice id: "+ i.getId());
            i.setTotalFee();
            System.out.println("finished calculating invoice id: "+ i.getId());
        }
    }
}

