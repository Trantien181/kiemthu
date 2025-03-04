package folderTest;

import org.example.service.Phan1service;
import org.junit.Assert;
import org.testng.annotations.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class phan1Test {
    Phan1service phan1service = new Phan1service();
    @Test
    public void TinhTong(){
        assertEquals(9,phan1service.tinhTong(5));
    }
}
