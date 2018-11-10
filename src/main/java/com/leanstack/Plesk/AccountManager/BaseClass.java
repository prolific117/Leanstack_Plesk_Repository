/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.leanstack.Plesk.AccountManager;

import com.leanstack.plesk_library.base.PleskApiClient;

/**
 *
 * @author prolific
 */
public class BaseClass {
    
    private String KA_SERVICE;
    private String REMOTE_API_LOGIN;
    private String REMOTE_API_PASSWORD;
    private PleskApiClient client;
 
    public BaseClass(String service, String login, String password){
        this.KA_SERVICE = service;
        this.REMOTE_API_LOGIN = login;
        this.REMOTE_API_PASSWORD = password;
        
        this.client = runConfigurations(service);
        
    }

    public String getKA_SERVICE() {
        return KA_SERVICE;
    }

    public void setKA_SERVICE(String KA_SERVICE) {
        this.KA_SERVICE = KA_SERVICE;
    }

    public String getREMOTE_API_LOGIN() {
        return REMOTE_API_LOGIN;
    }

    public void setREMOTE_API_LOGIN(String REMOTE_API_LOGIN) {
        this.REMOTE_API_LOGIN = REMOTE_API_LOGIN;
    }

    public String getREMOTE_API_PASSWORD() {
        return REMOTE_API_PASSWORD;
    }

    public void setREMOTE_API_PASSWORD(String REMOTE_API_PASSWORD) {
        this.REMOTE_API_PASSWORD = REMOTE_API_PASSWORD;
    }

    public PleskApiClient getClient() {
        return client;
    }

    public void setClient(PleskApiClient client) {
        this.client = client;
    }
    
    
    
     private PleskApiClient runConfigurations(String host){
        PleskApiClient client = new PleskApiClient(host);
        client.setCredentials(this.REMOTE_API_LOGIN, this.REMOTE_API_PASSWORD);
        
        return client;
    }
}
