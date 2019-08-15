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
public class SiteInfo {
    String cr_date;
   
    @XmlElement(name="webspace-id")
    String hostingid;

    public String getCr_date() {
        return cr_date;
    }

    public void setCr_date(String cr_date) {
        this.cr_date = cr_date;
    }

    public String getHostingid() {
        return hostingid;
    }

    public void setHostingid(String hostingid) {
        this.hostingid = hostingid;
    }
}
