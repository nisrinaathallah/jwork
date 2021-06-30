/**
 * @author Nisrina Athallah - 1806148813
 * @version 27 - 06 -2021
 */

package nisrinaathallah.jwork;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication

/**
 * inisiasi class jwork
 */
public class Jwork {

    public static void main(String[] args) {
        Location location1 = new Location("Depok", "Depok", "tes");
        Location location2 = new Location("Sumatera Barat", "Padang", "halo");
        Location location3 = new Location("Jawa Barat", "Bandung", "bye");

        DatabaseRecruiter.addRecruiter(new Recruiter(DatabaseRecruiter.getLastId()+1, "Nisrina", "temp@gmail.com", "0988921638", location1));
        DatabaseRecruiter.addRecruiter(new Recruiter(DatabaseRecruiter.getLastId()+1, "Athallah", "testes@gmail.com", "07828173628", location2));
        DatabaseRecruiter.addRecruiter(new Recruiter(DatabaseRecruiter.getLastId()+1, "Geraldy", "haihai@gmail.com", "08289136712", location3));

        try{
            DatabaseJob.addJob(new Job(DatabaseJob.getLastId()+1, "Nisrina1", DatabaseRecruiter.getRecruiterById(1), 10000, JobCategory.WebDeveloper));
            DatabaseJob.addJob(new Job(DatabaseJob.getLastId()+1, "Nisrina2", DatabaseRecruiter.getRecruiterById(2), 11000, JobCategory.WebDeveloper));
            DatabaseJob.addJob(new Job(DatabaseJob.getLastId()+1, "Nisrina3", DatabaseRecruiter.getRecruiterById(3), 11100, JobCategory.BackEnd));
            DatabaseJob.addJob(new Job(DatabaseJob.getLastId()+1, "Nisrina4", DatabaseRecruiter.getRecruiterById(3), 11110, JobCategory.FrontEnd));
        }catch (RecruiterNotFoundException error){
            System.out.println(error.getMessage());
        }

        SpringApplication.run(Jwork.class, args);
    }

}


/* import java.lang.reflect.Array;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.ArrayList;

public class Jwork{
    
    public static void main (String[] args) {
        {
            ArrayList<Jobseeker> list = new ArrayList<Jobseeker>();
            list.add(new Jobseeker(1, "Bryan", "bryandario@ui.ac.id", "asddsaasd"));
            list.add(new Jobseeker(2, "Dario", "bryandario@ui.ac.id", "dsaasddsa"));
            list.add(new Jobseeker(3, "Ando", "ando@ui.ac.id", "dddsssaaa"));
            list.add(new Jobseeker(4, "Dimas", "dimas@ui.ac.id", "aaasssddd"));

            for (Jobseeker j : list)
            {
                try {
                    DatabaseJobseeker.addJobseeker(j);
                } catch (EmailAlreadyExistsException e) {
                    System.out.println(e.getMessage());
                }
            }
        }

        {
            ArrayList<Bonus> list = new ArrayList<Bonus>();
            list.add(new Bonus(1, "test", 15000, 1000, true));
            list.add(new Bonus(2, "test", 30000, 5000, true));
            list.add(new Bonus(2, "hello", 15000, 1000, true));
            list.add(new Bonus(2, "cobacoba", 30000, 5000, true));
            for (Bonus b : list)
            {
                try {
                    DatabaseBonus.addBonus(b);
                } catch (ReferralCodeAlreadyExistsException e) {
                    System.out.println(e.getMessage());
                }
            }
        }

        {
            try {
                Jobseeker js = DatabaseJobseeker.getJobseekerById(88);
            } catch (JobSeekerNotFoundException e) {
                System.out.println(e.getMessage());
            }

            try {
                Recruiter js = DatabaseRecruiter.getRecruiterById(88);
            } catch (RecruiterNotFoundException e) {
                System.out.println(e.getMessage());
            }

            try {
                Job js = DatabaseJob.getJobById(88);
            } catch (JobNotFoundException e) {
                System.out.println(e.getMessage());
            }

            try {
                Bonus js = DatabaseBonus.getBonusById(88);
            } catch (BonusNotFoundException e) {
                System.out.println(e.getMessage());
            }
        }

        {
            ArrayList<Bonus> listBonus = DatabaseBonus.getBonusDatabase();
            ArrayList<Jobseeker> listJS = DatabaseJobseeker.getDatabaseJobseeker();

            for (Bonus b : listBonus)
                System.out.println(b);

            for (Jobseeker js : listJS)
                System.out.println(js);
        }

        {
            try {

                Jobseeker js1 = DatabaseJobseeker.getJobseekerById(1);
                Jobseeker js2 = DatabaseJobseeker.getJobseekerById(2);
                Jobseeker js3 = DatabaseJobseeker.getJobseekerById(3);

                Location location = new Location("DKI Jakarta", "Jakarta Utara", "Headquarter");
                Recruiter recruiter = new Recruiter(1, "Bryan Dario", "bryandario@ui.ac.id", "0813231123", location);
                DatabaseJob.addJob(new Job(1, "Facebook UI Designer", recruiter, 120000, JobCategory.UI));

                ArrayList<Invoice> list = new ArrayList<Invoice>();
                list.add(new BankPayment(1, DatabaseJob.getJobDatabase(), js1));
                list.add(new BankPayment(2, DatabaseJob.getJobDatabase(), js2));
                list.add(new BankPayment(3, DatabaseJob.getJobDatabase(), js3));

            } catch (JobSeekerNotFoundException e) {
                System.out.print(e.getMessage());
                return;
            }

            try{
                Invoice invoice = DatabaseInvoice.getInvoiceById(88);
            } catch (InvoiceNotFoundException e){
                System.out.print(e.getMessage());
            }

            for (Invoice invoice : list) {
                try{
                    DatabaseBonus.addBonus(invoice);
                } catch (OngoingInvoiceAlreadyExistsException e){
                    System.out.print(e.getMessage());
                }
            }

            Thread myThread = new Thread(new FeeCalculator());
            myThread.start();
        }
        */
// Location location1 = new Location("DKI Jakarta","Jakarta Pusat","Tempat lahir");
// DatabaseRecruiter.addRecruiter( new Recruiter(1,"Bryan","bryan@gmail.com","081398558008",location1));

// DatabaseJobseeker.addJobseeker( new Jobseeker(1,"Dario","bryandariolc@gmail.com","asdas"));
// DatabaseJobseeker.addJobseeker( new Jobseeker(2,"Dario","bryandariolc@gmail.com","asdas"));
// DatabaseJobseeker.addJobseeker( new Jobseeker(3,"Ferlinda","ferlinda@gmail.com","asdas"));

//  DatabaseJob.addJob( new Job(1,"Senior Designer",DatabaseRecruiter.getRecruiterById(1),200000,JobCategory.DataAnalyst));
// DatabaseJob.addJob( new Job(2,"Senior Designer",DatabaseRecruiter.getRecruiterById(2),200000,JobCategory.DataAnalyst));
// DatabaseJob.addJob( new Job(3,"Senior Designer",DatabaseRecruiter.getRecruiterById(3),200000,JobCategory.WebDeveloper));

// {
//     ArrayList<Jobseeker> jstest = DatabaseJobseeker.getJobseekerDatabase();
//      for (Jobseeker js : jstest)
//         System.out.println(js.toString());
//  }

//Job job1 = new Job(1, "Duelist", DatabaseRecruiter.getRecruiterById(1), 30000, JobCategory.UI);
//Job job2 = new Job(2, "Controller", DatabaseRecruiter.getRecruiterById(1), 30000, JobCategory.BackEnd);
//Job job3 = new Job(3, "tes3", DatabaseRecruiter.getRecruiterById(1), 30000, JobCategory.UI);
//DatabaseJob.addJob(job1);
//DatabaseJob.addJob(job2);
//DatabaseJob.addJob(job3);

//   ArrayList<Job> jobtest = DatabaseJob.getJobByCategory(JobCategory.UI);
//   for (Job j: jobtest)
//      System.out.println(j.toString());
// }

// {
//     DatabaseBonus.addBonus(new Bonus(1, "asd", 1500, 1000, false));
//     DatabaseBonus.addBonus(new Bonus(2, "asd", 1500, 1000, false));

// }

//  {
//   ArrayList<Bonus> list = DatabaseBonus.getBonusDatabase();
//   for(Bonus b : list){
//       System.out.println(b.toString());
//   }
// }

// {
//  ArrayList<Job> list = new ArrayList<Job>();
//  ArrayList<Job> list2 = new ArrayList<Job>();
//  list.add(new Job(1, "Duelist", DatabaseRecruiter.getRecruiterById(1), 30000, JobCategory.UI));
//  list.add(new Job(2, "Controller", DatabaseRecruiter.getRecruiterById(1), 30000, JobCategory.BackEnd));

//  DatabaseInvoice.addInvoice(new EwalletPayment(1, list, DatabaseJobseeker.getJobseekerById(1),DatabaseBonus.getBonusById(1)));
//  DatabaseInvoice.addInvoice(new BankPayment(2, list2, DatabaseJobseeker.getJobseekerById(1),DatabaseBonus.getBonusById(1)));
//  }


//{
//   ArrayList<Invoice> list = DatabaseInvoice.getInvoiceDatabase();
//   for(Invoice i : list)
//       i.setTotalFee();
//}

//{
//   int lastId = DatabaseJobseeker.getLastId();
// ArrayList<Invoice> list = DatabaseInvoice.getInvoiceByJobseeker(lastId);
//         for(Invoice i : list)
//        i.setTotalFee();
// }

//Recruiter recruiter1 = new Recruiter(1,"Bryan","bryandariolc@gmail.com","081398558008",location1);
//Job job1 = new Job(1,"Senior Designer",recruiter1,200000,JobCategory.DataAnalyst);

//Jobseeker jobseeker1 = new Jobseeker(1,"Apeng","bryandariolc@gmail.com","asdas",new GregorianCalendar(2021, 3, 12));
        /*Jobseeker jobseeker2 = new Jobseeker(2,"Ando","ando@gmail.com","Asdasd123",2021, 12, 12);
        Jobseeker jobseeker3 = new Jobseeker(3,"Wilson","wilson@gmail.com","password123");
        
        jobseeker1.toString();
        System.out.println(jobseeker1.toString());
        jobseeker2.toString();
        System.out.println(jobseeker2.toString());
        jobseeker3.toString();
        System.out.println(jobseeker3.toString());
        
        jobseeker1.setEmail("erickrichardo@gmail.com");
        jobseeker1.setPassword("AsdAsd123");
        jobseeker1.toString();
        System.out.println(jobseeker1.toString());        
        */

//Calendar calendar1 = new GregorianCalendar();

// BankPayment bankpayment1 = new BankPayment(1, job1, jobseeker1, InvoiceStatus.Finished);
//bankpayment1.setDate(calendar1);
//BankPayment bankpayment2 = new BankPayment(2, job1, jobseeker1, InvoiceStatus.Finished, 100000);
//Bonus bonus1 = new Bonus(1, null, 50000, 25000, true);
//Bonus bonus2 = new Bonus(2, "test", 10000, 30000, true);
//Bonus bonus3 = new Bonus(3, "test", 60000, 30000, true);
//EwalletPayment ewalletpayment1 = new EwalletPayment(1, job1, jobseeker1, InvoiceStatus.Ongoing,bonus1);
//ewalletpayment1.setDate(calendar1);//EwalletPayment ewalletpayment2 = new EwalletPayment(2, job1, jobseeker1, InvoiceStatus.Ongoing,bonus2);
//EwalletPayment ewalletpayment3 = new EwalletPayment(3, job1, jobseeker1, InvoiceStatus.Ongoing,bonus3);
//bankpayment1.setTotalFee();
//bankpayment2.setTotalFee();

// bankpayment1.toString();
//System.out.println(bankpayment1.toString());
//bankpayment2.printData();


//ewalletpayment1.setTotalFee();
//ewalletpayment2.setTotalFee();
//ewalletpayment3.setTotalFee();

//ewalletpayment1.toString();
//System.out.println(ewalletpayment1.toString());
//ewalletpayment2.printData();
//ewalletpayment3.printData();
//Invoice invoice1 = new Invoice(1,job1.getId(),"1/20/2021",job1.getFee(),jobseeker1,PaymentType.BankPayment,InvoiceStatus.Ongoing);


//System.out.println("Nama Recruiter " + recruiter1.getName()); /** fungsi mencetak nama recruiter dengan aksesor get */
//recruiter1.setName("Ferlinda"); /** mengubah nama recruiter dengan mutator set */
//System.out.println("Nama Recruiter " + recruiter1.getName()); /** fungsi mencetak kembali nama recruiter dengan aksesor get */

//job1.printData(); /** Cetak nama job dengan memanggil method print data*/
//System.out.println(PaymentType.Bank);

//invoice1.printData(); /** Cetak nama job dengan memanggil method print data*/
//System.out.println(PaymentType.Bank);

//DatabaseJob.addJob(job1); /** memasukkan objek kelas job dan recruiter tanpa membuat databasenya*/
//DatabaseRecruiter.addRecruiter(recruiter1);


