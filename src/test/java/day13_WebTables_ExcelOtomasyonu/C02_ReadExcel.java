package day13_WebTables_ExcelOtomasyonu;

import org.apache.poi.ss.usermodel.*;
import org.junit.jupiter.api.Test;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class C02_ReadExcel {

    @Test
    public void test01() throws IOException {

        // selenium bilgisayarımız da olan excel e ulasamaz  ulasmak için java yı kullanacagız
        String dosyaYolu ="src/test/java/day13_WebTables_ExcelOtomasyonu/ulkeler.xlsx" ;
        FileInputStream fileInputStream =new FileInputStream(dosyaYolu);

        // bir excel workboork da farklı sayfalar her sayfa da satırlar (row)
        // ve her satır da cell (hücre) ler var yukledigimiz apaci poi sayesinde excel de kı yapının
        // aynısını excel de olusturabiliriz
        Workbook workbook = WorkbookFactory.create(fileInputStream);

        Sheet sayfa =workbook.getSheet("Sayfa1");

        Row row = sayfa.getRow(1);
        Cell cell = row .getCell (1);
        System.out.println("2.satirdaki 2 .cell :" + cell);


    }
}