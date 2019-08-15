package com.leanstack.Runner;

import PleskAccountCreationResponses.Result;
import com.leanstack.Plesk.AccountManager.ContactUpdateService;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author olatunji.oduro
 */
public class AccountUpdateTest {
    public static void main(String[] args) throws Exception{
        ContactUpdateService service = new ContactUpdateService("206.189.123.56","admin","Admin@Leanstack-123");
        service.updateCustomerContact("57 Jamaica Street", "Lekki", "Lagos", "adedamola.elusakin@gmail.com", "NG", "100001", "switkim");
        //System.out.print("Status is : " + res.getStatus());
    }
}
