package studio7;

public class Die {
	private int n;
	
	public int random() {
		return (int) (Math.random() * n + 1);
	}

}
