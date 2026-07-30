package Orders;

public class Order {

    /**
     * Calculates the cost for a 2-item order (First Course + Drink).
     */
    public void calculateOrder(String firstCourse, double firstCourseCost, String drink, double drinkCost) {
        double total = firstCourseCost + drinkCost;
        System.out.println("El costo de " + firstCourse + " y " + drink + " es = $" + total);
    }

    /**
     * Calculates the cost for a 3-item order (First Course + Second Course +
     * Drink).
     */
    public void calculateOrder(String firstCourse, double firstCourseCost, String secondCourse, double secondCourseCost,
            String drink, double drinkCost) {
        double total = firstCourseCost + secondCourseCost + drinkCost;
        System.out.println("El costo de " + firstCourse + " + " + secondCourse + " + " + drink + " es = $" + total);
    }

    /**
     * Calculates the cost for a 4-item order (First Course + Second Course +
     * Dessert + Drink).
     */
    public void calculateOrder(String firstCourse, double firstCourseCost, String secondCourse, double secondCourseCost,
            String dessert, double dessertCost, String drink, double drinkCost) {
        double total = firstCourseCost + secondCourseCost + dessertCost + drinkCost;
        System.out.println("El costo de " + firstCourse + " + " + secondCourse + " + " + drink + " + " + dessert
                + " es = $" + total);
    }

    public static void main(String[] args) {
        Order order1 = new Order();
        order1.calculateOrder("Sancocho", 5000, "Gaseosa", 2000);

        Order order2 = new Order();
        order2.calculateOrder("Crema de verduras", 5000, "Churrasco", 6000, "Gaseosa", 2000);

        Order order3 = new Order();
        order3.calculateOrder("Crema de espinacas", 5000, "Salmón", 10000, "Tiramisú", 5000, "Gaseosa", 2000);
    }
}