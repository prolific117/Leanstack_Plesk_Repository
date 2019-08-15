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
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author olatunji.oduro
 */
@XmlRootElement(name="property")
@XmlAccessorType (XmlAccessType.FIELD)
public class LimitsData {
    
    @XmlElement(name="limit")
    ArrayList<Limit> limits;

    public ArrayList<Limit> getLimits() {
        return limits;
    }

    public void setLimits(ArrayList<Limit> limits) {
        this.limits = limits;
    }

    String overuse;

    public String getOveruse() {
        return overuse;
    }

    public void setOveruse(String overuse) {
        this.overuse = overuse;
    }
    
    

    
}
