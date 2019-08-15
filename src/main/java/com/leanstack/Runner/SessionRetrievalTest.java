/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.leanstack.Runner;

import com.leanstack.Plesk.AccountManager.SessionRetrievalService;
import com.leanstack.Plesk.AccountManager.SubscriptionRetrievalService;

/**
 *
 * @author olatunji.oduro
 */
public class SessionRetrievalTest {
     public static void main(String[] args) throws Exception{
        
        SessionRetrievalService service = new SessionRetrievalService("206.189.123.56","admin","Admin@Leanstack-123");
        service.getSession("palindrome", "197.255.164.53");
                
        //System.out.print("Status is : " + res.getStatus() + " error is "+ res.getErrtext());
    }  
}
