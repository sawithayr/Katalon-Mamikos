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

WebUI.waitForElementPresent(findTestObject('hargaMin'), 3)

WebUI.click(findTestObject('hargaMin'))

WebUI.setText(findTestObject('hargaMin'), '15000000')

WebUI.waitForElementPresent(findTestObject('hargaMax'), 3)

WebUI.click(findTestObject('hargaMax'))

not_run: WebUI.sendKeys(findTestObject('hargaMax'), Keys.chord(Keys.CONTROL, 'a'))

not_run: WebUI.sendKeys(findTestObject('hargaMax'), Keys.chord(Keys.BACK_SPACE))

WebUI.delay(3)

WebUI.click(findTestObject('buttonSet'))

WebUI.delay(3)

WebUI.verifyTextPresent('Ditemukan 0 kos-kosan di area sekitar saat ini', false)

WebUI.closeBrowser()

def ClearTextField(TestObject to) {
    WebUI.sendKeys(to, Keys.chord(Keys.CONTROL, 'a'))

    WebUI.sendKeys(to, Keys.chord(Keys.DELETE))

    WebUI.setText(findTestObject('hargaMax'), '15000000')
}

