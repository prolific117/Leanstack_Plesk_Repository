/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.leanstack.Runner;

import PleskAccountCreationResponses.Result;
import com.leanstack.Plesk.AccountManager.AccountCreationService;
import com.leanstack.Plesk.AccountManager.AccountDeletionService;

/**
 *
 * @author olatunji.oduro
 */
public class AccountDeletionTest {
    public static void main(String[] args) throws Exception{
        AccountDeletionService service = new AccountDeletionService("45.77.89.231","admin","Lean@stack-123");
        Result res = service.deleteCustomerAccount("47");
        System.out.print("Status is : " + res.getStatus());
    }
}
