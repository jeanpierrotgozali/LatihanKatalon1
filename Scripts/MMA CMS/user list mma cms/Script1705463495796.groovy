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

WebUI.delay(10)

WebUI.click(findTestObject('Object Repository/Page_Master News  MMA CMS/a_User List'))

WebUI.click(findTestObject('Object Repository/Page_User List  MMA CMS/button_Tambah                              _98daf2'))

WebUI.setText(findTestObject('Object Repository/Page_User List  MMA CMS/input_name'), 'tes katalon')

WebUI.setText(findTestObject('Object Repository/Page_User List  MMA CMS/input_email'), 'teskatalon@mail.com')

WebUI.click(findTestObject('Object Repository/Page_User List  MMA CMS/span_-- Choose Role --'))

WebUI.delay(5)

WebUI.setText(findTestObject('Page_User List  MMA CMS/Page_User List  MMA CMS/input_Save_select2-search__field'), 'test katalon')

WebUI.click(findTestObject('Page_User List  MMA CMS/Page_User List  MMA CMS/li_test katalon'))

WebUI.setEncryptedText(findTestObject('Object Repository/Page_User List  MMA CMS/input_password'), 'bYWZAF/DppUKN6LjEF/V9A==')

WebUI.click(findTestObject('Object Repository/Page_User List  MMA CMS/button_Save'))

WebUI.delay(10)

WebUI.click(findTestObject('Object Repository/Page_User List  MMA CMS/button_Log out'))

WebUI.closeBrowser()

