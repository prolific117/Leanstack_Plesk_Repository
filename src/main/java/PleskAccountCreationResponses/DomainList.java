/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package PleskAccountCreationResponses;

import java.util.ArrayList;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;

/**
 *
 * @author olatunji.oduro
 */
@XmlAccessorType(XmlAccessType.FIELD) 
public class DomainList {
    
    @XmlElement(name="domain")
    ArrayList<domain> alldomain;

    public ArrayList<domain> getDomain() {
        return alldomain;
    }

    public void setDomains(ArrayList<domain> alldomain) {
        this.alldomain = alldomain;
    }
    
    public String toString(){
        return alldomain.size()+"";
    }
}
