/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.leanstack.Plesk.AccountManager;

import PleskAccountCreationResponses.DomainDataResponse;
import PleskAccountCreationResponses.DomainsResult;
import PleskAccountCreationResponses.SiteDataResponse;
import PleskAccountCreationResponses.SubscriptionsRetrievalResponse;
import java.io.StringReader;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.xml.bind.JAXBContext;
import javax.xml.bind.Unmarshaller;

/**
 *
 * @author olatunji.oduro
 */
public class SiteRetrievalService extends BaseClass{
    private static final Logger logger = Logger.getLogger(HostingCreationService.class.getName());

    public SiteRetrievalService(String service, String login, String password) {
        super(service, login, password);
    }
    
    public SiteDataResponse getDomainData(String domainName) throws Exception {
       try {
            String request = "<packet>\n" +
            "<site>\n" +
            "<get>\n" +
            "   <filter>\n" +
            "      <name>"+domainName+"</name>\n" +
            "   </filter>\n" +
            "   <dataset>\n" +
            "      <hosting/>\n" +
            "      <gen_info/>\n" +
            "      <stat/>\n" +
            "      <disk_usage/>\n" +
            "      <performance/>\n" +
            "   </dataset>\n" +
            "</get>\n" +
            "</site>\n" +
            "</packet>";

            String response = this.getClient().request(request);
            StringReader reader = new StringReader(response);
            
            /*Scanner scanner = new Scanner(reader).useDelimiter("\\A");
            String str = scanner.hasNext() ? scanner.next() : "";
            System.out.print(str);*/

            //initialize jaxb classes
            JAXBContext context = JAXBContext.newInstance(SiteDataResponse.class);
            Unmarshaller un = context.createUnmarshaller();
            

            SiteDataResponse Data = (SiteDataResponse) un.unmarshal(reader);
            Data.getSite().getGet().getResult();
            
            System.out.print(Data.getSite().getGet().getResult().getData().getPerformance().getBandwidth());
                               
            return Data;
        } catch (Exception ex) {
             SiteDataResponse result = new  SiteDataResponse();
             logger.log(Level.SEVERE, "Error", ex);
             result.setSite(null);
             return result;
        }

    }
}
