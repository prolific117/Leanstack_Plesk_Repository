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
        ContactUpdateService service = new ContactUpdateService("45.77.89.231","admin","Lean@stack-123");
        service.createCustomerContact("57 Jamaica Street", "Lekki", "Lagos", "NG", "100001", "olatunji17");
        //System.out.print("Status is : " + res.getStatus());
    }
}
