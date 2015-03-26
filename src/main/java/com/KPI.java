package com;

/**
 * 
 * Definition: KPIs are relevant performance metrics that are measurable to industry, department or task. 
 * * KPIs are evaluated over a specified time period, and compared against acceptable norms, past performance or targets.
 Example: Currently we are driving at 60 km/h (10 km/h higher than the posted speed limit of 50 km/h), 
 or the average water temperature over the past week was 95 ÂºC (5 ÂºC lower than the target temperature of 100 ÂºC),
 or average pints per patron per visit at our pub this month is 1.6 (compared to the local pub average of 1.4ppv and last month's average of 1.3ppv).
 * 
 * * * 
 */
public interface KPI {
    public Integer getId();
    public String name();
    public <T> T value();
    public <U> U unit();
}
