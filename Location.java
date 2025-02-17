/**
 * @author: Nisrina Athallah - 1806148813
 * @version: Modul 8 - Case Study - 20 Mei 2021
 */

package nisrinaathallah.jwork;

public class Location
{
    /**
     deklarasi variabel
     */
    private String province; //deklarasi variabel String
    private String city; //deklarasi variabel String
    private String description; //deklarasi variabel String

    /**
     * constructor dari location
     * @param province: provinsi dari location
     * @param city: kota dari location
     * @param description: deskripsi dari location
     */

    public Location(String province, String city, String description)
    {
        this.province = province;
        this.city = city;
        this.description = description;
    }

    /**
     * getter provinsi dari location
     * @return province dari location
     */

    public String getProvince()
    {
        return province;
    }

    /**
     * getter kota dari location
     * @return city dari location
     */

    public String getCity()
    {
        return city;
    }

    /**
     * getter deskripsi dari location
     * @return description dari location
     */

    public String getDescription(){
        return description;
    }

    /**
     * setter provinsi location
     * @return province dari location
     */

    public void setProvince(String province)
    {
        this.province = province;
    }

    /**
     * setter kota location
     * @param city location
     */

    public void setCity(String city)
    {
        this.city = city;
    }

    /**
     * setter deskripsi location
     * @param description location
     */

    public void setDescription(String description)
    {
        this.description = city;
    }

    /**
     * menampilkan nama provinsi dari location
     */

    public String toString(){
        return "Province = " + province
                + "\nCity = " + city
                + "\nDescription = " + description;
    }

    //public void printData(){
    //System.out.println("===Location===\n" +
    //"Provinsi: " + province +
    //"\nCity: " + city +
    //"\nDeskripsi: " + description);
    //}
}
