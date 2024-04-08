import java.util.Scanner;

public class Hero {
  private String name;
  private int hp = 100;
  private int mp = 100;
  private String character = "Civilian";
  private Weapon weapon = new Weapon();

  // setter
  public void setName() {
    Scanner input = new Scanner(System.in);
    System.out.print("Please enter your name:");
    this.name = input.nextLine();
  }

  public void chageCharacter(String character) {
    this.character = character;
    if (this.character == "Hunter") {
      this.hp = 150;
      this.mp = 50;
    } else if (this.character == "Magican") {
      this.hp = 75;
      this.mp = 200;
    } else if (this.character == "Warrior") {
      this.hp = 200;
      this.mp = 100;
    }
  }

  public void chooseWeapon(){
    if(this.character.equals("Hunter")){
      this.weapon.chooseWeapon("Arch");
    } else if(this.character.equals("Magican")){
      this.weapon.chooseWeapon("MagicWand");
    } else if(this.character.equals("Warrior")){
      this.weapon.chooseWeapon("Sword");
    }
  }

  public String toString() {
    return "Hero Name is:" + this.name 
          + ", character is:" + this.character
          + ", weapon is:" + this.weapon.getWeaponName();
  }

  public static void main(String[] args) {
    Hero hero1 = new Hero();
    hero1.setName();
    hero1.chageCharacter("Warrior");
    hero1.chooseWeapon();
    System.out.println(hero1.toString());
  }
}


