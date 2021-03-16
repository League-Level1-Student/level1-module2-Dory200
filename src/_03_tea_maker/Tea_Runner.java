package _03_tea_maker;

public class Tea_Runner {
	public static void main(String[] args) {
		TeaBag tea = new TeaBag("Mint");
		tea.getFlavor();
		Kettle kettle = new Kettle();
		kettle.boil();
		Cup cup = new Cup();
		cup.makeTea(tea, kettle.getWater());
	}
}
