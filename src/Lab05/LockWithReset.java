package Lab05;

import java.util.ArrayList;
import java.util.NoSuchElementException;
import java.util.Scanner;
import javax.swing.JOptionPane;

public class LockWithReset extends Lock{

	public LockWithReset(int limit, Combination combo){
		super(limit, combo);
	}
	
	public void resetNaive(){
		String str = JOptionPane.showInputDialog(null, "Type a new combination");
		if(str == null)
			return;
		Scanner kb = new Scanner(str);
		String line = kb.nextLine();
		Scanner scan = new Scanner(line);
		
		ArrayList<Integer> list = new ArrayList<Integer>();
		
		while(scan.hasNext()){
			list.add(scan.nextInt());
		}
		
		if(list.size() != 3)
			throw new NoSuchElementException();
		
		Combination combo = new Combination(list.get(0), list.get(1), list.get(2));
		
		if(!combo.isWithinRange(this.getDialLimit()))
			throw new InvalidLockCombinationException();
		
		unlock = combo;
		
	}
	
	public void resetRetry(){
		boolean bool = true;
		while(bool){
			try{
				resetNaive();
			}
			catch(NoSuchElementException e){
				JOptionPane.showInputDialog(null, "Type 3 integers separated by spaces");
				continue;
			}
			catch(InvalidLockCombinationException e){
				JOptionPane.showInputDialog(null, "Type 3 integers in the range [0.." + this.getDialLimit() + "]");
				continue;
			}
			bool = false;
		}
		
	}
	
	public static void main(String[] args) {
		Combination c = new Combination( 1, 2, 3 );
		LockWithReset lock = new LockWithReset( 5, c );
		lock.resetNaive();
	}
	
}
