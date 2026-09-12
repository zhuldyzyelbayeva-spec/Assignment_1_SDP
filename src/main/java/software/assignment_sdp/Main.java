package software.assignment_sdp;

public class Main {
	public static void main(String[] args) {
		Porridge myBreakfast = new Porridge.Builder()
				.setGrain("Oats")
				.setLiquid("Almond Milk")
				.addButter(true)
				.addFruit("Banana")
				.addFruit("Blueberries")
				.addNutOrSeed("Chia seeds")
				.build();

		System.out.println(myBreakfast);
	}
}