public class Burger implements Burgerable {
  int cost;
  Burger(int cost){
    this.cost = cost;
  }
  public int cost(){
    return this.cost;
  }
  public void describe(){
    System.out.println("Burger ");
  }
}
