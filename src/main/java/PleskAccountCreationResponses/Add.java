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
 * @author prolific
 */
 @XmlRootElement(name="add")
                     public class Add {
                         private Result result;  

                         public Result getResult() {
                             return result;
                         }

                         @XmlElement
                         public void setResult(Result result) {
                             this.result = result;
                         }
                         
                       
                     }
