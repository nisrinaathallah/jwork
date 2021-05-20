/**
 * @author: Nisrina Athallah - 1806148813
 * @version: Modul 8 - Case Study - 20 Mei 2021
 */
package nisrinaathallah.jwork;

public class RecruiterNotFoundException extends Exception {
    private int recruiter_error;

    public RecruiterNotFoundException(int recruiter_input){
        super("Recruiter ID: ");
        recruiter_error = recruiter_input;
    }

    @Override
    public String getMessage() {
        return super.getMessage() + recruiter_error + "Not Found";
    }
}
