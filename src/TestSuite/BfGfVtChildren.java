package TestSuite;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;



import Base.BaseClass;
import Businessutilities.ExcelUtilities;
import PageFunctions.MagiPageFunc;


public class BfGfVtChildren extends BaseClass {
	
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

      public void BfGfVtChildren1(String state,String ag,String salary,String ag1,String salary1,String ag2,String ag3,String ag4) throws InterruptedException  {
    	  
    	  
    	  
    	  magipage.BfGfVtChildren(state, ag, salary,ag1,salary1,ag2,ag3, ag4);
    	  
    	  Thread.sleep(3000);
  
      }
      
      @DataProvider (name="testcase")

	  public Object[][] reg() throws Exception
	  {
		  	
		 Object[][] testObjArray = ExcelUtilities.getTableArray2(".\\TestData\\Magi.xlsx","Sheet6", 1,8);
		    return (testObjArray);
		 	

			}
      
      @AfterMethod
	  public void afterMethod() {

		//   d.close();
		   
	}
      }
