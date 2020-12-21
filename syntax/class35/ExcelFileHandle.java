package class35;


import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.FileInputStream;
import java.io.IOException;

public class ExcelFileHandle {
    public static void main(String[] args) throws IOException {
        String path ="C:\\Users\\stars\\eclipse-workspace\\MyFirstJava\\src\\com\\syntax\\Book1.xlsx";
        System.out.println(path);
        FileInputStream fis =new FileInputStream(path);
        XSSFWorkbook workbook=new XSSFWorkbook(fis);
        Sheet sheet =workbook.getSheet("Sheet1");
        Row row=sheet.getRow(0);
        Cell cell=row.getCell(0);
        System.out.println(path);
        System.out.println(cell.toString());

    }
}
