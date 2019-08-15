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
@XmlAccessorType(XmlAccessType.FIELD) 
public class DomainsResult {
         
        String status;
        
        @XmlElement(name="filter-id")
        String filter;
        
        String id;
        
        @XmlElement(name="domains")
        DomainList customerDomains;

        public String getFilter() {
            return filter;
        }

        public void setFilter(String filter) {
            this.filter = filter;
        }

        public String getStatus() {
            return status;
        }

        public void setStatus(String status) {
            this.status = status;
        }

        public String getId() {
            return id;
        }

        public void setId(String id) {
            this.id = id;
        }

        public DomainList getCustomerDomains() {
            return customerDomains;
        }

        public void setCustomerDomains(DomainList customerDomains) {
            this.customerDomains = customerDomains;
        }

        
    }
