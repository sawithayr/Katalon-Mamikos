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


RunConfiguration.setExecutionSettingFile('C:\\Users\\NOTEBO~1\\AppData\\Local\\Temp\\Katalon\\Test Cases\\Positive\\cariKostJogjaProperty\\20190905_212516\\execution.properties')

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

not_run: WebUI.verifyElementClickable(findTestObject('fieldCari'))

not_run: WebUI.click(findTestObject('fieldCari'))

not_run: WebUI.delay(3)

not_run: WebUI.waitForElementPresent(findTestObject('cariLokasi'), 3)

not_run: WebUI.click(findTestObject('cariLokasi'))

not_run: WebUI.setText(findTestObject('cariLokasi'), 'jalan kaliurang')

not_run: WebUI.delay(5)

not_run: WebUI.waitForElementPresent(findTestObject('lokasiJakal'), 5)

not_run: WebUI.click(findTestObject('lokasiJakal'))

not_run: WebUI.waitForElementPresent(findTestObject('hargaMin'), 3)

not_run: WebUI.click(findTestObject('hargaMin'))

not_run: WebUI.setText(findTestObject('hargaMin'), '1000000')

not_run: WebUI.waitForElementPresent(findTestObject('hargaMax'), 3)

not_run: WebUI.click(findTestObject('hargaMax'))

not_run: WebUI.setText(findTestObject('hargaMax'), '2000000')

not_run: WebUI.delay(3)

not_run: WebUI.click(findTestObject('buttonSet'))

not_run: WebUI.verifyTextPresent('kos-kosan di sekitar Jalan Kaliurang, Caturtunggal, Kabupaten Sleman, Daerah Istimewa Yogyakarta, Indonesia', 
    false)

not_run: WebUI.delay(3)

not_run: WebUI.waitForElementClickable(findTestObject('buttonBisaBooking'), 3)

not_run: WebUI.click(findTestObject('buttonBisaBooking'))

not_run: WebUI.delay(5)

not_run: WebUI.verifyTextPresent('Ditemukan 43 kos-kosan di sekitar Jalan Kaliurang', false)

not_run: WebUI.click(findTestObject('filterLanjutan'))

WebUI.waitForElementPresent(findTestObject('bookingKamar1'), 3)

WebUI.click(findTestObject('bookingKamar1'))

WebUI.waitForPageLoad(30)

WebUI.waitForElementPresent(findTestObject('booking'), 3)

WebUI.click(findTestObject('booking'))

WebUI.acceptAlert()

''', 'Test Cases/Positive/cariKostJogjaProperty', new TestCaseBinding('Test Cases/Positive/cariKostJogjaProperty',[:]), FailureHandling.STOP_ON_FAILURE , false)
    
