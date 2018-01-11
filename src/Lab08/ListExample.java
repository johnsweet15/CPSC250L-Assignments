package Lab08;

public class ListExample {
	
	public static Node<Character> getUppercaseList(Node<Character> head){
		Node<Character> current = head;
		if(current == null)
			return null;
		
		if(Character.isLowerCase(current.value)){
			while((Character.isLowerCase(current.value))){
				if(current.next == null)
					return null;
				else
					current = current.next;
			}
			Node<Character> iHateThis = current.next;
			
			while(iHateThis.next != null){
				while(Character.isLowerCase(iHateThis.value)){
					if(iHateThis.next == null)
						return current;
					else
						iHateThis = iHateThis.next;
				}	
				current.next = iHateThis;
			}
			return current;
		}
		else{
			while(Character.isUpperCase(current.value)){
				return current;
			}
		}
		return current;
	}
}
