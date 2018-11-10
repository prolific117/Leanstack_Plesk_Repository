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
public class AccountCreationService extends BaseClass {
    
    public AccountCreationService(String service, String login, String password){
        super(service, login , password);
        
    }
    
    public Result createCustomerAccount(String firstname, String lastname, String username, String password, String userEmail) throws JAXBException, Exception{
        
        Map customerData = new LinkedHashMap();
        
        customerData.put("cname","Plesk");
        customerData.put("pname",firstname+" "+lastname);
        customerData.put("login",username);
        customerData.put("passwd", password);
        customerData.put("email", userEmail);
        
        String request = "<packet version=\"1.6.7.0\">\n" +
                          "<customer>\n" +
                           "<add>\n" +
                             "<gen_info>" +PleskApiClient.convertToXML(customerData, "")+ "</gen_info>\n" +
                           "</add>\n" +
                          "</customer>\n" +
                         "</packet>";
        
        System.out.print(request);
        
        String response = this.getClient().request(request);
        StringReader reader = new StringReader(response);
        
        //initialize jaxb classes
	JAXBContext context = JAXBContext.newInstance(AccountCreationResponse.class);
	Unmarshaller un = context.createUnmarshaller();
	//convert to desired object
	AccountCreationResponse Data = (AccountCreationResponse)un.unmarshal(reader);
        
        return Data.getCustomer().getAdd().getResult();
     }
    
    private PleskApiClient runConfigurations(String host){
        PleskApiClient client = new PleskApiClient(host);
        client.setCredentials(this.getREMOTE_API_LOGIN(), this.getREMOTE_API_PASSWORD());
        
        return client;
    }
}
