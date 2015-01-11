package BosnianPhonebookSort;


public class Person {
	private String firstName;
	private String lastName;
	
	public Person(String firstName, String lastName) {
		this.firstName = firstName;
		this.lastName = lastName;
	}
	
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	
	/**
	 * Method which is looking if our first name/last name contains 'Dž'.
	 * In case we found 'Dž' we will set 'z' char value to 'd'. This way we're sure
	 * that sort will put 'dz' value to same as 'dd' value which isn't great but its 
	 * good at this moment.
	 * @return
	 */
	public String getValueFirstName (){
		String value = firstName;
		char [] firstNameToArray = value.toCharArray();
		int illegalCounter = firstNameToArray.length;
		
		for(int i=0; i<firstNameToArray.length-1; i++){
			//Checking if we found character 'Dž'.
			if(firstNameToArray[i] == 'd' && firstNameToArray[i+1] == 'ž'){
				firstNameToArray[i+1] = 'd';				
				illegalCounter--;
			}
			if(firstNameToArray[i] == 'd' && firstNameToArray[i+1] == 'ž'){
				firstNameToArray[i+1] = 'd';				
				illegalCounter--;
			}
			
		}
		
		value = "";
		for(int i=0; i<illegalCounter;i++)
			value += ""+firstNameToArray[i];
		
		return value;
	}
	
	/**
	 * Same as method for first name.
	 * @return
	 */
	public String getValueLasttName (){
		String value = lastName;
		char [] firstNameToArray = value.toCharArray();
		int illegalCounter = firstNameToArray.length;
		
		for(int i=0; i<firstNameToArray.length-1; i++){
			//Checking if we found character 'Dž'.
			if(firstNameToArray[i] == 'd' && firstNameToArray[i+1] == 'z'){
				firstNameToArray[i+1] = 'd';
				illegalCounter--;
			}
			
		}
		
		value = "";
		for(int i=0; i<illegalCounter;i++)
			value += ""+firstNameToArray[i];
		
		return value;
	}
	
	@Override
	public String toString() {
		return String.format("%s, %s", lastName, firstName);
	}

}
