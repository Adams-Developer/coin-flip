//Heads or tails 50% of the time

public class FlipCoin {

	public static void main(String[] args) {		
		if (Math.random() < 0.5)
			System.out.println("Heads");
		else
			System.out.println("Tails");
	}

}
