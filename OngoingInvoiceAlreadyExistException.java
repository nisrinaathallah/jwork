/**
 * @author: Nisrina Athallah - 1806148813
 * @version: Modul 8 - Case Study - 20 Mei 2021
 */

package nisrinaathallah.jwork;

public class OngoingInvoiceAlreadyExistException {
    private int ongoing_error;

    public OngoingInvoiceAlreadyExistException(int ongoing_input){
        super("Ongoing ID: ");
        bonus_error = ongoing_input;
    }

    @Override
    public String getMessage() {
        return super.getMessage() + bonus_error + "Not Found";
    }
}

