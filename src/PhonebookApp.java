
public class PhonebookApp {

	public static void main(String[] args) {
		Person[] phonebook = new Person[] {
	      new Person("Aja", "Goehring"),
				new Person("Arvilla", "Hodzic"),
				new Person("Lavette", "Viveiros"),
				new Person("Mandi", "Arguello"),
				new Person("Annett", "Mize"),
				new Person("Shantell", "Dike"),
				new Person("Daphine", "Dillman"),
				new Person("Louella", "Hodzic"),
				new Person("Amalia", "Brigman"),
				new Person("Alphonse", "Varley"),
				new Person("Phil", "Ewen"),
				new Person("Olimpia", "Saenz"),
				new Person("Erminia", "Mirando"),
				new Person("Edythe", "Castenada"),
				new Person("Robbi", "Maese"),
				new Person("Kelley", "Printz"),
				new Person("Dannie", "Ocasio"),
				new Person("Charles", "Hodzic"),
				new Person("Rubie", "Washer"),
				new Person("Bryant", "Masker"),
				new Person("Julius", "Stalzer"),
				new Person("Clement", "Prager"),
				new Person("Kathie", "Oquin"),
				new Person("Shakira", "Hernandes"),
				new Person("Armand", "Boler"),
				new Person("Foster", "Tims"),
				new Person("Hana", "Howson"),
				new Person("Arletta", "Nastasi"),
				new Person("Rebeca", "Mcnally"),
				new Person("Hsiu", "Rosemond"),
				new Person("Tyson", "Hodzic"),
				new Person("Celina", "Gallego"),
				new Person("Criselda", "Herrell"),
				new Person("Kendall", "Bascombe"),
				new Person("Nubia", "Deeter"),
				new Person("Joannie", "Deshields"),
				new Person("Sarai", "Criner"),
				new Person("Joette", "Anderson"),
				new Person("Alfonzo", "Rubinstein"),
				new Person("Justin", "Capshaw"),
				new Person("Elton", "Schnee"),
				new Person("Sage", "Sherrer"),
				new Person("Vita", "Neihoff"),
				new Person("Nikia", "Moody"),
				new Person("Linsey", "Profitt"),
				new Person("Tanesha", "Hodhic"),
				new Person("Billye", "Widman"),
				new Person("Kareem", "Whalley"),
		};

		/*System.out.println("Sortirani po imenima");
		sortByFirstName(phonebook);
		printPhonebook(phonebook);
		System.out.println();*/

		System.out.println("Sortirani po prezimenima \n");
		sortByLastName(phonebook);
		printPhonebook(phonebook);
	}

	private static void sortByFirstName(Person[] array) {
		for (int i = 1; i < array.length; i++) {

			Person key = array[i];
			int j = i;
						
			while (j > 0 && key.getValueFirstName().compareTo(array[j-1].getValueFirstName()) < 0) {

				array[j] = array[j-1];
				j--;
			}
			 array[j] = key;
		}
		
	}

	private static void sortByLastName(Person[] array) {
		for (int i = 1; i < array.length; i++) {

			Person key = array[i];
			int j = i;
						
			while (j > 0 && key.getValueLasttName().compareTo(array[j-1].getValueLasttName()) < 0) {

				array[j] = array[j-1];
				j--;
			}
			 array[j] = key;
		}
	}

	private static void printPhonebook(Person[] phonebook) {
		for (Person person : phonebook) {
			System.out.println(person);
		}
	}
	
	
}
