package com;

import spark.Request;
import spark.Response;
import spark.Route;

public class SysteModelModelRoute implements Route {
    @Override
    public Object handle(Request request, Response response) throws Exception {
        return Engine.get().get(request.params("system")).getModels().get(request.params("model")).getKPIs().keySet();
    }
}
