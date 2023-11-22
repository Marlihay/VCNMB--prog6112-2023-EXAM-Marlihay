/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package estateagentreport2;

/**
 *
 * @author lab_services_student
 */
public class agentInformation {
    //class that contains agent details
    //declaration
    private String agentLocation;
    private String agentName;
    private double propertyPrice;
    private double agentCommission;

    public agentInformation(String location, String name, double price, double commission) {
        //contuctors
        this.agentLocation = location;
        this.agentName = name;
        this.propertyPrice = price;
        this.agentCommission =commission;
    }

   //getters and setters for variables
    public String getAgentLocation() {
        return agentLocation;
    }

    /**
     * @param agentLocation the agentLocation to set
     */
    public void setAgentLocation(String agentLocation) {
        this.agentLocation = agentLocation;
    }

    /**
     * @return the agentName
     */
    public String getAgentName() {
        return agentName;
    }

    /**
     * @param agentName the agentName to set
     */
    public void setAgentName(String agentName) {
        this.agentName = agentName;
    }

    /**
     * @return the propertyPrice
     */
    public double getPropertyPrice() {
        return propertyPrice;
    }

    /**
     * @param propertyPrice the propertyPrice to set
     */
    public void setPropertyPrice(double propertyPrice) {
        this.propertyPrice = propertyPrice;
    }

    /**
     * @return the agentCommission
     */
    public double getAgentCommission() {
        return agentCommission;
    }

    /**
     * @param agentCommission the agentCommission to set
     */
    public void setAgentCommission(double agentCommission) {
        this.agentCommission = agentCommission;
    }
}

 //Farrell, J. (2019). Java programming. Boston: Cengage. 