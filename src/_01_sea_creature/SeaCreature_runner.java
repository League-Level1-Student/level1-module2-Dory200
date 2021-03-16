package _01_sea_creature;

public class SeaCreature_runner {
	public static void main(String[] args) {
		SeaCreature spongebob = new SeaCreature("Spongebob");
		spongebob.laugh();
		spongebob.eat();
		SeaCreature patrick = new SeaCreature("Patrick");
		SeaCreature squidward = new SeaCreature("Squidward");
		patrick.getName();
		squidward.getName();
		patrick.eat();
		squidward.eat();
		patrick.laugh();
		squidward.laugh();
		
	}
	
}
