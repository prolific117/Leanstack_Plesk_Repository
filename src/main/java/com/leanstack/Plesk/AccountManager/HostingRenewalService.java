/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.leanstack.Plesk.AccountManager;

import PleskAccountCreationResponses.AccountCreationResponse;
import PleskAccountCreationResponses.Result;
import PleskAccountCreationResponses.ResultR;
import PleskAccountCreationResponses.SubscriptionCreationResponse;
import PleskAccountCreationResponses.SubscriptionRenewalResponse;
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
public class HostingRenewalService extends BaseClass{
    
    private static final Logger logger = Logger.getLogger(HostingCreationService.class.getName());
  
    public HostingRenewalService(String service, String login, String password){
        super(service, login , password);
    }
    
    public ResultR renewHosting(Date expiryDate, String domainName, String span, int duration) throws Exception{
        
        String filter = "<filter><name>"+domainName+"</name></filter>";
        //limits
        
        SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd");
        Date newDate = null;
        
        if("MONTHLY".equals(span)){
           newDate  = DateUtils.addMonths(expiryDate, duration);
        }
        else{
           newDate  = DateUtils.addMonths(expiryDate, duration * 12);
        }
        
        //System.out.print(newDate.getTime() / 1000);
        
        String values = "<values><limits><limit>"
                 +"<name>expiration</name>"
                 +"<value>"+newDate.getTime() / 1000+"</value>"
                +"</limit></limits></values>";
        
        try{
            String request = "<packet version=\"1.6.7.0\">\n" +
                            "<webspace>\n" +
                             "<set>\n" +
                               filter + values +
                             "</set>\n" +
                            "</webspace>\n" +
                           "</packet>";
            
            System.out.print(request);
            
            String response = this.getClient().request(request);
            StringReader reader = new StringReader(response);
            
            //Scanner scanner = new Scanner(reader).useDelimiter("\\A");
            //String str = scanner.hasNext() ? scanner.next() : "";
            //System.out.print(str);

            //initialize jaxb classes
            JAXBContext context = JAXBContext.newInstance(SubscriptionRenewalResponse.class);
            Unmarshaller un = context.createUnmarshaller();
            
            SubscriptionRenewalResponse Data = (SubscriptionRenewalResponse)un.unmarshal(reader);
        
            return Data.getWebspace().getSet().getResult();
        }
        catch(Exception ex){
            logger.log(Level.INFO, "Could not create renewal for customer", ex);
            ResultR result = new ResultR();
            result.setStatus("false");
            result.setErrtext("Unable to create subscription");
            
            return result;
        }
        
    }
}
