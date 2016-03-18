package pageobjects;

import org.openqa.selenium.By;

public interface MagiPageObjects {
	
	public static By noinsurance = By.id("applicant_0_is_applicant");
	
	public static By selectstate = By.id("state");
	
	public static By selectyear = By.id("applicationYear");
	
	public static By age = By.id("applicant_0_age");
	
	public static By hoursworked = By.id("applicant_0_hours");
	
	public static By insured = By.id("applicant_0_has_insurance");
	
	public static By applyinsurance = By.id("applicant_0_is_applicant");
	
	public static By employeehealthbenefits = By.id("applicant_0_state_employee_health_benefits");
		
	public static By pregnant = By.id("applicant_1_pregnant");
	
	public static By childrenexpected = By.id("applicant_1_number_of_children_expected");
	
	public static By citizen1 = By.id("applicant_0_citizen");
	
	public static By lawfulpresence1 = By.id("applicant_0_citizen_lawful");
	
	public static By immigrationstatus1 = By.id("applicant_0_lawful_immigration_status");
	
	public static By fiveyrbar1 = By.id("applicant_0_qnc_five_year_bar");
	
	public static By filetaxes = By.id("applicant_0_income_taxes_required");
	
	public static By wages1 = By.xpath(".//*[@class='long-number annual']");
	
public static By livesindc0 = By.id("applicant_0_lives_in_state");
	
	public static By tempoutofdc0 = By.id("applicant_0_temporarily_out_of_state");
	
	public static By disabled0 = By.id("applicant_0_disabled");
	
	// common
	
	public static By addapplicant = By.xpath(".//*[@id='application_form']/button[1]");
	
	public static By submit = By.xpath(".//*[@type='submit']");
	
	public static By export = By.xpath(".//*[@class='submitlike']");
	
	 public static By dependent = By.id("newdependent_{$index}");
	 
	 public static By addtaxreturn = By.xpath("html/body/div/form/button[2]");
	 
	 public static By taxfiler = By.id("filer_{$index}");
	 
	 public static By taxfiler1 = By.xpath(".//fieldset[4]/div[2]/div[2]/div/div/select");
	 
	 public static By taxfiler1x = By.xpath(".//fieldset[7]/div[2]/div[2]/div/div/select");
	 
	 public static By medicare1 = By.id("applicant_0_eligible");
	 
	
	// 2nd applicant  
	
	public static By age1 = By.id("applicant_1_age");
	
	public static By disabled = By.id("applicant_1_disabled");
	
	public static By hoursworked1 = By.id("applicant_1_hours");
	
	public static By applyinsurance1 = By.id("applicant_1_is_applicant");
	
	public static By employeehealthbenefits1 = By.id("applicant_1_state_employee_health_benefits");
	
    public static By livesindc1 = By.id("applicant_1_lives_in_state");
	
	public static By tempoutofdc1 = By.id("applicant_1_temporarily_out_of_state");
	
public static By citizen2 = By.id("applicant_1_citizen");
	
	public static By lawfulpresence2 = By.id("applicant_1_citizen_lawful");
	
	public static By immigrationstatus2 = By.id("applicant_1_lawful_immigration_status");
	
	public static By fiveyrbar2 = By.id("applicant_1_qnc_five_year_bar");
	
	public static By filetaxes1 = By.id("applicant_1_income_taxes_required");
	
	public static By student2 = By.id("applicant_2_student");
	
	public static By medicare = By.id("applicant_1_eligible");
	
	public static By wages2 = By.xpath(".//fieldset[2]/div[19]/div/div[1]/div[2]/input");
	
// 3rd applicant
	
	public static By age2 = By.id("applicant_2_age");
	
	public static By hoursworked2 = By.id("applicant_2_hours");
	
	public static By employeehealthbenefits2 = By.id("applicant_2_state_employee_health_benefits");
	
	public static By livesindc = By.id("applicant_2_lives_in_state");
	
	public static By tempoutofdc = By.id("applicant_2_temporarily_out_of_state");
	
public static By citizen3 = By.id("applicant_2_citizen");
	
	public static By lawfulpresence3 = By.id("applicant_2_citizen_lawful");
	
	public static By immigrationstatus3 = By.id("applicant_2_lawful_immigration_status");
	
	public static By fiveyrbar3 = By.id("applicant_2_qnc_five_year_bar");
	
	public static By filetaxes2 = By.id("applicant_2_income_taxes_required");
	
	public static By wages3 = By.xpath(".//fieldset[3]/div[20]/div/div[1]/div[2]/input");
	
	// 4th applicant
	
			public static By age3 = By.id("applicant_3_age");
			
			public static By hoursworked3 = By.id("applicant_3_hours");
			
			public static By filetaxes3 = By.id("applicant_3_income_taxes_required");
			
			public static By wages4 = By.xpath(".//fieldset[4]/div[21]/div/div[1]/div[2]/input");
			
			public static By taxfiler41 = By.xpath(".//fieldset[6]/div[2]/div/div/div/select");
			 
			 public static By taxfiler42 = By.xpath(".//fieldset[7]/div[2]/div/div/div/select");
			 
			 public static By dependent41 = By.xpath(".//fieldset[6]/div[3]/div/div/div/select");
			 
			 public static By dependent42 = By.xpath(".//fieldset[6]/div[3]/div[2]/div/div/select");
	
	// 5th applicant
	
		public static By age4 = By.id("applicant_4_age");
		
		public static By hoursworked4 = By.id("applicant_4_hours");
		
		public static By disabled5 = By.id("applicant_4_disabled");
		
		public static By medicare5 = By.id("applicant_4_eligible");
		
		public static By filetaxes4 = By.id("applicant_4_income_taxes_required");
		
		public static By wages5 = By.xpath(".//fieldset[5]/div[22]/div/div[1]/div[2]/input");
		
		public static By taxfiler51 = By.xpath(".//fieldset[7]/div[2]/div/div/div/select");
		 
		 public static By taxfiler52 = By.xpath(".//fieldset[8]/div[2]/div/div/div/select");
		 
		 public static By dependent51 = By.xpath(".//fieldset[7]/div[3]/div[1]/div/div/select");
		 
		 public static By dependent52 = By.xpath(".//fieldset[7]/div[3]/div[2]/div/div/select");
		
		
		
		// 6th applicant
		
		public static By age5 = By.id("applicant_5_age");
		
		public static By hoursworked5 = By.id("applicant_5_hours");
		
		public static By filetaxes5 = By.id("applicant_5_income_taxes_required");
		
		public static By wages6 = By.xpath(".//fieldset[6]/div[23]/div/div[1]/div[2]/input");
		
		// 7th applicant
		
		public static By age6 = By.id("applicant_6_age");
		
		public static By hoursworked6 = By.id("applicant_6_hours");
		
		public static By filetaxes6 = By.id("applicant_6_income_taxes_required");
		
		// 8th applicant
		
		public static By age7 = By.id("applicant_7_age");
		
		public static By hoursworked7 = By.id("applicant_7_hours");
		
		public static By filetaxes7 = By.id("applicant_7_income_taxes_required");
		
		 public static By taxfiler81 = By.xpath(".//fieldset[10]/div[2]/div/div/div/select");
		 
		 public static By taxfiler82 = By.xpath(".//fieldset[11]/div[2]/div/div/div/select");
		 
		 public static By taxfiler83 = By.xpath(".//fieldset[12]/div[2]/div/div/div/select");
		 
		 public static By dependent81 = By.xpath(".//fieldset[10]/div[3]/div/div/div/select");
		 
		 public static By dependent82 = By.xpath(".//fieldset[11]/div[3]/div/div/div/select");
		 
		 public static By dependent83 = By.xpath(".//fieldset[12]/div[3]/div/div/div/select");
		
		// 9th applicant
		
		public static By age8 = By.id("applicant_8_age");
		
		public static By hoursworked8 = By.id("applicant_8_hours");
		
		public static By filetaxes8 = By.id("applicant_8_income_taxes_required");
		
		

		
		
		//relation to 1st applicant
		
		public static By realation = By.xpath(".//*[@id='uniform-undefined']/div/select");
		
		 public static By realationx = By.xpath("//fieldset[2]/div[1]/div/div/div/select");
		 
		 public static By realation1 = By.xpath("//fieldset[3]/div[1]/div/div/div/select");
		 
		 public static By realation2 = By.xpath("//fieldset[3]/div[2]/div/div/div/select");
		 
	     public static By realation3 = By.xpath("//fieldset[4]/div[1]/div/div/div/select");
		 
		 public static By realation4 = By.xpath("//fieldset[4]/div[2]/div/div/div/select");
		 
		 public static By realation5 = By.xpath("//fieldset[4]/div[3]/div/div/div/select");
		 
          public static By realation6 = By.xpath(".//fieldset[5]/div[1]/div/div/div/select");
		 
		 public static By realation7 = By.xpath("//fieldset[5]/div[2]/div/div/div/select");
		 
		 public static By realation8 = By.xpath("//fieldset[5]/div[3]/div/div/div/select");
		 
	     public static By realation9 = By.xpath("//fieldset[5]/div[4]/div/div/div/select");
		 
		 public static By realation10 = By.xpath("//fieldset[6]/div[1]/div/div/div/select");
		 
		 public static By realation11 = By.xpath("//fieldset[6]/div[2]/div/div/div/select");	 
		 
		 
		 public static By realation12 = By.xpath("//fieldset[6]/div[3]/div/div/div/select");
		 
		 public static By realation13 = By.xpath("//fieldset[6]/div[4]/div/div/div/select");
		 
	     public static By realation14 = By.xpath("//fieldset[6]/div[5]/div/div/div/select");
		 
		 public static By realation15 = By.xpath("//fieldset[7]/div[1]/div/div/div/select");
		 
		 public static By realation16 = By.xpath("//fieldset[7]/div[2]/div/div/div/select");
		 
          public static By realation17 = By.xpath(".//fieldset[7]/div[3]/div/div/div/select");
		 
		 public static By realation18 = By.xpath("//fieldset[7]/div[4]/div/div/div/select");
		 
		 public static By realation19 = By.xpath("//fieldset[7]/div[5]/div/div/div/select");
		 
	     public static By realation20 = By.xpath("//fieldset[7]/div[6]/div/div/div/select");
		 
		 public static By realation21 = By.xpath("//fieldset[8]/div[1]/div/div/div/select");
		 
		 public static By realation22 = By.xpath("//fieldset[8]/div[2]/div/div/div/select");	
		 
		 public static By realation23 = By.xpath("//fieldset[8]/div[3]/div/div/div/select");
		 
	     public static By realation24 = By.xpath("//fieldset[8]/div[4]/div/div/div/select");
		 
		 public static By realation25 = By.xpath("//fieldset[8]/div[5]/div/div/div/select");
		 
		 public static By realation26 = By.xpath("//fieldset[8]/div[6]/div/div/div/select");	
	
		 public static By realation27 = By.xpath("//fieldset[8]/div[7]/div/div/div/select");	
	
}
