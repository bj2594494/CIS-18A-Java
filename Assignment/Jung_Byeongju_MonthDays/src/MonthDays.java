public class MonthDays {
    private int month;
    private int years;

    /**
     * @return the month
     */
    public int getMonth() {
        return month;
    }

    /**
     * @param month the month to set
     */
    public void setMonth(int month) {
        this.month = month;
        if ((month<=0)||(month>12)){
            throw new IllegalArgumentException("Month must be between 1 and 12. Program terminating.");
        }
    }

    /**
     * @return the years
     */
    public int getYears() {
        return years;
    }

    /**
     * @param years the years to set
     */
    public void setYears(int years) {
        this.years = years;
    }
    
    public int getNumberOfDays(){
        int days=0;
        if (month==1||month==3||month==5||month==7||month==8||month==10||month==12){
            days=31;
        }
        if (month==2){
            if(years%100==0){
                if(years%400==0){
                    days=29;
                }
                else
                    days=28;
                }
            if(years%100!=0){
                if(years%4==0){
                    days=29;
                }
                else
                    days=28;
            }
        }
        if (month==4||month==6||month==9||month==11){
            days=30;
        }
        return days;
    }
    
    public MonthDays(int month, int year){
        setMonth(month);
        setYears(year);
    }
}
