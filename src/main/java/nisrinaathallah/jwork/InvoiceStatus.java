/**
 * @author Nisrina Athallah - 1806148813
 * @version 27 - 06 -2021
 */

package nisrinaathallah.jwork;

//enum pada status invoice//
public enum InvoiceStatus
{
    Ongoing("Ongoing"),
    Finished("Finished"),
    Cancelled("Cancelled");

    private String text;

    /**
     * constructor pada enum
     * @param text dari invoice status
     */
    InvoiceStatus(String text){
        this.text = text;
    }

    /**
     * method untuk menghasilkan status invoice
     */
    @Override
    public String toString(){
        return text;
    }
}
