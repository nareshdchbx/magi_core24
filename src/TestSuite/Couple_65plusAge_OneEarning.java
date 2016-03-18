package TestSuite;


import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;



import Base.BaseClass;
import Businessutilities.ExcelUtilities;
import PageFunctions.MagiPageFunc;


public class Couple_65plusAge_OneEarning extends BaseClass {
	
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

      public void Couple_65plusAge_OneEarning1(String state,String ag,String salary,String ag1) throws InterruptedException  {
    	  
    	  
    	  
    	  magipage.Couple_65plusAge_OneEarning(state, ag, salary,ag1);
    	  
    	  Thread.sleep(3000);
  
      }
      
      @DataProvider (name="testcase")

	  public Object[][] reg() throws Exception
	  {
		  	
		 Object[][] testObjArray = ExcelUtilities.getTableArray2(".\\TestData\\Magi.xlsx","Sheet2", 1,4);
		    return (testObjArray);
		 	

			}
      
      @AfterMethod
	  public void afterMethod() {

		 //  d.close();
		   
	}
      }
