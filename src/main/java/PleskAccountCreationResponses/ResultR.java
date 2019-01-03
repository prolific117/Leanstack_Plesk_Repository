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
@XmlRootElement(name="result")
public class ResultR {
    private String status;
    private String errtext;

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getErrtext() {
        return errtext;
    }

    public void setErrtext(String errtext) {
        this.errtext = errtext;
    }
    
    
}
