package fal18;

// 25 pts total (15 points for correct implementation (3 pts per section below), 10 points code passes all unit test).
// Refer to the UML class diagram for naming of all methods in this class: SkiRentalUML.pdf

// 1. Create public class named SkiRental that inherits SportShopRental.
public class SkiRental extends SportShopRental{
    
// 2. Create a private integer member variable named size and initialized to 175.
    private int size=175;
    
// 3. Implement the abstract method lateCharge which was declared in SportShopRental.
//    The method should only return 10% of the rental cost.
    @Override
    public double lateCharge(){
        return getRentalCost()*.1;
    }
    
// 4. Implement the toString method that returns a string in the following format:
//    "Rental #{s}, Cost: ${s}, New: {s}, Size: {1} cm"
//    where:  {s} is the format specifier for integers from SportShopRental class toString method (hint: utilize the super keyword),
//            {s} is the format specifier for doubles with width of 7 characters and 2 decimal places of precision from 
//                SportShopRental class toString method (hint: utilize the super keyword),
//            {s} is the format specifier for boolean values from SportShopRental class toString method (hint: utilize the super keyword),
//            {1} is the format specifier for integer with a field width of 4 characters.
    @Override
    public String toString(){
        return String.format(super.toString()+", Size: %4d cm", getSize());
    }
    
// 5. Create all getters and setters for private member variables created in step #2. Note below is specifics for data validation 
//    in specified setter methods below:

    /**
     * @return the size
     */
    public int getSize() {
        return size;
    }
    
//    a. In setter method for setting size, throw a new IllegalArgumentExcetion for
//       any size that is less than 50 or greater than 200, with the exception message: 
//       "Size out of range"
    /**
     * @param size the size to set
     */
    public void setSize(int size) {
        this.size = size;
        if(size<50||size>200){
            throw new IllegalArgumentException("Size out of range");
        }
    }
}
