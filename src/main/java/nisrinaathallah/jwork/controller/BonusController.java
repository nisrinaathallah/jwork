package nisrinaathallah.jwork.controller;

/**
 * @author Nisrina Athallah - 1806148813
 * @version 27 - 06 -2021
 */

import nisrinaathallah.jwork.*;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;

@RequestMapping("/bonus")
@RestController

//class untuk Bonus//
public class BonusController {
    @RequestMapping("")
    public ArrayList<Bonus> getAllBonus(){
        ArrayList<Bonus> bonus = null;
        bonus = DatabaseBonus.getBonusDatabase();
        return bonus;
    }

    /**
     * getter dengan referral code
     * @param referralCode
     * @return
     */
    @RequestMapping(value = "/{referralCode}", method = RequestMethod.GET)
    public Bonus getBonusByReferralCode(@PathVariable String referralCode) {
        Bonus bonus = null;
        bonus = DatabaseBonus.getBonusByReferralCode(referralCode);
        return bonus;
    }

    /**
     * method untuk menambah bonus kode
     * @param referralCode
     * @param extraFee untuk ekstra gaji
     * @param minTotalFee untuk gaji minimal
     * @param active untuk status bonus code
     * @return bonus yang telah dibuat
     * @throws ReferralCodeAlreadyExistsException
     */
    @RequestMapping(value = "", method = RequestMethod.POST)
    public Bonus addBonus(@RequestParam(value="referralCode") String referralCode,
                          @RequestParam(value="extraFee") int extraFee,
                          @RequestParam(value="minTotalFee") int minTotalFee,
                          @RequestParam boolean active)
            throws ReferralCodeAlreadyExistsException{
        Bonus bonus = new Bonus(DatabaseBonus.getLastId()+1, "test", minTotalFee, extraFee, active);
        if (DatabaseBonus.addBonus(bonus)){
            return bonus;
        }
        else{
            return null;
        }
    }
}
