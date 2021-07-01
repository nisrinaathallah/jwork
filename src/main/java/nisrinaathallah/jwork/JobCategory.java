/**
 * @author Nisrina Athallah - 1806148813
 * @version 27 - 06 -2021
 */

package nisrinaathallah.jwork;

/**
 * inisiasi enum
 */
public enum JobCategory
{
    WebDeveloper("Web Developer"),
    FrontEnd("Front End"),
    BackEnd("Back End"),
    UI("UI"),
    UX("UX"),
    Devops("Devops"),
    DataScientist("Data Scientist"),
    DataAnalyst("Data Analyst");

    private String text;

    /**
     * insiasi jenis tipe data Job Category
     * @param text untuk kategori job
     */
    JobCategory(String text){
        this.text = text;
    }

    /**
     * method menampilkan kategori
      * @return text
     */
    public String toString(){
        return text;
    }
}

