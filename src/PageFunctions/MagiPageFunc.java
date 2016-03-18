package PageFunctions;




import org.openqa.selenium.WebDriver;

import org.openqa.selenium.support.ui.Select;

import pageobjects.MagiPageObjects;

public class MagiPageFunc implements MagiPageObjects {
	
public WebDriver driver;
	
	public MagiPageFunc(WebDriver d) {
		this.driver=d;
	}
	
	public void ChildlessAdult_IncomeUnderMedicaid_HavingMEC(String state,String ag,String salary) throws InterruptedException{
		
		driver.findElement(selectstate).sendKeys(state);
		
		Select sy=new Select(driver.findElement(selectyear));
		sy.selectByVisibleText("2015");
		
		driver.findElement(age).sendKeys(ag);
		
		driver.findElement(hoursworked).sendKeys("40");
		
		driver.findElement(medicare1).click();
		
		
		driver.findElement(filetaxes).click();
		
		driver.findElement(wages1).sendKeys(salary);
		
		Select sc28=new Select(driver.findElement(taxfiler));
		sc28.selectByVisibleText("Applicant 1");
		
		//Thread.sleep(9999999);
		
		driver.findElement(export).click();
		
		driver.findElement(submit).click();

}
	
public void Couple_65plusAge_OneEarning(String state,String ag,String salary,String ag1) throws InterruptedException{
		
		driver.findElement(selectstate).sendKeys(state);
		
		Select sy=new Select(driver.findElement(selectyear));
		sy.selectByVisibleText("2015");
		
		driver.findElement(age).sendKeys(ag);
		
		driver.findElement(hoursworked).sendKeys("40");
		
		driver.findElement(filetaxes).click();
		
		driver.findElement(wages1).sendKeys(salary);
			
		driver.findElement(addapplicant).click();
		
		Select sc=new Select(driver.findElement(realation));
		sc.selectByVisibleText("Spouse");
		
		driver.findElement(age1).sendKeys(ag1);
		
		driver.findElement(filetaxes1).click();
		
		Select sc28=new Select(driver.findElement(taxfiler));
		sc28.selectByVisibleText("Applicant 1");
		Select sc29=new Select(driver.findElement(dependent));
		sc29.selectByVisibleText("Applicant 2");
		
		//Thread.sleep(9999999);
		
		driver.findElement(export).click();

		driver.findElement(submit).click();
}

public void CoupleWithParents_ChildrenAndSiblings(String state,String ag,String salary,String ag1,String salary1,String ag2,String ag3,String salary2,String ag4,String ag5,String ag6,String ag7) throws InterruptedException{
	
	driver.findElement(selectstate).sendKeys(state);
	
	Select sy=new Select(driver.findElement(selectyear));
	sy.selectByVisibleText("2015");
	
	driver.findElement(age).sendKeys(ag);
	
	driver.findElement(hoursworked).sendKeys("40");
	
	driver.findElement(filetaxes).click();
	
	driver.findElement(wages1).sendKeys(salary);
	
	//xxxxxxx

	
	driver.findElement(addapplicant).click();
	
	Select sc=new Select(driver.findElement(realation));
	sc.selectByVisibleText("Spouse");
	driver.findElement(age1).sendKeys(ag1);
	
	driver.findElement(hoursworked1).sendKeys("40");
	
	driver.findElement(filetaxes1).click();
	
	driver.findElement(wages2).sendKeys(salary1);
	
	//xxxxxxx
	
	driver.findElement(addapplicant).click();
	
	Select scx=new Select(driver.findElement(realation1));
	scx.selectByVisibleText("Child");
	//sc.selectByIndex(3);
	
	Select sc1=new Select(driver.findElement(realation2));
	sc1.selectByVisibleText("Child");

	
	driver.findElement(age2).sendKeys(ag2);
	
	//xxxxxxx
	
    driver.findElement(addapplicant).click();
   
   
	Select sc3=new Select(driver.findElement(realation3));
	sc3.selectByVisibleText("Child");
	
	Select sc4=new Select(driver.findElement(realation4));
	sc4.selectByVisibleText("Child");
	Select sc5=new Select(driver.findElement(realation5));
	sc5.selectByVisibleText("Sibling/Stepsibling");
	driver.findElement(age3).sendKeys(ag3);
	driver.findElement(hoursworked3).sendKeys("40");
	
	driver.findElement(filetaxes1).click();
	
	driver.findElement(wages4).sendKeys(salary2);
	
	//xxxxxxx
	
		driver.findElement(addapplicant).click();
		
		Select sc6=new Select(driver.findElement(realation6));
		sc6.selectByVisibleText("Sibling/Stepsibling");
		
		Select sc7=new Select(driver.findElement(realation7));
		sc7.selectByVisibleText("Sibling-in-law");
		Select sc8=new Select(driver.findElement(realation8));
		sc8.selectByVisibleText("Uncle/Aunt");
		Select sc9=new Select(driver.findElement(realation9));
		sc9.selectByVisibleText("Uncle/Aunt");
		
		driver.findElement(age4).sendKeys(ag4);
		
		//xxxxxxx
		
		driver.findElement(addapplicant).click();
		
		
		Select sc10=new Select(driver.findElement(realation10));
		sc10.selectByVisibleText("Sibling/Stepsibling");
		
		Select sc11=new Select(driver.findElement(realation11));
		sc11.selectByVisibleText("Sibling-in-law");
		Select sc12=new Select(driver.findElement(realation12));
		sc12.selectByVisibleText("Uncle/Aunt");
		Select sc13=new Select(driver.findElement(realation13));
		sc13.selectByVisibleText("Uncle/Aunt");
		Select sc14=new Select(driver.findElement(realation14));
		sc14.selectByVisibleText("Sibling/Stepsibling");
		driver.findElement(age5).sendKeys(ag5);
		
		
		//xxxxxxx
		
		driver.findElement(addapplicant).click();
		
		Select sc15=new Select(driver.findElement(realation15));
		sc15.selectByVisibleText("Parent");
		
		Select sc16=new Select(driver.findElement(realation16));
		sc16.selectByVisibleText("Parent-in-law");
		Select sc17=new Select(driver.findElement(realation17));
		sc17.selectByVisibleText("Grandparent");
		Select sc18=new Select(driver.findElement(realation18));
		sc18.selectByVisibleText("Grandparent");
		Select sc19=new Select(driver.findElement(realation19));
		sc19.selectByVisibleText("Parent");
		Select sc20=new Select(driver.findElement(realation20));
		sc20.selectByVisibleText("Parent");
		driver.findElement(age6).sendKeys(ag6);
		
		//xxxxxxx
		
		driver.findElement(addapplicant).click();
		
		Select sc21=new Select(driver.findElement(realation21));
		sc21.selectByVisibleText("Parent");
		
		Select sc22=new Select(driver.findElement(realation22));
		sc22.selectByVisibleText("Parent-in-law");
		Select sc23=new Select(driver.findElement(realation23));
		sc23.selectByVisibleText("Grandparent");
		Select sc24=new Select(driver.findElement(realation24));
		sc24.selectByVisibleText("Grandparent");
		Select sc25=new Select(driver.findElement(realation25));
		sc25.selectByVisibleText("Parent");
		Select sc26=new Select(driver.findElement(realation26));
		sc26.selectByVisibleText("Parent");
		Select sc27=new Select(driver.findElement(realation27));
		sc27.selectByVisibleText("Spouse");
		
		driver.findElement(age7).sendKeys(ag7);
	
		Select sc28=new Select(driver.findElement(taxfiler));
		sc28.selectByVisibleText("Applicant 1");
		Select sc0=new Select(driver.findElement(dependent));
		sc0.selectByVisibleText("Applicant 4");
		Select sc29=new Select(driver.findElement(dependent));
		sc29.selectByVisibleText("Applicant 5");
		Select sc30=new Select(driver.findElement(dependent));
		sc30.selectByVisibleText("Applicant 6");
		Select sc31=new Select(driver.findElement(dependent));
		sc31.selectByVisibleText("Applicant 7");
		Select sc32=new Select(driver.findElement(dependent));
		sc32.selectByVisibleText("Applicant 8");
	    
	   
	    
	    driver.findElement(addtaxreturn).click();
	    Select sc33=new Select(driver.findElement(taxfiler81));
		sc33.selectByVisibleText("Applicant 2");
		Select sc34=new Select(driver.findElement(dependent81));
		sc34.selectByVisibleText("Applicant 3");
	    
	   
	    
       driver.findElement(addtaxreturn).click();
	    
       Select sc35=new Select(driver.findElement(taxfiler82));
		sc35.selectByVisibleText("Applicant 4");
	
		//Thread.sleep(9999999);
	driver.findElement(export).click();
	
	driver.findElement(submit).click();

}

public void OneAdultWithChild(String state,String ag,String salary,String ag1) throws InterruptedException{
	
	driver.findElement(noinsurance).click();
	
	driver.findElement(selectstate).sendKeys(state);
	
	Select sy=new Select(driver.findElement(selectyear));
	sy.selectByVisibleText("2015");
	
	driver.findElement(age).sendKeys(ag);
	
	driver.findElement(hoursworked).sendKeys("40");
	
	driver.findElement(filetaxes).click();
	
	driver.findElement(wages1).sendKeys(salary);
		
	driver.findElement(addapplicant).click();
	
	Select sc=new Select(driver.findElement(realation));
	sc.selectByVisibleText("Parent");
	
	driver.findElement(age1).sendKeys(ag1);
	
	
	Select sc28=new Select(driver.findElement(taxfiler));
	sc28.selectByVisibleText("Applicant 1");
	
	Select sc29=new Select(driver.findElement(dependent));
	sc29.selectByVisibleText("Applicant 2");
	
	//Thread.sleep(9999999);
	
	driver.findElement(export).click();
	
	driver.findElement(submit).click();

}

public void BfGfVtChildren(String state,String ag,String salary,String ag1,String salary1,String ag2,String ag3,String ag4) throws InterruptedException{
	
	driver.findElement(selectstate).sendKeys(state);
	
	Select sy=new Select(driver.findElement(selectyear));
	sy.selectByVisibleText("2015");
	
	driver.findElement(age).sendKeys(ag);
	
	driver.findElement(hoursworked).sendKeys("40");
	
	driver.findElement(filetaxes).click();
	
	driver.findElement(wages1).sendKeys(salary);
	
	//xxxxxxx

	
	driver.findElement(addapplicant).click();
	
	Select sc=new Select(driver.findElement(realation));
	sc.selectByVisibleText("Domestic partner");
	driver.findElement(age1).sendKeys(ag1);
	
	driver.findElement(hoursworked1).sendKeys("40");
	
	driver.findElement(filetaxes1).click();
	
	driver.findElement(wages2).sendKeys(salary1);
	
	//xxxxxxx
	
	driver.findElement(addapplicant).click();
	
	Select scx=new Select(driver.findElement(realation1));
	scx.selectByVisibleText("Domestic partner's child");
	//sc.selectByIndex(3);
	
	Select sc1=new Select(driver.findElement(realation2));
	sc1.selectByVisibleText("Child");

	
	driver.findElement(age2).sendKeys(ag2);
	
	//xxxxxxx
	
    driver.findElement(addapplicant).click();
   
   
	Select sc3=new Select(driver.findElement(realation3));
	sc3.selectByVisibleText("Child");
	
	Select sc4=new Select(driver.findElement(realation4));
	sc4.selectByVisibleText("Domestic partner's child");
	Select sc5=new Select(driver.findElement(realation5));
	sc5.selectByVisibleText("Sibling/Stepsibling");
	driver.findElement(age3).sendKeys(ag3);
	
	
	//xxxxxxx
	
		driver.findElement(addapplicant).click();
		
		Select sc6=new Select(driver.findElement(realation6));
		sc6.selectByVisibleText("Child");
		
		Select sc7=new Select(driver.findElement(realation7));
		sc7.selectByVisibleText("Child");
		Select sc8=new Select(driver.findElement(realation8));
		sc8.selectByVisibleText("Sibling/Stepsibling");
		Select sc9=new Select(driver.findElement(realation9));
		sc9.selectByVisibleText("Sibling/Stepsibling");
		
		driver.findElement(age4).sendKeys(ag4);
		
		//xxxxxxx
		
	
	    
	  
	    Select sc33=new Select(driver.findElement(taxfiler));
		sc33.selectByVisibleText("Applicant 1");
		Select sc34=new Select(driver.findElement(dependent));
		sc34.selectByVisibleText("Applicant 4");
	    
	   
	    
       driver.findElement(addtaxreturn).click();
	    
       Select sc35=new Select(driver.findElement(taxfiler51));
		sc35.selectByVisibleText("Applicant 2");
		Select sc36=new Select(driver.findElement(dependent51));
		sc36.selectByVisibleText("Applicant 3");
		Select sc37=new Select(driver.findElement(dependent52));
		sc37.selectByVisibleText("Applicant 5");
	
		//Thread.sleep(9999999);
	driver.findElement(export).click();

	driver.findElement(submit).click();
}

public void CoupleVtChildren_HubbysSiblings(String state,String ag,String salary,String ag1,String ag2,String ag3,String ag4,String ag5,String salary1) throws InterruptedException{
	
	driver.findElement(selectstate).sendKeys(state);
	
	Select sy=new Select(driver.findElement(selectyear));
	sy.selectByVisibleText("2015");
	
	driver.findElement(age).sendKeys(ag);
	
	driver.findElement(hoursworked).sendKeys("40");
	
	driver.findElement(filetaxes).click();
	
	driver.findElement(wages1).sendKeys(salary);
	
	//xxxxxxx

	
	driver.findElement(addapplicant).click();
	
	Select sc=new Select(driver.findElement(realation));
	sc.selectByVisibleText("Spouse");
	driver.findElement(age1).sendKeys(ag1);
	
	
	//xxxxxxx
	
	driver.findElement(addapplicant).click();
	
	Select scx=new Select(driver.findElement(realation1));
	scx.selectByVisibleText("Child");
	//sc.selectByIndex(3);
	
	Select sc1=new Select(driver.findElement(realation2));
	sc1.selectByVisibleText("Child");

	
	driver.findElement(age2).sendKeys(ag2);
	
	//xxxxxxx
	
    driver.findElement(addapplicant).click();
   
   
	Select sc3=new Select(driver.findElement(realation3));
	sc3.selectByVisibleText("Child");
	
	Select sc4=new Select(driver.findElement(realation4));
	sc4.selectByVisibleText("Child");
	Select sc5=new Select(driver.findElement(realation5));
	sc5.selectByVisibleText("Sibling/Stepsibling");
	driver.findElement(age3).sendKeys(ag3);

	
	//xxxxxxx
	
		driver.findElement(addapplicant).click();
		
		Select sc6=new Select(driver.findElement(realation6));
		sc6.selectByVisibleText("Cousin");
		
		Select sc7=new Select(driver.findElement(realation7));
		sc7.selectByVisibleText("Sibling-in-law");
		Select sc8=new Select(driver.findElement(realation8));
		sc8.selectByVisibleText("Nephew/Niece");
		Select sc9=new Select(driver.findElement(realation9));
		sc9.selectByVisibleText("Nephew/Niece");
		
		driver.findElement(age4).sendKeys(ag4);
		driver.findElement(disabled5).click();
		driver.findElement(medicare5).click();
		
		//xxxxxxx
		
		driver.findElement(addapplicant).click();
		
		
		Select sc10=new Select(driver.findElement(realation10));
		sc10.selectByVisibleText("Cousin");
		
		Select sc11=new Select(driver.findElement(realation11));
		sc11.selectByVisibleText("Sibling-in-law");
		Select sc12=new Select(driver.findElement(realation12));
		sc12.selectByVisibleText("Nephew/Niece");
		Select sc13=new Select(driver.findElement(realation13));
		sc13.selectByVisibleText("Nephew/Niece");
		Select sc14=new Select(driver.findElement(realation14));
		sc14.selectByVisibleText("Sibling/Stepsibling");
		driver.findElement(age5).sendKeys(ag5);
		
		driver.findElement(hoursworked5).sendKeys("40");
		
		driver.findElement(filetaxes5).click();
		
		driver.findElement(wages6).sendKeys(salary1);
		
		
		
		//xxxxxxx
		
		Select sc28=new Select(driver.findElement(taxfiler));
		sc28.selectByVisibleText("Applicant 1");
		
		Select sc29=new Select(driver.findElement(taxfiler1x));
		sc29.selectByVisibleText("Applicant 2");
		Select sc30=new Select(driver.findElement(dependent));
		sc30.selectByVisibleText("Applicant 3");
		Select sc31=new Select(driver.findElement(dependent));
		sc31.selectByVisibleText("Applicant 4");
		Select sc32=new Select(driver.findElement(dependent));
		sc32.selectByVisibleText("Applicant 5");
		Select sc33=new Select(driver.findElement(dependent));
		sc33.selectByVisibleText("Applicant 6");
	    
		//Thread.sleep(9999999);
	driver.findElement(export).click();
	
	driver.findElement(submit).click();

}

public void CoupleLivingSeperately_ChildOutOfDC(String state,String ag,String salary,String ag1,String salary1,String ag2,String salary2,String ag3) throws InterruptedException{
	
	driver.findElement(selectstate).sendKeys(state);
	
	Select sy=new Select(driver.findElement(selectyear));
	sy.selectByVisibleText("2015");
	
	driver.findElement(age).sendKeys(ag);
	
	driver.findElement(hoursworked).sendKeys("40");
	
	driver.findElement(filetaxes).click();
	
	driver.findElement(wages1).sendKeys(salary);
	
	//xxxxxxx

	
	driver.findElement(addapplicant).click();
	
	Select sc=new Select(driver.findElement(realation));
	sc.selectByVisibleText("Spouse");
	driver.findElement(age1).sendKeys(ag1);
	
	driver.findElement(hoursworked1).sendKeys("40");
	
	driver.findElement(filetaxes1).click();
	
	driver.findElement(wages2).sendKeys(salary1);
	
	//xxxxxxx
	
	driver.findElement(addapplicant).click();
	
	Select scx=new Select(driver.findElement(realation1));
	scx.selectByVisibleText("Child");
	//sc.selectByIndex(3);
	
	Select sc1=new Select(driver.findElement(realation2));
	sc1.selectByVisibleText("Child");

	driver.findElement(age2).sendKeys(ag2);
	
   driver.findElement(hoursworked2).sendKeys("40");
   
   driver.findElement(livesindc).click();
   
	
	driver.findElement(filetaxes2).click();
	
	driver.findElement(wages3).sendKeys(salary2);
	
	//xxxxxxx
	
    driver.findElement(addapplicant).click();
   
   
	Select sc3=new Select(driver.findElement(realation3));
	sc3.selectByVisibleText("Child");
	
	Select sc4=new Select(driver.findElement(realation4));
	sc4.selectByVisibleText("Child");
	Select sc5=new Select(driver.findElement(realation5));
	sc5.selectByVisibleText("Sibling/Stepsibling");
	driver.findElement(age3).sendKeys(ag3);
	
	
	//xxxxxxx
	
	
	  
	    Select sc33=new Select(driver.findElement(taxfiler));
		sc33.selectByVisibleText("Applicant 1");
		Select sc34=new Select(driver.findElement(dependent));
		sc34.selectByVisibleText("Applicant 3");
	    
	   
	    
       driver.findElement(addtaxreturn).click();
	    
       Select sc35=new Select(driver.findElement(taxfiler41));
		sc35.selectByVisibleText("Applicant 2");
		Select sc36=new Select(driver.findElement(dependent41));
		sc36.selectByVisibleText("Applicant 4");
		
		driver.findElement(addtaxreturn).click();
		
		 Select sc37=new Select(driver.findElement(taxfiler42));
			sc37.selectByVisibleText("Applicant 3");
		
		//Thread.sleep(9999999);
	    
	driver.findElement(export).click();
	
	driver.findElement(submit).click();

}

public void CoupleVt2Children_1ChildLivingSeperately(String state,String ag,String salary,String ag1,String salary1,String ag2,String ag3) throws InterruptedException{
	
	driver.findElement(selectstate).sendKeys(state);
	
	Select sy=new Select(driver.findElement(selectyear));
	sy.selectByVisibleText("2015");
	
	driver.findElement(age).sendKeys(ag);
	
	driver.findElement(hoursworked).sendKeys("40");
	
	driver.findElement(filetaxes).click();
	
	driver.findElement(wages1).sendKeys(salary);
	
	//xxxxxxx

	
	driver.findElement(addapplicant).click();
	
	Select sc=new Select(driver.findElement(realation));
	sc.selectByVisibleText("Spouse");
	driver.findElement(age1).sendKeys(ag1);
	
	driver.findElement(hoursworked1).sendKeys("40");
	
	driver.findElement(filetaxes1).click();
	
	driver.findElement(wages2).sendKeys(salary1);
	
	//xxxxxxx
	
	driver.findElement(addapplicant).click();
	
	Select scx=new Select(driver.findElement(realation1));
	scx.selectByVisibleText("Child");
	//sc.selectByIndex(3);
	
	Select sc1=new Select(driver.findElement(realation2));
	sc1.selectByVisibleText("Child");

	driver.findElement(age2).sendKeys(ag2);
	
   driver.findElement(livesindc).click();
   
   driver.findElement(tempoutofdc).click();

	
	//xxxxxxx
	
    driver.findElement(addapplicant).click();
   
   
	Select sc3=new Select(driver.findElement(realation3));
	sc3.selectByVisibleText("Child");
	
	Select sc4=new Select(driver.findElement(realation4));
	sc4.selectByVisibleText("Child");
	Select sc5=new Select(driver.findElement(realation5));
	sc5.selectByVisibleText("Sibling/Stepsibling");
	driver.findElement(age3).sendKeys(ag3);
	
	
	//xxxxxxx
	
	    Select sc33=new Select(driver.findElement(taxfiler));
		sc33.selectByVisibleText("Applicant 1");
		Select sc34=new Select(driver.findElement(dependent));
		sc34.selectByVisibleText("Applicant 3");
	    
	   
	    
       driver.findElement(addtaxreturn).click();
	    
       Select sc35=new Select(driver.findElement(taxfiler41));
		sc35.selectByVisibleText("Applicant 2");
		Select sc36=new Select(driver.findElement(dependent41));
		sc36.selectByVisibleText("Applicant 4");
		
		//Thread.sleep(9999999);
	    
	driver.findElement(export).click();
	
	driver.findElement(submit).click();

}


public void GrandChildrenVtGranny(String state,String ag,String salary,String ag1,String salary1,String ag2,String ag3) throws InterruptedException{
	
	driver.findElement(selectstate).sendKeys(state);
	
	Select sy=new Select(driver.findElement(selectyear));
	sy.selectByVisibleText("2015");
	
	driver.findElement(age).sendKeys(ag);
	
	driver.findElement(hoursworked).sendKeys("40");
	
	driver.findElement(filetaxes).click();
	
	driver.findElement(wages1).sendKeys(salary);
	
	//xxxxxxx

	
	driver.findElement(addapplicant).click();
	
	Select sc=new Select(driver.findElement(realationx));
	sc.selectByVisibleText("Child");
	
	driver.findElement(applyinsurance1).click();
	
	driver.findElement(age1).sendKeys(ag1);
	
	driver.findElement(hoursworked1).sendKeys("40");
	
	driver.findElement(filetaxes1).click();
	
	driver.findElement(wages2).sendKeys(salary1);
	
	//xxxxxxx
	
	driver.findElement(addapplicant).click();
	
	Select scx=new Select(driver.findElement(realation1));
	scx.selectByVisibleText("Grandchild");
	//sc.selectByIndex(3);
	
	Select sc1=new Select(driver.findElement(realation2));
	sc1.selectByVisibleText("Child");

	driver.findElement(age2).sendKeys(ag2);
	

	
	//xxxxxxx
	
    driver.findElement(addapplicant).click();
   
   
	Select sc3=new Select(driver.findElement(realation3));
	sc3.selectByVisibleText("Grandchild");
	
	Select sc4=new Select(driver.findElement(realation4));
	sc4.selectByVisibleText("Child");
	Select sc5=new Select(driver.findElement(realation5));
	sc5.selectByVisibleText("Sibling/Stepsibling");
	driver.findElement(age3).sendKeys(ag3);
	
	
	//xxxxxxx
	
	    Select sc33=new Select(driver.findElement(taxfiler));
		sc33.selectByVisibleText("Applicant 1");
		
       driver.findElement(addtaxreturn).click();
	    
       Select sc35=new Select(driver.findElement(taxfiler41));
		sc35.selectByVisibleText("Applicant 2");
		Select sc36=new Select(driver.findElement(dependent41));
		sc36.selectByVisibleText("Applicant 3");
		Select sc37=new Select(driver.findElement(dependent42));
		sc37.selectByVisibleText("Applicant 4");
		
		//Thread.sleep(9999999);
		
	driver.findElement(export).click();
	
	
	driver.findElement(submit).click();

}

public void BfGfVtChildren_GfHavingMEC(String state,String ag,String salary,String ag1,String salary1,String ag2,String ag3) throws InterruptedException{
	
	driver.findElement(selectstate).sendKeys(state);
	
	Select sy=new Select(driver.findElement(selectyear));
	sy.selectByVisibleText("2015");
	
	driver.findElement(age).sendKeys(ag);
	
	driver.findElement(hoursworked).sendKeys("40");
	
	driver.findElement(filetaxes).click();
	
	driver.findElement(wages1).sendKeys(salary);
	
	//xxxxxxx

	
	driver.findElement(addapplicant).click();
	
	Select sc=new Select(driver.findElement(realation));
	sc.selectByVisibleText("Domestic partner");
	driver.findElement(age1).sendKeys(ag1);
	
	driver.findElement(hoursworked1).sendKeys("40");
	
	driver.findElement(employeehealthbenefits1).click();
	
	driver.findElement(filetaxes1).click();
	
	driver.findElement(wages2).sendKeys(salary1);
	
	//xxxxxxx
	
	driver.findElement(addapplicant).click();
	
	Select scx=new Select(driver.findElement(realation1));
	scx.selectByVisibleText("Domestic partner's child");
	//sc.selectByIndex(3);
	
	Select sc1=new Select(driver.findElement(realation2));
	sc1.selectByVisibleText("Child");

	driver.findElement(age2).sendKeys(ag2);
	
	driver.findElement(employeehealthbenefits2).click();
	

	
	//xxxxxxx
	
    driver.findElement(addapplicant).click();
   
   
	Select sc3=new Select(driver.findElement(realation3));
	sc3.selectByVisibleText("Child");
	
	Select sc4=new Select(driver.findElement(realation4));
	sc4.selectByVisibleText("Domestic partner's child");
	Select sc5=new Select(driver.findElement(realation5));
	sc5.selectByVisibleText("Sibling/Stepsibling");
	driver.findElement(age3).sendKeys(ag3);
	
	
	//xxxxxxx
	
	    Select sc33=new Select(driver.findElement(taxfiler));
		sc33.selectByVisibleText("Applicant 1");
		Select sc36=new Select(driver.findElement(dependent));
		sc36.selectByVisibleText("Applicant 4");
		
       driver.findElement(addtaxreturn).click();
	    
       Select sc35=new Select(driver.findElement(taxfiler41));
		sc35.selectByVisibleText("Applicant 2");
		
		Select sc37=new Select(driver.findElement(dependent41));
		sc37.selectByVisibleText("Applicant 3");
		
		//Thread.sleep(9999999);
		
	driver.findElement(export).click();
	
	
	driver.findElement(submit).click();

}

public void PregnantWomanVtChild(String state,String ag,String salary,String ag1,String ag2) throws InterruptedException{
	
	driver.findElement(selectstate).sendKeys(state);
	
	Select sy=new Select(driver.findElement(selectyear));
	sy.selectByVisibleText("2015");
	
	driver.findElement(age).sendKeys(ag);
	
	driver.findElement(hoursworked).sendKeys("40");
	
	 driver.findElement(livesindc0).click();
	   
	   driver.findElement(tempoutofdc0).click();
	
	driver.findElement(filetaxes).click();
	
	driver.findElement(wages1).sendKeys(salary);
	
	//xxxxxxx

	
	driver.findElement(addapplicant).click();
	
	Select sc=new Select(driver.findElement(realation));
	sc.selectByVisibleText("Spouse");
	driver.findElement(age1).sendKeys(ag1);
	driver.findElement(pregnant).click();
	//driver.findElement(childrenexpected).sendKeys("1");
	
	//xxxxxxx
	
	driver.findElement(addapplicant).click();
	
	Select scx=new Select(driver.findElement(realation1));
	scx.selectByVisibleText("Child");
	//sc.selectByIndex(3);
	
	Select sc1=new Select(driver.findElement(realation2));
	sc1.selectByVisibleText("Child");

	driver.findElement(age2).sendKeys(ag2);
	
	 driver.findElement(livesindc).click();
	   
	   driver.findElement(tempoutofdc).click();
	
	
	//xxxxxxx
	
   
	    Select sc33=new Select(driver.findElement(taxfiler));
		sc33.selectByVisibleText("Applicant 1");
		Select sc34=new Select(driver.findElement(taxfiler1));
		sc34.selectByVisibleText("Applicant 2");
		Select sc35=new Select(driver.findElement(dependent));
		sc35.selectByVisibleText("Applicant 3");
	 
		//Thread.sleep(999999);
	    
	driver.findElement(export).click();
	
	driver.findElement(submit).click();

}


public void FatherVt2Children(String state,String ag,String salary,String ag1,String ag2) throws InterruptedException{
	
	driver.findElement(selectstate).sendKeys(state);
	
	Select sy=new Select(driver.findElement(selectyear));
	sy.selectByVisibleText("2015");
	
	driver.findElement(age).sendKeys(ag);
	
	driver.findElement(hoursworked).sendKeys("40");
	
	driver.findElement(employeehealthbenefits).click();
	
	driver.findElement(filetaxes).click();
	
	driver.findElement(wages1).sendKeys(salary);
	
	//xxxxxxx

	
	driver.findElement(addapplicant).click();
	
	Select sc=new Select(driver.findElement(realationx));
	sc.selectByVisibleText("Child");
	driver.findElement(age1).sendKeys(ag1);
	driver.findElement(employeehealthbenefits1).click();
	
	//xxxxxxx
	
	driver.findElement(addapplicant).click();
	
	Select scx=new Select(driver.findElement(realation1));
	scx.selectByVisibleText("Child");
	//sc.selectByIndex(3);
	
	Select sc1=new Select(driver.findElement(realation2));
	sc1.selectByVisibleText("Sibling/Stepsibling");

	driver.findElement(age2).sendKeys(ag2);
	
	driver.findElement(employeehealthbenefits2).click();
	
	
	//xxxxxxx
	
   
	    Select sc33=new Select(driver.findElement(taxfiler));
		sc33.selectByVisibleText("Applicant 1");
		Select sc34=new Select(driver.findElement(dependent));
		sc34.selectByVisibleText("Applicant 2");
		Select sc35=new Select(driver.findElement(dependent));
		sc35.selectByVisibleText("Applicant 3");
	 
		//Thread.sleep(9999999);
	driver.findElement(export).click();
	
	
	driver.findElement(submit).click();

}


public void GrannyVtDaughter_GrandDaughter(String state,String ag,String salary,String ag1,String salary1,String ag2) throws InterruptedException{
	
	driver.findElement(selectstate).sendKeys(state);
	
	Select sy=new Select(driver.findElement(selectyear));
	sy.selectByVisibleText("2015");
	
	driver.findElement(age).sendKeys(ag);
	
	driver.findElement(hoursworked).sendKeys("40");
	
	driver.findElement(filetaxes).click();
	
	driver.findElement(wages1).sendKeys(salary);
	
	//xxxxxxx

	
	driver.findElement(addapplicant).click();
	
	Select sc=new Select(driver.findElement(realation));
	sc.selectByVisibleText("Parent");
	driver.findElement(age1).sendKeys(ag1);
	driver.findElement(filetaxes1).click();
	
	driver.findElement(wages2).sendKeys(salary1);
	
	
	//xxxxxxx
	
	driver.findElement(addapplicant).click();
	
	Select scx=new Select(driver.findElement(realation1));
	scx.selectByVisibleText("Grandchild");
	//sc.selectByIndex(3);
	
	Select sc1=new Select(driver.findElement(realation2));
	sc1.selectByVisibleText("Child");

	driver.findElement(age2).sendKeys(ag2);
	
	//xxxxxxx
	
   
	    Select sc33=new Select(driver.findElement(taxfiler));
		sc33.selectByVisibleText("Applicant 1");
		Select sc34=new Select(driver.findElement(dependent));
		sc34.selectByVisibleText("Applicant 2");
		Select sc35=new Select(driver.findElement(dependent));
		sc35.selectByVisibleText("Applicant 3");
	 
	   // Thread.sleep(9999999);
	driver.findElement(export).click();

	driver.findElement(submit).click();
	
}


public void CoupleVtDaughter(String state,String ag,String salary,String ag1,String salary1,String ag2,String salary2) throws InterruptedException{
	
	driver.findElement(selectstate).sendKeys(state);
	
	Select sy=new Select(driver.findElement(selectyear));
	sy.selectByVisibleText("2015");
	
	driver.findElement(age).sendKeys(ag);
	
	driver.findElement(hoursworked).sendKeys("40");
	
	driver.findElement(filetaxes).click();
	
	driver.findElement(wages1).sendKeys(salary);
	
	//xxxxxxx

	
	driver.findElement(addapplicant).click();
	
	Select sc=new Select(driver.findElement(realation));
	sc.selectByVisibleText("Spouse");
	driver.findElement(age1).sendKeys(ag1);
	driver.findElement(hoursworked1).sendKeys("40");
	driver.findElement(filetaxes1).click();
	
	driver.findElement(wages2).sendKeys(salary1);
	
	
	//xxxxxxx
	
	driver.findElement(addapplicant).click();
	
	Select scx=new Select(driver.findElement(realation1));
	scx.selectByVisibleText("Child");
	//sc.selectByIndex(3);
	
	Select sc1=new Select(driver.findElement(realation2));
	sc1.selectByVisibleText("Child");

	driver.findElement(age2).sendKeys(ag2);
	
	driver.findElement(student2).click();
	
	  driver.findElement(livesindc).click();
	   
	   driver.findElement(hoursworked2).sendKeys("40");
	   
        driver.findElement(filetaxes).click();
	
	driver.findElement(wages3).sendKeys(salary2);
	
	//xxxxxxx
	
   
	    Select sc33=new Select(driver.findElement(taxfiler));
		sc33.selectByVisibleText("Applicant 1");
		Select sc34=new Select(driver.findElement(taxfiler1));
		sc34.selectByVisibleText("Applicant 2");
		Select sc35=new Select(driver.findElement(dependent));
		sc35.selectByVisibleText("Applicant 3");
		
		//Thread.sleep(999999);
	 
	driver.findElement(export).click();
	
	driver.findElement(submit).click();

}

public void MotherVtDaughter(String state,String ag,String salary,String ag1,String salary1) throws InterruptedException{
	
	driver.findElement(selectstate).sendKeys(state);
	
	Select sy=new Select(driver.findElement(selectyear));
	sy.selectByVisibleText("2015");
	
	driver.findElement(age).sendKeys(ag);
	
	driver.findElement(hoursworked).sendKeys("40");
	
	driver.findElement(wages1).sendKeys(salary);
	
	//xxxxxxx

	
	driver.findElement(addapplicant).click();
	
	Select sc=new Select(driver.findElement(realation));
	sc.selectByVisibleText("Parent");
	
	driver.findElement(age1).sendKeys(ag1);
	
	driver.findElement(hoursworked1).sendKeys("40");
	
	driver.findElement(wages2).sendKeys(salary1);
	
	//Thread.sleep(9999999);
	
	driver.findElement(export).click();
	
	driver.findElement(submit).click();

}

public void MotherVtChild(String state,String ag,String salary,String ag1) throws InterruptedException{
	
	driver.findElement(selectstate).sendKeys(state);
	
	Select sy=new Select(driver.findElement(selectyear));
	sy.selectByVisibleText("2015");
	
	driver.findElement(age).sendKeys(ag);
	
	driver.findElement(hoursworked).sendKeys("40");
	
	driver.findElement(filetaxes).click();
	
	driver.findElement(wages1).sendKeys(salary);
	
	//xxxxxxx

	
	driver.findElement(addapplicant).click();
	
	Select sc=new Select(driver.findElement(realation));
	sc.selectByVisibleText("Parent");
	driver.findElement(age1).sendKeys(ag1);

	
	//xxxxxxx
	
   
	    Select sc33=new Select(driver.findElement(taxfiler));
		sc33.selectByVisibleText("Applicant 1");
		Select sc34=new Select(driver.findElement(dependent));
		sc34.selectByVisibleText("Applicant 2");
		//Thread.sleep(9999999);
		
	driver.findElement(export).click();
	
	driver.findElement(submit).click();

}


public void MotherVtMedicare_Daughter(String state,String ag,String salary,String ag1,String salary1) throws InterruptedException{
	
	driver.findElement(selectstate).sendKeys(state);
	
	Select sy=new Select(driver.findElement(selectyear));
	sy.selectByVisibleText("2015");
	
	driver.findElement(age).sendKeys(ag);
	
	driver.findElement(hoursworked).sendKeys("40");
	
	
	driver.findElement(filetaxes).click();
	
	driver.findElement(wages1).sendKeys(salary);
	
	//xxxxxxx

	
	driver.findElement(addapplicant).click();
	
	Select sc=new Select(driver.findElement(realation));
	sc.selectByVisibleText("Child");
	driver.findElement(applyinsurance1).click();
	driver.findElement(age1).sendKeys(ag1);
	driver.findElement(hoursworked1).sendKeys("40");
	 driver.findElement(medicare).click();
	 driver.findElement(livesindc1).click();
	   
	driver.findElement(disabled).click();
	driver.findElement(filetaxes1).click();
	driver.findElement(wages2).sendKeys(salary1);
	
	//xxxxxxx
	
   
	    Select sc33=new Select(driver.findElement(taxfiler));
		sc33.selectByVisibleText("Applicant 1");
		Select sc34=new Select(driver.findElement(dependent));
		sc34.selectByVisibleText("Applicant 2");
		
		//Thread.sleep(9999999);
	
	driver.findElement(export).click();
	
	driver.findElement(submit).click();

}

public void Medicaid_Refugees_MarriedCoupleVtChild(String state,String ag,String salary,String ag1,String ag2) throws InterruptedException{
	
	driver.findElement(selectstate).sendKeys(state);
	
	Select sy=new Select(driver.findElement(selectyear));
	sy.selectByVisibleText("2015");
	
	driver.findElement(age).sendKeys(ag);
	
	driver.findElement(hoursworked).sendKeys("40");
	
	driver.findElement(citizen1).click();
	
	driver.findElement(lawfulpresence1).click();
	
	Select sc9=new Select(driver.findElement(immigrationstatus1));
	sc9.selectByVisibleText("Asylee");
	
	driver.findElement(fiveyrbar1).click();
	
	driver.findElement(filetaxes).click();
	
	driver.findElement(wages1).sendKeys(salary);
	
	//xxxxxxx

	
	driver.findElement(addapplicant).click();
	
	Select sc=new Select(driver.findElement(realation));
	sc.selectByVisibleText("Spouse");
	driver.findElement(age1).sendKeys(ag1);

	driver.findElement(citizen2).click();
	
	driver.findElement(lawfulpresence2).click();
	
	Select sc10=new Select(driver.findElement(immigrationstatus2));
	sc10.selectByVisibleText("Asylee");
	
	driver.findElement(fiveyrbar2).click();
	
	
	//xxxxxxx
	
	driver.findElement(addapplicant).click();
	
	Select scx=new Select(driver.findElement(realation1));
	scx.selectByVisibleText("Child");
	//sc.selectByIndex(3);
	
	Select sc1=new Select(driver.findElement(realation2));
	sc1.selectByVisibleText("Child");

	driver.findElement(age2).sendKeys(ag2);
	
	driver.findElement(citizen3).click();
	
	driver.findElement(lawfulpresence3).click();
	
	Select sc11=new Select(driver.findElement(immigrationstatus3));
	sc11.selectByVisibleText("Asylee");
	
	driver.findElement(fiveyrbar3).click();
	
	//xxxxxxx
	
   
	 Select sc33=new Select(driver.findElement(taxfiler));
		sc33.selectByVisibleText("Applicant 1");
		Select sc34=new Select(driver.findElement(taxfiler1));
		sc34.selectByVisibleText("Applicant 2");
		Select sc35=new Select(driver.findElement(dependent));
		sc35.selectByVisibleText("Applicant 3");
		
		//Thread.sleep(9999999);
	 
	driver.findElement(export).click();
	
	driver.findElement(submit).click();

}

public void Refugees_MotherWithChild(String state,String ag,String salary,String ag1) throws InterruptedException{
	
	driver.findElement(selectstate).sendKeys(state);
	
	Select sy=new Select(driver.findElement(selectyear));
	sy.selectByVisibleText("2015");
	
	driver.findElement(age).sendKeys(ag);
	
	driver.findElement(hoursworked).sendKeys("40");
	
driver.findElement(citizen1).click();
	
	driver.findElement(lawfulpresence1).click();
	
	Select sc9=new Select(driver.findElement(immigrationstatus1));
	sc9.selectByVisibleText("Refugee");
	
	driver.findElement(fiveyrbar1).click();
	
	driver.findElement(filetaxes).click();
	
	driver.findElement(wages1).sendKeys(salary);
	
	//xxxxxxx

	
	driver.findElement(addapplicant).click();
	
	Select sc=new Select(driver.findElement(realation));
	sc.selectByVisibleText("Parent");
	driver.findElement(age1).sendKeys(ag1);
	
driver.findElement(citizen2).click();
	
	driver.findElement(lawfulpresence2).click();
	
	Select sc10=new Select(driver.findElement(immigrationstatus2));
	sc10.selectByVisibleText("Refugee");
	
	driver.findElement(fiveyrbar2).click();

	
	//xxxxxxx
	
   
	    Select sc33=new Select(driver.findElement(taxfiler));
		sc33.selectByVisibleText("Applicant 1");
		Select sc34=new Select(driver.findElement(dependent));
		sc34.selectByVisibleText("Applicant 2");
		//Thread.sleep(9999999);

	
	driver.findElement(export).click();
	
	driver.findElement(submit).click();

}

public void FatherVtChild(String state,String ag,String salary,String ag1) throws InterruptedException{
	
	driver.findElement(selectstate).sendKeys(state);
	
	Select sy=new Select(driver.findElement(selectyear));
	sy.selectByVisibleText("2015");
	
	
	driver.findElement(applyinsurance).click();
	driver.findElement(age).sendKeys(ag);
	
	driver.findElement(hoursworked).sendKeys("40");
	
	driver.findElement(disabled0).click();
	driver.findElement(filetaxes).click();
	driver.findElement(citizen1).click();
	driver.findElement(wages1).sendKeys(salary);
	
	//xxxxxxx

	
	driver.findElement(addapplicant).click();
	
	Select sc=new Select(driver.findElement(realation));
	sc.selectByVisibleText("Parent");
	
	driver.findElement(age1).sendKeys(ag1);
	driver.findElement(disabled).click();
	
	
	//Thread.sleep(9999999);
	
	driver.findElement(export).click();
	
	driver.findElement(submit).click();

}

}
