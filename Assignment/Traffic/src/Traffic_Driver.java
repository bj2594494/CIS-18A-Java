public class Traffic_Driver {
    
    public static void main(String[] args) {
        String light1 = "RED";
        String light2 = "YELLOW";
        String light3 = "GREEN";
        String light4 = "WALK";
        String light5 = "DONT_WALK";
        
        Traffic duration1 = new Traffic(Traffic.valueOf(light1));
        duration1.duration();
    }
    
}
