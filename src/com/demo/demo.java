package com.demo;

public class demo {
	
	public static void main(String args[]) throws Exception{
		String lunchOption = "pasta";
		String recommendation = getRecommendation(lunchOption);
		System.out.println("Recommendation is "+recommendation);
	}

	private static String getRecommendation(String lunchOption) throws Exception{
		return switch(lunchOption) {
		   case "burger" -> "Burger King";
		   case "sub", "salad"    -> {
			   String location = "Redmond";
			   yield "Subway:"+location;
		   }
		   default       -> throw new Exception("Not a valid choice");
		};
		
		
		/*switch(lunchOption) {
		   case "burger" :
		      joint = "Burger King";
		      break; // optional
		   case "sub" :
			 //  String location = "Redmond";
			   joint = "Subway";
		      break;
		   default : // Optional
			  // String location = "Bellevue";
		      joint = "Kanishka";
		}*/
	}
	
}
