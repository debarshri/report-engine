package com;

import java.util.HashMap;
import java.util.Map;

public class Engine {
    
    private static volatile Map<String,System> systems;
    public static void register(System system)
    {
        if(systems == null) {
            
            systems = new HashMap<String, System>();
        }
         
            if(!systems.containsKey(system))
            {
                systems.put(system.systemName(), system);
            }
    }
    
    public static Map<String,System> get()
    {
        return systems;
    }
}
