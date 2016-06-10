package fights;

class Fighters{
	 static int health = 5;
	 static int damage = 2;
	static void dealsDamage(int damage){
		Player.health = health - damage;
	}
	void newHealth(int health){
		health = Player.health;
		}
			
		
	}

