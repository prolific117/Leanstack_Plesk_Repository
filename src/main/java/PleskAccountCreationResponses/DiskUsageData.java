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
public class DiskUsageData {
     int httpdocs;
     int httpsdocs;
     int subdomains;
     int web_users;
     int anonftp;
     int logs;
     int dbases;
     int mailboxes;
     int maillists;
     int domaindumps;
     int configs;
     int chroot;

    public int getHttpdocs() {
        return httpdocs;
    }

    public void setHttpdocs(int httpdocs) {
        this.httpdocs = httpdocs;
    }

    public int getHttpsdocs() {
        return httpsdocs;
    }

    public void setHttpsdocs(int httpsdocs) {
        this.httpsdocs = httpsdocs;
    }

    public int getSubdomains() {
        return subdomains;
    }

    public void setSubdomains(int subdomains) {
        this.subdomains = subdomains;
    }

    public int getWeb_users() {
        return web_users;
    }

    public void setWeb_users(int web_users) {
        this.web_users = web_users;
    }

    public int getAnonftp() {
        return anonftp;
    }

    public void setAnonftp(int anonftp) {
        this.anonftp = anonftp;
    }

    public int getLogs() {
        return logs;
    }

    public void setLogs(int logs) {
        this.logs = logs;
    }

    public int getDbases() {
        return dbases;
    }

    public void setDbases(int dbases) {
        this.dbases = dbases;
    }

    public int getMailboxes() {
        return mailboxes;
    }

    public void setMailboxes(int mailboxes) {
        this.mailboxes = mailboxes;
    }

    public int getMaillists() {
        return maillists;
    }

    public void setMaillists(int maillists) {
        this.maillists = maillists;
    }

    public int getDomaindumps() {
        return domaindumps;
    }

    public void setDomaindumps(int domaindumps) {
        this.domaindumps = domaindumps;
    }

    public int getConfigs() {
        return configs;
    }

    public void setConfigs(int configs) {
        this.configs = configs;
    }

    public int getChroot() {
        return chroot;
    }

    public void setChroot(int chroot) {
        this.chroot = chroot;
    }
     
     
}
