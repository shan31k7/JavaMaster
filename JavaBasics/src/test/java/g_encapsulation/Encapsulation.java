package g_encapsulation;

// binding attributes and methods
// getter, setter, POJO methods
public class Encapsulation {
		// private variables encapsulated with public methods
	private long SocialSecurity;
	private float salary;

	public long getSocialSecurity() {
		return SocialSecurity;
	}

	public void setSocialSecurity(long socialSecurity) {
		SocialSecurity = socialSecurity;
	}

	public float getSalary() {
		return salary;
	}

	public void setSalary(float salary) {
		this.salary = salary;
	}
}
