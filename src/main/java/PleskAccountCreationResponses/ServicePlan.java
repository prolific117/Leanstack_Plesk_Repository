/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package PleskAccountCreationResponses;

import com.thoughtworks.xstream.annotations.XStreamAlias;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author olatunji.oduro
 */
public class ServicePlan {
    
    ServicePlanGet get;

    public ServicePlanGet getGet() {
        return get;
    }

    public void setGet(ServicePlanGet get) {
        this.get = get;
    }
   
   
}
