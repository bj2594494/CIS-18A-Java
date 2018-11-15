package bdj;

public class Traffic_Driver {
    
    public static void main(String[] args) {
        String light1 = "RED";
        String light2 = "YELLOW";
        String light3 = "GREEN";
        String light4 = "WALK";
        String light5 = "DONT_WALK";
        
        Traffic duration1 = new Traffic(TrafficSignal.valueOf(light1));
        duration1.duration();
        
        Traffic duration2 = new Traffic(TrafficSignal.valueOf(light2));
        duration2.duration();
        
        Traffic duration3 = new Traffic(TrafficSignal.valueOf(light3));
        duration3.duration();
        
        Traffic duration4 = new Traffic(TrafficSignal.valueOf(light4));
        duration4.duration();
        
        Traffic duration5 = new Traffic(TrafficSignal.valueOf(light5));
        duration5.duration();
    }
    
}

