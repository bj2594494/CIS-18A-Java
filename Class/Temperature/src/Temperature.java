public class Temperature {
    
    //Member Variables
    private float value = 0;
    private char type = 'K';

    /**
     * @return the value
     */
    public float getValue() {
        return value;
    }

    /**
     * @param new_value the value to set
     */
    public void setValue(float new_value) {
        if ( type == 'K' || type=='k' ){
            if (new_value >= 0){
                value=new_value;
            }
            else
                throw new IllegalArgumentException("Invalid Value for degrees in "+type);
        }
        
        if( type == 'F' || type=='f' ){
            if (new_value >= -459.4){
                value=new_value;
            }
            else
                throw new IllegalArgumentException("Invalid Value for degrees in "+type);
        }
        
        if( type == 'C' || type=='c' ){
            if (new_value >= -273.13){
                value=new_value;
            }
            else
                throw new IllegalArgumentException("Invalid Value for degrees in "+type);
        }
        
        
    }

    /**
     * @return the type
     */
    public char getType() {
        return type;
    }

    /**
     * @param new_type the type to set
     */
    public void setType(char new_type) {
        if ( new_type == 'K' || new_type=='k' ){
            type=new_type;
        }
        else if( new_type == 'F' || new_type=='f' ){
            type=new_type;
        }
        else if( new_type == 'C' || new_type=='c' ){
            type=new_type;
        }
        else
            throw new IllegalArgumentException("Invalid Value for degrees in type");
    }
    
    @Override
    public String toString(){
        return String.format("%.2f%c",value,type);
    }
    
    
}
