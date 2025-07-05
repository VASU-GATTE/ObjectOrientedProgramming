package Serialization;

import lombok.AllArgsConstructor;
import lombok.ToString;

import java.io.Serializable;

@AllArgsConstructor
@ToString
public class ATMCard implements Serializable {
    String expDate;
    int cvv;
    String cardHolderName;
    long cardNumber;
    transient int pin=9999;

    public void cardDetails(){
        System.out.println("Holder Name : "+cardHolderName+"\nCard Number : "+cardNumber+"\nCard CVV : "+cvv+"\nExpiry Date : "+expDate+"\nPIN Number : "+pin);
    }
}
