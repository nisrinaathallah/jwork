/**
 * @author: Nisrina Athallah - 1806148813
 * @version: Modul 8 - Case Study - 20 Mei 2021
 */

import java.util.Calendar;
import java.util.GregorianCalendar;
import java.time.LocalDate;
import java.util.ArrayList;

package nisrinaathallah.jwork;

/**
 deklarasi class
 */
public abstract class Invoice /** inisiasi class*/
{
    private int id; //inisiasi variable integer
    private Calendar date; //inisiasi variable string
    private Jobseeker jobseeker; //inisasi variable dari class jobseeker
    private InvoiceStatus invoiceStatus;
    private ArrayList<Job> jobs;
    protected int totalFee;
    private PaymentType paymentType;

    /**
     * Constructor untuk object invoice
     * @param id id pada invoice
     * @param idJob nama pada invoice
     * @param date date dari invoice
     * @param totalFee totalFee dari invoice
     * @param jobseeker jobseeker dari invoice
     */
    public Invoice(int id, ArrayList<Job> jobs, Jobseeker jobseeker)
    {
        this.id = id;
        this.jobs = jobs;
        this.totalFee = totalFee;
        this.jobseeker = jobseeker;
        this.invoiceStatus = invoiceStatus.Ongoing;
        this.date = Calendar.getInstance();
        LocalDate localDate = LocalDate.now();
        setDate(localDate.getYear(), localDate.getMonthValue(), localDate.getDayOfMonth());
    }

    /**
     * getter id dari invoice
     * @return dari id
     */
    public int getId()
    {
        return id;
    }

    /**
     * getter idJob dari invoice
     * @return dari idJob
     */
    public ArrayList<Job> getJobs()
    {
        return jobs;
    }

    /**
     * getter date dari invoice
     * @return dari date
     */
    public Calendar getDate()
    {
        return date;
    }

    /**
     * getter totalFee dari invoice
     * @return dari totalFee
     */
    public int getTotalFee()
    {
        return totalFee;
    }

    /**
     * getter jobseeker dari invoice
     * @return dari jobseeker
     */
    public Jobseeker getJobseeker()
    {
        return jobseeker;
    }

    public abstract PaymentType getPaymentType();

    public InvoiceStatus getInvoiceStatus()
    {
        return invoiceStatus;
    }

    /**
     * setter id dari invoice
     * @param id
     */
    public void setId(int id)
    {
        this.id = id;
    }

    /**
     * setter idjob dari invoice
     * @param idjob
     */
    public void setJobs(ArrayList<Job> jobs)
    {
        this.jobs = jobs;
    }

    /**
     * setter date dari invoice
     * @param date
     */
    public void setDate(Calendar Date){
        this.date = date;
    }

    public void setDate(int year,int month,int dayOfMonth ){
        this.date = new GregorianCalendar(year, month-1, dayOfMonth);
    }

    /**
     * setter totalFee dari invoice
     * @param totalFee
     */
    public abstract void setTotalFee();

    /**
     * setter jobseeker dari invoice
     * @param jobseeker
     */
    public void setJobseeker(Jobseeker jobseeker)
    {
        this.jobseeker = jobseeker;
    }

    public void setInvoiceStatus(InvoiceStatus invoiceStatus)
    {
        this.invoiceStatus = invoiceStatus;
    }

    public void setPaymentType(PaymentType paymentType)
    {
        this.paymentType = paymentType;
    }

    /**
     * printData ini fungsi nya untuk nge print data pada invoice yang dipanggil pada JWork
     */
    public abstract String toString();
   /*     {String joindate = "";
    String pattern = "dd-MMMM-yyyy";
    SimpleDateFormat simpleDateFormat = new SimpleDateFormat(pattern);
    if(joinDate != null){
        Date date = joinDate.getTime();
       joindate = simpleDateFormat.format(date);
}*/
    
     /*System.out.println("\n===Invoice===\n"+
        "ID: " + id +
        "\nID job: " + job + 
        "\nDate: " + job +  
        "\nJob Seeker: " + jobseeker.getName() +
        "\nTotal Fee: " + totalFee +
        "\nStatus: "+getInvoiceStatus()
        ); */

}
