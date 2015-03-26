import com.Engine;
import com.Server;
import example.EcoSystem;

public class ServerMain {
    public static void main(String[] args)
    {
        Engine.register(new EcoSystem("System1"));
        Engine.register(new EcoSystem("System2"));
        
        Server.init();
    }
}
