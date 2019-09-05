import com.kms.katalon.core.main.TestCaseMain
import com.kms.katalon.core.logging.KeywordLogger
import com.kms.katalon.core.testcase.TestCaseBinding
import com.kms.katalon.core.driver.internal.DriverCleanerCollector
import com.kms.katalon.core.model.FailureHandling
import com.kms.katalon.core.configuration.RunConfiguration
import com.kms.katalon.core.webui.contribution.WebUiDriverCleaner
import com.kms.katalon.core.mobile.contribution.MobileDriverCleaner
import com.kms.katalon.core.cucumber.keyword.internal.CucumberDriverCleaner


DriverCleanerCollector.getInstance().addDriverCleaner(new com.kms.katalon.core.webui.contribution.WebUiDriverCleaner())
DriverCleanerCollector.getInstance().addDriverCleaner(new com.kms.katalon.core.mobile.contribution.MobileDriverCleaner())
DriverCleanerCollector.getInstance().addDriverCleaner(new com.kms.katalon.core.cucumber.keyword.internal.CucumberDriverCleaner())


RunConfiguration.setExecutionSettingFile('C:\\Users\\NOTEBO~1\\AppData\\Local\\Temp\\Katalon\\Test Cases\\Negative\\keySearchFailed\\20190905_233546\\execution.properties')

TestCaseMain.beforeStart()

        TestCaseMain.runTestCaseRawScript(
'''import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
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

not_run: WebUI.openBrowser('https://mamikos.com/cari/')

not_run: WebUI.maximizeWindow()

not_run: WebUI.waitForPageLoad(30)

WebUI.waitForElementPresent(findTestObject('hargaMin'), 3)

WebUI.click(findTestObject('hargaMin'))

WebUI.setText(findTestObject('hargaMin'), '15000000')

WebUI.waitForElementPresent(findTestObject('hargaMax'), 3)

WebUI.click(findTestObject('hargaMax'))

not_run: WebUI.sendKeys(findTestObject('hargaMax'), Keys.chord(Keys.CONTROL, 'a'))

WebUI.sendKeys(findTestObject('hargaMax'), Keys.chord(Keys.BACK_SPACE))

WebUI.setText(findTestObject('hargaMax'), '2000000')

WebUI.delay(3)

WebUI.click(findTestObject('buttonSet'))

''', 'Test Cases/Negative/keySearchFailed', new TestCaseBinding('Test Cases/Negative/keySearchFailed',[:]), FailureHandling.STOP_ON_FAILURE , false)
    
