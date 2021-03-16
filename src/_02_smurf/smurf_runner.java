package _02_smurf;

public class smurf_runner {
	public static void main(String[] args) {
		Smurf smurf = new Smurf("joe");
		smurf.eat();
		smurf.getName();
		Smurf smurff = new Smurf("Papa");
		smurff.getName();
		smurff.getHatColor();
		smurff.isGirlOrBoy();
		Smurf smurfette = new Smurf("Smurfette");
		smurfette.getName();
		smurfette.getHatColor();
		smurff.isGirlOrBoy();
	}
}
