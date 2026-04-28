package per;

public class Person implements Comparable<Person>{
	private String name;
	private int age;
	
	public Person(String name, int age) {
		this.name = name;
		this.age = age;
	}
	
	public String getName() {
		return name;
	}
	
	public int getAge() {
		return age;
	}
	
	public String toString() {
		return getName() + ", at age " + getAge();
	}
	
	public boolean equals(Object obj) {
		boolean result = false;
		
		if(obj != null && obj instanceof Person) {
			Person p = (Person) obj;
			if(this.getName().equals(p.getName()) & this.getAge() == p.getAge()) {
				result = true;
			}
			
		}
			return result;
	}
	
	public int hashCode() {
		return getName().hashCode() ^ getAge();
	}
	
	public int compareTo(Person per) {
		int result = this.getAge() - per.getAge();
		if(result > 0) {
			result = 1;
		}else if(result < 0) {
			result = -1;
		}else if(result == 0) {
			result = 0;
		}
		
		return result;
	}
	
}
