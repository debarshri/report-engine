package example;

import com.KPI;
import com.Measure;
import com.Model;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Model2 implements Model {
    private String model2;

    public Model2(String model2) {

        this.model2 = model2;
    }

    @Override
    public String getName() {
        return model2;
    }

    @Override
    public Map<String, List<KPI>> getKPIs() {
        return new HashMap<String, List<KPI>>();
    }

    @Override
    public Map<String, List<Measure>> getMeasures() {
        return null;
    }
}
