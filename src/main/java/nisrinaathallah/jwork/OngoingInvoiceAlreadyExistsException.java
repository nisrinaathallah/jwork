/**
 * @author Nisrina Athallah - 1806148813
 * @version 27 - 06 -2021
 */
package nisrinaathallah.jwork;

/**
 * inisiasi class
 */
public class OngoingInvoiceAlreadyExistsException extends Exception{

    private Invoice invoice_error;

    /**
     * constructor yang digunakan
     */
    public OngoingInvoiceAlreadyExistsException(Invoice invoice_input){
        super("Jobseeker Email : ") ;
        invoice_error = invoice_input;
    }

    /**
     * method menampilkan hasil error
     */
    @Override
    public String getMessage() {
        return super.getMessage() + invoice_error.getInvoiceStatus() + " already exists.";
    }
}
