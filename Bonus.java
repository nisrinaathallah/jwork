/**
 * @author: Nisrina Athallah - 1806148813
 * @version: Modul 8 - Case Study - 20 Mei 2021
 */

/**
 deklarasi class
 */
package nisrinaathallah.jwork;

public class Bonus
{
    /**
     deklarasi variabel
     */
    private int id; //deklarasi variabel int
    private String referralCode; //deklarasi variabel String
    private int extraFee; //deklarasi variabel int
    private int minTotalFee; //deklarasi variabel int
    private boolean active;

    /**
     * Constructor dari objek class Bonus
     */
    public Bonus(int id, String referralCode, int extraFee, int minTotalFee, boolean active)
    {
        this.id = id;
        this.referralCode = referralCode;
        this.extraFee = extraFee;
        this.minTotalFee = minTotalFee;
        this.active = active;

    }

    public int getId()
    {
        return id;
    }

    public String getReferralCode()
    {
        return referralCode;
    }

    public int getExtraFee()
    {
        return extraFee;
    }

    public int getMinTotalFee()
    {
        return minTotalFee;
    }

    public boolean getActive()
    {
        return active;
    }

    public void setId(int id)
    {
        this.id = id;
    }

    public void setReferralCode(String referralCode)
    {
        this.referralCode = referralCode;
    }

    public void setExtraFee(String referralCode)
    {
        this.referralCode = referralCode;
    }

    public void setExtraFee(int extraFee)
    {
        this.extraFee = extraFee;
    }

    public void setMinTotalFee(int minTotalFee)
    {
        this.minTotalFee = minTotalFee;
    }

    public void setActive(boolean active)
    {
        this.active = active;
    }

    public String toString(){
        return "Id = " + id
                + "\nReferral Code = " + referralCode
                + "\nExtra Fee = " + extraFee
                + "\nMin Total Fee = " + minTotalFee
                + "\nActive Status = " + active;
    }

    //public void printData(){
    //}
}
