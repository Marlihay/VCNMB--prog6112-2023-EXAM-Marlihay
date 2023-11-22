/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package estateagentreport2;

/**
 *
 * @author lab_services_student
 */
public class EstateAgent implements IEstateAgent {
//method that calculates commission 
    @Override
    public double CalculateCommission(double propertyPrice, double agentCommission) {
       return propertyPrice * (agentCommission/ 100.0);
    }
//mwthod to ensure the user cannot enter negatives or zeros into input fields
    @Override
    public boolean ValidateData(agentInformation dataToValidate) {
         return dataToValidate.getAgentLocation()!= null &&
                !dataToValidate.getAgentLocation().isEmpty() &&
                dataToValidate.getAgentName()!= null &&
                !dataToValidate.getAgentName().isEmpty() &&
                dataToValidate.getAgentCommission() > 0 &&
                dataToValidate.getAgentCommission() > 0 &&
                dataToValidate.getPropertyPrice() > 0 &&
                dataToValidate.getPropertyPrice() > 0;      
    }


   
    
}
 //Farrell, J. (2019). Java programming. Boston: Cengage. 
