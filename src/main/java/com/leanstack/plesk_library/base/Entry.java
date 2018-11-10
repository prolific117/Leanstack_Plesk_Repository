/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.leanstack.plesk_library.base;

import static com.oracle.jrockit.jfr.ContentType.Address;
import java.util.HashMap;
import java.util.Map;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author prolific
 */
@XmlRootElement
public class Entry{

    private Map<String, Value> valueMap = new HashMap<String, Value>();

    public Map<String, Value> getValueMap() {
        return valueMap;
    }

    public void setValueMap(Map<String, Value> valueMap) {
        this.valueMap = valueMap;
    }

}


class Value {

    private String value;

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

}