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

@XmlRootElement(name="webspace")
public class Webspace {
   private Add add;  

   public Add getAdd() {
       return add;
   }

   @XmlElement
   public void setAdd(Add add) {
       this.add = add;
   }


 } 

