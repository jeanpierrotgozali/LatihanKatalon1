import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testng.keyword.TestNGBuiltinKeywords as TestNGKW
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import internal.GlobalVariable as GlobalVariable
import org.openqa.selenium.Keys as Keys

WebUI.openBrowser('')

WebUI.navigateToUrl('http://34.128.87.8:8082/login')

WebUI.setText(findTestObject('Object Repository/add calender event mma cms/Page_Login  MMA CMS/input_email'), 'receptionist@kaf.co.id')

WebUI.setEncryptedText(findTestObject('Object Repository/add calender event mma cms/Page_Login  MMA CMS/input_password'), 
    'ZKA0+lUKvIqsSH1GemtPdg==')

WebUI.click(findTestObject('Object Repository/add calender event mma cms/Page_Login  MMA CMS/button_Login'))

WebUI.click(findTestObject('Object Repository/add calender event mma cms/Page_Report  MMA CMS/a_Calendar Event'))

WebUI.click(findTestObject('Object Repository/add calender event mma cms/Page_Calendar Event  MMA CMS/button_Tambah                            Event'))

WebUI.setText(findTestObject('Object Repository/add calender event mma cms/Page_Calendar Event  MMA CMS/input_title'), 'tes katalon')

WebUI.click(findTestObject('add calender event mma cms/Page_Calendar Event  MMA CMS/input_Start Date_start'))

WebUI.setText(findTestObject('add calender event mma cms/Page_Calendar Event  MMA CMS/input_Start Date_start'), '25012024')

WebUI.sendKeys(findTestObject('add calender event mma cms/Page_Calendar Event  MMA CMS/input_Start Date_start'), Keys.chord(
        Keys.TAB))

WebUI.setText(findTestObject('add calender event mma cms/Page_Calendar Event  MMA CMS/input_End Date_end'), '0300')

WebUI.setText(findTestObject('add calender event mma cms/Page_Calendar Event  MMA CMS/input_End Date_end'), '31012024')

WebUI.sendKeys(findTestObject('add calender event mma cms/Page_Calendar Event  MMA CMS/input_End Date_end'), Keys.chord(
        Keys.TAB))

WebUI.setText(findTestObject('add calender event mma cms/Page_Calendar Event  MMA CMS/input_End Date_end'), '1300')

WebUI.click(findTestObject('Object Repository/add calender event mma cms/Page_Calendar Event  MMA CMS/div_Description'))

WebUI.setText(findTestObject('Object Repository/add calender event mma cms/Page_Calendar Event  MMA CMS/textarea_description'), 
    'tes katalon')

WebUI.setText(findTestObject('Object Repository/add calender event mma cms/Page_Calendar Event  MMA CMS/textarea_location'), 
    'tes katalon')

WebUI.click(findTestObject('Object Repository/add calender event mma cms/Page_Calendar Event  MMA CMS/ul_select2-selection__rendered'))

WebUI.click(findTestObject('Object Repository/add calender event mma cms/Page_Calendar Event  MMA CMS/ul_select2-selection__rendered_1'))

WebUI.click(findTestObject('Object Repository/add calender event mma cms/Page_Calendar Event  MMA CMS/button_Save'))

WebUI.click(findTestObject('Object Repository/add calender event mma cms/Page_Calendar Event  MMA CMS/button_Log out'))

WebUI.closeBrowser()

