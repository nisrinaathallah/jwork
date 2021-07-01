/**
 * @author Nisrina Athallah - 1806148813
 * @version 27 - 06 -2021
 */

package nisrinaathallah.jwork;
import java.util.ArrayList;

//class database bonus//
public class DatabaseBonus {

    private static ArrayList<Bonus> BONUS_DATABASE= new ArrayList<Bonus>();;
    private static int lastId = 0;

    /**
     * method getter database bonus
     * @return database bonus
     */
    public static ArrayList<Bonus> getBonusDatabase(){
        return BONUS_DATABASE;
    }

    /**
     * method getter id terakhir
     * @return id terakhir
     */
    public static int getLastId(){
        return lastId;
    }

    /**
     * method getter bonus sesuai id
     * @param id database bonus
     * @return bonus dengan id yang sesuai
     * @throws BonusNotFoundException jika sesuai
     */
    public static Bonus getBonusById(int id) throws BonusNotFoundException {
        Bonus val = null;
        try {
            for (Bonus bns : BONUS_DATABASE) {
                if (id == bns.getId()) {
                    val = bns;
                }
            }
        }
        catch (Exception error)
        {
            throw new BonusNotFoundException(id);
        }
        return val;
    }

    /**
     * method getter bonus sesuai dengan referral code
     * @param referralCode database bonus
     * @return bonus dengan referral code yang sesuai
     */
    public static Bonus getBonusByReferralCode(String referralCode){
        for (int i=0; i < BONUS_DATABASE.size(); i++) {
            if(BONUS_DATABASE.get(i).getReferralCode()== referralCode){
                return BONUS_DATABASE.get(i);
            }
        }
        return null;
    }

    /**
     * method penambahan bonus
     * @param bonus database bonus
     * @return true apabila penambahan berhasil
     * @throws ReferralCodeAlreadyExistsException jika referral code sudah ada
     */
    public static boolean addBonus(Bonus bonus) throws ReferralCodeAlreadyExistsException {
        for (Bonus bns : BONUS_DATABASE)
        {
            if (bonus.getReferralCode() == bns.getReferralCode())
            {
                throw new ReferralCodeAlreadyExistsException(bonus);
            }
        }
        BONUS_DATABASE.add(bonus);
        lastId = bonus.getId();
        return true;
    }

    /**
     * method aktivasi bonus
     * @param id database bonus
     * @return true jika berhasil, false jika tidak
     */
    public static boolean activateBonus(int id) {
        for (int i = 0; i < BONUS_DATABASE.size(); i++) {
            if (BONUS_DATABASE.get(i).getId() == id) {
                BONUS_DATABASE.get(i).setActive(true);
                return true;
            }
        }
        return false;
    }

    /**
     * method menonaktifkan bonus
     * @param id database bonus
     * @return true jika berhasil, false jika tidak
     */
    public static boolean deactivateBonus(int id) {
        for (int i = 0; i < BONUS_DATABASE.size(); i++) {
            if (BONUS_DATABASE.get(i).getId() == id) {
                BONUS_DATABASE.get(i).setActive(true);
                return true;
            }
        }
        return false;
    }

    /**
     * method penghilangan bonus
     * @param id database bonus
     * @return true jika terhapus, false jika tidak
     * @throws JobnotFoundException jika tidak ditemukan job
     */
    public static boolean removeBonus(int id) throws JobnotFoundException {
        for (Bonus bns : BONUS_DATABASE) {
            if (bns.getId() == id) {
                BONUS_DATABASE.remove(bns);
                return true;
            }
        }
        throw new JobnotFoundException(id);
    }
}