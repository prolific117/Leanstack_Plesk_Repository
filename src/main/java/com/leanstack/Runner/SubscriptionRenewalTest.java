/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.leanstack.Runner;

import PleskAccountCreationResponses.Result;
import PleskAccountCreationResponses.ResultR;
import com.leanstack.Plesk.AccountManager.HostingCreationService;
import com.leanstack.Plesk.AccountManager.HostingRenewalService;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 *
 * @author olatunji.oduro
 */
public class SubscriptionRenewalTest {
    
     public static void main(String[] args) throws Exception{
        
        SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd");

        Date date  = format.parse ("2019-01-01" );  

        HostingRenewalService service = new HostingRenewalService("45.77.89.231","admin","Lean@stack-123");
        ResultR res = service.renewHosting(date, "adedamolaelush.com", "MONTHLY", 5);
        System.out.print("Status is : " + res.getStatus() + " error is "+ res.getErrtext());
    }
}
