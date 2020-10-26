public class PizzaOrderTest {
    public static void main(String[] args)
    {
        Pizza pizza1 = new Pizza("large", 1, 0, 1);
        Pizza pizza2 = new Pizza("medium", 2, 2, 0);
       // Pizza pizza3 = new Pizza("small", 1, 1, 1);
        PizzaOrder order = new PizzaOrder();
        order.setNumPizzas(3);
        order.setPizza1(pizza1);
        order.setPizza2(pizza2);
       // order.setPizza3(pizza3);
        double total = order.calcTotal();

        System.out.println(pizza1.getDescription());
        System.out.println(pizza2.getDescription());
      //  System.out.println(pizza3.getDescription());
        System.out.println("Total cost: $" + total);
    }

}
