/**
 * @author: Nisrina Athallah - 1806148813
 * @version: Modul 8 - Case Study - 20 Mei 2021
 */
public class jwork {

    public static void main(String[] args) {
        Location loc1 = new Location("Jakarta", "Jakarta Timur", "Pulomas");
        Location loc2 = new Location("Jawa Barat", "Bandung", "Asal daerah");
        Location loc3 = new Location("Sumatera Barat", "Padang", "Suku");

        DatabaseRecruiter.addRecruiter(new Recruiter(DatabaseRecruiter.getLastId()+1, "Nisrina", "nisrina9@gmail.com", "08123456789", loc1));
        DatabaseRecruiter.addRecruiter(new Recruiter(DatabaseRecruiter.getLastId()+1, "Ailsa", "ailsa123@gmail.com", "081111111111", loc2));
        DatabaseRecruiter.addRecruiter(new Recruiter(DatabaseRecruiter.getLastId()+1, "Sherly", "sherly15@gmail.com", "082222222222", loc3));

        try{
            DatabaseJob.addJob(new Job(DatabaseJob.getLastId()+1, "Nisrina", DatabaseRecruiter.getRecruiterById(1), 5, JobCategory.DataScientist));
        }catch (RecruiterNotFoundException error){
            System.out.println(error.getMessage());
        }
        try{
            DatabaseJob.addJob(new Job(DatabaseJob.getLastId()+1, "Nisrina2", DatabaseRecruiter.getRecruiterById(2), 50, JobCategory.DataAnalyst));
        }catch (RecruiterNotFoundException error){
            System.out.println(error.getMessage());
        }
        try{
            DatabaseJob.addJob(new Job(DatabaseJob.getLastId()+1, "Nisrina3", DatabaseRecruiter.getRecruiterById(3), 500, JobCategory.BackEnd));
        }catch (RecruiterNotFoundException error){
            System.out.println(error.getMessage());
        }
        try{
            DatabaseJob.addJob(new Job(DatabaseJob.getLastId()+1, "Nisrina4", DatabaseRecruiter.getRecruiterById(3), 5000, JobCategory.FrontEnd));
        }catch (RecruiterNotFoundException error){
            System.out.println(error.getMessage());
        }

        SpringApplication.run(jwork.class, args);
    }

}



//ewalletpayment1.printData();
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
