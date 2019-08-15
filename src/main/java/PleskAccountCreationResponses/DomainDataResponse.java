/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package PleskAccountCreationResponses;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author olatunji.oduro
 */
@XmlRootElement(name="packet")
@XmlAccessorType (XmlAccessType.FIELD)
public class DomainDataResponse {
    
    DomainWebspace webspace;

    public DomainWebspace getWebspace() {
        return webspace;
    }

    public void setWebspace(DomainWebspace webspace) {
        this.webspace = webspace;
    }
    
}
