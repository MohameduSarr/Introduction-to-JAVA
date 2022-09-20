public class YearlyMaintenanceCost {

    public static void main(String[] args) {
        double springCost = 100.0;
        double summerCost = 75.55;
        double fallCost = 185.43;
        double winterCost = 99.99;
        double totalYearlyMaintenanceCost;


        totalYearlyMaintenanceCost = springCost + summerCost + fallCost + winterCost;

        System.out.println("The spring cost is " + springCost + ", The summer cost is " + summerCost + ", The fall cost is " + fallCost + ", The winter cost is " + winterCost + ", The total yearly maintenance cost is: " + totalYearlyMaintenanceCost);
    }
}
