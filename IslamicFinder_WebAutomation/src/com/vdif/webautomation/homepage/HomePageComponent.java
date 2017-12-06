/**
 * 
 */
package com.vdif.webautomation.homepage;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import com.vdif.webautomation.AbstractComponent;

/**
 * @author Naeem Siddiq
 *
 */
public class HomePageComponent extends AbstractComponent {

	HomePageLocators homePageLocators = PageFactory.initElements(driver, HomePageLocators.class);
	WebDriverWait wait = new WebDriverWait(driver, 20);
	WebElement waitElement;

	/// For Top NavBar

	public String checkH1Tag(){
		String element=homePageLocators.h1Tag.getText();
		return element;
	}
	
	public void searchTopNavBar() throws Exception {

		driver.manage().timeouts().implicitlyWait(4, TimeUnit.SECONDS);
		homePageLocators.topNavBarSearch.clear();
		homePageLocators.topNavBarSearch.sendKeys(homePageLocators.lahore);
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		driver.findElement(By.linkText("Lahore, Punjab, Pakistan")).click();
		Thread.sleep(1000);
	}

	public void openSettingspanel() throws Exception {
		homePageLocators.openSettingPanel.click();
		Thread.sleep(1000);
	}

	public String checkLocationText() {
		String checkLocationText = homePageLocators.checkLocationText.getText();
		System.out.println(checkLocationText);
		return checkLocationText;
	}

	public void switchOffAutoPaddle() {
		homePageLocators.switchAutoPaddle.click();
	}

	public void switchOnAutoPaddle() {
		homePageLocators.switchAutoPaddle.click();
	}

	public void closeSettingspanel() throws Exception {
		Thread.sleep(1000);
		homePageLocators.closeSettingPanel.click();
	}

	public void closePrompt() {
		homePageLocators.closePrompt.click();
	}

	public void clickDropDownEnglish() throws Exception {
		homePageLocators.clickDropDownEnglish.click();
		Thread.sleep(1000);
	}

	public void clickArabic() throws Exception {
		homePageLocators.clickArabic.click();
		Thread.sleep(1000);
	}

	public void clickDropDownArabic() throws Exception {
		homePageLocators.clickDropDownArabic.click();
		Thread.sleep(1000);
	}

	public void clickEnglish() throws Exception {
		homePageLocators.clickEnglish.click();
		Thread.sleep(1000);
	}

	public void clickLoginText() throws Exception {
		homePageLocators.clickLogin.click();
		Thread.sleep(1000);
	}

	public void clickHomeButton() throws Exception {
		WebElement element = homePageLocators.homeButton;
		scrollToLocateElement(element);
	}

	/********       ********/
	// For Prayer Times Card on Home Page
	public void clickOnPrayerTimesToday() {
		homePageLocators.prayerTimesToday.click();
	}

	public String checkLahorePunjabPakistanText() {
		WebElement element = homePageLocators.lahorePunjabPakistan;
		System.out.println(element.getText());
		return element.getText();
	}

	public void clickOnThisWeek() {
		homePageLocators.clickOnThisWeek.click();
	}

	public void clickOnWrongLocation() {
		homePageLocators.wrongLocation.click();
	}

	public String checkUpcomingPrayersText() {
		WebElement element = homePageLocators.upcomingPrayers;
		System.out.println(element.getText());
		return element.getText();
	}

	public void clickOnSeeMonthlyPrayerTime() {
		homePageLocators.seeMonthlyPrayers.click();
	}
	
	public void verifyListOfNamaz() throws Exception {
		ArrayList<String> headingOnTopUps = new ArrayList<>(
				Arrays.asList("Fajr (Morning)", "Sunrise",
						"Dhuhr (Noon)", "Asr (Late Afternoon)","Maghrib (Evening)","Isha (Night)","Qiyam"));
		ArrayList<String> closePopUpPath = new ArrayList<>(Arrays.asList("popup-fajr-info",
				"popup-sunrise-info", "popup-dhuhr-info", "popup-asr-info","popup-maghrib-info","popup-isha-info","popup-qiyam-info"));
	List<WebElement> listOfPrayerName=homePageLocators.listOfPrayerNames;
		for(int i=0;i<listOfPrayerName.size();i++){
			listOfPrayerName.get(i).click();
			Assert.assertEquals(checkHeadingOnTopUps(headingOnTopUps.get(i)), headingOnTopUps.get(i));
			closePopUp(closePopUpPath.get(i));
		}
	
	}

	public void verifyListOfCalculationMethodJMDSLatLng() throws Exception {

		ArrayList<String> closePopUpPath = new ArrayList<>(Arrays.asList("popup-calculation-info",
				"popup-jusirstic-info", "popup-daylight-info", "popup-latlng-info"));
		ArrayList<String> headingOnTopUps = new ArrayList<>(
				Arrays.asList("Calculation Method", "The difference between Standard and Hanafi (Juristic Methods)",
						"Daylight Saving Time", "Latitude and Longitude"));

		List<WebElement> parentRow = homePageLocators.listOf_CalculationMethod_JM_DS_LatLng;
		for (int i = 0; i < parentRow.size(); i++) {
			System.out.println(parentRow.get(i).findElement(By.tagName("span")).getText());
			parentRow.get(i).findElement(By.tagName("span")).click();
			checkAssert(headingOnTopUps.get(i), checkHeadingOnTopUps(headingOnTopUps.get(i)));
			closePopUp(closePopUpPath.get(i));
			System.out.println(parentRow.get(i).findElement(By.tagName("p")).getText());
		}

	}

	public void closePopUp(String path) {
		WebElement element = homePageLocators.popUpclosePath(path);
		element.click();
	}

	public String checkHeadingOnTopUps(String path) {
		String element = homePageLocators.headingOnTopUp(path);
		return element;
	}

	public void openChangeSettingsPanel() throws Exception {
		WebElement element = homePageLocators.openChangeSettings;
		scrollToLocateElement(element);
	}

	/********       ********/
	// For Verse Of The Day Card on Home Page
	public String checkVerseOfTheDayText() {
		WebElement element = homePageLocators.verseOfTheDayText;
		System.out.println(element.getText());
		return element.getText();
	}

	public String checkTranslatedInUrduText() {
		WebElement element = homePageLocators.translatedInUrduText;
		System.out.println(element.getText());
		return element.getText();
	}

	public void openSharePanelOnVerseOfTheDayCard() throws Exception {
		WebElement element = homePageLocators.openSharePanelOnVerseOfTheDayCard;
		scrollToLocateElement(element);
	}

	public void closeSharePanelOnVerseOfTheDayCard() throws Exception {
		WebElement element = homePageLocators.closeSharePanelOnVerseOfTheDayCard;
		scrollToLocateElement(element);/////////////////////check this
		//element.click();
	}

	public void clickOnreciteAlQuranWithTranslation() throws Exception {
		WebElement element = homePageLocators.reciteAlQuranWithTranslation;
		scrollToLocateElement(element);
	}

	/********       ********/
	// For Popular Surah and Verses Card on Home Page

	public String checkPopularSurahAndVersesText() {
		WebElement element = homePageLocators.popularSurahAndVersesText;
		System.out.println(element.getText());
		return element.getText();
	}

	public void clickSurahYasinText() throws Exception {
		WebElement element = homePageLocators.surahYasinText;
		scrollToLocateElement(element);
	}

	public void clickSurahBaqarahText() throws Exception {
		WebElement element = homePageLocators.surahBaqarahText;
		scrollToLocateElement(element);
	}

	public void clickSurahNisaText() throws Exception {
		WebElement element = homePageLocators.surahNisaText;
		scrollToLocateElement(element);
	}

	/********       ********/
	// For Articles on Iqra Card on Home Page

	public String checkArticlesOnIqraText() {
		WebElement element = homePageLocators.articlesOnIqraText;
		System.out.println(element.getText());
		return element.getText();
	}

	public void openSeeAllPostsOnIqraCard() throws Exception {
		WebElement element = homePageLocators.seeAllPostsText;
		scrollToLocateElement(element);
	}

	/********       ********/
	// For Islamic Gallery Card on Home Page

	public String checkIslamicGalleryText() {
		WebElement element = homePageLocators.islamicGalleryText;
		System.out.println(element.getText());
		return element.getText();
	}

	public void openSeeAllOnIslamicGalleryCard() throws Exception {
		WebElement element = homePageLocators.seeAllText;
		scrollToLocateElement(element);
	}

	/********       ********/
	// For Islamic Gallery Card on Home Page

	public String checkYourMonthlyPrayerbookText() {
		WebElement element = homePageLocators.seeYourMonthlyPrayerbookText;
		System.out.println(element.getText());
		return element.getText();
	}

	public void clickloginButtonOnSeeYourMonthlyPrayerBook() throws Exception {
		WebElement element = homePageLocators.loginButtonOnSeeYourMonthlyPrayerBook;
		scrollToLocateElement(element);
	}

	/********       ********/
	// For Dua of the Day Card on Home Page

	public String checkDuaOfTheDayText() {
		WebElement element = homePageLocators.duaOfTheDayText;
		System.out.println(element.getText());
		return element.getText();
	}

	public void openSharePanelOnDuaOfTheDayCard() throws Exception {
		WebElement element = homePageLocators.openSharePanelOnDuaOfTheDayCard;
		scrollToLocateElement(element);
	}

	public void clickOnReadAllDuasOnDuaOfTheDayCard() throws Exception {
		WebElement element = homePageLocators.readAllDuas;
		scrollToLocateElement(element);
	}

	/********       ********/
	// For Upcoming Event Card on Home Page

	public String checkUpcomingEventText() {
		WebElement element = homePageLocators.upcomingEventText;
		System.out.println(element.getText());
		return element.getText();
	}

	public void clickOnLearnMoreButtonOnUpcomingEventCard() throws Exception {
		WebElement element = homePageLocators.learnMoreButtonOnUpcomingEventCard;
		scrollToLocateElement(element);
	}

	public void clickOnSeeAllIslamicDaysOnUpcomingEventCard() throws Exception {
		WebElement element = homePageLocators.seeAllIslamicDays;
		scrollToLocateElement(element);
	}

	/********       ********/
	// For Top Places in Lahore Card on Home Page

	public String checkTopPlacesInLahoreText() {
		WebElement element = homePageLocators.topPlacesInLahoreText;
		System.out.println(element.getText());
		return element.getText();
	}

	public void clickOnSeeMoreIslamicPlacesOnTopPlacesInLahoreCard() throws Exception {
		WebElement element = homePageLocators.seeMoreIslamicPlacesOnTopPlacesInLahoreCard;
		scrollToLocateElement(element);
	}

	/********       ********/
	// For Stay Updated Card on Home Page

	public void enterNameInStayUpdatedCard() {
		homePageLocators.nameInStayUpdatedCard.clear();
		homePageLocators.nameInStayUpdatedCard.sendKeys("VD_CHECK");
	}

	public void enterEmailInStayUpdatedCard() throws Exception {
		homePageLocators.emailInStayUpdatedCard.clear();
		homePageLocators.emailInStayUpdatedCard.sendKeys("vdcheck123@gmail.com");
	}

	public void ClicksubscribeButtonInStayUpdatedCard() throws Exception {
		homePageLocators.subscribeButtonInStayUpdatedCard.click();
		Thread.sleep(1500);
	}

	public void verifyThankYouMessageInStayUpdatedCard() throws Exception {
		WebElement element = homePageLocators.thankYouMessageInStayUpdatedCard;
		scrollToLocateElement(element);
	}

	/********       ********/
	// For Top Places in Lahore Card on Home Page

	public void clickOnfooterHomeLink() throws Exception {
		WebElement element = homePageLocators.footerHomeLink;
		scrollToLocateElement(element);
	}

	public void clickOnfooterDuaLink() throws Exception {
		WebElement element = homePageLocators.footerDuaLink;
		scrollToLocateElement(element);
	}

	public void checkDuasIslamicandQuranic_TextOnDuaPage() throws Exception {
		WebElement element = homePageLocators.checkDuasIslamicandQuranic_TextOnDuaPage;
		scrollToLocateElement(element);
	}

	public void clickOnfooterPrayerTimesLink() throws Exception {
		WebElement element = homePageLocators.footerPrayerTimesLink;
		scrollToLocateElement(element);
	}

	public void checkPrayerTimesTextOnPrayerTimesPage() throws Exception {
		WebElement element = homePageLocators.checkPrayerTimesTextOnPrayerTimesPage;
		scrollToLocateElement(element);
		Thread.sleep(500);
	}

	public void clickOnfooterIslamicPacesLink() throws Exception {
		WebElement element = homePageLocators.footerIslamicPacesLink;
		scrollToLocateElement(element);
	}

	public void checkNearByMosquesAndIslamicPlacesIPage() throws Exception {
		WebElement element = homePageLocators.checkNearByMosquesAndIslamicPlacesIPage;
		scrollToLocateElement(element);
	}

	public void clickOnfooterQiblaDirectionLink() throws Exception {
		WebElement element = homePageLocators.footerQiblaDirectionLink;
		scrollToLocateElement(element);
	}

	public void checkQiblaDirectionAndQiblaCompass() throws Exception {
		WebElement element = homePageLocators.checkQiblaDirectionAndQiblaCompass;
		scrollToLocateElement(element);
	}

	public void clickOnfooterWorldLink() throws Exception {
		WebElement element = homePageLocators.footerWorldLink;
		scrollToLocateElement(element);
	}

	public void checkFindPrayerTimesAndIslamicPlacesInYourCountryOnWorldPage() throws Exception {
		WebElement element = homePageLocators.checkFindPrayerTimesAndIslamicPlacesInYourCountryOnWorldPage;
		scrollToLocateElement(element);
	}

	public void clickOnfooterCalenderLink() throws Exception {
		WebElement element = homePageLocators.footerCalenderLink;
		scrollToLocateElement(element);
	}

	public void checkIslamicCalendarOnCalenderPage() throws Exception {
		WebElement element = homePageLocators.checkIslamicCalendarOnCalenderPage;
		scrollToLocateElement(element);
	}

	public void clickOnfooterIslamicDaysLink() throws Exception {
		WebElement element = homePageLocators.footerIslamicDaysLink;
		scrollToLocateElement(element);
	}

	public String checkSpecialIslamicDaysPageOnIslamicDaysPage() throws Exception {
		WebElement element = homePageLocators.checkSpecialIslamicDaysPage;
		return element.getText();
	}

	public void clickOnfooterDateConverterLink() throws Exception {
		WebElement element = homePageLocators.footerDateConverterLink;
		scrollToLocateElement(element);
	}

	public void checkIslamicDateConverterGregorianCalendarConverter() throws Exception {
		WebElement element = homePageLocators.checkIslamicDateConverterGregorianCalendarConverter;
		scrollToLocateElement(element);
	}

	public void clickOnfooterIslamicGalleryLink() throws Exception {
		WebElement element = homePageLocators.footerIslamicGalleryLink;
		scrollToLocateElement(element);
	}

	public void checkIsIslamicGalleryBestCollectionofIslamicPictures() throws Exception {
		WebElement element = homePageLocators.checkIsIslamicGalleryBestCollectionofIslamicPictures;
		scrollToLocateElement(element);
	}

	public void clickOnfooterProductsLink() throws Exception {
		WebElement element = homePageLocators.footerProductsLink;
		scrollToLocateElement(element);
	}

	public void checkStayOnTopOfYourSalahOnProductPage() throws Exception {
		WebElement element = homePageLocators.checkStayOnTopOfYourSalahOnProductPage;
		scrollToLocateElement(element);
	}

	public void clickOnfooterAthanLink() throws Exception {
		WebElement element = homePageLocators.footerAthanLink;
		scrollToLocateElement(element);
	}

	public void clickIslamicFinderLogoToComeBackToHomePageFooter() throws Exception {
		WebElement element = homePageLocators.clickIslamicFinderLogoToComeBackToHomePageFooter;
		scrollToLocateElement(element);
	}

	public void clickOnfooterInspirationsLink() throws Exception {
		WebElement element = homePageLocators.footerInspirationsLink;
		scrollToLocateElement(element);
	}

	public void checkInspirationsForMuslims() throws Exception {
		WebElement element = homePageLocators.checkInspirationsForMuslims;
		scrollToLocateElement(element);
	}

	public void clickOnfooterTasbeehLink() throws Exception {
		WebElement element = homePageLocators.footerTasbeehLink;
		scrollToLocateElement(element);
	}

	public void checkStayOnTopOfYourSalahOnTasbeehPage() throws Exception {
		WebElement element = homePageLocators.checkStayOnTopOfYourSalahOnTasbeehPage;
		scrollToLocateElement(element);
	}

	public void clickOnfooterPrayerWidgetsLink() throws Exception {
		WebElement element = homePageLocators.footerPrayerWidgetsLink;
		scrollToLocateElement(element);
	}

	public void checkAddIslamicFinderServicestoYourSiteOnWidgetsPage() throws Exception {
		WebElement element = homePageLocators.checkAddIslamicFinderServicestoYourSiteOnWidgetsPage;
		scrollToLocateElement(element);
	}

	public void clickOnfooterRamadan2017Link() throws Exception {
		WebElement element = homePageLocators.footerRamadan2017Link;
		scrollToLocateElement(element);
	}

	public void checkRamadanKareemOnRamadan2017Page() throws Exception {
		WebElement element = homePageLocators.checkRamadanKareemOnRamadan2017Page;
		scrollToLocateElement(element);
	}

	public void clickOnfooterHajj2017Link() throws Exception {
		WebElement element = homePageLocators.footerHajj2017Link;
		scrollToLocateElement(element);
	}

	public void checkHajj2017OnHajjPage() throws Exception {
		WebElement element = homePageLocators.checkHajj2017OnHajjPage;
		scrollToLocateElement(element);
	}

	public void clickOnfooterAboutLink() throws Exception {
		WebElement element = homePageLocators.footerAboutLink;
		scrollToLocateElement(element);
	}

	public void checkAboutIslamicFinderPage() throws Exception {
		WebElement element = homePageLocators.checkAboutIslamicFinderPage;
		scrollToLocateElement(element);
	}

	public void clickOnfooterIqraTheBlogLink() throws Exception {
		WebElement element = homePageLocators.footerIqraTheBlogLink;
		scrollToLocateElement(element);
	}

	public void checkIQRAOnIqraTheBlogPage() throws Exception {
		WebElement element = homePageLocators.checkIQRAOnIqraTheBlogPage;
		scrollToLocateElement(element);
	}

	public void clickOnfooterAdvertiseWithUsLink() throws Exception {
		WebElement element = homePageLocators.footerAdvertiseWithUsLink;
		scrollToLocateElement(element);
	}

	public void checkAboutIslamicFinderOnAdvertiseWithUsPage() throws Exception {
		WebElement element = homePageLocators.checkAboutIslamicFinderOnAdvertiseWithUsPage;
		scrollToLocateElement(element);
	}

	public void clickOnfooterTalkToUsLink() throws Exception {
		WebElement element = homePageLocators.footerTalkToUsLink;
		scrollToLocateElement(element);
	}

	public void checkTalkToUsOnTalkUsPage() throws Exception {
		WebElement element = homePageLocators.checkTalkToUsOnTalkUsPage;
		scrollToLocateElement(element);
	}
	
	public void clickViewDetailsLinkOnTopPlacesCard() throws Exception {
		WebElement element = homePageLocators.viewDetailsLinkOnTopPlacesCard;
		scrollToLocateElement(element);
	}
	
	public String checkTestLinkOnTopPlacesCard() throws Exception {
		String element = homePageLocators.testLinkOnTopPlacesCard.getText();
		System.out.println(element);
		return element;
	}
	
	public void openSharePanelOnIslamicGallery() throws Exception {
		WebElement element = homePageLocators.shareButtonOnIslamicGallery;
		scrollToLocateElement(element);
	}
	
	public String checkShareTextOnSharePanel() throws Exception {
		String element = homePageLocators.shareTextOnSharePanel.getText();
		System.out.println(element);
		return element;
	}
	
	
	
	
	
	
	
	
	
	

}
