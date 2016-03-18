package TestSuite;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;



import Base.BaseClass;
import Businessutilities.ExcelUtilities;
import PageFunctions.MagiPageFunc;


public class ChildlessAdult_IncomeUnderMedicaid_HavingMEC extends BaseClass {
	
public BaseClass b;
	
	WebDriver d;
	
	MagiPageFunc magipage;
	

	
@BeforeMethod
	
	public void bsateup()
	{

		b=new BaseClass();
		d=b.getdriver();
		
		magipage=new MagiPageFunc(d);
		
		
	}

      @Test(dataProvider = "testcase")

      public void ChildlessAdult_IncomeUnderMedicaid_HavingMEC1(String state,String ag,String salary) throws InterruptedException  {
    	  
    	  
    	  
    	  magipage.ChildlessAdult_IncomeUnderMedicaid_HavingMEC(state, ag, salary);
    	  
    	  Thread.sleep(3000);
  
      }
      
      @DataProvider (name="testcase")

	  public Object[][] reg() throws Exception
	  {
		  	
		 Object[][] testObjArray = ExcelUtilities.getTableArray2(".\\TestData\\Magi.xlsx","Sheet1", 1,3);
		    return (testObjArray);
		 	

			}
      
      @AfterMethod
	  public void afterMethod() {

		//   d.close();
		   
	}
      }
