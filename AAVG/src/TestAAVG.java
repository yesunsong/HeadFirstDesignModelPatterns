public class TestAAVG {
	public static void main(String[] args) {
		Character queen = new Queen();
		queen.setWeaponBehavior(new KnifeBehavior());
		queen.fight();

		Character troll = new Troll();
		troll.setWeaponBehavior(new BowAndArrowBehavior());
		troll.fight();
	}
}
