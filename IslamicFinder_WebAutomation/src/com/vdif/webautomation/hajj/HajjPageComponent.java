/**
 * 
 */
package com.vdif.webautomation.hajj;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

import com.vdif.webautomation.AbstractComponent;

/**
 * @author {Naeem Siddiq}
 *
 *         {Associate Software Engineer}
 */
public class HajjPageComponent extends AbstractComponent {

	HajjPageLocators hajjPageLocators = PageFactory.initElements(driver, HajjPageLocators.class);

	public void clickHajj2017PageButton() throws Exception {
		WebElement element = hajjPageLocators.hajjPageButton;
		scrollToLocateElement(element);
	}

	public void clickIqraPageLink() throws Exception {
		WebElement element = hajjPageLocators.iqraLink;
		scrollToLocateElement(element);
	}

	public void clickIslamicGalleryLink() throws Exception {
		WebElement element = hajjPageLocators.islamicGalleryLink;
		scrollToLocateElement(element);
	}

	public void clickAlQuranLink() throws Exception {
		WebElement element = hajjPageLocators.alQuranLink;
		scrollToLocateElement(element);
	}

	public String checkAlQuranWithTranslationTextOnAlQuranPage() {
		WebElement element = hajjPageLocators.alQuranWithTranslationTextOnAlQuranPage;
		System.out.println(element.getText());
		return element.getText();
	}

	public void clickIslamicCalenderLink() throws Exception {
		WebElement element = hajjPageLocators.islamicCalendarLink;
		scrollToLocateElement(element);
	}

	public void clickDuasPageLink() throws Exception {
		WebElement element = hajjPageLocators.duasLink;
		scrollToLocateElement(element);
	}

	/********       ********/
	// For Side NavBar On Hajj Page

	public String checkHajj2017Text() {
		WebElement element = hajjPageLocators.Hajj2017Text;
		System.out.println(element.getText());
		return element.getText();
	}

	public void clickCommencementOfHajjLink() throws Exception {
		WebElement element = hajjPageLocators.commencementOfHajjLink;
		scrollToLocateElement(element);
	}

	public void clickGoBackButtonOnHajjPage() throws Exception {
		WebElement element = hajjPageLocators.goBackButtonOnHajjPage;
		scrollToLocateElement(element);
	}

	public void clickADayAtMinaLink() throws Exception {
		WebElement element = hajjPageLocators.aDayAtMinaLink;
		scrollToLocateElement(element);
	}

	public void clickADayOfArafatLink() throws Exception {
		WebElement element = hajjPageLocators.aDayOfArafatLink;
		scrollToLocateElement(element);
	}

	public void clickRamyJamaratLink() throws Exception {
		WebElement element = hajjPageLocators.ramyJamaratLink;
		scrollToLocateElement(element);
	}

	public void clickEndOfHajjLink() throws Exception {
		WebElement element = hajjPageLocators.endOfHajjLink;
		scrollToLocateElement(element);
	}

	/********       ********/
	// For Hajj Live Card On Hajj Page

	public String checkHajjLiveText() {
		WebElement element = hajjPageLocators.hajjLiveText;
		System.out.println(element.getText());
		return element.getText();
	}

	public String checkHajjDuaText() {
		WebElement element = hajjPageLocators.hajjDuaText;
		System.out.println(element.getText());
		return element.getText();
	}

	public void clickViewAllDuasButton() throws Exception {
		WebElement element = hajjPageLocators.viewAllDuasButton;
		scrollToLocateElement(element);
	}

	public String checkFindDuasDuringHajj2017Text() {
		WebElement element = hajjPageLocators.findDuasDuringHajj2017Text;
		System.out.println(element.getText());
		return element.getText();
	}

	/********       ********/
	// For Other Card On Hajj Page

	public String checkTheHistoryAndImportanceOfIslamicCalendarText() {
		WebElement element = hajjPageLocators.theHistoryAndImportanceOfIslamicCalendarText;
		System.out.println(element.getText());
		return element.getText();
	}

	public String checkSurahBaqarahVerse125Text() {
		WebElement element = hajjPageLocators.surahBaqarahVerse125Text;
		System.out.println(element.getText());
		return element.getText();
	}

	public String checkHajjText() {
		WebElement element = hajjPageLocators.hajjText;
		System.out.println(element.getText());
		return element.getText();
	}

	public String checkTheStoryBehindTheStoningOfSatanDuringHajjText() {
		WebElement element = hajjPageLocators.theStoryBehindTheStoningOfSatanDuringHajjText;
		System.out.println(element.getText());
		return element.getText();
	}

	public String checkSurahBaqarahVerse196Text() {
		WebElement element = hajjPageLocators.surahBaqarahVerse196Text;
		System.out.println(element.getText());
		return element.getText();
	}

	public String checkSeekHelpThroughPrayersText() {
		WebElement element = hajjPageLocators.seekHelpThroughPrayersText;
		System.out.println(element.getText());
		return element.getText();
	}

	public String checkCommonMistakesMadeOnTheDayOfArafahText() {
		WebElement element = hajjPageLocators.commonMistakesMadeOnTheDayOfArafahText;
		System.out.println(element.getText());
		return element.getText();
	}

	public String checkSmileText() {
		WebElement element = hajjPageLocators.smileText;
		System.out.println(element.getText());
		return element.getText();
	}

	public String checkEidulAdhaCelebratingItInAResponsibleWayText() {
		WebElement element = hajjPageLocators.eidulAdhaCelebratingItInAResponsibleWayText;
		System.out.println(element.getText());
		return element.getText();
	}

	public String checkSurahMaaidaVerse1Text() {
		WebElement element = hajjPageLocators.surahMaaidaVerse1Text;
		System.out.println(element.getText());
		return element.getText();
	}

	

}
