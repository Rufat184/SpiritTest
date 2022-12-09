package Library;

import org.testng.annotations.DataProvider;

public class DataProviderTest {

  @DataProvider
  public Object[][] dataProvider1() {
	  ReadExcelLib excel = new ReadExcelLib();
	  String file = "/Users/322858/IdeaProjects/SpiritProject/TestData/TestData.xlsx";
	  return excel.Get_Excel_Data(file, "Sheet1", 3);
   
  }
    @DataProvider
    public Object[][] dataProvider2() {
        ReadExcelLib excel = new ReadExcelLib();
        String file = "/Users/322858/IdeaProjects/SpiritProject/TestData/TestData.xlsx";
        return excel.Get_Excel_Data(file, "Sheet2", 2);

    }

    @DataProvider
    public Object[][] dataProvider3() {
        ReadExcelLib excel = new ReadExcelLib();
        String file = "/Users/322858/IdeaProjects/SpiritProject/TestData/TestData.xlsx";
        return excel.Get_Excel_Data(file, "Sheet3", 7);

    }
  
}
