package nisrinaathallah.jwork;
/**
 * @author Nisrina Athallah - 1806148813
 * @version 27 - 06 -2021
 */
public class Recruiter /** inisiasi class */
{
    private int id; /** inisiasi variabel */
private String name;
    private String email;
    private String phoneNumber;
    private Location location;
    /**
     * constructor
     * @param id id pada recruiter
     * @param name nama recruiter
     * @param email email recruiter
     * @param phoneNumber nomor telepon dari recruiter
     * @param location objek location dari recruiter
     */
    public Recruiter(int id,String name, String email, String phoneNumber,Location location){
        this.id = id;
        this.name = name;
        this.email = email;
        this.phoneNumber = phoneNumber;
        this.location = location;
    }
    /**
     * getter id pada recruiter
     * @return id pada recruiter
     */
    public int getId(){
        return this.id;
    }
    /**
     * getter nama perekrut pada recruiter
     * @return nama recruiter
     */
    public String getName(){
        return this.name;
    }
    /**
     * getter email perekrut pada recruiter
     * @return email recruiter
     */
    public String getEmail(){
        return this.email;
    }
    /**
     * getter nomor telepon dari recruiter
     * @return nomor telepon
     */
    public String getPhoneNumber(){
        return this.phoneNumber;
    }
    /**
     * getter location dari recruiter
     * @return objek location
     */
    public Location getLocation(){
        return this.location;
    }
    /**
     * setter id dari recruiter
     * @param id pada Recruiter
     */
    public void setId(int id){
        this.id = id;
    }
    /**
     * setter nama perekrut dari recruiter
     * @param name pada Recruiter
     */
    public void setName(String name){
        this.name = name;
    }
    /**
     * setter email perekrut dari recruiter
     * @param Email pada Recruiter
     */
    public void setEmail(String Email){
        this.email = email;
    }
    /**
     * setter nomor telepon dari recruiter
     * @param phoneNumber pada Recruiter
     */
    public void setPhoneNumber(String phoneNumber){
        this.phoneNumber = phoneNumber;
    }
    /**
     * setter objek location dari recruiter
     * @param location pada Recruiter
     */
    public void setLocation(Location location){
        this.location = location;
    }


    /**
     * method untuk menghasilkan informasi recruiter
     * @return toString
     */
    public String toString(){
        return "Id = " + id +
                "\nName = " + name +
                "\nEmail = " + email +
                "\nPhone = " + phoneNumber +
                "\nCity = " + location.getCity() ;
    }
/**
 * method untuk print nama dari recruiter
 * outputnya adalah id, nama, email, nomor telepon, dan kota perekrut
 */
    //public void printData(){
    // System.out.println("==== Recruiter ====");
    // System.out.println("Id: " + getId());
    // System.out.println("Name: " + getName());
    // System.out.println("Email: " + getEmail());
    // System.out.println("Phone: " + getPhoneNumber());
    // System.out.println("City: " + location.getCity());
}

