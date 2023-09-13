		package studio2;
		
		import java.util.Scanner;
		
		public class Ruin {
		
			public static void main(String[] args) {
			
				Scanner in = new Scanner(System.in);
				System.out.println("Start Amount");
				double startAmount = in.nextDouble();
				System.out.println("Enter Win Chance");
				double winChance = in.nextDouble();
				System.out.println("Enter Win Limit");
				double winLimit = in.nextDouble();
				System.out.println("Enter Total Simulations");
				int totalSimulations = in.nextInt();
				
	for(int i = 1; i <=totalSimulations; i++){
			
			
		while (startAmount <= winLimit || startAmount == 0){
				
			    if(winChance >= Math.random()){
				
				startAmount++;
			}
				
				else {
					
					startAmount--;
				}
			    
        if (startAmount == winLimit) {
		    	System.out.println("You Win");
		        break;
        }
		
		else {
			System.out.println("You Lose");
			break;
		}
			
		    }
			
		}
			}
		}
		
	
	
