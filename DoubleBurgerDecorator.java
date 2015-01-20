public class DoubleBurgerDecorator implements Burgerable {
  Burgerable burger;

  DoubleBurgerDecorator(Burgerable burger){
    this.burger = burger;
  }

  public int cost(){
    return this.burger.cost() * 2;
  }
  public void describe(){
    this.burger.describe();
    System.out.println(" has double cost");
  }
}
