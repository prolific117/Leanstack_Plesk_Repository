/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PleskAccountCreationResponses;

import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author prolific
 */
@XmlRootElement(name="packet")
public class SubscriptionCreationResponse {
    
    private Webspace webspace;

    public Webspace getWebspace() {
        return webspace;
    }

    public void setWebspace(Webspace webspace) {
        this.webspace = webspace;
    }
    
    
}
