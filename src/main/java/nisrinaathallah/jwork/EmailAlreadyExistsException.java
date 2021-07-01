/**
 * @author Nisrina Athallah - 1806148813
 * @version 27 - 06 -2021
 */
package nisrinaathallah.jwork;

/**
 * insiasi class
 */
public class EmailAlreadyExistsException extends Exception {
    private Jobseeker jobseeker_error;

    /**
     * constructor yang digunakan
     * @param jobseeker_input menghasilkan email jobseekr
     */
    public EmailAlreadyExistsException(Jobseeker jobseeker_input){
        super("Jobseeker Email : ") ;
        jobseeker_error = jobseeker_input;
    }

    /**
     * method untuk menghasilkan pesan error
     * @return already exists
     */
    @Override
    public String getMessage() {
        return super.getMessage() + jobseeker_error.getEmail() + "already exists.";
    }
}

