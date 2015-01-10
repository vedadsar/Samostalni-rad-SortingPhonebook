/**
 * Class which compares two objects of type Person.
 * @author Vedad_2
 *
 */
public class ComparatorFirstName implements Comparator {

	
	/**
	 * Method which is my compare method. To avoid using compareTo method from
	 * strings we made this Compare method. First i moved all names into 
	 * char array. Then i looked for arrays size so I know till when to loop.
	 * Then method checks value of each character and returning value -1 if left
	 * name is lower, 1 if its higher and 0 if names are equal.
	 */
	@Override
	public int compare(Person left, Person right) {
		
		char[] leftPersonCharArray = left.getValueFirstName().toCharArray();
		char[] rightPersonCharArray = right.getValueFirstName().toCharArray();
		
		// Using sizes to know while we'll repeat our loop.
		int leftSize = leftPersonCharArray.length;
		int rightSize = rightPersonCharArray.length;
		
		//Case when left size is lower or equal to right size.
		if(leftSize <= rightSize){
			// Checking each character
			for(int i=0; i<leftSize; i++){
				if(leftPersonCharArray[i] < rightPersonCharArray[i])
					return -1;
				else if(leftPersonCharArray[i] > rightPersonCharArray[i])
					return 1;
					
			}
		}
		// Same as first case, just left size is higher then right size.
		else{
			
			for(int i=0; i<rightSize; i++){
				if(leftPersonCharArray[i] < rightPersonCharArray[i])
					return -1;
				else if(leftPersonCharArray[i] > rightPersonCharArray[i])
					return 1;
							
			}
		}
		// Returns 0 if names are equal.		
		return 0;
		
	}

}
