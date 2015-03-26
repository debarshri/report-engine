package com;

import spark.Request;
import spark.Response;
import spark.Route;

public class IndexRoute implements Route {
    @Override
    public Object handle(Request request, Response response) throws Exception {
        
        return Engine.get().keySet();
    }

}
