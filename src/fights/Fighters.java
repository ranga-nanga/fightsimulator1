package fights;

class Fighters{
	/*
	 * Health defaults to 5
	 * Damage defaults to 2
	 */
	static int health = 5;
	static int damage = 2;
	static void dealsDamage(){
		Player.health = Player.health - damage;
	}
	void newHealth(int health){
		health = Player.health;
	}
}

