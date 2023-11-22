/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package estateagentreport;

import java.util.Arrays;

/**
 *
 * @author lab_services_student
 */
public class EstateAgentReport {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        double[][] propertySales = { //populating 2D array
            {800000, 1500000, 2000000},
            {700000, 1200000, 1600000}
        };
//names of real estate agents
        EstateAgent Agent1 = new EstateAgent("Joe Bloggs");
        EstateAgent Agent2 = new EstateAgent("Jane Doe");

        Agent1.calculateEstateAgentSales(propertySales[0]);
        Agent2.calculateEstateAgentSales(propertySales[1]);

        Agent1.calculateEstateAgentCommission();
        Agent2.calculateEstateAgentCommission();
        //report display
        System.out.println("Estate Agents Sales Report:"); // Displays report heading
        System.out.println("\nEstate Agent\t\tJan\t\tFeb\t\tMar\t\t");
        System.out.println("--------------------------------------------------------------------------");
        System.out.print("Joe Bloggs:\t\t");
        agentSales(Agent1);//calls method to display monthly sales
        System.out.print("Jane Doe:\t\t");
        agentSales(Agent2);//calls method to display monthly sales
        
        System.out.println("\nSales Commission for Joe Bloggs:");
        displayCommission(Agent1);//calls method to display commission
        System.out.println("Sales Commission for Jane Doe:");
        displayCommission(Agent2);//calls method to display comission

        System.out.println("\nThe property sales for Joe Bloggs:");
        totalSales(Agent1);
        System.out.println("The property sales for Jane Doe:");
        totalSales(Agent2);
        // Determine the top agent
        EstateAgent topAgent = (Agent1.getAgentCommission() > Agent2.getAgentCommission()) ? Agent1 : Agent2;
        System.out.println("\nTop performing Estate Agent: " + topAgent.getAgentName());
    }
//method for displaying the agents monthly sales
    private static void agentSales(EstateAgent agent) {
        double[] monthlySales = agent.getPropertySales();
// go through the monthly sales and print each sale
    for (double sale : monthlySales) {
// Format and print each sale with a width of 15 characters
        System.out.printf("%-15.2f", sale);
    }

    System.out.println();
}
 //method which gets the total property sales and displays them     
     
      private static void totalSales(EstateAgent agent) {
        System.out.println(agent.getTotalPropertySales());
    }
 //method for displaying the commission               
    private static void displayCommission(EstateAgent agent) {
        System.out.println(": R " + agent.getAgentCommission());
    }
    }
       
   //Farrell, J. (2019). Java programming. Boston: Cengage.   

