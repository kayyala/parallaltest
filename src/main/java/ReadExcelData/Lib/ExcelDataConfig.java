package ReadExcelData.Lib;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.File;
import java.io.FileInputStream;

/**
 * Created by Sudhakar on 31/07/2017.
 */
public class ExcelDataConfig {

    XSSFWorkbook wb;
    XSSFSheet sheet1;

    public ExcelDataConfig(String excelpath) {

        try {
            File src = new File("C:\\Exceldata\\TestData.xlsx");
            FileInputStream fls = new FileInputStream(src);
            wb = new XSSFWorkbook(fls);

        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

    }
    public String getData(int sheetnumber,int row,int column) {
        sheet1 = wb.getSheetAt(sheetnumber);
    String data =sheet1.getRow(row).getCell(column).getStringCellValue();
        return data;
    }
}
