/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */
package estateagentreport2;

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
    public void testCalculateCommission_Successfully() {
        System.out.println("CalculateCommission");
        double propertyPrice = 80000.0;
        double agentCommission = 5.0;
        EstateAgent instance = new EstateAgent();
        double expResult = 4000.0;
        double result = instance.CalculateCommission(propertyPrice, agentCommission);
        assertEquals(expResult, result, 0);
       
    }
 @Test
public void testCalculateCommission_UnSuccessfully() {
    System.out.println("CalculateCommission_UnSuccessfully");
    double propertyPrice = -80000.0;
    double agentCommission = 5.0;
    EstateAgent instance = new EstateAgent();
    
    // Calculate the expected result based on your business logic
    double expResult = 0; // You need to define what the expected result should be
    
    // Call the CalculateCommission method
    double result = instance.CalculateCommission(propertyPrice, agentCommission);
    
    // Check if the result matches the expected result
    assertEquals(expResult, result, 0);
}
    
  
    
      @Test
    public void testValidateData_ValidData() {
        System.out.println("ValidateData_ValidData");
        EstateAgent instance = new EstateAgent();
        agentInformation validData = new agentInformation("Cape Town", "Marli", 100000.0, 5.0);
        boolean result = instance.ValidateData(validData);
        assertTrue(result);
    }
    @Test
    public void testValidateData_InValid() {
        System.out.println("ValidateData_InvalidData");
        EstateAgent instance = new EstateAgent();
        agentInformation invalidData = new agentInformation("", "Marli", 0, -5);
        boolean result = instance.ValidateData(invalidData);
        assertFalse(result);
    }
    
}
