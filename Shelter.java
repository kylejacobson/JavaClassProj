package story2;

public class Shelter {
	String building;
	String distanceAway;

	public void narration2() {
		System.out.println(
				"He looked for the best structure to hide out in. There was a " + building + distanceAway + " away.");
	}

	public void hideOut() {
		Shelter shelter1 = new Shelter();
		shelter1.building = "brick structure";
		shelter1.distanceAway = "50 feet";

		Shelter shelter2 = new Shelter();
		shelter2.building = "wooden structure";
		shelter2.distanceAway = "25 feet";
	

	}
}
