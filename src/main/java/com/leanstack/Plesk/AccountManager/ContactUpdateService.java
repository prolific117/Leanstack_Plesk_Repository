/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.leanstack.Plesk.AccountManager;


import PleskAccountCreationResponses.AccountCreationResponse;
import PleskAccountCreationResponses.Result;
import com.leanstack.plesk_library.base.PleskApiClient;
import com.leanstack.plesk_library.base.PleskApiClient;
import java.io.StringReader;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Unmarshaller;
/**
 *
 * @author prolific
 */
public class ContactUpdateService extends BaseClass {
    
    public ContactUpdateService(String service, String login, String password){
        super(service, login , password);
        
    }
    
    public void updateCustomerContact(String address, String city, String state, String email, 
            String country, String postcode, String login) throws JAXBException, Exception{
        
        Map customerData = new LinkedHashMap();
        
        if(address != null)
          customerData.put("address",address);
        
        if(city != null)
           customerData.put("city",city);
        
        if(state != null)
           customerData.put("state",state);
        
        if(postcode != null)
           customerData.put("pcode", postcode);
        
        if(country != null)
           customerData.put("country", country);
        
        if(email != null)
           customerData.put("email", email);
        
        
        
        String request = "<packet version=\"1.6.7.0\">\n" +
                          "<customer>\n" +
                           "<set>\n" +
                               "<filter>"
                                    + "<login>"+login+"</login>"
                                + "</filter>\n" 
                                + "<values><gen_info>" +PleskApiClient.convertToXML(customerData, "")+ "</gen_info></values>"+
                           "</set>\n" +
                          "</customer>\n" +
                         "</packet>";
        
        System.out.print(request);
        
        String response = this.getClient().request(request);
        StringReader reader = new StringReader(response);
        
        System.out.print(response);
        
        //initialize jaxb classes
	JAXBContext context = JAXBContext.newInstance(AccountCreationResponse.class);
	Unmarshaller un = context.createUnmarshaller();
	//convert to desired object
	AccountCreationResponse Data = (AccountCreationResponse)un.unmarshal(reader);
        
        //return Data.getCustomer().getAdd().getResult();
     }
    
    private PleskApiClient runConfigurations(String host){
        PleskApiClient client = new PleskApiClient(host);
        client.setCredentials(this.getREMOTE_API_LOGIN(), this.getREMOTE_API_PASSWORD());
        
        return client;
    }
}
