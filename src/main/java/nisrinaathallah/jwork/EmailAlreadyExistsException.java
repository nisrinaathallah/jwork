/**
 * @author Nisrina Athallah - 1806148813
 * @version 27 - 06 -2021
 */
package nisrinaathallah.jwork;

public class EmailAlreadyExistsException extends Exception {
    private Jobseeker jobseeker_error;

    public EmailAlreadyExistsException(Jobseeker jobseeker_input){
        super("Jobseeker Email : ") ;
        jobseeker_error = jobseeker_input;
    }

    @Override
    public String getMessage() {
        return super.getMessage() + jobseeker_error.getEmail() + "already exists.";
    }
}

