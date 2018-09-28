package com.java.testCode.excelReading;

import java.io.File;
import java.io.IOException;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReadExcelInMap
{
	public static List<Map<String, String>> listOfMap = new LinkedList<Map<String, String>>();

	public static List<Map<String, String>> readExcel() throws InvalidFormatException, IOException
	{

		String dir = System.getProperty("user.dir");
		String path = dir + "\\src\\com\\test\\excelReading\\";

		File file = new File(path + "TestExcel.xlsx");
		XSSFWorkbook wb = new XSSFWorkbook(file);

		XSSFSheet sh = wb.getSheet("Sheet2");

		int totalRows = sh.getLastRowNum() - sh.getFirstRowNum(); //
		System.out.println(totalRows);

		for (int i = 1; i <= totalRows; i++)
		{
			HashMap<String, String> excelData = new HashMap<String, String>();

			Row r = sh.getRow(i);
			int cellCount = r.getLastCellNum();

			for (int j = 0; j <= cellCount - 1; j++)
			{
				excelData.put(sh.getRow(0).getCell(j).toString(), r.getCell(j).toString());
			}
			listOfMap.add(excelData);
		}

		return listOfMap;
	}

	public static void main(String[] args) throws InvalidFormatException, IOException
	{
		List<Map<String, String>> mapR = readExcel();

		System.out.println(mapR.get(0).get("Business_Unit"));

	}

}
