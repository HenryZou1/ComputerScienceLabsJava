public class Province
{
   //-----------Start below here. To do: approximate lines of code = 14
   //
   /**
    * Create 3 instance variables: one of type String to store the
    * province name, one of type int to store the population and one of 
    * type double to store the area
    */
   private String name;
   private int population;
   private double area;
   
   
   
   /**
      Create a constructor method that has 3 parameters,
      one to initialize the name, one to initialize the 
      population and one to initialize the area 
   */
   public Province(String name, int population, double area){
	this.name = name;
	this.population = population;
	this.area = area;
   }
   
   
   
   
   
   
   /**
      Create a public method called getProvinceStats() that returns a String
      containing the name of the province followed by the population followed
      by the area
   */
   
   public String getProvinceStats(){
	return "Name: " + name + " Population "+ population + " Area " + area;
   }
   
   
   
   /**
      Create a public method getPopulationDensity() that returns a double
      number representing the population density. Make sure to check
      that area is > 0 before dividing population by it 
   */
   
   public double getPopulationDensity(){
	   if (area == 0)
		return 0;
	   return population/area;
   }
   
   
   
   
   
   
   
   
   
   //-----------------End here. Please do not remove this comment. Reminder: no changes outside the todo regions.
}
