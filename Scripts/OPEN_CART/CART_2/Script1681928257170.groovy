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

WebUI.navigateToUrl('https://opencart.abstracta.us/')

WebUI.maximizeWindow()

WebUI.click(findTestObject('Object Repository/OPEN_CART/Page_Your Store/a_Contact Us'))

WebUI.setText(findTestObject('Object Repository/OPEN_CART/Page_Your Store/input_Your Name_name'), 'Mariana')

WebUI.setText(findTestObject('Object Repository/OPEN_CART/Page_Your Store/input_E-Mail Address_email'), 'mariana.montenegro77@gmail.com')

WebUI.setText(findTestObject('Object Repository/OPEN_CART/Page_Your Store/textarea_Enquiry_enquiry'), 'This a test')

WebUI.click(findTestObject('Object Repository/OPEN_CART/Page_Your Store/input_Enquiry_btn btn-primary'))

WebUI.scrollToPosition(0, 120)

WebUI.click(findTestObject('Object Repository/OPEN_CART/Page_Your Store/a_Continue'))

WebUI.closeBrowser()

