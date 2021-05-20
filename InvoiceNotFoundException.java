/**
 * @author: Nisrina Athallah - 1806148813
 * @version: Modul 8 - Case Study - 20 Mei 2021
 */

package nisrinaathallah.jwork;

public class InvoiceNotFoundException extends Exception {
    private int invoice_error;

    public InvoiceNotFoundException(int invoice_input){
        super("invoice ID: ");
        bonus_error = invoice_input;
    }

    @Override
    public String getMessage() {
        return super.getMessage() + bonus_error + "Not Found";
    }
}
