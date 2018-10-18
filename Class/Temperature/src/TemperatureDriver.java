public class TemperatureDriver {
    
    public static void main(String[] args) {
        Temperature testA = new Temperature();
        System.out.println("The default for testA is "+testA.toString());
        
        testA.setValue(303.13F);
        System.out.println("After setting value, testA is "+testA.toString());
        //System.out.println("Out of Range");
        
        testA.setType('F');
        System.out.println("After setting value, testA is "+testA.toString());
        //System.out.println("Out of Range");
        
        testA.setValue(-503.25F);
        System.out.println("After setting value, testA is "+testA.toString());
        //System.out.println("Out of Range");
    }
    
}
