/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.leanstack.Plesk.AccountManager;

import PleskAccountCreationResponses.AccountDeletionResponse;
import PleskAccountCreationResponses.Result;
import java.io.StringReader;
import java.util.LinkedHashMap;
import java.util.Map;
import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Unmarshaller;

/**
 *
 * @author olatunji.oduro
 */
public class AccountDeletionService extends BaseClass {
    
    public AccountDeletionService(String service, String login, String password){
        super(service, login , password);
        
    }
    
    public Result deleteCustomerAccount(String pleskid) throws JAXBException, Exception{
        
        Map customerData = new LinkedHashMap();
        
        String request = "<packet version=\"1.6.7.0\">\n" +
                          "<customer>\n" +
                           "<del>\n" +
                             "<filter><id>" +pleskid+ "</id></filter>\n" +
                           "</del>\n" +
                          "</customer>\n" +
                         "</packet>";
        
        System.out.print(request);
        
        String response = this.getClient().request(request);
        StringReader reader = new StringReader(response);
        
        //initialize jaxb classes
	JAXBContext context = JAXBContext.newInstance(AccountDeletionResponse.class);
	Unmarshaller un = context.createUnmarshaller();
	//convert to desired object
        
         AccountDeletionResponse Data = (AccountDeletionResponse)un.unmarshal(reader);
        return Data.getCustomer().getDel().getResult();
     }
}
