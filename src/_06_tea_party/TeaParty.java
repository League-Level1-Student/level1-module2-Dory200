package _06_tea_party;

import javax.swing.JOptionPane;

public class TeaParty {
	public String welcome(String name, boolean isWoman, boolean isKnighted) {
		String greeting = "Hello ";
		if(isWoman) {
			if(isKnighted) {
				greeting += "Lady ";
			}
			else {
				greeting += "Ms. ";
			}
		}
		if(!isWoman) {
			if(isKnighted) {
				greeting += "Sir ";
			}
			else {
				greeting += "Mr. ";
			}
		}
		
		return greeting += name;
	}
}