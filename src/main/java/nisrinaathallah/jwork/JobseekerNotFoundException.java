package nisrinaathallah.jwork;
/**
 * @author Nisrina Athallah - 1806148813
 * @version 27 - 06 -2021
 */

/**
 * inisiasi class
 */
public class JobseekerNotFoundException extends Exception {
    private int jobseeker_error;

    /**
     * constructor jobseeker not found exception
     * @param jobseeker_input
     */
    public JobseekerNotFoundException(int jobseeker_input){
        super("Jobseeker ID: ");
        jobseeker_error = jobseeker_input;
    }

    @Override
    /**
     * method menghasilkan pesan error
     */
    public String getMessage() {
        return super.getMessage() + jobseeker_error + "Not Found";
    }
}