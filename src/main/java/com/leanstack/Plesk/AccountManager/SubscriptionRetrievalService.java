/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.leanstack.Plesk.AccountManager;

import PleskAccountCreationResponses.DomainDataResponse;
import PleskAccountCreationResponses.DomainsResult;
import PleskAccountCreationResponses.SubscriptionsRetrievalResponse;
import java.io.StringReader;
import java.util.Scanner;
import java.util.logging.Logger;
import javax.xml.bind.JAXBContext;
import javax.xml.bind.Unmarshaller;

/**
 *
 * @author olatunji.oduro
 */
public class SubscriptionRetrievalService extends BaseClass{
    private static final Logger logger = Logger.getLogger(HostingCreationService.class.getName());

    public SubscriptionRetrievalService(String service, String login, String password) {
        super(service, login, password);
    }
    
    public  DomainDataResponse getDomainData(String domainName) throws Exception {
       try {
            String request = "<packet>\n" +
            "<webspace>\n" +
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
            "      <limits/>\n" +
            "   </dataset>\n" +
            "</get>\n" +
            "</webspace>\n" +
            "</packet>";

            String response = this.getClient().request(request);
            StringReader reader = new StringReader(response);

            /*Scanner scanner = new Scanner(reader).useDelimiter("\\A");
            String str = scanner.hasNext() ? scanner.next() : "";
            System.out.print(str);*/

            //initialize jaxb classes
            JAXBContext context = JAXBContext.newInstance(DomainDataResponse.class);
            Unmarshaller un = context.createUnmarshaller();

            DomainDataResponse Data = (DomainDataResponse) un.unmarshal(reader);

            System.out.print(Data.getWebspace().getGet().getResult().getData().getGen_info().getCr_date());
                    
            
            return Data;
        } catch (Exception ex) {
             DomainDataResponse result = new  DomainDataResponse();
             result.setWebspace(null);
             return result;
        }

    }
}
