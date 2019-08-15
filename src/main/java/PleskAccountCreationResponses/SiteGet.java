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
@XmlRootElement(name="get")
@XmlAccessorType (XmlAccessType.FIELD)
public class SiteGet {
    
    SiteResult result;

    public SiteResult getResult() {
        return result;
    }

    public void setResult(SiteResult result) {
        this.result = result;
    }
    
    
}
