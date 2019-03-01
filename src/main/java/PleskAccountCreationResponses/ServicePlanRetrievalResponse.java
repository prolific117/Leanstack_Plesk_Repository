/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package PleskAccountCreationResponses;

import com.thoughtworks.xstream.annotations.XStreamAlias;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author olatunji.oduro
 */
@XmlRootElement(name="packet")
@XmlAccessorType (XmlAccessType.FIELD)
public class ServicePlanRetrievalResponse {
    
    @XmlElement(name="service-plan")
    ServicePlan serviceplan;

    public ServicePlan getServiceplan() {
        return serviceplan;
    }

    public void setServiceplan(ServicePlan serviceplan) {
        this.serviceplan = serviceplan;
    }
    
    
}
