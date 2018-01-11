package Lab06;

import java.io.*;
import java.util.*;

public class CookieJar {

	public static void cashingIn(File input, File output){
		try{
			Scanner scanner = new Scanner(input);
			PrintWriter writer = new PrintWriter(output);
			double money = 0.0;
			
			while(scanner.hasNext()){
				int n = scanner.nextInt();
				String str = scanner.next();
				
				if(str.equals("penny") || str.equals("pennies"))
					money += (n * .01);
				if(str.equals("nickel") || str.equals("nickels"))
					money += (n * .05);
				if(str.equals("dime") || str.equals("dimes"))
					money += (n * .10);
				if(str.equals("quarter") || str.equals("quarters"))
					money += (n * .25);
			}
			
			if(money == 0.0){
				String noMoney = "You have no money in the jar";
				writer.printf("%s", noMoney);
			}
			else
				writer.printf("You have $%,.2f in the jar", money);
			
			scanner.close();
			writer.close();
		}
		catch(IOException e){
			
		}
	}
}
