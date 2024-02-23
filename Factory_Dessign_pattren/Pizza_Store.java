
interface Pizza {
  void prepare();

  void bake();

  void cut();

  void box();
}

class NYStyleCheesePizza implements Pizza {
  @Override
  public void prepare() {
    System.out.println("Preparing NY Style Cheese Pizza");
  }

  @Override
  public void bake() {
    System.out.println("Baking NY Style Cheese Pizza");
  }

  @Override
  public void cut() {
    System.out.println("Cutting NY Style Cheese Pizza");
  }

  @Override
  public void box() {
    System.out.println("Boxing NY Style Cheese Pizza");
  }
}

class ChicagoStyleCheesePizza implements Pizza {
  @Override
  public void prepare() {
    System.out.println("Preparing Chicago Style Cheese Pizza");
  }

  @Override
  public void bake() {
    System.out.println("Baking Chicago Style Cheese Pizza");
  }

  @Override
  public void cut() {
    System.out.println("Cutting Chicago Style Cheese Pizza");
  }

  @Override
  public void box() {
    System.out.println("Boxing Chicago Style Cheese Pizza");
  }
}

interface PizzaFactory {
  Pizza createPizza();
}

  class NYPizzaFactory implements PizzaFactory {
    @Override
    public Pizza createPizza() {
      return new NYStyleCheesePizza();
    }
  }

  class ChicagoPizzaFactory implements PizzaFactory {
    @Override
    public Pizza createPizza() {
      return new ChicagoStyleCheesePizza();
    }
  }

  class PizzaStore {
    private PizzaFactory factory;

    public PizzaStore(PizzaFactory factory) {
      this.factory = factory;
    }

    public Pizza orderPizza() {
      Pizza pizza = factory.createPizza();

      pizza.prepare();
      pizza.bake();
      pizza.cut();
      pizza.box();

      return pizza;
    }
  }

  public class Pizza_Store {
    public static void main(String[] args) {
      PizzaStore nyStore = new PizzaStore(new NYPizzaFactory());
      nyStore.orderPizza();

      PizzaStore chicagoStore = new PizzaStore(new ChicagoPizzaFactory());
      chicagoStore.orderPizza();
    }
  }

