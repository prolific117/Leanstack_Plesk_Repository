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
 @XmlRootElement(name="set")
public class SubscriptionSet {
    private ResultR result;  

    public ResultR getResult() {
        return result;
    }

    public void setResult(ResultR result) {
        this.result = result;
    }

    
    
}
