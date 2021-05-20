/**
 * @author: Nisrina Athallah - 1806148813
 * @version: Modul 8 - Case Study - 20 Mei 2021
 */

package nisrinaathallah.jwork;

import java.util.Calendar;
import java.util.Date;
import java.text.SimpleDateFormat;
import java.util.ArrayList;

public class BankPayment extends Invoice {
    private static final PaymentType PAYMENT_TYPE = PaymentType.BankPayment;
    private int adminFee = 0;

    public BankPayment(int id, ArrayList<Job> jobs, Jobseeker jobseeker) {
        super(id, jobs, jobseeker);
    }

    public BankPayment(int id, ArrayList<Job> job, Jobseeker jobseeker, int adminFee) {
        super(id, job, jobseeker);
        this.adminFee = adminFee;
    }

    public PaymentType getPaymentType() {
        return PAYMENT_TYPE;
    }

    public int getAdminFee() {
        return adminFee;
    }

    public void setAdminFee(int adminFee) {
        this.adminFee = adminFee;
    }

    public void setTotalFee() {
        //totalFee = getJob().getFee();
        if (adminFee != 0) {
            totalFee -= adminFee;
        }
    }

    @Override
    public String toString()
    {
        Date date = getDate().getTime();
        String strDate = "";
        if (date != null) {
            SimpleDateFormat dateFormat = new SimpleDateFormat("dd-MMMM-yyyy");
            strDate = dateFormat.format(date);
        }
        String str =    "====== Ewallet Payment ======" +
                "\nID : " + getId() +
                "\nJobs : " + getJobs() +
                "\nDate : " + strDate +
                "\nSeeker : " + getJobseeker().getName() +
                "\nFee : " + totalFee +
                "\nStatus : " + getInvoiceStatus().toString() +
                "\nPayment Type : " + PAYMENT_TYPE.toString();
        return str;
    }
}

    /*public void printData(){
        System.out.println("==========Invoice==========" 
                            + "\nID: "+ super.getId()
                            + "\nJob: "+ super.getJob().getName()
                            + "\nDate: "+ super.getDate()
                            + "\nJob Seeker: "+ super.getJobseeker().getName()
                            + "\nAdminFee "+ adminFee
                            + "\nTotal Fee: "+ super.totalFee
                            + "\nStatus:  "+ super.getInvoiceStatus().toString()
                            + "\nPayment Type: "+ PAYMENT_TYPE.toString());
    }*/

