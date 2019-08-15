/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.leanstack.Runner;

import com.leanstack.Plesk.AccountManager.SiteRetrievalService;

/**
 *
 * @author olatunji.oduro
 */
public class SiteRetrievalTest {
     public static void main(String[] args) throws Exception{
        SiteRetrievalService service = new SiteRetrievalService("206.189.123.56","admin","Admin@Leanstack-123");
        service.getDomainData("testing.com");
     }
}
