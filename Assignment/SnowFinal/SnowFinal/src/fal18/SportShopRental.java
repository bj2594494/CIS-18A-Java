package fal18;

// 25 pts total (15 points for correct implementation (3 pts per section below), 10 points code passes all unit test).
// Refer to the UML class diagram for naming of all methods in this class: SportShopRentalUML.pdf

// 1. Create abstract class named SportShotRental.
// 2. a. Create private boolean member variable named newModel and initialize to false.
//    b. Create private double member variable named rentalCost and initialize to 25.0.
//    c. Create private long member variable named rentalNumber and initialize to 1.
abstract class SportShotRental{
    private boolean newModel=false;
    private double rentalCost=25.0;
    private long rentalNumber=1;


// 3. Create all getters and setters for private member variables created in step #2. Note below is specifics for data validation 
//    in specified setter methods below:

 
    
    /**
     * @return the newModel
     */
    public boolean isNewModel() {
        return newModel;
    }

    /**
     * @param newModel the newModel to set
     */
    public void setNewModel(boolean newModel) {
        this.newModel = newModel;
    }

    /**
     * @return the rentalCost
     */
    public double getRentalCost() {
        return rentalCost;
    }
    
//    a. In setter method for setting rental cost, throw a new IllegalArgumentExcetion for
//       any rental cost that is less than or equal to zero, with the exception message: 
//       "RentalCost out of range"
    
    /**
     * @param rentalCost the rentalCost to set
     */
    public void setRentalCost(double rentalCost) {
        this.rentalCost = rentalCost;
        if (rentalCost<=0){
            throw new IllegalArgumentException("RentalCost out of range");
        }
    }

    /**
     * @return the rentalNumber
     */
    public long getRentalNumber() {
        return rentalNumber;
    }

//    b. In setter method for setting rental number, throw a new IllegalArgumentException for
//       any rental number that is less than 1 or greater than 999999999999, with the
//       exception message: "RentalNumber out of range"   
    
    /**
     * @param rentalNumber the rentalNumber to set
     */
    public void setRentalNumber(long rentalNumber) {
        this.rentalNumber = rentalNumber;
        if (rentalNumber<0||rentalNumber>999999999999l){
            throw new IllegalArgumentException("RentalNumber out of range");
        }
    }
    
// 4. Create the overrided method named toString that returns a string in the format of:
//    "Rental #{1}, Cost: ${2}, New: {3}"
//    where:  {1} is the format specifier for integers,
//            {2} is the format specifier for doubles with width of 7 characters and 2 decimal places of precision,
//            {3} is the format specifier for boolean values.
    
    @Override
    public String toString(){
        return String.format("Rental #%d, Cost: $%f7.2, New: %b",rentalNumber,rentalCost,newModel);
    }
    
// 5. Create the abstract method lateCharge that takes no parameters and returns the late charge as a double.
    public abstract double lateCharge();
}


