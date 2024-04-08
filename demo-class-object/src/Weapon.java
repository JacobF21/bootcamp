public class Weapon {
  private String name = "Unarmed";
  private int damage = 25;

  public void chooseWeapon(String name) {
    this.name = name;
    if (this.name.equals("Arch")) {
      this.damage = 50;
    } else if (this.name.equals("MagicWand")) {
      this.damage = 200;
    } else if (this.name.equals("Sword")) {
      this.damage = 100;
    }
  }

  public int getDamage(){
    return damage;
  }

  public String getWeaponName(){
    return this.name;
  }

}
