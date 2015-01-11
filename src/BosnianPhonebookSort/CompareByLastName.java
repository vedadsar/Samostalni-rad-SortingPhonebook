package BosnianPhonebookSort;

public class CompareByLastName implements Comparator {

	/**
	 * Compare method which is sorting persons. To check if our names
	 * have bosnian character as 'dž'. Because of this check I turned
	 * our names into char array and then into float array( for managing values of chars)
	 */
	public int compare(Person left, Person right){
		float leftNameValue;
		float rightNameValue;
		
		char[] leftName = left.getLastName().toCharArray();
		char[] rightName = right.getLastName().toCharArray();
		
		// If left length is higher then right length, we're checking to right length. 
		if(left.getLastName().length() >= right.getLastName().length()){
			int size = rightName.length;			
			float[] leftNameArray = charToFloat(leftName);
			float[] rightNameArray = charToFloat(rightName);
			
			for(int i = 0; i<size; i++ ){
				if(leftNameArray[i] > rightNameArray[i])
					return 1;
				if(leftNameArray[i] < rightNameArray[i])
					return -1;				
			}			
		}
		// If right length is higher then left length, we're checking to left length. 
		if(left.getLastName().length() < right.getLastName().length()){
			int size =leftName.length;			
			float[] leftNameArray = charToFloat(leftName);
			float[] rightNameArray = charToFloat(rightName);
			
			for(int i = 0; i<size; i++ ){
				if(leftNameArray[i] > rightNameArray[i])
					return 1;
				if(leftNameArray[i] < rightNameArray[i])
					return -1;				
			}			
		}
					
		return 0;
		
	}
	

	/**
	 * This method gets as parameter our name as char array, and turning it into
	 * float array by ASCII values of name. In here we'll be sorting bosnian characters
	 * as 'È' 'Dž'...
	 * Once we find special character as 'è' we replace his float value by adding
	 *  'c' + 0.5. That way we're sure it will be right after c.
	 * @param array
	 * @return
	 */
	private float [] charToFloat(char [] array){
		float [] floatArray = new float[array.length];
		
		for(int i=0; i<array.length; i++)
			floatArray[i] = (float)array[i];
		
		
		for(int i=0; i<array.length-1;i++){
			if(array[i] == 'D' && array[i+1] == 'ž'){
				floatArray[i] =(float) ('D' + 0.5);	
				floatArray[i+1] =(float) ('d' + 0.5);	
			}
			if(array[i] == 'd' && array[i+1] == 'ž')
				floatArray[i+1] =(float) ('d' + 0.5);				
			if(array[i] == 'Ð' )
				floatArray[i] =(float) ('D' + 0.7);
			if(array[i] == 'ð' )
				floatArray[i] =(float) ('d' + 0.7);
			if(array[i] == 'È' )
				floatArray[i] =(float) ('C' + 0.5);
			if(array[i] == 'Æ' )
				floatArray[i] =(float) ('C' + 0.7);
			if(array[i] == 'è' )
				floatArray[i] =(float) ('c' + 0.5);
			if(array[i] == 'æ' )
				floatArray[i] =(float) ('c' + 0.7);
			if(array[i] == 'Š' )
				floatArray[i] =(float) ('S' + 0.5);
			if(array[i] == 'š' )
				floatArray[i] =(float) ('s' + 0.5);
		}
		
		return floatArray;
	}
	
}
