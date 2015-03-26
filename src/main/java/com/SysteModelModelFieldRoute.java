package com;

import spark.Request;
import spark.Response;
import spark.Route;

import java.util.List;

public class SysteModelModelFieldRoute implements Route {
    @Override
    public Object handle(Request request, Response response) throws Exception {
        List<KPI> kpis = Engine.get().get(request.params("system")).getModels().get(request.params("model")).getKPIs().get(request.params("field"));
        String out = "";
        for(KPI kpi : kpis)
        {
            out = out + kpi.value()+"\n";
        }
        
        return "<pre>"+out+"</pre>";
    }
}
