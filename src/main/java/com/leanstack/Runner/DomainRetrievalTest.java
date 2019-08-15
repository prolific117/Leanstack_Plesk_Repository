/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.leanstack.Runner;

import com.leanstack.Plesk.AccountManager.SubscriptionRetrievalService;
import com.leanstack.Plesk.AccountManager.SubscriptionsRetrievalService;

/**
 *
 * @author olatunji.oduro
 */ 
public class DomainRetrievalTest {
   public static void main(String[] args) throws Exception{
        
        SubscriptionRetrievalService service = new SubscriptionRetrievalService("206.189.123.56","admin","Admin@Leanstack-123");
        service.getDomainData("testing.com");
                
        //System.out.print("Status is : " + res.getStatus() + " error is "+ res.getErrtext());
    }  
}
