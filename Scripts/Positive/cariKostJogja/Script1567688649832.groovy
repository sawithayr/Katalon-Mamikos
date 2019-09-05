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

WebUI.openBrowser('https://mamikos.com/cari/')

WebUI.maximizeWindow()

WebUI.waitForPageLoad(30)

WebUI.verifyElementClickable(findTestObject('fieldCari'))

WebUI.click(findTestObject('fieldCari'))

WebUI.delay(3)

WebUI.waitForElementPresent(findTestObject('cariLokasi'), 3)

WebUI.click(findTestObject('cariLokasi'))

WebUI.setText(findTestObject('cariLokasi'), 'jalan kaliurang')

WebUI.delay(5)

WebUI.waitForElementPresent(findTestObject('lokasiJakal'), 5)

WebUI.click(findTestObject('lokasiJakal'))

WebUI.waitForElementPresent(findTestObject('hargaMin'), 3)

WebUI.click(findTestObject('hargaMin'))

WebUI.setText(findTestObject('hargaMin'), '1000000')

WebUI.waitForElementPresent(findTestObject('hargaMax'), 3)

WebUI.click(findTestObject('hargaMax'))

not_run: WebUI.setText(findTestObject('hargaMax'), '2000000')

WebUI.delay(3)

WebUI.click(findTestObject('buttonSet'))

WebUI.verifyTextPresent('kos-kosan di sekitar Jalan Kaliurang, Caturtunggal, Kabupaten Sleman, Daerah Istimewa Yogyakarta, Indonesia', 
    false)

