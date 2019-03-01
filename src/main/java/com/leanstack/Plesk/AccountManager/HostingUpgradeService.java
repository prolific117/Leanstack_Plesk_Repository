/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.leanstack.Plesk.AccountManager;

import PleskAccountCreationResponses.AccountCreationResponse;
import PleskAccountCreationResponses.Result;
import PleskAccountCreationResponses.SubscriptionCreationResponse;
import com.leanstack.plesk_library.base.PleskApiClient;
import com.leanstack.plesk_library.base.StrongPasswordGen;
import java.io.StringReader;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.xml.bind.JAXBContext;
import javax.xml.bind.Unmarshaller;
import org.apache.commons.lang3.time.DateUtils;

/**
 *
 * @author prolific
 */
public class HostingUpgradeService extends BaseClass{
    
    private static final Logger logger = Logger.getLogger(HostingCreationService.class.getName());
  
    public HostingUpgradeService(String service, String login, String password){
        super(service, login , password);
    }
    
    public Result upgradeHosting(String pleskId, String domainName, String planGuid) throws Exception{
        
        try{
            String request = "<packet version=\"1.6.7.0\">\n" +
                            "<webspace>\n" +
                              "<switch-subscription>"+
                                "<filter>"+
                                   "<name>"+domainName+"</id>"+
                                "</filter>"+
                                "<plan-guid>"+planGuid+"</plan-guid>"+
                              "</switch-subscription>"+
                           "</packet>";
            
            System.out.print(request);
            
            String response = this.getClient().request(request);
            StringReader reader = new StringReader(response);
            
            //Scanner scanner = new Scanner(reader).useDelimiter("\\A");
            //String str = scanner.hasNext() ? scanner.next() : "";
            //System.out.print(str);

            //initialize jaxb classes
            JAXBContext context = JAXBContext.newInstance(SubscriptionCreationResponse.class);
            Unmarshaller un = context.createUnmarshaller();
            
            SubscriptionCreationResponse Data = (SubscriptionCreationResponse)un.unmarshal(reader);
        
            return Data.getWebspace().getAdd().getResult();
        }
        catch(Exception ex){
            logger.log(Level.INFO, "Could not upgrade hosting for customer", ex);
            Result result = new Result();
            result.setStatus("false");
            result.setErrtext("Unable to upgrade subscription");
            
            return result;
        }
        
    }
}
