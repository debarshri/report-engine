package com;

import java.util.List;
import java.util.Map;

public interface Model {
    public String getName();
    public Map<String, List<KPI>> getKPIs();
    public Map<String, List<Measure>> getMeasures();
}
