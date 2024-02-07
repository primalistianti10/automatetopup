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

WebUI.navigateToUrl('https://rs-dev.promosindo.web.id/')

WebUI.setText(findTestObject('Object Repository/Page_Resellerindo - Masuk SMM Panel Resellerindo/input_face_username_a'), 
    'primalisti')

WebUI.setEncryptedText(findTestObject('Object Repository/Page_Resellerindo - Masuk SMM Panel Resellerindo/input_lock_outline_password_a'), 
    'ZxFguJnQseeHukWJJhGuHA==')

WebUI.click(findTestObject('Object Repository/Page_Resellerindo - Masuk SMM Panel Resellerindo/div_Masuk'))

WebUI.click(findTestObject('Object Repository/Page_Dasbor  Resellerindo/button_Close'))

WebUI.click(findTestObject('Object Repository/Page_Dasbor  Resellerindo/span_'))

WebUI.click(findTestObject('Object Repository/Page_Dasbor  Resellerindo/i_Simpan_fas fa-times'))

WebUI.click(findTestObject('Object Repository/Page_Dasbor  Resellerindo/p_Tambah Saldo'))

WebUI.setText(findTestObject('Object Repository/Page_Pembayaran  Resellerindo/input_Rp_nominal'), '15000')

WebUI.click(findTestObject('Object Repository/Page_Pembayaran  Resellerindo/button_Pesan'))

WebUI.click(findTestObject('Object Repository/Page_Pembayaran  Resellerindo/i_keyboard_arrow_down'))

WebUI.click(findTestObject('Object Repository/Page_Pembayaran  Resellerindo/i_keyboard_arrow_right'))

WebUI.click(findTestObject('Object Repository/Page_Pembayaran  Resellerindo/button_Lanjutkan Step Selanjutnya'))

//WebUI.closeBrowser()

