/**
 * @author: Nisrina Athallah - 1806148813
 * @version: Modul 8 - Case Study - 20 Mei 2021
 */

package nisrinaathallah.jwork;

public class Recruiter
{
    /**
     deklarasi variabel
     */
    private int id; //deklarasi variabel int
    private String name; //deklarasi variabel String
    private String email; //deklarasi variabel String
    private String phoneNumber; //deklarasi variabel String
    private Location location;

    /**
     * constructor dari recruiter
     * @param id dari recruiter
     * @param nama dari recruiter
     * @param email dari recruiter
     * @param phoneNumber dari recruiter
     * @param lokasi dari location
     */

    public Recruiter(int id, String name, String email, String phoneNumber, Location location){
        this.id = id;
        this.name = name;
        this.email = email;
        this.phoneNumber = phoneNumber;
        this.location = location;
    }

    /**
     * getter id dari recruiter
     * @return id dari recruiter
     */

    public int getId(){
        return id;
    }

    /**
     * getter nama dari recruiter
     * @return name dari recruiter
     */

    public String getName(){
        return name;
    }

    /**
     * getter email dari recruiter
     * @return email dari recruiter
     */

    public String getEmail(){
        return email;
    }

    /**
     * getter nomor telepon dari recruiter
     * @return phonenumber dari recruiter
     */

    public String getPhoneNumber(){
        return phoneNumber;
    }

    /**
     * getter lokasi dari recruiter
     * @return location dari recruiter
     */

    public Location getLocation(){
        return location;
    }

    /**
     * setter id recruiter
     * @param id recruiter
     */

    public void setId(int id){
        this.id = id;
    }

    /**
     * setter nama recruiter
     * @param name recruiter
     */

    public void setName(String name){
        this.name = name;
    }

    /**
     * setter email recruiter
     * @param email recruiter
     */

    public void setEmail(String Email){
        this.email = email;
    }

    /**
     * setter nomor telepon recruiter
     * @param phonenumber recruiter
     */

    public void setPhoneNumber(String PhoneNumber){
        this.phoneNumber = phoneNumber;
    }

    /**
     * setter lokasi recruiter
     * @param location recruiter
     */

    public void setLocation(Location location){
        this.location= location;
    }

    public String toString(){
        return "Id = " + id
                + "\nNama = " + name
                + "\nPhoneNumber = " + phoneNumber
                + "\nLocation = " + location.toString();
    }

    /**
     * menampilkan nama perekrut dari recruiter
     */

    //public void printData(){
    //System.out.println("Nama Perekrut: " + getName());
    //}
}