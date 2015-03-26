package example;

import com.KPI;
import com.Measure;
import com.Model;
import org.apache.commons.io.FileUtils;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Model1 implements Model {

    private String model1;

    public Model1(String model1) {
        this.model1 = model1;
    }

    @Override
    public String getName() {
        return model1;
    }

    @Override
    public Map<String, List<KPI>> getKPIs() {
        Map<String, List<KPI>> kpis = new HashMap<String, List<KPI>>();
        
        try {
            List<String> flatfile = FileUtils.readLines(new File("flatfile"));
            for(String line : flatfile)
            {
                String[] split = line.split(",");
                List<KPI> id = kpis.get("ID");
                if(id != null)
                {
                    id.add(new KPI1("ID",split[0]));
                    kpis.put("ID",id);
                }
                else 
                {
                    List<KPI> kpiList = new ArrayList<KPI>();
                    kpiList.add(new KPI1("ID",split[0]));
                    kpis.put("ID",kpiList);
                    
                }

            }

        } catch (IOException e) {
            e.printStackTrace();
        }
        return kpis;
    }

    @Override
    public Map<String, List<Measure>> getMeasures() {
        return null;
    }
}
