package story2;

public class Weather {

	String storm;
	int temperature;

	public void narration() {
		System.out.print("But, before he knew it.... a storm was brewing. He started to hear warnings for an incoming "
				+ storm + " with an unbelievable temperature of " + temperature);

	}

	public void disaster() {
		Weather weather1 = new Weather();
		weather1.storm = "tornado";
		weather1.temperature = 160;

		Weather weather2 = new Weather();
		weather2.storm = "hurricane";
		weather2.temperature = 105;
		weather2.narration();

	}

}
