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
public class SubscriptionRenewalResponse {
    
    private WebspaceR webspace;

    public WebspaceR getWebspace() {
        return webspace;
    }

    public void setWebspace(WebspaceR webspace) {
        this.webspace = webspace;
    }
    
    
}
