package day11_fileTestleri_Waits;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.nio.file.Files;
import java.nio.file.Paths;

public class C01_FileExistTesti {

    @Test

    public void test01(){

        // day11 package'i icinde funnyImage.jpg
// dosyasinin varoldugunu test edin

        String dosyaYolu ="src/test/java/day11_fileTestleri_Waits/funnyImage.jpg";
        System.out.println(Files.exists(Paths.get(dosyaYolu)));

        Assertions.assertTrue(Files.exists(Paths.get(dosyaYolu)));






        }


    }

