package entities;

public class Champion {
	private String name;
	private int life;
	private int attack;
	private int armor;

	public Champion(String name, int life, int damage, int armor) {
		this.name = name;
		this.life = life;
		this.attack = damage;
		this.armor = armor;
	}

	public int getLife() {
		return life;
	}

	public int getAttack() {
		return attack;
	}

	public void takeDamage(Champion champion) {

		if (armor > champion.getAttack()) {
			life -= 1;
		} else {
			life -= (champion.getAttack() - armor);

		}

		if (life < 0) {
			life = 0;
		}

	}

	public String status() {
		if(life == 0) {
			return name + ": " + life + " de vida (morreu)\n";
		}else {
			return name + ": " + life + " de vida\n";
		}
		
	}

}
