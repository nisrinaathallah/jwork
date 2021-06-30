/**
 * @author Nisrina Athallah - 1806148813
 * @version 27 - 06 -2021
 */
package nisrinaathallah.jwork;
/**
 * inisiasi class
 */
public class JobnotFoundException extends Exception {
    private int job_error;

    /**
     * constructor yang digunakan
     * @param job_input
     */
    public JobnotFoundException(int job_input){
        super("Job ID: ");
        job_error = job_input;
    }

    @Override
    /**
     * method getmessage untuk menampilkan error
     */
    public String getMessage() {
        return super.getMessage() + job_error + "Not Found";
    }
}