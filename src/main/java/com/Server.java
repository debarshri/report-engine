package com;

import spark.Spark;

public class Server {
    public static void init() {
        Spark.get("/", new IndexRoute());
        Spark.get("/system/:system", new SysteModelRoute());
        Spark.get("/system/:system/model/:model", new SysteModelModelRoute());
        Spark.get("/system/:system/model/:model/field/:field", new SysteModelModelFieldRoute());

    }
}
