package ReadExcelData;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

/**
 * Created by Sudhakar on 31/07/2017.
 */
public class ReadExcel {
    public static void main(String[]args) throws IOException {
        File src = new File("C:\\Exceldata\\TestData.xlsx");
        FileInputStream fls = new FileInputStream(src);
        XSSFWorkbook wb =new XSSFWorkbook(fls);
       XSSFSheet sheet1=  wb.getSheetAt(0);
        String data0 = sheet1.getRow(1).getCell(1).getStringCellValue();
        System.out.println(""+data0);
    }
}
