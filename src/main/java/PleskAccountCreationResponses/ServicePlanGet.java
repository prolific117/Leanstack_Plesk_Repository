/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package PleskAccountCreationResponses;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author olatunji.oduro
 */
@XmlRootElement(name="get")
public class ServicePlanGet {
    
    ServicePlanResult result;

    @XmlElement
    public ServicePlanResult getResult() {
        return result;
    }

    public void setResult(ServicePlanResult result) {
        this.result = result;
    }
    
    
}
