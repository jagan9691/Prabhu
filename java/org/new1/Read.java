package org.new1;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Read {
	public void add() {
		System.out.println("add");
	}

	public static void main(String[] args) throws IOException {
		File f = new File("F:\\eclipse\\Excel\\Data\\Day1.xlsx");

		FileInputStream s = new FileInputStream(f);
		Workbook w = new XSSFWorkbook(s);
		Sheet sh = w.getSheet("Sheet1");
		int rows = sh.getPhysicalNumberOfRows();
		// Row r = sh.getRow(5);
		// int cells = r.getPhysicalNumberOfCells();
		for (int i = 0; i < sh.getPhysicalNumberOfRows(); i++) {

			Row rh = sh.getRow(i);
			for (int j = 0; j < rh.getPhysicalNumberOfCells(); j++) {
				Cell ce = rh.getCell(j);
				System.out.println(ce);

				System.out.println("one");
				System.out.println("two");
				System.out.println("three");
			}

		}

	}

	private void newMeth() {
		System.out.println("new");
	}

}
