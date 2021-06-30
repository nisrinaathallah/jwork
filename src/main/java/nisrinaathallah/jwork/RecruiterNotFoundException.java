/**
 * @author Nisrina Athallah - 1806148813
 * @version 27 - 06 -2021
 */
package nisrinaathallah.jwork;

//inisasi class
public class RecruiterNotFoundException extends Exception {
    private int recruiter_error;

    /**
     * constructor recruiter not found exception
     * @param recruiter_input
     */
    public RecruiterNotFoundException(int recruiter_input){
        super("Recruiter ID: ");
        recruiter_error = recruiter_input;
    }

    @Override
    /**
     * method untuk menampilkan pesan error
     */
    public String getMessage() {
        return super.getMessage() + recruiter_error + "Not Found";
    }
}