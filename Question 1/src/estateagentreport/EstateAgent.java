/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package estateagentreport;

import java.util.Arrays;

/**
 *
 * @author lab_services_student
 */
public class EstateAgent implements IEstateAgent {
    private String agentName;
    private double[] propertySales;
    private double agentCommission;
    //contructors for agent name,property sales and commission
     public EstateAgent(String agentName) {
        this.agentName = agentName;
    }

    public void calculateEstateAgentSales(double[] propertySales) {
        this.setPropertySales(propertySales);
    }

    public void calculateEstateAgentCommission() {
        this.setAgentCommission(EstateAgentCommission(getPropertySales()));
    }
    //getters and setters
     public double getTotalPropertySales() {
        return Arrays.stream(propertySales).sum();
     }

    public String getAgentName() {
        return agentName;
    }

    public void setAgentName(String agentName) {
        this.agentName = agentName;
    }

    public double[] getPropertySales() {
        return propertySales;
    }

   
    public void setPropertySales(double[] propertySales) {
        this.propertySales = propertySales;
    }

    public double getAgentCommission() {
        return agentCommission;
    }

    public void setAgentCommission(double agentCommission) {
        this.agentCommission = agentCommission;
    }
    //method to calculate the total of each agents monthly sales
    @Override
    public double EstateAgentSales(double[] propertySales) {
    return Arrays.stream(propertySales).sum();
}
    
 //method to determine the top estate agent
    @Override
    public int TopEstateAgent(double[] totalSales) {
    if (totalSales.length == 0) {
        return -1; // returns -1 when the array is empty
    }
//track the maximum sales and the index of the top agent
    double maxSales = totalSales[0];
    int topAgentIndex = 0;
 // for loop goes through the array to find the top estate agent
    for (int i = 1; i < totalSales.length; i++) {
        if (totalSales[i] > maxSales) {
            maxSales = totalSales[i];
            topAgentIndex = i;
        }
    }
// Return the index of the top estate agent
    return topAgentIndex;
}
   
//method to calculate the commission of esate agents
    @Override
    public double EstateAgentCommission(double[] propertySales) {
      return 0.02 * EstateAgentSales(propertySales);
    }


}
//www.youtube.com. VCSOIT. (2020). PROG6112 LU1-LU6
 //Farrell, J. (2019). Java programming. Boston: Cengage. 