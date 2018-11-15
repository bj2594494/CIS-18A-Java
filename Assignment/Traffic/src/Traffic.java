enum TrafficSignal{
    RED, GREEN, YELLOW, WALK, DONT_WALK;
}

public class Traffic {
    TrafficSignal light;
    
    public Traffic(TrafficSignal light){
        this.light = light;
    }
    
    public void duration(){
        switch (light){
            case RED:
                System.out.println("Duration of red light is 90 seconds.");
                break;
            case GREEN:
                System.out.println("Duration of green light is 30 seconds.");
                break;
            case YELLOW:
                System.out.println("Duration of red light is 5 seconds.");
                break;
            case WALK:
                System.out.println("You have 30 seconds to walk across.");
                break;
            default:
                System.out.println("You have to wait 90 seconds before crossing.");
                break;
        }
    }
}
