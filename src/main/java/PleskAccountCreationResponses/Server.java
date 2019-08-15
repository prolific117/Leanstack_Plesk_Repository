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
 @XmlRootElement(name="server")
public class Server {
    CreateSession create_session;

    public CreateSession getCreate_session() {
        return create_session;
    }

    public void setCreate_session(CreateSession create_session) {
        this.create_session = create_session;
    }
    
    
}
