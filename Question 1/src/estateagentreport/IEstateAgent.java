/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package estateagentreport;

/**
 *
 * @author lab_services_student
 */
public interface IEstateAgent {
    //interface for agent sales, commission and the top estate agent
 double EstateAgentSales(double[] propertySales);
 double EstateAgentCommission(double[] propertySales);
 int TopEstateAgent(double[] totalSales);
}

 //Farrell, J. (2019). Java programming. Boston: Cengage. 