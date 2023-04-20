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

WebUI.navigateToUrl('https://blazedemo.com/')

WebUI.selectOptionByValue(findTestObject('Object Repository/Page_BlazeDemo/select_Paris            Philadelphia       _54ada8'), 
    'Philadelphia', true)

WebUI.selectOptionByValue(findTestObject('Object Repository/Page_BlazeDemo/select_Buenos Aires            Rome        _b23956'), 
    'London', true)

WebUI.click(findTestObject('Object Repository/Page_BlazeDemo/input_Choose your destination city_btn btn-primary'))

WebUI.click(findTestObject('Object Repository/Page_BlazeDemo - reserve/input_Price_btn btn-small'))

WebUI.setText(findTestObject('Object Repository/Page_BlazeDemo Purchase/input_Name_inputName'), 'Test')

WebUI.setText(findTestObject('Object Repository/Page_BlazeDemo Purchase/input_Address_address'), 'Dire uno')

WebUI.setText(findTestObject('Object Repository/Page_BlazeDemo Purchase/input_City_city'), 'Ciudad')

WebUI.setText(findTestObject('Object Repository/Page_BlazeDemo Purchase/input_State_state'), 'Ciudad')

WebUI.setText(findTestObject('Object Repository/Page_BlazeDemo Purchase/input_Zip Code_zipCode'), '12345')

WebUI.selectOptionByValue(findTestObject('Object Repository/Page_BlazeDemo Purchase/select_Visa                American Express_d3f7e8'), 
    'amex', true)

WebUI.setText(findTestObject('Object Repository/Page_BlazeDemo Purchase/input_Credit Card Number_creditCardNumber'), '1234567')

WebUI.setText(findTestObject('Object Repository/Page_BlazeDemo Purchase/input_Month_creditCardMonth'), '04')

WebUI.setText(findTestObject('Object Repository/Page_BlazeDemo Purchase/input_Year_creditCardYear'), '2023')

WebUI.setText(findTestObject('Object Repository/Page_BlazeDemo Purchase/input_Name on Card_nameOnCard'), 'Juan Lopez')

WebUI.click(findTestObject('Page_BlazeDemo Purchase/btn_Submit'))

WebUI.verifyElementText(findTestObject('Object Repository/Page_BlazeDemo Confirmation/h1_Thank you for your purchase today'), 
    'Thank you for your purchase today!')

