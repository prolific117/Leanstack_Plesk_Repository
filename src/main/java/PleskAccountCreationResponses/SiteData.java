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
@XmlRootElement(name="site")
@XmlAccessorType (XmlAccessType.FIELD)
public class SiteData {
    
    SiteGet get;

    public SiteGet getGet() {
        return get;
    }

    public void setGet(SiteGet get) {
        this.get = get;
    }
}
