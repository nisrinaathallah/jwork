/**
 * @author: Nisrina Athallah - 1806148813
 * @version: Modul 7 - Case Study - 6 Mei 2021
 */

public class ReferralCodeAlreadyExistsException extends Exception {
    private Bonus referral_error;

    public ReferralCodeAlreadyExistsException(Bonus referral_input){
        super("Jobseeker Email : ") ;
        referral_error = referral_input;
    }

    @Override
    public String getMessage() {
        return super.getMessage() + referral_error + "already exists.";
    }
}