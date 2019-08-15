/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.leanstack.Runner;

import PleskAccountCreationResponses.domain;
import PleskAccountCreationResponses.DomainsResult;
import com.leanstack.Plesk.AccountManager.PlanRetrievalService;
import com.leanstack.Plesk.AccountManager.SubscriptionsRetrievalService;

/**
 *
 * @author olatunji.oduro
 */
public class DomainsRetrievalTest {
    public static void main(String[] args) throws Exception{
        
        SubscriptionsRetrievalService service = new SubscriptionsRetrievalService("206.189.123.56","admin","Admin@Leanstack-123");
        service.getDomains("19");
        //for(Domain domain : result.getDomains()){
          //System.out.print(domain.getName());
        //}
        //System.out.print("Status is : " + service.getStatus() + " error is "+ res.getErrtext());
    }
}
