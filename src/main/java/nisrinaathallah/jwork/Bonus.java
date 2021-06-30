package nisrinaathallah.jwork;
/**
 * @author Nisrina Athallah - 1806148813
 * @version 27 - 06 -2021
 */
public class Bonus /** inisiasi class */
{
    private int id; /** inisiasi variabel */
private String referralCode;
    private int extraFee;
    private int minTotalFee;
    private boolean active;

    /**
     * constructor untuk bonus
     * @param id
     * @param referralCode
     * @param extraFee
     * @param minTotalFee
     * @param active
     */
    public Bonus(int id, String referralCode, int extraFee, int minTotalFee, boolean active){
        this.id = id;
        this.referralCode = referralCode;
        this.extraFee = extraFee;
        this.minTotalFee = minTotalFee;
        this.active = active;
    }

    /**
     * method getter id dari bonus
     * @return id dari bonus
     */
    public int getId(){
        return this.id;
    }

    /**
     * method getter referral code dari bonus
     * @return referral code dari bonus
     */
    public String getReferralCode(){
        return this.referralCode;
    }

    /**
     * method getter extra fee dari bonus
     * @return extra fee dari bonus
     */
    public int getExtraFee(){
        return this.extraFee;
    }

    /**
     * method getter min total fee dari bonus
     * @return min total fee dari bonus
     */
    public int getMinTotalFee(){
        return this.minTotalFee;
    }

    /**
     * method getter active dari bonus
     * @return active dari bonus
     */
    public boolean getActive(){
        return this.active;
    }

    /**
     * method setter id dari bonus
     * @param id dari bonus
     */

    public void setId(int id){
        this.id = id;
    }

    /**
     * method setter referral code dari bonus
     * @param referralCode dari bonus
     */
    public void setReferralCode(String referralCode){
        this.referralCode = referralCode;
    }

    /**
     * method setter extra fee dari bonus
     * @param extraFee dari bonus
     */
    public void setExtraFee(int extraFee){
        this.extraFee = extraFee;
    }

    /**
     * method setter min total fee dari bonus
     * @param minTotalFee dari bonus
     */
    public void setMinTotalFee(int minTotalFee){
        this.minTotalFee = minTotalFee;
    }

    /**
     * method setter active dari bonus
     * @param active dari bonus
     */
    public void setActive(boolean active){
        this.active = active;
    }

    /**
     * method toString untuk menampilkan bonus
     * @return bonus
     */
    public String toString(){
        return "Id = " + id +
                "\nReferral Code = " + referralCode +
                "\nExtraa Fee = " + extraFee +
                "\nMin Total Fee = " + minTotalFee +
                "\nActive Status = " + active ;
    }

    //public void printData(){
    //  System.out.println(id);
    //  System.out.println(referralCode);
    //  System.out.println(extraFee);
    //  System.out.println(minTotalFee);
    //  System.out.println(active);
}
