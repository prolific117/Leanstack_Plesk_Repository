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
public class SiteDataResponse {
    
    SiteData site;

    public SiteData getSite() {
        return site;
    }

    public void setSite(SiteData site) {
        this.site = site;
    }
    
    
}
