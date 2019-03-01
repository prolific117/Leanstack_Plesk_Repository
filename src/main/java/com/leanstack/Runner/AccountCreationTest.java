/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.leanstack.Runner;

import PleskAccountCreationResponses.Result;
import com.leanstack.Plesk.AccountManager.AccountCreationService;
import com.leanstack.Plesk.AccountManager.HostingCreationService;

/**
 *
 * @author prolific
 */
public class AccountCreationTest {
    
    public static void main(String[] args) throws Exception{
        AccountCreationService service = new AccountCreationService("206.189.123.56","admin","Admin@Leanstack-123");
        Result res = service.createCustomerAccount("TTeej", "thethetunjicoe","theylll",  "Monthly1@4", "prolificeffects@mail.com");
        System.out.print("Status is : " + res.getStatus());
    }
}

