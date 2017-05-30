
package graduatingWeekOne;

import java.util.Scanner;

public class NumbersToWords {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int num = 0;
		int millionX = 0;
		int thousandX = 0;
		int oneX = 0;
		//int modulsMillionX = 0;
		int modulusThousandX = 0;
		int modulusOneX = 0;
		
		String one = "One";
		String two = "Two";
		String three = "Three";
		String four = "Four";
		String five = "Five";
		String six = "Six";
		String seven = "Seven";
		String eight = "Eight";
		String nine = "Nine";
		String ten = "Ten";
		String eleven = "Eleven";
		String twelve = "Twelve";
		String thirteen = "Thirteen";
		String fourteen = "Fourteen";
		String fifteen = "Fifteen";
		String sixteen = "Sixteen";
		String seventeen = "Seventeen";
		String eighteen = "Eighteen";
		String nineteen = "Nineteen" ;
		String twenty = "Twenty";
		String thirty = "Thirty";
		String forty = "Forty";
		String fifty = "Fifty";
		String sixty = "Sixty";
		String seventy = "Seventy";
		String eighty = "Eighty";
		String ninety = "Ninety";
		String hundred = "Hundred";
		String thousand = "Thousand";
		String million = "Million";
		
		
		
		boolean again = false;
		boolean keepGoing = false;
		String yesOrNo = "";
		Scanner numScan = new Scanner(System.in);
		Scanner strScan = new Scanner(System.in);
		
		do{
			
			num = 0;
			millionX = 0;
			thousandX = 0;
			oneX = 0;
			//modulsMillionX = 0;
			modulusThousandX = 0;
			modulusOneX = 0;
			
			do{
				System.out.println("Enter number: ");
				//checks if letters are input
				if (numScan.hasNextInt()){
					num = numScan.nextInt();
					//checks if the day is valid
					if(num < 1){
						System.out.println("The number you entered wasn't valid. Please try again.");					
					}
					else if(true){
						oneX = num%1000;
						modulusOneX = num - oneX;
						if(num>1000){
							thousandX = modulusOneX/1000%1000;
							modulusThousandX = num - thousandX - oneX;
						}
						if(num > 1000000){
							millionX = modulusThousandX/1000000;
							
						}
							System.out.println(oneX);
							System.out.println(modulusOneX);
							System.out.println(thousandX);
							System.out.println(modulusThousandX);
							System.out.println(millionX);
							System.out.println(millionX%100);
					}
					
				}else{
					System.out.println("You didn't submit a whole number. Please try again.");
					numScan.next();
					keepGoing = true;
					continue;
				}
			}while(false);
			
			if (millionX>100){
				//System.out.print(millionX/100);
				switch (millionX/100) {
	            case 1:  System.out.print(one);
	                     break;
	            case 2:  System.out.print(two);
	                     break;
	            case 3:  System.out.print(three);
	                     break;
	            case 4:  System.out.print(four);
	                     break;
	            case 5:  System.out.print(five);
	                     break;
	            case 6:  System.out.print(six);
	                     break;
	            case 7:  System.out.print(seven);
	                     break;
	            case 8:  System.out.print(eight);
	                     break;
	            case 9:  System.out.print(nine);
	                     break;
				}
				System.out.print(" " + hundred + " ");
			}
			if(millionX>1){
				//System.out.print(millionX/10%10);
				if(millionX/10%10>1){
					switch (millionX/100) {

					case 1: case 2:  System.out.print(twenty);
		                     break;
		            case 3:  System.out.print(thirty);
		                     break;
		            case 4:  System.out.print(forty);
		                     break;
		            case 5:  System.out.print(fifty);
		                     break;
		            case 6:  System.out.print(sixty);
		                     break;
		            case 7:  System.out.print(seventy);
		                     break;
		            case 8:  System.out.print(eighty);
		                     break;
		            case 9:  System.out.print(ninety);
		                     break;
					}
					
					System.out.print(" ");
					switch (millionX%10) {

		            case 1:  System.out.print(one);
		                     break;
		            case 2:  System.out.print(two);
		                     break;
		            case 3:  System.out.print(three);
		                     break;
		            case 4:  System.out.print(four);
		                     break;
		            case 5:  System.out.print(five);
		                     break;
		            case 6:  System.out.print(six);
		                     break;
		            case 7:  System.out.print(seven);
		                     break;
		            case 8:  System.out.print(eight);
		                     break;
		            case 9:  System.out.print(nine);
		                     break;
					}
				
			} 
			if(millionX%100<20){
				switch (millionX%100) {
				
		            case 1:  System.out.print(one);
		                     break;
		            case 2:  System.out.print(two);
		                     break;
		            case 3:  System.out.print(three);
		                     break;
		            case 4:  System.out.print(four);
		                     break;
		            case 5:  System.out.print(five);
		                     break;
		            case 6:  System.out.print(six);
		                     break;
		            case 7:  System.out.print(seven);
		                     break;
		            case 8:  System.out.print(eight);
		                     break;
		            case 9:  System.out.print(nine);
		                     break;
		            case 10:  System.out.print(ten);
		                     break;
		            case 11:  System.out.print(eleven);
		                     break;
		            case 12:  System.out.print(twelve);
		                     break;
		            case 13:  System.out.print(thirteen);
		                     break;
		            case 14:  System.out.print(fourteen);
		                     break;
		            case 15:  System.out.print(fifteen);
		                     break;
		            case 16:  System.out.print(sixteen);
		                    break;
		            case 17:  System.out.print(seventeen);
		                     break;
		            case 18:  System.out.print(eighteen);
		                     break;
		            case 19:  System.out.print(nineteen);
                    		 break;
								}
				}
				
			System.out.print(" " + million + " ");
			}
			if (thousandX>100){
				//System.out.print(millionX/100);
				switch (thousandX/100) {
	            case 1:  System.out.print(one);
	                     break;
	            case 2:  System.out.print(two);
	                     break;
	            case 3:  System.out.print(three);
	                     break;
	            case 4:  System.out.print(four);
	                     break;
	            case 5:  System.out.print(five);
	                     break;
	            case 6:  System.out.print(six);
	                     break;
	            case 7:  System.out.print(seven);
	                     break;
	            case 8:  System.out.print(eight);
	                     break;
	            case 9:  System.out.print(nine);
	                     break;
				}
				System.out.print(" " + hundred + " ");
			}
			if(thousandX>1){
				//System.out.print(thousandX/10%10);
				if(thousandX/10%10>1){
					switch (thousandX/10%10) {

					case 1: case 2:  System.out.print(twenty);
		                     break;
		            case 3:  System.out.print(thirty);
		                     break;
		            case 4:  System.out.print(forty);
		                     break;
		            case 5:  System.out.print(fifty);
		                     break;
		            case 6:  System.out.print(sixty);
		                     break;
		            case 7:  System.out.print(seventy);
		                     break;
		            case 8:  System.out.print(eighty);
		                     break;
		            case 9:  System.out.print(ninety);
		                     break;
					}
					
					System.out.print(" ");
					switch (thousandX%10) {

		            case 1:  System.out.print(one);
		                     break;
		            case 2:  System.out.print(two);
		                     break;
		            case 3:  System.out.print(three);
		                     break;
		            case 4:  System.out.print(four);
		                     break;
		            case 5:  System.out.print(five);
		                     break;
		            case 6:  System.out.print(six);
		                     break;
		            case 7:  System.out.print(seven);
		                     break;
		            case 8:  System.out.print(eight);
		                     break;
		            case 9:  System.out.print(nine);
		                     break;
					}
				
			} 
			if(thousandX%100<20){
				switch (thousandX%100) {
				
		            case 1:  System.out.print(one);
		                     break;
		            case 2:  System.out.print(two);
		                     break;
		            case 3:  System.out.print(three);
		                     break;
		            case 4:  System.out.print(four);
		                     break;
		            case 5:  System.out.print(five);
		                     break;
		            case 6:  System.out.print(six);
		                     break;
		            case 7:  System.out.print(seven);
		                     break;
		            case 8:  System.out.print(eight);
		                     break;
		            case 9:  System.out.print(nine);
		                     break;
		            case 10:  System.out.print(ten);
		                     break;
		            case 11:  System.out.print(eleven);
		                     break;
		            case 12:  System.out.print(twelve);
		                     break;
		            case 13:  System.out.print(thirteen);
		                     break;
		            case 14:  System.out.print(fourteen);
		                     break;
		            case 15:  System.out.print(fifteen);
		                     break;
		            case 16:  System.out.print(sixteen);
		                    break;
		            case 17:  System.out.print(seventeen);
		                     break;
		            case 18:  System.out.print(eighteen);
		                     break;
		            case 19:  System.out.print(nineteen);
                    		 break;
								}
				}
				
			System.out.print(" " + thousand + " ");
			}
			
			if (oneX>100){
				//System.out.print(millionX/100);
				switch (oneX/100) {
	            case 1:  System.out.print(one);
	                     break;
	            case 2:  System.out.print(two);
	                     break;
	            case 3:  System.out.print(three);
	                     break;
	            case 4:  System.out.print(four);
	                     break;
	            case 5:  System.out.print(five);
	                     break;
	            case 6:  System.out.print(six);
	                     break;
	            case 7:  System.out.print(seven);
	                     break;
	            case 8:  System.out.print(eight);
	                     break;
	            case 9:  System.out.print(nine);
	                     break;
				}
				System.out.print(" " + hundred + " ");
			}
			if(oneX>1){
				//System.out.print(oneX/10%10);
				if(oneX/10%10>1){
					switch (oneX/10%10) {

					case 1: case 2:  System.out.print(twenty);
		                     break;
		            case 3:  System.out.print(thirty);
		                     break;
		            case 4:  System.out.print(forty);
		                     break;
		            case 5:  System.out.print(fifty);
		                     break;
		            case 6:  System.out.print(sixty);
		                     break;
		            case 7:  System.out.print(seventy);
		                     break;
		            case 8:  System.out.print(eighty);
		                     break;
		            case 9:  System.out.print(ninety);
		                     break;
					}
					
					System.out.print(" ");
					switch (oneX%10) {

		            case 1:  System.out.print(one);
		                     break;
		            case 2:  System.out.print(two);
		                     break;
		            case 3:  System.out.print(three);
		                     break;
		            case 4:  System.out.print(four);
		                     break;
		            case 5:  System.out.print(five);
		                     break;
		            case 6:  System.out.print(six);
		                     break;
		            case 7:  System.out.print(seven);
		                     break;
		            case 8:  System.out.print(eight);
		                     break;
		            case 9:  System.out.print(nine);
		                     break;
					}
				
			} 
				//System.out.println(oneX%100<20);
			if(oneX%100<20){
				switch (oneX%100) {
				
		            case 1:  System.out.print(one);
		                     break;
		            case 2:  System.out.print(two);
		                     break;
		            case 3:  System.out.print(three);
		                     break;
		            case 4:  System.out.print(four);
		                     break;
		            case 5:  System.out.print(five);
		                     break;
		            case 6:  System.out.print(six);
		                     break;
		            case 7:  System.out.print(seven);
		                     break;
		            case 8:  System.out.print(eight);
		                     break;
		            case 9:  System.out.print(nine);
		                     break;
		            case 10:  System.out.print(ten);
		                     break;
		            case 11:  System.out.print(eleven);
		                     break;
		            case 12:  System.out.print(twelve);
		                     break;
		            case 13:  System.out.print(thirteen);
		                     break;
		            case 14:  System.out.print(fourteen);
		                     break;
		            case 15:  System.out.print(fifteen);
		                     break;
		            case 16:  System.out.print(sixteen);
		                    break;
		            case 17:  System.out.print(seventeen);
		                     break;
		            case 18:  System.out.print(eighteen);
		                     break;
		            case 19:  System.out.print(nineteen);
                    		 break;
								}
				}
			/*System.out.print(oneX);
				if(oneX==1){
					System.out.print(one);
				}*/
			//System.out.print(" " + thousand + " ");
			}
			System.out.println();
		}while(letsGoAgain(yesOrNo, again, strScan));
		numScan.close();
		strScan.close();
	}
	
	public static boolean letsGoAgain(String yesOrNo, boolean again, Scanner strScan){
		do{
			System.out.println("Do you want to continue? Y or N");
			yesOrNo = strScan.nextLine();
			//in case the user types "y" or "n" it will still go through
			yesOrNo = yesOrNo.toUpperCase();
			if(yesOrNo.equals("Y")){
				again = true;
			}
			else if(yesOrNo.equals("N")){
				again = false;
			}
			else{
				System.out.println("You didn't type \"Y\" or \"N\". please try again");
			}
			
		}while((!(yesOrNo.equals("Y"))) && (!(yesOrNo.equals("N"))));
		
		return again;
	}

}
