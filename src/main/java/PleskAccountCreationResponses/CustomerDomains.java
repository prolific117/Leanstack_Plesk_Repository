/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package PleskAccountCreationResponses;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;

@XmlAccessorType(XmlAccessType.FIELD) 
public class CustomerDomains {

        @XmlElement(name="get-domain-list")
        DomainsList domainsList;

        public DomainsList getDomainsList() {
            return domainsList;
        }

        public void setDomainsList(DomainsList domainsList) {
            this.domainsList = domainsList;
        }
        
        
    }