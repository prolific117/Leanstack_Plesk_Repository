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
public class SiteGenInfo {
    HostingData hosting;
    SiteInfo gen_info;
    StatData stat;
    DiskUsageData disk_usage;
    PerformanceData performance;

    public HostingData getHosting() {
        return hosting;
    }

    public void setHosting(HostingData hosting) {
        this.hosting = hosting;
    }

    public SiteInfo getGen_info() {
        return gen_info;
    }

    public void setGen_info(SiteInfo gen_info) {
        this.gen_info = gen_info;
    }

    public StatData getStat() {
        return stat;
    }

    public void setStat(StatData stat) {
        this.stat = stat;
    }

    public DiskUsageData getDisk_usage() {
        return disk_usage;
    }

    public void setDisk_usage(DiskUsageData disk_usage) {
        this.disk_usage = disk_usage;
    }

    public PerformanceData getPerformance() {
        return performance;
    }

    public void setPerformance(PerformanceData performance) {
        this.performance = performance;
    }
    
    
}
