package ReadExcelData;

import ReadExcelData.Lib.ExcelDataConfig;
import org.testng.annotations.Test;

/**
 * Created by Sudhakar on 31/07/2017.
 */
public class ReadExcelData {
    @Test
    public void readingdata() {
        ExcelDataConfig excel = new ExcelDataConfig("C:\\Exceldata\\TestData.xlsx");
        System.out.println(excel.getData(0,2,0));
        System.out.println(excel.getData(0,2,1));
    }
}