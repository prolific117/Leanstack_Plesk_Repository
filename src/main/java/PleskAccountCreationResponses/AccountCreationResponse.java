/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PleskAccountCreationResponses;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author prolific
 */

@XmlRootElement(name="packet")
public class AccountCreationResponse {
    private Customer customer;  

    public Customer getCustomer() {
        return customer;
    }

    @XmlElement
    public void setCustomer(Customer customer) {
        this.customer = customer;
    }
    
}






