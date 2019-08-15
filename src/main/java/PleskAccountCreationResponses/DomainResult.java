/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package PleskAccountCreationResponses;

/**
 *
 * @author olatunji.oduro
 */
public class DomainResult {
    
    String status;
    String id;
    DomainData data;

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public DomainData getData() {
        return data;
    }

    public void setData(DomainData data) {
        this.data = data;
    }
    
    
}
