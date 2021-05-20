/**
 * @author: Nisrina Athallah - 1806148813
 * @version: Modul 8 - Case Study - 20 Mei 2021
 */

package nisrinaathallah.jwork;

import java.util.Calendar;
import java.util.Date;
import java.util.regex.*;
import java.util.GregorianCalendar;
import java.text.SimpleDateFormat;

public class Jobseeker
{
    /**
     deklarasi variabel
     */
    private int id; //deklarasi variabel int
    private String name; //deklarasi variabel String
    private String email; //deklarasi variabel String
    private String password; //deklarasi variabel String
    public Calendar joinDate; //deklarasi variabel Calendar

    /**
     * constructor dari jobseeker
     * @param id dari jobseeker
     * @param nama dari jobseeker
     * @param email dari jobseeker
     * @param password dari jobseeker
     * @param joindate dari jobseeker
     */

    public Jobseeker(int id, String name, String email, String password, Calendar joinDate){
        this.id = id;
        this.name = name;
        this.joinDate = joinDate;
        this.setEmail(email);
        this.setPassword(password);
    }

    public Jobseeker(int id, String name, String email, String password, int year, int month, int dayOfMonth){
        this.id = id;
        this.name = name;
        this.setEmail(email);
        this.setPassword(password);
        this.setJoinDate(year, month, dayOfMonth);
    }

    public Jobseeker(int id, String name, String email, String password){
        this.id = id;
        this.name = name;
        this.joinDate = new GregorianCalendar();
        this.setEmail(email);
        this.setPassword(password);
    }

    /**
     * getter id dari jobseeker
     * @return id dari jobseeker
     */

    public int getId(){
        return id;
    }

    /**
     * getter nama dari jobseeker
     * @return name dari jobseeker
     */

    public String getName(){
        return name;
    }

    /**
     * getter email dari jobseeker
     * @return email dari jobseeker
     */

    public String getEmail(){
        return email;
    }

    /**
     * getter password dari jobseeker
     * @return password dari jobseeker
     */

    public String getPassword(){
        return password;
    }

    /**
     * getter tanggal masuk dari jobseeker
     * @return joindate dari jobseeker
     */

    public Calendar getJoinDate(){
        return joinDate;
    }

    /**
     * setter id dari jobseeker
     * @param id dari jobseeker
     */

    public void setId(int id){
        this.id = id;
    }

    /**
     * setter nama dari jobseeker
     * @param name dari jobseeker
     */

    public void setName(String name){
        this.name = name;
    }

    /**
     * setter email dari jobseeker
     * @param email dari jobseeker
     */

    public void setEmail(String email){
        Pattern x = Pattern.compile("^(?!.*([.])\1)[^.][a-zA-Z0-9.&*_~]+@[^-. ][a-zA-Z0-9-.&*_~]+(?:\\.[a-zA-Z0-9-]+)*");
        Matcher y = x.matcher(email);
        if (y.matches()){
            this.email = email;
        }else{
            this.email = "";
        }
    }

    /**
     * setter password dari jobseeker
     * @param password dari jobseeker
     */

    public void setPassword(String password){
        Pattern x = Pattern.compile("^(?=.*[a-z])(?=.*[A-Z])(?=.*\\d)[a-zA-Z\\d]{6,}$");
        Matcher y = x.matcher(password);
        if (y.matches()){
            this.password = password;
        }else{
            this.password = "";
        }
    }

    /**
     * setter tanggal masuk dari jobseeker
     * @param joindate dari jobseeker
     */

    public void setJoinDate(Calendar joinDate){
        this.joinDate = joinDate;
    }

    public void setJoinDate(int year, int month, int dayOfMonth){
        this.joinDate = new GregorianCalendar(year, month, dayOfMonth);
    }

    public String toString(){
        String joindate = "";
        String pattern = "dd-MMMM-yyyy";
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat(pattern);
        if(joinDate != null){
            Date date = joinDate.getTime();
            joindate = simpleDateFormat.format(date);
        }
        if(joinDate == null){
        }
        return "Id = " + id
                + "\nNama = " + name
                + "\nEmail = " + email
                + "\nPassword = " + password
                + "\nJoin Date = " + joindate;
    }
    //public void printData(){
    //System.out.println("Nama Jobseeker: " + getName());
    //}
}
