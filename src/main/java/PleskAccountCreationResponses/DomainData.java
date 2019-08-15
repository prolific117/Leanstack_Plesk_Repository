/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package PleskAccountCreationResponses;

import java.util.ArrayList;

/**
 *
 * @author olatunji.oduro
 */
public class DomainData {
    HostingData hosting;
    CreationData gen_info;
    LimitsData limits;
    StatData stat;
    DiskUsageData disk_usage;
    PerformanceData performance;

    public CreationData getGen_info() {
        return gen_info;
    }

    public void setGen_info(CreationData gen_info) {
        this.gen_info = gen_info;
    }
    
    public PerformanceData getPerformance() {
        return performance;
    }

    public void setPerformance(PerformanceData performance) {
        this.performance = performance;
    }
    
    public HostingData getHosting() {
        return hosting;
    }

    public void setHosting(HostingData hosting) {
        this.hosting = hosting;
    }

    public LimitsData getLimits() {
        return limits;
    }

    public void setLimits(LimitsData limits) {
        this.limits = limits;
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
     
    
}
