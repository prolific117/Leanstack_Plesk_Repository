/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.leanstack.Runner;

import PleskAccountCreationResponses.Result;
import com.leanstack.Plesk.AccountManager.HostingUpgradeService;
import com.leanstack.Plesk.AccountManager.PlanRetrievalService;

/**
 *
 * @author olatunji.oduro
 */
public class PlanRetrievalTest {
    
     public static void main(String[] args) throws Exception{
        
        PlanRetrievalService service = new PlanRetrievalService("206.189.123.56","admin","Admin@Leanstack-123");
        service.getPlan("7");
        //System.out.print("Status is : " + res.getStatus() + " error is "+ res.getErrtext());
    }
}
