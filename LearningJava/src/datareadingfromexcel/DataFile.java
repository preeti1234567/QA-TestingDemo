package datareadingfromexcel;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;

import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFFormulaEvaluator;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class DataFile {

	public static String readFile(int rowNo, int cellNo) {
		XSSFCell cell;
		String data = null;
		try {

			// 1 Step: Creating a file
			File file = new File("D:\\Preeti\\Libraries\\RedmineRegistrationData.xlsx");

			// 2 Step: reading file
			FileInputStream fis = new FileInputStream(file);

			// 3 Steps: to get control on excel file
			XSSFWorkbook excel = new XSSFWorkbook(fis);
			// for new calculated excel details
			excel.setForceFormulaRecalculation(true);
			XSSFFormulaEvaluator.evaluateAllFormulaCells(excel);
			// 4 Step: to get control on the sheet of the excel
			XSSFSheet sheet = excel.getSheet("Sheet1");
			// 5 Step: to get control on the cell
			cell = sheet.getRow(rowNo).getCell(cellNo);
			// 6 Step: to get the value from the cell
			data = cell.getStringCellValue();
			fis.close();
			excel.close();
		} catch (Exception e) {
			// TODO: handle exception
		}
		return data;
	}

	public static void writeFile(int rowNo, int cellNo, String Input) {
		XSSFCell cell;

		try {
			File file = new File("D:\\Preeti\\Libraries\\RedmineRegistrationData.xlsx");
			FileInputStream fis = new FileInputStream(file);
			XSSFWorkbook excel = new XSSFWorkbook(fis);
			excel.setForceFormulaRecalculation(true);
			XSSFFormulaEvaluator.evaluateAllFormulaCells(excel);
			XSSFSheet sheet = excel.getSheet("Sheet1");
			cell = sheet.getRow(rowNo).createCell(cellNo);
			cell.setCellValue(Input);
			FileOutputStream fos = new FileOutputStream(file);
			excel.write(fos);
			fos.flush();
			fos.close();
			excel.close();

		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
