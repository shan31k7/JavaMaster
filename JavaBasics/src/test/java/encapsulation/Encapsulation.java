package encapsulation;

public class Encapsulation {
		// private variables accessed via public methods
	private long SocialSecurity;

	public long getSocialSecurity() {
		return SocialSecurity;
	}

	public void setSocialSecurity(long socialSecurity) {
		SocialSecurity = socialSecurity;
	}
}
