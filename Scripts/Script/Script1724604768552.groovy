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

'Open Browser'
WebUI.openBrowser('')

'Navigate to URL'
WebUI.navigateToUrl('https://katalon-demo-cura.herokuapp.com/')

'Click Appointment'
WebUI.click(findTestObject('Object Repository/Auto/Page_CURA Healthcare Service/a_Make Appointment'))

'Enter Username'
WebUI.setText(findTestObject('Object Repository/Auto/Page_CURA Healthcare Service/input_Username_username'), 'John Doe')

'Enter Password'
WebUI.setEncryptedText(findTestObject('Object Repository/Auto/Page_CURA Healthcare Service/input_Password_password'), 'g3/DOGG74jC3Flrr3yH+3D/yKbOqqUNM')

'Click Login'
WebUI.click(findTestObject('Object Repository/Auto/Page_CURA Healthcare Service/button_Login'))

'Verify '
WebUI.click(findTestObject('Object Repository/Auto/Page_CURA Healthcare Service/h2_Make Appointment'))

'Close Browser'
WebUI.closeBrowser()
