/**
 * @author Nisrina Athallah - 1806148813
 * @version 27 - 06 -2021
 */

package nisrinaathallah.jwork;
import java.util.ArrayList;
/**
 * inisiasi class untuk Database Invoice
 */
public class DatabaseInvoice {
    private static ArrayList<Invoice> INVOICE_DATABASE = new ArrayList<Invoice>();
    private static int lastId;

    /**
     * method getter invoice database
     * @return invoice database
     */
    public static ArrayList<Invoice> getInvoiceDatabase(){
        return INVOICE_DATABASE;
    }

    /**
     * method getter id terakhir
     * @return id terakhir
     */
    public static int getLastId(){
        return lastId;
    }

    /**
     * method getter invoice dengan id
     * @param id
     * @return invoice dengan id yang sesuai
     * @throws InvoiceNotFoundException
     */
    public static Invoice getInvoiceById(int id) throws InvoiceNotFoundException{
        Invoice val = null;
        try {
            for (Invoice invc : INVOICE_DATABASE) {
                if (id == invc.getId()) {
                    val = invc;
                }
            }
        }
        catch (Exception error) {
            throw new InvoiceNotFoundException(id);
        }
        return val;
    }

    /**
     * method getter invoice dengan jobseeker
     * @param jobseekerId
     * @return invoice dengan jobseeker yang sesuai
     */
    public static ArrayList<Invoice> getInvoiceByJobseeker(int jobseekerId){
        ArrayList<Invoice> temp = new ArrayList<>();
        for (int i=0; i < INVOICE_DATABASE.size(); i++) {
            if(INVOICE_DATABASE.get(i).getJobseeker().getId() == jobseekerId){
                temp.add(INVOICE_DATABASE.get(i));
            }
        }
        return temp.isEmpty()? null : temp;
    }

    /**
     * method penambahan invoice
     * @param invoice
     * @return true jika invoice berhasil ditambah
     * @throws OngoingInvoiceAlreadyExistsException
     */
    public static boolean addInvoice(Invoice invoice) throws OngoingInvoiceAlreadyExistsException{
        for (Invoice invc : INVOICE_DATABASE) {
            if (InvoiceStatus.Ongoing == invc.getInvoiceStatus()) {
                throw new OngoingInvoiceAlreadyExistsException(invoice);
            }
        }
        INVOICE_DATABASE.add(invoice);
        lastId = invoice.getId();
        return true;
    }

    /**
     * method pengubahan status invoice
     * @param id
     * @param invoiceStatus
     * @return true jika status invoice berhasil diubah
     */
    public static boolean changeInvoiceStatus(int id, InvoiceStatus invoiceStatus){
        for (int i=0; i < INVOICE_DATABASE.size(); i++) {
            if(INVOICE_DATABASE.get(i).getId() == id) {
                INVOICE_DATABASE.get(i).setInvoiceStatus(invoiceStatus);
                return true;
            }
        }
        return false;
    }

    /**
     * method untuk menghapus invoice
     * @param id
     * @return true jika invoice berhasil terhapus
     * @throws true jika tidak terdapat invoice
     */
    public static boolean removeInvoice(int id) throws InvoiceNotFoundException{
        for (int i=0; i < INVOICE_DATABASE.size(); i++) {
            if(INVOICE_DATABASE.get(i).getId() == id) {
                INVOICE_DATABASE.remove(i);
                return true;
            }
        }
        throw new InvoiceNotFoundException(id);
    }

}

