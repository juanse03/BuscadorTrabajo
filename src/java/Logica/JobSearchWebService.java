/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Logica;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebService;

/**
 *
 * @author enfasis1
 */
@WebService(serviceName = "JobSearchWebService")
public class JobSearchWebService {

    /**
     * This is a sample web service operation
     */
    @WebMethod(operationName = "getJobOffer")
    public String getJobOffer(@WebParam(name = "keyword") String keyword) {
        return JobSearch.getJobOffers(keyword);
    }
}
