package edu.buffalostate.cis425.sp16.exercises.kuntz;

public class Temperature {

	private double currentTemp;
	
    public Temperature(double i) {				//default constructor
		setTemp(i);
	}

	public void setTemp(double t)
    {
        currentTemp = t;
    }

    public double getTemp()
    {
        return currentTemp;
    }

    
     public double incrementTemp(){
    	currentTemp = currentTemp + 1;
    	return currentTemp;
     }


	 public double decrementTemp(){
		 currentTemp = currentTemp - 1;
		 return currentTemp;
	 }

     
      public double changeTemp( double t ){
      	currentTemp = currentTemp + t;
      	return currentTemp;
      }
      
      public static void main( String args[] ){
    	 Temperature temp1 = new Temperature(52);
    	 Temperature temp2 = new Temperature(45);
    	 
    	 System.out.println("Temperature 1 is: " + temp1.getTemp() + " and temperature 2 is: " + temp2.getTemp());
    	 temp1.incrementTemp();
    	 System.out.println("Testing increment. Temp1 incremented = " + temp1.getTemp());
    	 temp1.decrementTemp();
    	 System.out.println("Testing decrement. Temp1 decremented from most recent value = " + temp1.getTemp());
      }
	
}
