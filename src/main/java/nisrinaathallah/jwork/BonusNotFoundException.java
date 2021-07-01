/**
 * @author Nisrina Athallah - 1806148813
 * @version 27 - 06 -2021
 */
package nisrinaathallah.jwork;

/**
 * inisiasi class Bonus Not Found Exception
 */
public class BonusNotFoundException extends Exception {
    private int bonus_error;

    /**
     * constructor bonus not found exception
     * @param bonus_input untuk bonus
     */
    public BonusNotFoundException(int bonus_input){
        super("Bonus ID: ");
        bonus_error = bonus_input;
    }

    /**
     * method getter untuk pesan error
     */
    @Override
    public String getMessage() {
        return super.getMessage() + bonus_error + "Not Found";
    }
}
