
public class ComparatorLastName implements Comparator{
	/**
	 * Method which is my compare method. To avoid using compareTo method from
	 * strings we made this Compare method. First i moved all names into 
	 * char array. Then i looked for arrays size so I know till when to loop.
	 * Then method checks value of each character and returning value -1 if left
	 * name is lower, 1 if its higher and 0 if names are equal.
	 */
	@Override
	public int compare(Person left, Person right) {
		char[] leftPersonCharArray = left.getValueLasttName().toCharArray();
		char[] rightPersonCharArray = right.getValueLasttName().toCharArray();
		
		// Using sizes to know while we'll repeat our loop.
		int leftSize = leftPersonCharArray.length;
		int rightSize = rightPersonCharArray.length;
		
		
		if(leftSize <= rightSize){
			
			for(int i=0; i<leftSize; i++){
				if(leftPersonCharArray[i] < rightPersonCharArray[i])
					return -1;
				else if(leftPersonCharArray[i] > rightPersonCharArray[i])
					return 1;
								
			}
		}
		
		else{
			
			for(int i=0; i<rightSize; i++){
				if(leftPersonCharArray[i] < rightPersonCharArray[i])
					return -1;
				else if(leftPersonCharArray[i] > rightPersonCharArray[i])
					return 1;
							
			}
		}
				
		return 0;
	}

}
