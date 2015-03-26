package com;

/**
 * 
 * http://www.klipfolio.com/blog/kpi-metric-measure
 * *
 * Definition: A measure is an agreed upon concept of quantification. It's a standard, which when "measurements" or "values" are associated with the term "measure", a standard is created that allows for a common language and a basis for comparison.
 Example: Speed expressed in km/h, or temperature expressed in ºC, or beer as a pint.
 * 
 * * * 
 */
public interface Measure {
    public Integer getId();
    public String name();
    public Object value();
    public Object unit();
}
