/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.leanstack.Runner;

import PleskAccountCreationResponses.Result;
import com.leanstack.Plesk.AccountManager.HostingCreationService;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 *
 * @author prolific
 */
public class SubscriptionCreationTest {
    
    public static void main(String[] args) throws Exception{
        
        SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd");

        Date   date       = format.parse ( "2018-12-31" );  

        HostingCreationService service = new HostingCreationService("45.77.89.231","admin","Lean@stack-123");
        Result res = service.createHosting("47", "adedamolaelush.com", date ,  "Small Teams Monthly", "MONTHLY", 3);
        System.out.print("Status is : " + res.getStatus() + " error is "+ res.getErrtext());
    }
}
