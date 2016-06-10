package fights;


public class Mr_Skeletal extends Fighters {
	public static <attack> void main(String[] args) {

		Fighters Mr_Skeletal = new Fighters();
			Mr_Skeletal.dealsDamage(damage);
				boolean calcium = true;
		System.out.println("Mr. Skeletal did " + damage + " damage!");
		{
			System.out.println("Mr. Skeletal says: 'I'm stealing your Calcium!'");
			System.out.println("You have " + Fighters.health + " HP left!");
			while(calcium){
				if (Player.health >= 0) {
					Mr_Skeletal.dealsDamage(damage);
					System.out.println("Mr. Skeletal did " + damage + " damage!");
					System.out.println("You have " + Fighters.health + " HP left!");
				} else if(health <= 0) {
					System.out.println("You have lost all your calcium.");
					System.out.println("You should have thanked Mr. Skeletal");
					calcium = false;
				}
			}
		}
	}
}
