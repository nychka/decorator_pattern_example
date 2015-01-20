public class Burgerville{
  public static void main(String[] args){
    Burgerable burger = new Burger(10); // create burger with cost 10
    burger.describe(); // <= standard burger's cost
    burger = new BurgerWithCheeseDecorator(burger); // wrap burger with cheese decorator
    burger.describe(); // <= plus cheese
    burger = new DoubleBurgerDecorator(burger);
    burger.describe();
    int final_cost = burger.cost(); // <= burger's double standard cost
    System.out.println("=============================");
    System.out.println("Burger costs: " + final_cost);
  }
}
