/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package PleskAccountCreationResponses;

import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author olatunji.oduro
 */
@XmlRootElement(name="packet")
public class AccountDeletionResponse {
     private CustomerDel customer;  

    public CustomerDel getCustomer() {
        return customer;
    }

    public void setCustomer(CustomerDel customer) {
        this.customer = customer;
    }
}
