class BurgerWithCheeseDecorator implements Burgerable {
  Burgerable burger;

  BurgerWithCheeseDecorator(Burgerable burger){
	this.burger = burger;
  }
  public int cost(){
   	return this.burger.cost() + 10;
  }
  public void describe(){
    this.burger.describe();
    System.out.println(" with cheese");
  }
}
