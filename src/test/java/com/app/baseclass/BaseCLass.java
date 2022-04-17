package com.app.baseclass;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.DateUtil;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;

import io.cucumber.java.sl.Ce;

public class BaseCLass {

	public static WebDriver driver;
	public static ExtentHtmlReporter reporter;
	public static ExtentReports extent;

	@BeforeClass
	public static void browserlaunch() {

		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\HP\\eclipse-workspace\\new\\new\\Maven_Sample\\Driver\\chromedriver.exe");
		driver = new ChromeDriver();
		reporter = new ExtentHtmlReporter("./Reports/sample_automation.html");
		extent = new ExtentReports();
		extent.attachReporter(reporter);
		System.out.println("Before class");

	}

	public static void url(String url) {
		driver.get(url);
		driver.manage().window().maximize();
	}

	// 1.scenario for FindElement
	public static WebElement findElementById(String id) {
		return driver.findElement(By.id(id));
	}

	public static WebElement findElementByXpath(String xpath) {
		return driver.findElement(By.xpath(xpath));
	}

	// 2. scenario for FindElement
	// create a method using abtract class as argument
	public static WebElement findElementByAB(By ab) {
		return driver.findElement(ab);

	}

	public static void typeData(WebElement element, String data) {
		element.sendKeys(data);
	}

	public static void press(WebElement element) {
		element.click();
	}

	public static void dropDownindex(WebElement element, int values) {
		Select s = new Select(element);
		s.selectByIndex(values);
	}

	public static void dropDownvalue(WebElement element, String values) {
		Select s = new Select(element);
		s.selectByValue(values);
	}

	public static void movetoElement(WebElement element) {
		Actions a = new Actions(driver);
		a.moveToElement(element).perform();
	}

	public static String getAttribute(WebElement element, String... attribute) {
		String text = attribute.length < 1 ? "value" : attribute[0];
		String attributevalue = null;
		try {
			attributevalue = text;
		} catch (NullPointerException e) {
			throw new RuntimeException("Warning : Failure detected when requesting the element property:value");
		}
		return attributevalue;
	}

	@AfterClass
	public static void screenShot() {

		try {
			File src = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
			FileUtils.copyFile(src,
					new File("location" + new SimpleDateFormat("yyyy-MM-dd-HH-mm-ss").format(new Date()) + ".jpeg"));
		} catch (IOException e) {
			e.printStackTrace();
		}

	}

	public static void impwait() {
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	}

	public static void expwait(WebElement element) {
		WebDriverWait exp = new WebDriverWait(driver, 10);
		exp.until(ExpectedConditions.elementToBeClickable(element));

	}

	public static String readExcel(int row1, int cell1) {
		String value = null ;
		try {
			File f = new File("");
			FileInputStream fis = new FileInputStream(f);
			Workbook wb = new XSSFWorkbook(fis);
			Sheet sheet = wb.getSheet("Sheet1");
			Row row = sheet.getRow(row1);
			 Cell cell = row.getCell(cell1);
			 int cellType = cell.getCellType();
			 if(cellType==1) {
				 value = cell.getStringCellValue();
				 System.out.println(value);
			 }if(cellType==0) {
				 // date or number
				 // date value import org.apache.poi.ss.usermodel.DateUtil;
				 if(DateUtil.isCellDateFormatted(cell)) {
					 Date dateCellValue = cell.getDateCellValue();
					 // current date 
					 //Date d = new Date(); 11 02 2022
					 SimpleDateFormat format = new SimpleDateFormat("dd-MM-yyyy");
					  value = format.format(dateCellValue);	 
				 }else {
					 double numericCellValue = cell.getNumericCellValue();
					 long l = (long)numericCellValue;
					 value = String.valueOf(l);
				 }
			 }
			 
		} catch (IOException e) {
		}
		return value;

	}

	@Before
	public void exetime() {
		Date date = new Date();
		System.out.println(date);
	}

	@After
	public void afterreport() {
		extent.flush();
	}
}
