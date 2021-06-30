/**
 * @author Nisrina Athallah - 1806148813
 * @version 27 - 06 -2021
 */

package nisrinaathallah.jwork;

//class invoice not found exception//
public class InvoiceNotFoundException extends Exception{

    private int invoice_error;

    /**
     * constructor yang digunakan
     * @param invoice_input
     */
    public InvoiceNotFoundException(int invoice_input){
        super("Invoice ID: ");
        invoice_error = invoice_input;
    }

    @Override
    /**
     * method getmessage untuk menampilkan error
     */
    public String getMessage() {
        return super.getMessage() + invoice_error + "Not Found";
    }

}
