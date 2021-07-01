/**
 * @author Nisrina Athallah - 1806148813
 * @version 27 - 06 -2021
 */

package nisrinaathallah.jwork.controller;

import nisrinaathallah.jwork.*;
import org.springframework.web.bind.annotation.*;
import java.util.ArrayList;

@RequestMapping("/invoice")
@RestController
/**
 * class pada Invoice Controller
 */
public class InvoiceController {

    /**
     * method getter semua kelas invoice
     * @return invoice
     */
    @RequestMapping("")
    public ArrayList<Invoice> getAllInvoice(){
        return DatabaseInvoice.getInvoiceDatabase();
    }

    /**
     * method getter Invoice berdasarkan id
     * @param id pada Invoice Controller
     * @return invoice dengan id yang sesuai
     */
    @RequestMapping("/{id}")
    public Invoice getInvoiceById(@PathVariable int id) {
        Invoice invoice = null;
        try {
            invoice = DatabaseInvoice.getInvoiceById(id);
        } catch (InvoiceNotFoundException e) {
            e.getMessage();
            return null;
        }
        return invoice;
    }

    /**
     * method getter invoice dengan jobseeker
     * @param jobseekerId pada Invoice Controller
     * @return invoice dengan id jobseeker yang sesuai
     */
    @RequestMapping(value = "/jobseeker/{jobseekerId}", method = RequestMethod.GET)
    public ArrayList<Invoice> getInvoiceByJobseeker(@PathVariable int jobseekerId) {
        return DatabaseInvoice.getInvoiceByJobseeker(jobseekerId);
    }

    /**
     * method invoice status
     * @param id pada Invoice Controller
     * @param invoiceStatus pada Invoice Controller
     * @return jumlah invoice terbaru
     * @throws InvoiceNotFoundException invoice not found
     */
    @RequestMapping(value = "/invoiceStatus/{id}", method = RequestMethod.PUT)
    public Invoice changeInvoiceStatus(@RequestParam(value="id") int id,
                                       @RequestParam(value="invoiceStatus") InvoiceStatus invoiceStatus) throws InvoiceNotFoundException {
        DatabaseInvoice.changeInvoiceStatus(id, invoiceStatus);
        Invoice invoice = DatabaseInvoice.getInvoiceById(id);
        return invoice;
    }

    /**
     * method penghapusan invoice dengan id
     * @param id pada Invoice Controller
     * @return true apabila berhasil dihapus
     */
    @RequestMapping(value = "/{id}", method = RequestMethod.DELETE)
    public Boolean removeInvoice(@RequestParam(value = "id") int id){
        try{
            DatabaseInvoice.removeInvoice(id);
        } catch (InvoiceNotFoundException e){
            e.getMessage();
            return false;
        }
        return true;
    }

    /**
     * method invoice dengan bank payment
     * @param jobIdList list job yang dipilih
     * @param jobseekerId id pelamar kerja
     * @param adminFee upah untuk admin
     * @return invoice yang baru dibuat
     */
    @RequestMapping(value = "/createBankPayment", method = RequestMethod.POST)
    public Invoice addBankPayment(@RequestParam(value = "jobIdList") ArrayList<Integer> jobIdList,
                                  @RequestParam(value = "jobseekerId") int jobseekerId,
                                  @RequestParam(value = "adminFee") int adminFee){
        ArrayList<Job> job = new ArrayList<>();
        for (int jobs : jobIdList) {
            try {
                job.add(DatabaseJob.getJobById(jobs));
            } catch (JobnotFoundException e) {
                System.out.println(e.getMessage());
            }
        }
        try {
            Invoice invoice = new BankPayment(DatabaseInvoice.getLastId()+1, job,
                    DatabaseJobseekerPostgre.getJobseekerById(jobseekerId), adminFee);
            DatabaseInvoice.addInvoice(invoice);
            invoice.setTotalFee();
            return invoice;
        } catch (Exception e) {
            System.out.println(e.getMessage());
            return null;
        }
    }

    /**
     * method invoice dengan metode e wallet payment
     * @param jobIdList list job yang dipiluh
     * @param jobseekerId id pelamar kerja
     * @param referralCode kode bonus yang digunakan
     * @return invoice yang baru dibuat
     */
    @RequestMapping(value = "/createEWalletPayment", method = RequestMethod.POST)
    public Invoice addBankPayment(@RequestParam(value = "jobIdList") ArrayList<Integer> jobIdList,
                                  @RequestParam(value = "jobseekerId") int jobseekerId,
                                  @RequestParam(value = "referralCode") String referralCode)
    {
        try{
            ArrayList<Job> jobs = new ArrayList<Job>();
            for (Integer id : jobIdList){
                Job job = DatabaseJob.getJobById(id);
                jobs.add(job);
            }
            Jobseeker jobseeker = DatabaseJobseekerPostgre.getJobseekerById(jobseekerId);
            EwalletPayment ep = new EwalletPayment(DatabaseInvoice.getLastId() + 1, jobs, jobseeker, DatabaseBonus.getBonusByReferralCode(referralCode));
            DatabaseInvoice.addInvoice(ep);
            return ep;
        } catch (Exception e){
            System.out.println(e.getMessage());
        }
        return null;
    }


}

