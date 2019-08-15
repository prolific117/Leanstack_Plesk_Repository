/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.leanstack.Plesk.AccountManager;

import PleskAccountCreationResponses.DomainsResult;
import PleskAccountCreationResponses.Result;
import PleskAccountCreationResponses.ServicePlanRetrievalResponse;
import PleskAccountCreationResponses.SubscriptionsRetrievalResponse;
import PleskAccountCreationResponses.domain;
import java.io.StringReader;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.xml.bind.JAXBContext;
import javax.xml.bind.Unmarshaller;

/**
 *
 * @author olatunji.oduro
 */
public class SubscriptionsRetrievalService extends BaseClass{
    
    private static final Logger logger = Logger.getLogger(HostingCreationService.class.getName());

    public SubscriptionsRetrievalService(String service, String login, String password) {
        super(service, login, password);
    }
    
    public DomainsResult getDomains(String customerId) throws Exception {

        try {
            String request = "<packet>\n" +
                "  <customer>\n" +
                "    <get-domain-list>\n" +
                "      <filter>\n" +
                "        <id>"+customerId+"</id>\n" +
                "      </filter>\n" +
                "    </get-domain-list>\n" +
                "  </customer>\n" +
                "</packet>";

            String response = this.getClient().request(request);
            StringReader reader = new StringReader(response);

            /*Scanner scanner = new Scanner(reader).useDelimiter("\\A");
            String str = scanner.hasNext() ? scanner.next() : "";
            System.out.print(str);*/

            //initialize jaxb classes
            JAXBContext context = JAXBContext.newInstance(SubscriptionsRetrievalResponse.class);
            Unmarshaller un = context.createUnmarshaller();

            SubscriptionsRetrievalResponse Data = (SubscriptionsRetrievalResponse) un.unmarshal(reader);

            //if(Data.getCustomer().getDomainsList().getResult().getDomains() == null)
            System.out.print("Size is "+Data.getCustomer().getDomainsList().getResult().getCustomerDomains().getDomain().get(0).getName()+" lll");
            
            //System.out.print("done");
            return Data.getCustomer().getDomainsList().getResult();
        } catch (Exception ex) {
            logger.log(Level.SEVERE, "error", ex);
            DomainsResult result = new DomainsResult();
            result.setStatus("false");
            return result;
        }

    }
}
