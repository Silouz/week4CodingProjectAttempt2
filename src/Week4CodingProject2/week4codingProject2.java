package Week4CodingProject2;

public class week4codingProject2 {

	public static void main(String[] args) {
		
		// TODO Auto-generated method stub
		
		//1 Create an array of int called ages that contains the following values: 3, 9, 23, 64, 2, 8, 28, 93.

        //a. Programmatically subtract the value of the first element in the array from the value in the last element of the array (i.e. do not use ages[7] in your code). Print the result to the console.  

         //b. Create a new array of int called ages2 with 9 elements (ages2 will be longer than the ages array, and have more elements).  
		
		        Integer ages [] = {3, 9, 23, 64, 2, 8, 28, 93};
				
				
				System.out.println((ages[ages.length-1]) - ages[0]  );
				
				
				//Create a new array called ages2
				Integer ages2 [] = {1, 2, 3, 4, 5, 6, 7, 8, 9};
				System.out.println((ages2[ages2.length-1]) - ages2[0]);
				
				//iii. Show that using the index values for the elements 
				//is dynamic (works for arrays of different lengths).
				
				
				
				//c. use loop to iterate and calculate the average age.
				int totalSum = 0;
				for (int i = 0;i < ages2.length; i++) {
					totalSum += ages2[i];
				}
					System.out.println(totalSum/ages2.length);
			//2. Create an array of String called names 
				String [] names  = {"Sam", "Tommy", "Tim", "Sally", "Buck", "Bob"};
				double sumOfLetters = 0;
				for (String name : names) {
					sumOfLetters += name.length();
				}
				System.out.println(sumOfLetters/names.length);
				
		//a. Use a loop to iterate through the array and calculate the average number of letters per name.
		//Print the result to the console.
				
				
			
		//b. Use a loop to iterate through the array again and concatenate all the names together, separated 
		//by spaces, and print the result to the console.
				
		//7. Write a method that takes a String, word, and an int, n, as arguments and returns the word 
		//concatenated to itself n number of times. (i.e. if I pass in “Hello” and 3, I expect the method to return “HelloHelloHello”).
				String inputWord = "Hello";
		        int repeatCount = 3;
		        String repeatedString = repeatWord(inputWord, repeatCount);
		        System.out.println(repeatedString);
		//8. 
				String fullName1 = fullName("David" , "Singh"); //how would you invoke?? ****
				System.out.println(fullName1);

		//10 
			double[] doubles = {25.5, 20.7, 35.5};
			System.out.println(averageOfArray(doubles));
					
			
		//11
			
		//12. 
			
			boolean isHotOutside = true;
			double moneyInPocket = 15.50;
			boolean decisionToDrink =  willBuyDrink (isHotOutside , moneyInPocket); 
			System.out.println("Is it me or is it hot? I feel Parched? " + decisionToDrink);
		//13
			double testResult = 6.2;

		    if (hasAdhd(testResult)) {
		        System.out.println("You may have ADHD, set upt an interview with a specialist");
		    } else {
		        System.out.println("It's unlikely that you have ADHD, but call a profesional for an interview");
		    }
		    
		    
		    
			}  //main method *********************************************************************************
		   
			
			//7. Write a method that takes a String, word, and an int, n, as arguments and returns the word 
			//concatenated to itself n number of times. (i.e. if I pass in “Hello” and 3, I expect the method to 
			//return “HelloHelloHello”).
		 
			 public static String repeatWord(String word, int n) {
			        String result = "";
			        
			        for (int i = 0; i < n; i++) {
			            result += word;
			        }
			        
			        return result;
			    }
			
			//8. Write a method that takes two Strings, firstName and lastName, and returns a full name 
			//(the full name should be the first and the last name as a String separated by a space).
		    public static String fullName (String firstName, String lastName) {
		    	return firstName + " " + lastName; 
		    
			
		}
			//9. Write a method that takes an array of int and returns true if the sum of all the ints in 
			//the array is greater than 100.
			public static boolean SumOfIntsGreater(int[] array) {
				int sum = 0;
				for (int num : array) {
					sum += num;
					
				}
				return sum > 100;
			}
			

			//10. Write a method that takes an array of double and returns the average of all the elements in the array.
		 	public static double averageOfArray (double[] array) {
		 		
		 		     double sum = 0; 
		 			 for (double number : array) {
		 				 sum += number;
		 				 
		 			 }
		 			 return sum / array.length; 
		 		}
		 	
		 	
		 
			//11. Write a method that takes two arrays of double and returns true if the average of the elements in the first array 
			//is greater than the average of the elements in the second array.
		 	public static boolean FirstArrayGreaterThanSecondArray (double[]array1, double[] array2) {
		 		double average1 = averageOfArray (array1); 
		 		double average2 = averageOfArray (array2);
		 		if (average1 > average2) {
		 			return true;
		 		}else { 
		 			return false; 
		 		}
		 		//return average1 > average2;
		 	}
		 
			//12. Write a method called willBuyDrink that takes a boolean isHotOutside, 
		 	//and a double moneyInPocket, and returns true if it is
			//hot outside and if moneyInPocket is greater than 10.50.
		 		
		 	public static boolean willBuyDrink (boolean isHotOutside, double moneyInPocket) {
		 		return isHotOutside && moneyInPocket >10.50;
		 		
		 	}
		 	
			//13. Create a method of your own that solves a problem. In comments, write what the method does and why you created it.
		 	//ADHD test based on a test value to see if you have adhd and need to see a Profesional. 
		 	//test is based on QB Test value that measures attention and eye movement. 
		 	//I am creating a method that takes a double testResult and returns boolean of hasADhd
		 	// or not based on if the test result is greater than 5.0
		 	
		 public static boolean hasAdhd(double testResult) {
			return testResult > 5.0;
					
		}

			
			
			
			
			
			
			
			
			
			
			

			}//public class void main

		
	


