package fight;

public class SuperBasher extends Item {

	public SuperBasher() {
		name = "SuperBasher";
		agylity = 10;
		strength = 10;
		intelligance = 10;
		health = 100;
		setItemStats();
	}

	void setItemStats() {
		String[] stats = { "10", "10", "10" };
		this.stats = stats;

	}

}
