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
 @XmlRootElement(name="create_session")
public class CreateSession {
    SessionResult result;

    public SessionResult getResult() {
        return result;
    }

    public void setResult(SessionResult result) {
        this.result = result;
    }
    
}
