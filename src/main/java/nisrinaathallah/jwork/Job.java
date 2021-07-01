package nisrinaathallah.jwork;
/**
 * @author Nisrina Athallah - 1806148813
 * @version 27 - 06 -2021
 */
public class Job /** inisiasi class */
{
    private int id; /** inisiasi variabel */
private String name;
    private Recruiter recruiter;
    private int fee;
    private JobCategory category;
    /**
     * constructor
     * @param id id pada job
     * @param name nama pekerjaan
     * @param recruiter objek recruiter pada job
     * @param fee jumlah gaji dari job
     * @param category kategori dari job
     */
    public Job(int id, String name, Recruiter recruiter, int fee, JobCategory category){
        this.id = id;
        this.name = name;
        this.recruiter = recruiter;
        this.fee = fee;
        this.category = category;
    }
    /**
     * getter id dari job
     * @return id dari job
     */
    public int getId(){
        return this.id;
    }
    /**
     * getter nama pekerjaan dari job
     * @return nama dari job
     */
    public String getName(){
        return this.name;
    }
    /**
     * getter objek recruiter dari job
     * @return objek recruiter dari job
     */
    public Recruiter getRecruiter(){
        return this.recruiter;
    }
    /**
     * getter jumlah gaji dari job
     * @return jumlah gaji dari job
     */
    public int getFee(){
        return this.fee;
    }
    /**
     * getter kategori dari job
     * @return kategori dari job
     */
    public JobCategory getCategory(){
        return this.category;
    }
    /**
     * setter id dari job
     * @param id dari job
     */
    public void setId(int id){
        this.id = id;
    }
    /**
     * setter nama pekerjaan dari job
     * @param name dari job
     */
    public void setName(String name){
        this.name = name;
    }
    /**
     * setter jumlah gaji dari job
     * @param fee dari job
     */
    public void setFee(int fee){
        this.fee = fee;
    }
    /**
     * setter objek recruiter dari job
     * @param recruiter dari job
     */
    public void setRecruiter(Recruiter recruiter){
        this.recruiter = recruiter;
    }
    /**
     * setter kategori dari job
     * @param category dari job
     */
    public void setCategory(JobCategory category){
        this.category = category;
    }
    /**
     * method untuk print nama dari job
     * outputnya adalah id, nama pekerjaan, nama perekrut, nama kota, jumlah gaji, dan kategori
     */
    public String toString(){
        return "Id = " + id +
                "\nName = " + name +
                "\nRecruiter = " + recruiter.getName() +
                "\nCity = " + recruiter.getLocation().getCity() +
                "\nFee = " + fee +
                "\nCategory = " + category;
    }

    //public void printData(){
    //   System.out.println("==================JOB==================");
    //   System.out.println("ID :" + id);
    //   System.out.println("Name :" + name);
    //   System.out.println("Recruiter :" + recruiter.getName());
    //   System.out.println("City :" + recruiter.getLocation().getCity());
    //   System.out.println("Fee :" + fee);
    //   System.out.println("Category :" + category);
}
