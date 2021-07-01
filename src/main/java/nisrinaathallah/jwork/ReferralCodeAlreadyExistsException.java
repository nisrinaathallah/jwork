/**
 * @author Nisrina Athallah - 1806148813
 * @version 27 - 06 -2021
 */

package nisrinaathallah.jwork;

/**
 * inisiasi class
 */
public class ReferralCodeAlreadyExistsException extends Exception {
    private Bonus referral_error;

    /**
     * constructor untuk referral code already exist
     * @param referral_input referral code
     */
    public ReferralCodeAlreadyExistsException(Bonus referral_input){
        super("Jobseeker Email : ") ;
        referral_error = referral_input;
    }

    @Override
    /**
     * method menghasilkan pesan error
     */
    public String getMessage() {
        return super.getMessage() + referral_error + "already exists.";
    }
}