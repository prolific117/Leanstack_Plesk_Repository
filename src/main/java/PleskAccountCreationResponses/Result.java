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
     @XmlRootElement(name="result")
    public class Result {

        private String status;
        private String errcode;
        private String errtext;
        private String id;
        private String guid;

        public String getStatus() {
            return status;
        }

        @XmlElement
        public void setStatus(String status) {
            this.status = status;
        }

        public String getErrcode() {
            return errcode;
        }

        @XmlElement
        public void setErrcode(String errcode) {
            this.errcode = errcode;
        }

        public String getErrtext() {
            return errtext;
        }

        @XmlElement
        public void setErrtext(String errtext) {
            this.errtext = errtext;
        }

        public String getId() {
            return id;
        }

        @XmlElement
        public void setId(String id) {
            this.id = id;
        }

        public String getGuid() {
            return guid;
        }

        @XmlElement
        public void setGuid(String guid) {
            this.guid = guid;
        }



    }