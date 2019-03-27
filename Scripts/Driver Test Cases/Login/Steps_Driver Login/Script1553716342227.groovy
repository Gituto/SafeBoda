import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import internal.GlobalVariable as GlobalVariable

//Adding the Global Effect on the Apk location
location = System.getenv('USERPROFILE')

String filePathDriverApp = location + '/git/SafeBoda/SafeBoda Apps/app-driver.apk'

Mobile.startApplication(filePathDriverApp, false)

Mobile.delay(3, FailureHandling.STOP_ON_FAILURE)

Mobile.tap(findTestObject('Driver App/Login Screen/Button_Continue with Google'), 2)

Mobile.delay(5, FailureHandling.STOP_ON_FAILURE)

//The Email Account needs to be added on the Device before running the Scripts
//Its not possible to add the Email Account when running the Scripts because, Adding the email Account then will request the user to input the device PIN
Mobile.tap(findTestObject('Driver App/Login Screen/Link_Email Account'), 2)

Mobile.delay(3, FailureHandling.STOP_ON_FAILURE)

driverTitle = Mobile.getText(findTestObject('Driver App/Login Screen/Title_Drivers Home Screen'), 0)

Mobile.verifyEqual(driverTitle, titleDriversHomeScreen)

