/**
 * @author: Nisrina Athallah - 1806148813
 * @version: Modul 8 - Case Study - 20 Mei 2021
 */

package nisrinaathallah.jwork;

public enum InvoiceStatus
{
    Ongoing("Ongoing"),
    Finished("Finished"),
    Cancelled("Cancelled");

    private String text;

    InvoiceStatus(String text){
        this.text = text;
    }

    @Override
    public String toString(){
        return text;
    }
}
