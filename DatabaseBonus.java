package nisrinaathallah.jwork;

/**
 * @author: Nisrina Athallah - 1806148813
 * @version: Modul 8 - Case Study - 20 Mei 2021
 */

import java.util.ArrayList;

/**
 deklarasi class
 */

public class DatabaseBonus{

    private static ArrayList<Bonus> BONUS_DATABASE;
    private static int lastId;

    /**
     * getter list object Database Job
     * @return nilai null
     */
    public static ArrayList<Bonus> getBonusDatabase(){
        return BONUS_DATABASE;
    }

    public static int getLastId(){
        return lastId;
    }

    /**
     * getter objek Database Job
     * @return nilai null
     */
    public static Bonus getBonusById(int id){
        for (int i=0; i < BONUS_DATABASE.size(); i++) {
            if(BONUS_DATABASE.get(i).getId()== id){
                return BONUS_DATABASE.get(i);
            }
        }
        return null;
    }

    public static Bonus getBonusByReferralCode(String referralCode){
        for (int i=0; i < BONUS_DATABASE.size(); i++) {
            if(BONUS_DATABASE.get(i).getReferralCode()== referralCode){
                return BONUS_DATABASE.get(i);
            }
        }
        return null;
    }

    /**
     * method untuk menambahkan objek database job
     * @return nilai false
     */
    public static boolean addBonus(Bonus bonus){
        for (Bonus bons : BONUS_DATABASE)
        {
            if (bons.getId() == bonus.getId()) return false;
            if (bons.getReferralCode() == bonus.getReferralCode()) return false;
        }
        BONUS_DATABASE.add(bonus);
        lastId = bonus.getId();
        return true;
    }

    public static boolean activeBonus(int id){
        for (int i = 0; i < BONUS_DATABASE.size(); i++) {
            if (BONUS_DATABASE.get(i).getId() == id) {
                BONUS_DATABASE.get(i).setActive(true);
                return true;
            }
        }
        return false;
    }

    public static boolean deactivateBonus(int id){
        for (int i = 0; i < BONUS_DATABASE.size(); i++) {
            if (BONUS_DATABASE.get(i).getId() == id) {
                BONUS_DATABASE.get(i).setActive(false);
                return true;
            }
        }
        return false;
    }

    /**
     * method untuk menghapus objek database job
     * @return nilai false
     */
    public static boolean removeBonus(int id){
        for (int i=0; i < BONUS_DATABASE.size(); i++) {
            if(BONUS_DATABASE.get(i).getId() == id) {
                BONUS_DATABASE.remove(i);
                return true;
            }
        }
        return false;
    }
}