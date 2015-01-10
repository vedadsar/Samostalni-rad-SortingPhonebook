
public class testklas {
	public static void main(String[] args) {
		Person p = new Person("Hodzic", "Hodzic");
		Person p1 = new Person("Tyson", "Hodzic");
		Person p2 = new Person("Shakira", "Hernandes");

		System.out.println(p.getValueLasttName());
		System.out.println(p1.getValueLasttName());
		ComparatorLastName cmp = new ComparatorLastName();
		System.out.println(cmp.compare(p1, p2));
		
		
	}
}
