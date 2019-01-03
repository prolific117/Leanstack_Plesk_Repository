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

@XmlRootElement(name="webspace")
public class WebspaceR {
   private SubscriptionSet set;  

    public SubscriptionSet getSet() {
        return set;
    }

    public void setSet(SubscriptionSet set) {
        this.set = set;
    }
 } 

