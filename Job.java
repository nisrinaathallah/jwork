/**
 * @author: Nisrina Athallah - 1806148813
 * @version: Modul 8 - Case Study - 20 Mei 2021
 */

package nisrinaathallah.jwork;

/**
 * deklarasi class
 */
public class Job
{
    /**
     deklarasi variabel
     */
    private int id; //deklarasi variabel int
    private String name; //deklarasi variabel String
    private Recruiter recruiter;
    private int fee; //deklarasi variabel int
    private JobCategory category;

    /**
     * constructor dari job
     * @param id dari job
     * @param nama dari job
     * @param perekrut dari recruiter
     * @param fee dari job
     * @param kategori dari job
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
        return id;
    }

    /**
     * getter nama job
     * @return name job
     */

    public String getName(){
        return name;
    }

    /**
     * getter fee job
     * @return fee job
     */

    public int getFee(){
        return fee;
    }

    /**
     * getter kategori job
     * @return category job
     */

    public JobCategory getCategory(){
        return category;
    }

    /**
     * setter rekruiter job
     * @param recruiter job
     */

    public Recruiter getRecruiter(){
        return recruiter;
    }


    /**
     * setter id job
     * @param id job
     */

    public void setId(int id){
        this.id = id;
    }

    /**
     * setter nama job
     * @param name job
     */

    public void setName(String name){
        this.name = name;
    }

    /**
     * setter rekruiter job
     * @param recruiter job
     */

    public void setRecruiter(Recruiter recruiter){
        this.recruiter = recruiter;
    }

    /**
     * setter fee job
     * @param fee job
     */

    public void setFee(int fee){
        this.fee = fee;
    }

    /**
     * setter kategori job
     * @param category job
     */

    public void setCategory(JobCategory category){
        this.category = category;
    }

    /**
     * Menampilkan data Job 
     * Job berisi ID, name, recruiter, city, fee dan category
     */

    public String toString(){
        return "Id = " + id
                + "\nNama = " + name
                + "\nRecruiter = " + recruiter.getName()
                + "\nCity = " + recruiter.getLocation().getCity()
                + "\nFee =  " + fee
                + "\nCategory = " + category;
    }

    //public void printData(){
    // System.out.println("===========Job==========\n" +
    // "ID: " + id +
    //"\nName: " + name +
    //"\nRecruiter: " + recruiter.getName() +
    //"\nCity: " + recruiter.getLocation().getCity() +
    //"\nFee: " + fee +
    //"\nCategory: " + category.toString());
    //}
}