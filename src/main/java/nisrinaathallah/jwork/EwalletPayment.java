/**
 * @author Nisrina Athallah - 1806148813
 * @version 27 - 06 -2021
 */

package nisrinaathallah.jwork;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;


/**
 * insiasi class Ewallet Payment
 */
public class EwalletPayment extends Invoice
{

    private static final PaymentType PAYMENT_TYPE = PaymentType.EwalletPayment;
    private Bonus bonus;

    /**
     * constructor ewallet payment
     * @param id nomor id
     * @param jobs nama pekerjaan
     * @param jobseeker nama pelamar kerja
     */
    public EwalletPayment(int id, ArrayList<Job> jobs, Jobseeker jobseeker){
        super(id, jobs, jobseeker);
    }

    /**
     * constructor ewalletpayment dengan bonus
     * @param id nomor id
     * @param jobs nama pekerjaan
     * @param jobseeker nama pelamar kerja
     * @param bonus kode bonus
     */
    public EwalletPayment(int id, ArrayList<Job> jobs, Jobseeker jobseeker, Bonus bonus){
        super(id, jobs, jobseeker);
        this.bonus = bonus;
    }

    /**
     * method getter payment type
     * @return payment type
     */
    public PaymentType getPaymentType(){
        return PAYMENT_TYPE;
    }

    /**
     * method getter bonus
     * @return bonus
     */
    public Bonus getBonus(){
        return bonus;
    }

    /**
     * method setter bonus
     * @param bonus bonus
     */
    public void setBonus(Bonus bonus){
        this.bonus = bonus;
    }
    public void setTotalFee() {
        //super.totalFee = getJob().getFee();
        if (bonus != null && bonus.getActive() &&
                getTotalFee() > bonus.getMinTotalFee()) {
            super.totalFee += bonus.getExtraFee();
        }
    }

    /**
     * method setter total fee untuk menghitung upah
     * @return string
     */
    @Override
    public String toString() {
        Date date = getDate().getTime();
        String strDate = "";
        if (date != null) {
            SimpleDateFormat dateFormat = new SimpleDateFormat("dd-MM-yyyy");
            strDate = dateFormat.format(date);
        }
        // Print data secara keseluruhan
        String str = "====== Ewallet Payment ======" +
                "\nID           : " + getId() +
                "\nJobs         : " + getJobs() +
                "\nDate         : " + strDate +
                "\nSeeker       : " + getJobseeker().getName();
        // Hanya tampilkan referral code kalau bonusnya aktif atau valid
        if (bonus.getReferralCode() != null &&
                bonus != null && bonus.getActive() &&
                getTotalFee() > bonus.getMinTotalFee()) {
            str += "\nReferral Code: " + bonus.getReferralCode();
        }
        str += "\nFee          : " + totalFee +
                "\nStatus       : " + getInvoiceStatus().toString() +
                "\nPayment Type : " + PAYMENT_TYPE.toString();
        return str;
    }
}

    /*public void printData()
    {
        System.out.println("==========Invoice==========");
        System.out.println("ID: "+ super.getId());
        System.out.println("Job: "+ super.getJob().getName());
        System.out.println("Date: "+ super.getDate());
        System.out.println("Job Seeker: "+ super.getJobseeker().getName());
        System.out.println("Total Fee: "+ super.totalFee);

        if (getJob().getFee() != totalFee) {
            System.out.println("Bonus "+ bonus.getReferralCode());
        }

        System.out.println("Status:  "+ super.getInvoiceStatus().toString());
        System.out.println("Payment Type: "+ PAYMENT_TYPE.toString());
    */
