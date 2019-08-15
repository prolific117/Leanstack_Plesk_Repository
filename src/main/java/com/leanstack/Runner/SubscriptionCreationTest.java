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

        Date   date = format.parse ( "2019-12-31" );  

        HostingCreationService service = new HostingCreationService("206.189.123.56","admin","Admin@Leanstack-123");
        Result res = service.createHosting("36", "adeddamolaeluhi.com", date ,  "Small Teams Monthly", "MONTHLY", 3,"baggbaroosa", "rrtt!33123ei4oiio");
        System.out.print("Status is : " + res.getStatus() + " error is "+ res.getErrtext());
    }
}
