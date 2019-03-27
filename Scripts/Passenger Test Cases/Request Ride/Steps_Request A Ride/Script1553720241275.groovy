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

//Adding the Global Effect on the Apk's Location

location = System.getenv('USERPROFILE')

String filepathPassengerApp = location + '/git/SafeBoda/SafeBoda Apps/app-passenger.apk'

Mobile.startApplication(filepathPassengerApp, false)

Mobile.tap(findTestObject('Passenger App/Request Ride Screen/input_Location'), 0)

Mobile.tap(findTestObject('Passenger App/Request Ride Screen/input_Location'), 0)

Mobile.sendKeys(findTestObject('Passenger App/Request Ride Screen/input_Location'), destinationLocation)

Mobile.tap(findTestObject('Passenger App/Request Ride Screen/dropdown_Pick upDestination Location'), 0)

Mobile.tap(findTestObject('Passenger App/Request Ride Screen/icon_Search Pick Up'), 0)

Mobile.tap(findTestObject('Passenger App/Request Ride Screen/input_Location'), 0)

Mobile.tap(findTestObject('Passenger App/Request Ride Screen/input_Location'), 0)

Mobile.sendKeys(findTestObject('Passenger App/Request Ride Screen/input_Location'), pickUpLocation)

Mobile.tap(findTestObject('Passenger App/Request Ride Screen/dropdown_Pick upDestination Location'), 0)

Mobile.tap(findTestObject('Passenger App/Request Ride Screen/RadioButton_Cash'), 0)

Mobile.tap(findTestObject('Passenger App/Request Ride Screen/Button_Request'), 0)

Mobile.delay(3, FailureHandling.STOP_ON_FAILURE)

Mobile.tap(findTestObject('Passenger App/Request Ride Screen/Close_Pick up Screen'), 2)

Mobile.closeApplication()

