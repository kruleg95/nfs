package fight;

public class PZM extends Hero {

	public static void main(String[] args) throws InterruptedException {
		Pudge pudge = new Pudge();
		Zeus zeus = new Zeus();
		SuperBasher sup = new SuperBasher();
		pudge.getInfo();
		pudge.setItem(sup);
		

		do {

			int turnToFight = (int) (Math.random() * 2);
			if (turnToFight == 1) {
				new Pudge();
				zeus.setHpLeft(pudge.getStrike());
				System.out.println("Pudge kicked zeus`s ass on " + pudge.getStrike() + "points. Zeus now has "
						+ (zeus.getHpLeft() < 0 ? "0" : zeus.getHpLeft()) + "hp left" + ((pudge.critical)
								? ". WOW, that was a critical hit!" : (pudge.miss ? ". Oh,what a miss" : "")));
			} else {

				new Zeus();
				pudge.setHpLeft(zeus.getStrike());
				System.out.println("Zeus kicked pudge`s ass on " + zeus.getStrike() + "points. Pudge now has "
						+ (pudge.getHpLeft() < 0 ? "0" : pudge.getHpLeft()) + "hp left" + ((zeus.critical)
								? ". WOW, that was a critical hit!" : (zeus.miss ? ". Oh,what a miss" : "")));

			}

			Thread.sleep(500);

			zeus.critical = false;
			pudge.critical = false;
			zeus.miss = false;
			pudge.miss = false;

		} while (zeus.health > 0 && pudge.health > 0);

		if (zeus.health <= 0) {
			System.out.println("Pudge won with " + pudge.getHpLeft() + "hp left");
		} else {
			System.out.println("Zeus won with " + zeus.getHpLeft() + "hp left");
		}

	}
}