import java.util.Scanner;

public class Hero {
  private String name;
  private int hp;
  private int mp;
  private String character;
  private Weapon weapon;
  private int damageCount;

  public Hero(){
    this.hp=100;
    this.mp=100;
    this.character ="Civilian";
    this.weapon = new Weapon();
    this.damageCount=0;
    //this.name = name;
  };


  // setter
  public void setName() {
    Scanner input = new Scanner(System.in);
    System.out.print("Please enter your name:");
    this.name = input.nextLine();
  }

  public void chageCharacter(String character) {
    this.character = character;
    if (this.character.equals("Hunter")) {
      this.hp = 150;
      this.mp = 50;
    } else if (this.character.equals("Magican")) {
      this.hp = 150;
      this.mp = 200;
    } else if (this.character.equals("Warrior")) {
      this.hp = 200;
      this.mp = 100;
    }
  }

  public void chooseWeapon() {
    if (this.character.equals("Hunter")) {
      this.weapon.chooseWeapon("Arch");
    } else if (this.character.equals("Magican")) {
      this.weapon.chooseWeapon("MagicWand");
    } else if (this.character.equals("Warrior")) {
      this.weapon.chooseWeapon("Sword");
    }
  }

  public void reduceHp(Weapon weapon) {
    this.hp -= weapon.getDamage();
  }

  public void attack(Hero opponent) {
    opponent.reduceHp(this.weapon);
    opponent.damageCount++;
  }


  public String toString() {
    return "Hero Name is:" + this.name 
          + ", character is:" + this.character
          + ", weapon is:" + this.weapon.getWeaponName() 
          + ", hp remain is:"+ this.hp 
          + ", damage count is:" + this.damageCount;
  }

  public static void main(String[] args) {
    Hero hero1 = new Hero();
    hero1.setName();
    hero1.chageCharacter("Warrior");
    hero1.chooseWeapon();
    Hero hero2 = new Hero();
    hero2.setName();
    hero2.chageCharacter("Magican");
    hero2.chooseWeapon();
    System.out.println(hero1.toString());
    System.out.println(hero2.toString());
    hero1.attack(hero2);
    System.out.println(hero2.toString());
  }
}


