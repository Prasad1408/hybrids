package pageobjectmodel;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.sl.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

import com.google.common.collect.Table.Cell;

public class Flib {
	public String readExcelData(String excelPath,String sheetName,int rowCount,int cellCount) throws EncryptedDocumentException, IOException
	{
		FileInputStream fis = new FileInputStream(excelPath);
		Workbook wb = WorkbookFactory.create(fis);
		Sheet sh = (Sheet) wb.getSheet(sheetName);
		Row row = getRow(rowCount);
		Cell cell = (Cell) row.getCell(cellCount);
		String data = getStringCellValue();
		return data;

	}


	private String getStringCellValue() {
		// TODO Auto-generated method stub
		return null;
	}


	private Row getRow(int rowCount) {
		// TODO Auto-generated method stub
		return null;
	}


	//get the rowcount

	public int getRowCount(String excelPath,String sheetName) throws EncryptedDocumentException, IOException
	{
		FileInputStream fis = new FileInputStream(excelPath);
		Workbook wb = WorkbookFactory.create(fis);
		Sheet sh = (Sheet) wb.getSheet(sheetName);
		int rc = ((org.apache.poi.ss.usermodel.Sheet) sh).getLastRowNum();
		return rc;
	}

	//write the data in excel file

	public void writeExcelData(String excelPath,String sheetName,int rowCount,int cellCount,String data) throws EncryptedDocumentException, IOException
	{
		FileInputStream fis = new FileInputStream(excelPath);
		Workbook wb = WorkbookFactory.create(fis);
		Sheet sh = (Sheet) wb.getSheet(sheetName);
		Row row = ((Flib) sh).getRow(rowCount);
		Cell cell = (Cell) row.createCell(cellCount);

		((org.apache.poi.ss.usermodel.Cell) cell).setCellValue(data);

		FileOutputStream fos = new FileOutputStream(excelPath);
		wb.write(fos);

	}







	//generic reusable method to read the property file

	public String readPropertyFile(String propPath,String key) throws IOException
	{
		FileInputStream fis = new FileInputStream(propPath);
		Properties prop = new Properties();
		prop.load(fis);
		String value = prop.getProperty(key);
		return value;

	}







}
