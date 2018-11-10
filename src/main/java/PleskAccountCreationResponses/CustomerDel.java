/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package PleskAccountCreationResponses;

import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author olatunji.oduro
 */
@XmlRootElement(name="customer")
public class CustomerDel {
    private Del del;

    public Del getDel() {
        return del;
    }

    public void setDel(Del del) {
        this.del = del;
    }
    
}
