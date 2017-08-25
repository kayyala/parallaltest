package ReadExcelData;

import org.apache.poi.hssf.record.FontRecord;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

/**
 * Created by Sudhakar on 31/07/2017.
 */
public class ReadExcel1 {
    public static void main(String[]args) throws IOException {
        File src = new File("C:\\Exceldata\\TestData.xlsx");
        FileInputStream fls = new FileInputStream(src);
        XSSFWorkbook wb =new XSSFWorkbook(fls);
       XSSFSheet sheet1=  wb.getSheetAt(0);
      int rowcount= sheet1.getLastRowNum();
        System.out.println("ROWCOUNT"+rowcount);
        for (int i=0;i<rowcount;i++){
            String data0=sheet1.getRow(i).getCell(0 ).getStringCellValue();
            System.out.println("data from Row "+data0);
        }
    }
}
