package fight;

import java.util.Arrays;

public abstract class Hero {
	String name;
	protected int agylity = 5;
	protected int strength = 5;
	protected int intelligance = 5;
	protected int health = 100;
	protected int handStrike;
	protected int statStrike;
	protected int fullStrike;
	protected int stats[] = { agylity, strength, intelligance};
	Item item=new Item();
	Item [] items = new Item[2];
	String slot1;
	String slot2;

	boolean critical;
	boolean miss;

	public void setItem(Item item) {
		this.item = item;
		for (int i = 0; i < items.length; i++) {
			if (items[i] == null) {
				items[i] = item;
				this.agylity += Integer.parseInt(item.stats[0]);
				this.strength += Integer.parseInt(item.stats[1]);
				this.intelligance += Integer.parseInt(item.stats[2]);
				break;
			}
		}
	}

	protected void setStats() {
		name = "";
		health = 0;
		intelligance = 0;
		agylity = 0;
		strength = 0;
	}

	protected void setHpLeft(int h) {
		health = health - h;
	}

	protected void setStrike() {
		fullStrike = (int) ((intelligance / 3) + (agylity / 2) + strength);
		int crit = (int) (Math.random() * 100);
		if (crit > 90) {
			fullStrike = fullStrike * 5;
			critical = true;
		}

	}

	@Override
	public String toString() {
		return "Hero [name=" + name + ", agylity=" + agylity + ", strength=" + strength + ", intelligance="
				+ intelligance + ", health=" + health + ", handStrike=" + handStrike + ", statStrike=" + statStrike
				+ ", fullStrike=" + fullStrike + ", stats=" + Arrays.toString(stats) + " "+ "]";
	}

	protected int getHpLeft() {

		return (health);
	}

	int getStrike() {
		return fullStrike;
	}

	protected void getInfo() {
		System.out.println("health=" + health);
	}

}
