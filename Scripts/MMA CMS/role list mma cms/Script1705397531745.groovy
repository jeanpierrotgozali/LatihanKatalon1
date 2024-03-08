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

WebUI.click(findTestObject('Object Repository/Page_Role List  MMA CMS/Page_Master News  MMA CMS/span_Role List'))

WebUI.click(findTestObject('Object Repository/Page_Role List  MMA CMS/Page_Role List  MMA CMS/button_Tambah                              _2f1eed'))

WebUI.setText(findTestObject('Object Repository/Page_Role List  MMA CMS/Page_Role List  MMA CMS/input_name'), 'test katalon')

WebUI.click(findTestObject('Object Repository/Page_Role List  MMA CMS/Page_Role List  MMA CMS/button_Save'))

WebUI.delay(5)

WebUI.scrollToElement(findTestObject('Page_Role List  MMA CMS/Page_Role List  MMA CMS/td_test katalon'), 0)

WebUI.click(findTestObject('Page_Role List  MMA CMS/Page_Role List  MMA CMS/a_Admin KAF_btnPrivileges'))

WebUI.click(findTestObject('Page_Role List  MMA CMS/Page_Privilege List  tes katalon  MMA CMS/label 1'))

WebUI.click(findTestObject('Page_Role List  MMA CMS/Page_Privilege List  tes katalon  MMA CMS/label 2'))

WebUI.click(findTestObject('Page_Role List  MMA CMS/Page_Privilege List  tes katalon  MMA CMS/label 3'))

WebUI.click(findTestObject('Page_Role List  MMA CMS/Page_Privilege List  tes katalon  MMA CMS/label 4'))

WebUI.click(findTestObject('Object Repository/Page_Role List  MMA CMS/Page_Privilege List  test katalon  MMA CMS/button_Save'))

