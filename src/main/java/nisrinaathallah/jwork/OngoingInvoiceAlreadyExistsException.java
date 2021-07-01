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
     * @param invoice_input pada Ongoing Invoice Already Exists
     */
    public OngoingInvoiceAlreadyExistsException(Invoice invoice_input){
        super("Jobseeker Email : ") ;
        invoice_error = invoice_input;
    }

    /**
     * method untuk menghasilkan pesan error
     * @return pesan already exist
     */
    @Override
    public String getMessage() {
        return super.getMessage() + invoice_error.getInvoiceStatus() + " already exists.";
    }
}
