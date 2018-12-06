package fal18;

// 25 pts total (15 points for correct implementation (3 pts per section below), 10 points code passes all unit test).
// Refer to the UML class diagram for naming of all methods in this class: SnowMobileRentalUML.pdf

// 1. Create public class named SnowMobileRental that inherits SportShopRental.
public class SnowMobileRental extends SportShopRental{
    
// 2. a. Create a private integer member variable named capacity and initialized to 1.
//    a. Create a private string member variable named vin and initialized to "1A234567890123456789".
    private int capacity=1;
    private String vin="1A234567890123456789";

// 3. Implement the abstract method lateCharge which was declared in SportShopRental.
//    The method should only return (20 + capacity * 5)% of the rental cost.
    @Override
    public double lateCharge(){
        return getRentalCost()*((20+capacity*5)/100f);
    }

// 4. Implement the toString method that returns a string in the following format:
//    "Rental #{s}, Cost: ${s}, New: {s}, Capacity: {1} seat, Vin: {2}"
//    where:  {s} is the format specifier for integers from SportShopRental class toString method (hint: utilize the super keyword),
//            {s} is the format specifier for doubles with width of 7 characters and 2 decimal places of precision from 
//                SportShopRental class toString method (hint: utilize the super keyword),
//            {s} is the format specifier for boolean values from SportShopRental class toString method (hint: utilize the super keyword),
//            {1} is the format specifier for integer with a field width of 1 character,
//            {2} is the format specifier for a string.
    @Override
    public String toString(){
        return String.format(super.toString()+", Capacity: %1d seat, Vin: %s", getCapacity(), getVin());
    }

// 5. Create all getters and setters for private member variables created in step #2. Note below is specifics for data validation 
//    in specified setter methods below:



    /**
     * @return the capacity
     */
    public int getCapacity() {
        return capacity;
    }

//    a. In setter method for setting capacity, throw a new IllegalArgumentExcetion for
//       any capacity that is less than one or greater than three, with the exception message: 
//       "Capacity out of range"
    /**
     * @param capacity the capacity to set
     */
    public void setCapacity(int capacity) {
        this.capacity = capacity;
        if(capacity<1||capacity>3){
            throw new IllegalArgumentException("Capacity out of range");
        }
    }

    /**
     * @return the vin
     */
    public String getVin() {
        return vin;
    }

//    b. In setter method for setting vin, throw a new IllegalArgumentException for
//       any vin that has the number of characters greater than 20, with the
//       exception message: "Vin cannot be more than 20 characters"    
    /**
     * @param vin the vin to set
     */
    public void setVin(String vin) {
        this.vin = vin;
        if(vin.length()>20){
            throw new IllegalArgumentException("Vin cannot be more than 20 characters");
        }
    }
}
