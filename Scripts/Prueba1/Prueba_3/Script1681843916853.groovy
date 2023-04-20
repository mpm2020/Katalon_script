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

WebUI.navigateToUrl('https://demoqa.com/')

WebUI.maximizeWindow()

WebUI.scrollToPosition(0, 120)

WebUI.click(findTestObject('Prueba1/Page_DEMOQA/svg'))

WebUI.click(findTestObject('Prueba1/Page_DEMOQA/li_Text Box'))

WebUI.setText(findTestObject('Object Repository/Prueba1/Page_DEMOQA/input_Full Name_userName'), 'Mariana Montenegro')

WebUI.setText(findTestObject('Object Repository/Prueba1/Page_DEMOQA/input_Email_userEmail'), 'mariana.montenegro77@gmail.com')

WebUI.setText(findTestObject('Object Repository/Prueba1/Page_DEMOQA/textarea_Current Address_currentAddress'), 'Dire UNO')

WebUI.setText(findTestObject('Object Repository/Prueba1/Page_DEMOQA/textarea_Permanent Address_permanentAddress'), 'Dire Dos')

WebUI.scrollToPosition(0, 120)

WebUI.click(findTestObject('Object Repository/Prueba1/Page_DEMOQA/button_Submit'))

WebUI.verifyElementText(findTestObject('Object Repository/Prueba1/Page_DEMOQA/div_Text Box'), 'Text Box')

WebUI.closeBrowser()

