/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */
package estateagentreport;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author lab_services_student
 */
public class EstateAgentTest {
    
    public EstateAgentTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    

    @Test
    public void testCalculateEstateAgentCommission() {
        System.out.println("calculateEstateAgentCommission");
        // Creating instances of the EstateAgent class
        EstateAgent instance = new EstateAgent("Jane Doe");
        //propertySales array with values used to calculate commission
        double[] propertySales = {700000, 1200000, 1600000};
        //expected commission
        double expResult = 70000.0; 
        double result = instance.EstateAgentCommission(propertySales);
        assertEquals(expResult, result, 0);
    }

   @Test
    public void testTopEstateAgent() {
        System.out.println("TopEstateAgent");
        // Creating instances of the EstateAgent class
        EstateAgent estateAgent1 = new EstateAgent("Joe Bloggs");  
        EstateAgent estateAgent2 = new EstateAgent("Jane Doe");  
        // Total sales of Joe Bloggs and Jane Doe
        double[] totalSales = {4300000.0, 3500000.0};
        //index of the agent with the highest total sales is 0 (430000000)
        int expResult = 0;
        // Calling the TopEstateAgent method
        int result1 = estateAgent1.TopEstateAgent(totalSales);
        assertEquals(expResult, result1);
        // Calling the TopEstateAgent method 
        int result2 = estateAgent2.TopEstateAgent(totalSales);
        assertEquals(expResult, result2);
    }
 @Test
    public void testGetTotalPropertySales() {
        System.out.println("getTotalPropertySales");
        // Creating instances of the EstateAgent class
        EstateAgent instance = new EstateAgent("Jane Doe");
        //propertysales array populated with Jane Doe's sales
        double[] propertySales = {700000, 1200000, 1600000};
        double expResult = 3500000.0; // Expected result of her total property sales
        double result = instance.EstateAgentSales(propertySales);
        assertEquals(expResult, result, 0);
    }
    
}
