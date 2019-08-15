/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.leanstack.Plesk.AccountManager;

import PleskAccountCreationResponses.Result;
import PleskAccountCreationResponses.ServicePlanRetrievalResponse;
import java.io.StringReader;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.xml.bind.JAXBContext;
import javax.xml.bind.Unmarshaller;

/**
 *
 * @author prolific
 */
public class PlanRetrievalService extends BaseClass {

    private static final Logger logger = Logger.getLogger(HostingCreationService.class.getName());

    public PlanRetrievalService(String service, String login, String password) {
        super(service, login, password);
    }

    public void getPlan(String planId) throws Exception {

        try {
            String request = "<packet version=\"1.6.7.0\">\n"
                    + "<service-plan>\n"
                    + "<get>"
                    + "<filter>"
                    + "<id>" + planId + "</id>"
                    + "</filter>"
                    + "</get>"
                    + "</service-plan>"
                    + "</packet>";

            String response = this.getClient().request(request);
            StringReader reader = new StringReader(response);

            /*Scanner scanner = new Scanner(reader).useDelimiter("\\A");
            String str = scanner.hasNext() ? scanner.next() : "";
            System.out.print(str);*/

            //initialize jaxb classes
            JAXBContext context = JAXBContext.newInstance(ServicePlanRetrievalResponse.class);
            Unmarshaller un = context.createUnmarshaller();

            // System.out.print(response);
            ServicePlanRetrievalResponse Data = (ServicePlanRetrievalResponse) un.unmarshal(reader);

            System.out.print(Data.getServiceplan().getGet().getResult().getName());
            System.out.print(Data.getServiceplan().getGet().getResult().getGuid());

            //return Data.getWebspace().getAdd().getResult();
        } catch (Exception ex) {
            logger.log(Level.INFO, "Could not upgrade hosting for customer", ex);
            Result result = new Result();
            result.setStatus("false");
            result.setErrtext("Unable to upgrade subscription");

            //return result;
        }

    }
}
