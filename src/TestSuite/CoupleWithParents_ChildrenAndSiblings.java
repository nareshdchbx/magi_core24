package TestSuite;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;



import Base.BaseClass;
import Businessutilities.ExcelUtilities;
import PageFunctions.MagiPageFunc;


public class CoupleWithParents_ChildrenAndSiblings extends BaseClass{
	
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

      public void CoupleWithParents_ChildrenAndSiblings1(String state,String ag,String salary,String ag1,String salary1,String ag2,String ag3,String salary2,String ag4,String ag5,String ag6,String ag7) throws InterruptedException  {
    	  
    	  
    	  
    	  magipage.CoupleWithParents_ChildrenAndSiblings(state,ag,salary,ag1,salary1,ag2,ag3,salary2,ag4,ag5,ag6,ag7);
    	  
    	  Thread.sleep(9000);
  
      }
      
      @DataProvider (name="testcase")

	  public Object[][] reg() throws Exception
	  {
		  	
		 Object[][] testObjArray = ExcelUtilities.getTableArray2(".\\TestData\\Magi.xlsx","Sheet4", 1,12);
		    return (testObjArray);
		 	

			}
      
      @AfterMethod
	  public void afterMethod() {

		 //  d.close();
		   
	}
      }
