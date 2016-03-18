package TestSuite;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;



import Base.BaseClass;
import Businessutilities.ExcelUtilities;
import PageFunctions.MagiPageFunc;


public class GrandChildrenVtGranny extends BaseClass {
	
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

      public void GrandChildrenVtGranny1(String state,String ag,String salary,String ag1,String salary1,String ag2,String ag3) throws InterruptedException  {
    	  
    	  
    	  
    	  magipage.GrandChildrenVtGranny(state,ag,salary,ag1,salary1,ag2,ag3);
    	  
    	  Thread.sleep(3000);
  
      }
      
      @DataProvider (name="testcase")

	  public Object[][] reg() throws Exception
	  {
		  	
		 Object[][] testObjArray = ExcelUtilities.getTableArray2(".\\TestData\\Magi.xlsx","Sheet10", 1,7);
		    return (testObjArray);
		 	

			}
      
      @AfterMethod
	  public void afterMethod() {

		 //  d.close();
		   
	}
      }
