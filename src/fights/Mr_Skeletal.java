package fights;


public class Mr_Skeletal extends Fighters {
	public static <attack> void main(String[] args) {
		while(Player.health >= 0){
			System.out.println("Mr. Skeletal says: 'I'm stealing your Calcium!'");
			Fighters.dealsDamage();
			System.out.println("Mr. Skeletal did " + damage + " damage!");
			System.out.println("You have " + Player.health + " HP left!");
		}
		System.out.println("You have lost all your calcium.");
		System.out.println("You should have thanked Mr. Skeletal");
	}
}

