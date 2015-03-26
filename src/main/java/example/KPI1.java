package example;

import com.KPI;

public class KPI1 implements KPI{
    private final String id;
    private final String s;

    public KPI1(String id, String s) {
        this.id = id;
        this.s = s;
    }

    @Override
    public Integer getId() {
        return null;
    }
    
    @Override
    public String name() {
        return id;
    }

    @Override
    public String value() {
        return s;
    }

    @Override
    public String unit() {
        return null;
    }
}
