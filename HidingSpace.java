package story2;

public class HidingSpace {

	String roomLocation;
	int windows;

	public void narriation2() {
		System.out.println("Once in the structure he looked for the best room to hide out in. He went to the "
				+ roomLocation + " to a room with " + windows + " windows.");
	}

	public void hideOut() {

		HidingSpace hidingspace1 = new HidingSpace();
		hidingspace1.roomLocation = "Second floor";
		hidingspace1.windows = 2;

		HidingSpace hidingspace2 = new HidingSpace();
		hidingspace2.roomLocation = "Fifth floor";
		hidingspace2.windows = 1;

	}

}
