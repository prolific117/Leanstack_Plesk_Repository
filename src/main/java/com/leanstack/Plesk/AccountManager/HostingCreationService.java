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
public class HostingCreationService extends BaseClass{
    
    private static final Logger logger = Logger.getLogger(HostingCreationService.class.getName());
  
    public HostingCreationService(String service, String login, String password){
        super(service, login , password);
    }
    
    public Result createHosting(String pleskId, String domainName, Date creationDate, String planName, String span, int duration, String login, String password) throws Exception{
        
        Map add = new HashMap();
        
        //gen setup
        Map genInfoData = new LinkedHashMap();
        
        genInfoData.put("name", domainName);
        genInfoData.put("htype", "vrt_hst");
        genInfoData.put("owner-id", pleskId);
        genInfoData.put("ip_address", this.getKA_SERVICE());
        genInfoData.put("status", 0);
        
        String gen_setup = "<gen_setup>"+PleskApiClient.convertToXML(genInfoData, "")+"</gen_setup>";
        
        //hosting
        
        LinkedHashMap adminlogin = new LinkedHashMap();
        adminlogin.put("name", "ftp_login");
        adminlogin.put("value", login);
        
        
        LinkedHashMap adminpassword = new LinkedHashMap();
        
        adminpassword.put("name", "ftp_password");
        //adminpassword.put("value", StrongPasswordGen.generatePassword());
        adminpassword.put("value", password);
      
        LinkedHashMap ipAddress = new LinkedHashMap();
        ipAddress.put("ip_address", this.getKA_SERVICE());
        
        
        String hosting = "<hosting><vrt_hst>"
                 +"<property>"+PleskApiClient.convertToXML(adminlogin, "") + "</property>"
                 +"<property>"+PleskApiClient.convertToXML(adminpassword, "") + "</property>"
                 +PleskApiClient.convertToXML(ipAddress, "")
              +"</vrt_hst></hosting>";
        
       
        //limits
        
        SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd");
        Date newDate = null;
        
        if("MONTHLY".equals(span)){
           newDate  = DateUtils.addMonths(creationDate, duration);
        }
        else{
           newDate  = DateUtils.addMonths(creationDate, duration * 12);
        }
        
        System.out.print(newDate.getTime() / 1000);
        
        String limits = "<limits><limit>"
                 +"<name>expiration</name>"
                 +"<value>"+newDate.getTime() / 1000+"</value>"
                +"</limit></limits>";
        
        
        //plan nae
        String plan = "<plan-name>"+planName+"</plan-name>";
        
        try{
            String request = "<packet version=\"1.6.7.0\">\n" +
                            "<webspace>\n" +
                             "<add>\n" +
                               gen_setup + hosting + limits + plan +
                             "</add>\n" +
                            "</webspace>\n" +
                           "</packet>";
            
            System.out.print(request);
            
            String response = this.getClient().request(request);
            StringReader reader = new StringReader(response);
            
            /*Scanner scanner = new Scanner(reader).useDelimiter("\\A");
            String str = scanner.hasNext() ? scanner.next() : "";
            System.out.print(str);*/

            //initialize jaxb classes
            JAXBContext context = JAXBContext.newInstance(SubscriptionCreationResponse.class);
            Unmarshaller un = context.createUnmarshaller();
            
            SubscriptionCreationResponse Data = (SubscriptionCreationResponse)un.unmarshal(reader);
        
            //return null;
            return Data.getWebspace().getAdd().getResult();
        }
        catch(Exception ex){
            logger.log(Level.INFO, "Could not create hosting for customer", ex);
            Result result = new Result();
            result.setStatus("false");
            result.setErrtext("Unable to create subscription");
            
            return result;
        }
        
    }
}
