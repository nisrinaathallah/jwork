/**
 * @author: Nisrina Athallah - 1806148813
 * @version: Modul 8 - Case Study - 20 Mei 2021
 */

package nisrinaathallah.jwork;

public class BonusNotFoundException extends Exception {
    private int bonus_error;

    public BonusNotFoundException(int bonus_input){
        super("Bonus ID: ");
        bonus_error = bonus_input;
    }

    @Override
    public String getMessage() {
        return super.getMessage() + bonus_error + "Not Found";
    }
}

