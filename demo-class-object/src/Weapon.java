public class Weapon {
  private String name = "Unarmed";
  private int damage = 25;

  public void chooseWeapon(String name) {
    this.name = name;
    if (this.name == "Arch") {
      this.damage = 50;
    } else if (this.name == "MagicWand") {
      this.damage = 200;
    } else if (this.name == "Sword") {
      this.damage = 100;
    }
  }

  public String getWeaponName(){
    return this.name;
  }

}
