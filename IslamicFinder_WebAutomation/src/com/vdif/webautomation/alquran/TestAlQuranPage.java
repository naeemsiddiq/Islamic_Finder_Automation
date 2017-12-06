/**
 * 
 */
package com.vdif.webautomation.alquran;

import java.util.concurrent.TimeUnit;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import sendReport.SendReports;
import com.vdif.webautomation.AbstractComponent;
import com.vdif.webautomation.hajj.HajjPageComponent;
import com.vdif.webautomation.homepage.HomePageComponent;

/**
 * @author {Naeem Siddiq}
 *
 *         {Associate Software Engineer}
 */

public class TestAlQuranPage extends AbstractComponent {

	AlQuranPageComponent alQuranPageComponent;
	HajjPageComponent hajjPageComponent;
	HomePageComponent homePageComponent;

	@BeforeClass
	public void setUp() throws Exception {
		callSetUp();
		System.out.println("<<-----------------------Testing Al Quran Page Islamic Finder----------------------->>\n");
	}

	@Test
	public void testSurahListsOnAlQuranPage() throws Exception {
		System.out.println("<------Testing Surah Lists On Al-Quran Page------->\n");
		incrementAndOpenURLpage();

		implicicitwait2sec();

		homePageComponent=new HomePageComponent();
		alQuranPageComponent = new AlQuranPageComponent();
		hajjPageComponent = new HajjPageComponent();
		
		homePageComponent.searchTopNavBar();
		alQuranPageComponent.clickAlQuranLink();
		hajjPageComponent.checkAlQuranWithTranslationTextOnAlQuranPage();
		alQuranPageComponent.checkSurahListAlQuranPage();
	}

	@Test
	public void testJuzListsOnAlQuranPage() throws Exception {
		System.out.println("<------Testing Juz Lists On Al-Quran Page------->\n");
		incrementAndOpenURLpage();
		implicicitwait2sec();

		homePageComponent=new HomePageComponent();
		alQuranPageComponent = new AlQuranPageComponent();
		homePageComponent.searchTopNavBar();
		alQuranPageComponent.clickAlQuranLink();
		alQuranPageComponent.clickJuzTab();
		alQuranPageComponent.checkJuzListAlQuranPage();
	}

	@Test
	public void testTranslationsListsOnAlQuranPage() throws Exception {
		System.out.println("<------Testing Translations Lists On Al-Quran Page------->\n");
		incrementAndOpenURLpage();
		Thread.sleep(1000);

		homePageComponent=new HomePageComponent();
		alQuranPageComponent = new AlQuranPageComponent();
		homePageComponent.searchTopNavBar();
		alQuranPageComponent.clickAlQuranLink();
		alQuranPageComponent.clickTranslationsTab();
		alQuranPageComponent.checkTranslationsListAlQuranPage();
	}

	@Test
	public void testTopicsListsOnAlQuranPage() throws Exception {
		System.out.println("<------Testing Topics Lists On Al-Quran Page------->\n");
		incrementAndOpenURLpage();
		implicicitwait2sec();

		homePageComponent=new HomePageComponent();
		alQuranPageComponent = new AlQuranPageComponent();
		homePageComponent.searchTopNavBar();
		alQuranPageComponent.clickAlQuranLink();
		alQuranPageComponent.clickTopicsTab();
		alQuranPageComponent.checkTopicsListAlQuranPage();
	}

	@AfterClass
	public static void tearDown() throws Exception {
		callTearDown();
	}
}
