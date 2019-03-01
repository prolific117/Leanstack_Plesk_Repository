/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.leanstack.Runner;

import PleskAccountCreationResponses.Result;
import com.leanstack.Plesk.AccountManager.HostingUpgradeService;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 *
 * @author prolific
 */
public class HostingUpgradeTest {
    
    public static void main(String[] args) throws Exception{
        
        HostingUpgradeService service = new HostingUpgradeService("45.77.89.231","admin","Lean@stack-123");
        Result res = service.upgradeHosting("47", "adedamolaelush.com", "Small Teams Monthly");
        System.out.print("Status is : " + res.getStatus() + " error is "+ res.getErrtext());
    }
}
