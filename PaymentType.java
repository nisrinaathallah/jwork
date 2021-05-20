/**
 * @author: Nisrina Athallah - 1806148813
 * @version: Modul 8 - Case Study - 20 Mei 2021
 */

package nisrinaathallah.jwork;

public enum PaymentType {
    BankPayment("Bank Payment"),
    EwalletPayment("E-Wallet Payment");

    private String paymenttype;

    PaymentType(String PaymentType){
        this.paymenttype = paymenttype;
    }

    public String toString(){
        return paymenttype;
    }


}
    
  

