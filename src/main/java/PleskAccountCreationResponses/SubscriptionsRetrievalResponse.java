/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package PleskAccountCreationResponses;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author olatunji.oduro
 */
@XmlRootElement(name="packet")
@XmlAccessorType (XmlAccessType.FIELD)
public class SubscriptionsRetrievalResponse {
    
    CustomerDomains customer;

    public CustomerDomains getCustomer() {
        return customer;
    }

    public void setCustomer(CustomerDomains customer) {
        this.customer = customer;
    }

    
    

   

    
}

