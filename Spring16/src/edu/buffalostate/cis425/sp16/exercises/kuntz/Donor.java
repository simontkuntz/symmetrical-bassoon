package edu.buffalostate.cis425.sp16.exercises.kuntz;

public class Donor
{
    private String name = "no name";
    private String rating = "none";
    private String address = "n/a";

    /**
     * Donor() constructor sets the object's name and rating
     * @param str -- a String giving the donor's name
     * @param str2 -- a String giving the donor's rating
     */
    public Donor(String str, String str2, String str3)
    {
        name = str;
        rating = str2;
        address = str3;
    }

    /**
     * getName() returns the donor's name
     * @return a String giving the person's name
     */
    public String getName()
    {
        return name;
    }
    
    public String getAddress()
    {
    	return address;
    }
    
    public void updateRating(double amt){

    	if (amt >= 1000){
    		rating = "high";
    	}
    	
    	else if(amt <100){
    		rating = "low";
    	}
    	
    	else if((amt >=100)&&(amt < 1000)){
    		rating = "medium";
    	}
    	
    	else{
    		rating = "none";
    	}
    }
    /**
     * getRating() returns the donor's rating
     * @return a String giving the person's rating
     */
    public String getRating()
    {
        if (rating.equals ("high"))
            return "high";
        if (rating.equals ("medium"))
            return "medium";
        if (rating.equals("low"))
        	return "low";
        
        return "none";
    }

    /**
     * main() creates three Donor instances and tests this
     *  classes methods.
     */
    public static void main (String argv[])
    {
        Donor donor1 = new Donor("Jeff", "high", "2679");
        System.out.println("Donor's name is " + donor1.getName());
        System.out.println(donor1.getName() + "'s rating is " + donor1.getRating());
        System.out.println(donor1.getName() + "'s address is " + donor1.getAddress());

        Donor donor2 = new Donor("Correy", "medium", "2390");
        System.out.println("Donor's name is " + donor2.getName());
        System.out.println(donor2.getName() + "'s rating is " + donor2.getRating());
        System.out.println(donor2.getName() + "'s address is " + donor2.getAddress());

        Donor donor3 = new Donor("Veronica", "none", "3920");
        System.out.println("Donor's name is " + donor3.getName());
        System.out.println(donor3.getName() + "'s rating is " + donor3.getRating());
        System.out.println(donor3.getName() + "'s address is " + donor3.getAddress());
        
        Donor donor4 = new Donor("Bill", "low", "4120");
        System.out.println("Donor's name is " + donor4.getName());
        System.out.println(donor4.getName() + "'s rating is " + donor4.getRating());
        System.out.println(donor4.getName() + "'s address is " + donor4.getAddress());
        donor4.updateRating(150);
        System.out.println(donor4.getName() + "'s new rating is " + donor4.getRating());
    } // main()
}