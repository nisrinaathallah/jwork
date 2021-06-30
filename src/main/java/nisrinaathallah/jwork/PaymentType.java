/**
 * @author Nisrina Athallah - 1806148813
 * @version 27 - 06 -2021
 */

package nisrinaathallah.jwork;

/**
 * inisiasi enum
 */
public enum PaymentType
{
    BankPayment("Bank Payment"),
    EwalletPayment("E-Wallet Payment");

    private String paymenttype;

    PaymentType(String paymenttype){
        this.paymenttype = paymenttype;
    }

    /**
     * method untuk menghasilkan paymenttype
     */
    public String toString(){
        return paymenttype;
    }
}


