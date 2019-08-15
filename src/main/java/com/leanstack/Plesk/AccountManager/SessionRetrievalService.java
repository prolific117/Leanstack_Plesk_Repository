/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.leanstack.Plesk.AccountManager;

import PleskAccountCreationResponses.DomainDataResponse;
import PleskAccountCreationResponses.DomainsResult;
import PleskAccountCreationResponses.SessionResponse;
import PleskAccountCreationResponses.SubscriptionsRetrievalResponse;
import java.io.StringReader;
import java.util.Base64;
import java.util.Scanner;
import java.util.logging.Logger;
import javax.xml.bind.JAXBContext;
import javax.xml.bind.Unmarshaller;

/**
 *
 * @author olatunji.oduro
 */
public class SessionRetrievalService extends BaseClass{
    private static final Logger logger = Logger.getLogger(HostingCreationService.class.getName());

    public SessionRetrievalService(String service, String login, String password) {
        super(service, login, password);
    }
    
    public  SessionResponse getSession(String username, String publicIp) throws Exception {
       try {
            String request = "<packet>\n" +
                                "  <server>\n" +
                                "    <create_session>\n" +
                                "      <login>"+username+"</login>\n" +
                                "      <data>\n" +
                                "        <user_ip>"+Base64.getEncoder().encodeToString(publicIp.getBytes())+"</user_ip>\n" +
                                "        <source_server></source_server>\n" +
                                "      </data>\n" +
                                "    </create_session>\n" +
                                "  </server>\n" +
                                "</packet>";

            String response = this.getClient().request(request);
            StringReader reader = new StringReader(response);

            /*Scanner scanner = new Scanner(reader).useDelimiter("\\A");
            String str = scanner.hasNext() ? scanner.next() : "";
            System.out.print(str);*/

            //initialize jaxb classes
            JAXBContext context = JAXBContext.newInstance(SessionResponse.class);
            Unmarshaller un = context.createUnmarshaller();

            SessionResponse Data = (SessionResponse) un.unmarshal(reader);

            System.out.print(Data.getServer().getCreate_session().getResult().getId());
                    
            
            return Data;
            
        } catch (Exception ex) {
             SessionResponse result = new  SessionResponse();
             result.setServer(null);
             return result;
        }

    }
}
