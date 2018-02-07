import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.checkpoint.CheckpointFactory as CheckpointFactory
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as MobileBuiltInKeywords
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testcase.TestCaseFactory as TestCaseFactory
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testdata.TestDataFactory as TestDataFactory
import com.kms.katalon.core.testobject.ObjectRepository as ObjectRepository
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WSBuiltInKeywords
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUiBuiltInKeywords
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import internal.GlobalVariable as GlobalVariable
import org.openqa.selenium.Keys as Keys

WebUI.openBrowser('')

WebUI.openBrowser('')

WebUI.navigateToUrl('http://executeautomation.com/demosite/Login.html')

WebUI.setText(findTestObject('EAOR/Page_Execute Automation/input_UserName'), 'admin')

WebUI.setText(findTestObject('EAOR/Page_Execute Automation/input_Password'), 'admin')

WebUI.click(findTestObject('EAOR/Page_Execute Automation/input_Login'))

WebUI.selectOptionByValue(findTestObject('EAOR/Page_Execute Automation/select_SelectMr.Ms.'), '1', true)

WebUI.setText(findTestObject('EAOR/Page_Execute Automation/input_Initial'), 'KK')

WebUI.setText(findTestObject('EAOR/Page_Execute Automation/input_FirstName'), 'Karthik')

WebUI.click(findTestObject('EAOR/Page_Execute Automation/input_Hindi'))

WebUI.doubleClick(findTestObject('EAOR/Page_Execute Automation/input_Save'))

WebUI.click(findTestObject('EAOR/Page_Execute Automation/a_HtmlPopup'))

WebUI.click(findTestObject('EAOR/Page_Execute Automation/span_User Form'))

WebUI.click(findTestObject('EAOR/Page_Execute Automation/span_Drag and Drop'))

WebUI.click(findTestObject('EAOR/Page_/li_Drag Item 1'))

WebUI.closeBrowser()

WebUI.closeBrowser()

