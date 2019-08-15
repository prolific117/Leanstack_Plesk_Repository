/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package PleskAccountCreationResponses;

import java.util.ArrayList;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author olatunji.oduro
 */
@XmlRootElement(name="property")
@XmlAccessorType (XmlAccessType.FIELD)
public class HostingData {
    
    ArrayList<Properties> vrt_hst;

    public ArrayList<Properties> getVrt_hst() {
        return vrt_hst;
    }

    public void setVrt_hst(ArrayList<Properties> vrt_hst) {
        this.vrt_hst = vrt_hst;
    }

}
