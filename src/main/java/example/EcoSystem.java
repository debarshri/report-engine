package example;

import com.Model;

import java.util.HashMap;
import java.util.Map;

public class EcoSystem implements com.System {

    private String system1;

    public EcoSystem(String system1) {
        this.system1 = system1;
    }

    @Override
    public String systemName() {
        return system1;
    }

    @Override
    public Map<String,Model> getModels() {

        Map<String,Model> models = new HashMap();
       
        Model1 model1 = new Model1("model1");
        Model2 model2 = new Model2("model2");
        
        models.put("model1",model1);
        models.put("model2", model2);
        
        return models;
    }
}
