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

//Generate me a test case for logining to the application and logout
// Open browser and navigate to the login page
WebUI.openBrowser('')
WebUI.navigateToUrl('https://katalon-demo-cura.herokuapp.com/')

// Click on Make Appointment button to go to login page
WebUI.click(findTestObject('Object Repository/CURA Objects/Page_CURA Healthcare Service/a_We Care About Your Health_btn-make-appointment'))

// Set username
WebUI.setText(findTestObject('Object Repository/CURA Objects/Page_CURA Healthcare Service/input_Username_txt-username'), 'John Doe')

// Set password
WebUI.setEncryptedText(findTestObject('Object Repository/CURA Objects/Page_CURA Healthcare Service/input_Password_txt-password'), 'g3/DOGG74jC3Flrr3yH+3D/yKbOqqUNM')

// Click login button
WebUI.click(findTestObject('Object Repository/CURA Objects/Page_CURA Healthcare Service/button_Password_btn-login'))

// Verify login success by checking presence of menu toggle
WebUI.verifyElementPresent(findTestObject('Object Repository/Page_CURA Healthcare Service/a_CURA Healthcare_menu-toggle'), 10)

// Click menu toggle to open sidebar
WebUI.click(findTestObject('Object Repository/Page_CURA Healthcare Service/a_CURA Healthcare_menu-toggle'))

// Click logout link
WebUI.click(findTestObject('Object Repository/Page_CURA Healthcare Service/a_We Care About Your Health_btn-make-appointment'))

// Close browser
WebUI.closeBrowser()

/
*  Automate login and logout process on the CURA Healthcare Service demo site
*
*  1. Open browser and navigate to the CURA Healthcare Service demo URL.
*  2. Click the "Make Appointment" button to navigate to the login page.
*  3. Enter the username "John Doe" into the username input field.
*  4. Enter the encrypted password into the password input field.
*  5. Click the login button to submit credentials.
*  6. Verify successful login by checking the presence of the menu toggle element.
*  7. Click the menu toggle to open the sidebar menu.
*  8. Click the logout link to log out of the application.
*  9. Close the browser to end the session.
* /