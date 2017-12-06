/**
 * 
 */
package com.vdif.webautomation.alquran;

import java.util.List;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

/**
 * @author {Naeem Siddiq}
 *
 * {Associate Software Engineer}
 */

public class AlQuranPageLocators {

	WebDriver driver; 
	
	public AlQuranPageLocators(WebDriver adriver){
		this.driver=adriver;
	}
	
	@FindBy(how=How.LINK_TEXT,using="Al Quran")
	WebElement alQuarnButton;
	
	@FindBy(how=How.XPATH,using="//*[@id='panel1']/div/div")
	List<WebElement> surahsListAlQuranPage;
	
	@FindBy(how=How.TAG_NAME,using="h1")
	WebElement h1Tag;
	
	@FindBy(how=How.XPATH,using="//a[contains(text(),'Juz')]")
	WebElement juzTab;
	
	@FindBy(how=How.XPATH,using="//*[@id='panel2']/div/div")
	List<WebElement> juzListAlQuranPage;
	
	@FindBy(how=How.XPATH,using="//a[contains(text(),'Translations')]")
	WebElement translationsTab;
	
	@FindBy(how=How.XPATH,using="//*[@id='panel3']/div/div")
	List<WebElement> translationsListAlQuranPage;
	
	@FindBy(how=How.XPATH,using="//*[@id='panel4']/div/div")
	List<WebElement> topicsListAlQuranPage;
	
	@FindBy(how=How.XPATH,using="//a[contains(text(),'Topics')]")
	WebElement topicsTab;	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
