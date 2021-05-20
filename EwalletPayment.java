package nisrinaathallah.jwork;

import java.util.Calendar;
import java.util.Date;
import java.text.SimpleDateFormat;
import java.util.ArrayList;

/**
 * @author: Nisrina Athallah - 1806148813
 * @version: Modul 8 - Case Study - 20 Mei 2021
 */

/**
 deklarasi class
 */

public class EwalletPayment extends Invoice {

    private Bonus bonus;
    private static final PaymentType PAYMENT_TYPE = PaymentType.EwalletPayment;

    public EwalletPayment(int id, ArrayList<Job> jobs, Jobseeker jobseeker){
        super(id, jobs, jobseeker);
    }

    public EwalletPayment(int id, ArrayList<Job> jobs, Jobseeker jobseeker, Bonus bonus){
        super(id, jobs, jobseeker);
        this.bonus = bonus;
    }

    public PaymentType getPaymentType(){
        return PAYMENT_TYPE;
    }
    public Bonus getBonus(){
        return bonus;
    }
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

    @Override
    public String toString() {
        Date date = getDate().getTime();
        String strDate = "";
        if (date != null) {
            SimpleDateFormat dateFormat = new SimpleDateFormat("dd-MM-yyyy");
            strDate = dateFormat.format(date);
        }
        // Print data
        String str = "====== Ewallet Payment ======" +
                "\nID : " + getId() +
                "\nJobs : " + getJobs() +
                "\nDate : " + strDate +
                "\nSeeker : " + getJobseeker().getName();
        // Menampilkan referral code jika bonusnya aktif atau valid
        if (bonus.getReferralCode() != null &&
                bonus != null && bonus.getActive() &&
                getTotalFee() > bonus.getMinTotalFee()) {
            str += "\nReferral Code: " + bonus.getReferralCode();
        }
        str += "\nFee : " + totalFee +
                "\nStatus: " + getInvoiceStatus().toString() +
                "\nPayment Type : " + PAYMENT_TYPE.toString();
        return str;
    }
}