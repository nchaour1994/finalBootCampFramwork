package utility;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class DataReader {
    XSSFWorkbook excelWorkBook;
    XSSFSheet excelSheet;
    XSSFCell cell;

    public String  readCell(String path,String sheet,int rowNum, int colNum){
        try {
            FileInputStream file=new FileInputStream(path);
            excelWorkBook=new XSSFWorkbook(file);
            excelSheet=excelWorkBook.getSheet(sheet);
            cell=excelSheet.getRow(rowNum).getCell(colNum);
            String val=cell.getStringCellValue();
          file.close();
            return val;

        } catch (IOException e) {
            System.out.println("data not found");
            return "";
        }

    }

    public List<String> getAllColumn(String path,String sheet, int startRow,int colNum){
        List<String>list= new ArrayList<>();
        try {

            FileInputStream file=new FileInputStream(path);
            excelWorkBook=new XSSFWorkbook(file);
            excelSheet=excelWorkBook.getSheet(sheet);
               int i = startRow;
               while (excelSheet.getRow(i).getCell(colNum).getStringCellValue()!= null) {
                   list.add(excelSheet.getRow(i).getCell(colNum).getStringCellValue());
                   i++;
               }
               file.close();
        } catch (Exception e) {

        }
        return list;
    }

    public List<String> getEntireColumnForGivenHeader(String path, String sheet, String header) throws IOException {
            FileInputStream file=new FileInputStream(path);
            excelWorkBook=new XSSFWorkbook(file);
            excelSheet=excelWorkBook.getSheet(sheet);
            int i = 0;
             while (readCell(path,sheet,0,i)!= null ){
                    if(readCell(path,sheet,0,i).equalsIgnoreCase(header)){
                        getAllColumn(path,sheet,1,i);
                        break;
                    }
                    i++;
             }
        return getAllColumn(path,sheet,1,i);
    }

    public String getValueForGivenHeaderAndKey(String path, String sheet, String headerName, String key){
        String value = null;
        int i = 0;
        while (readCell(path, sheet, 0, i) != null){
            if(readCell(path, sheet, 0, i).equalsIgnoreCase(headerName)){
                for (int j = 0; j < getAllColumn(path, sheet, 1, i).size(); j++){
                    if(getAllColumn(path, sheet, 1, i).get(j).equalsIgnoreCase(key)){
                        value = getAllColumn(path, sheet, 1, i+1).get(j);
                    }
                }
                break;
            }
            i++;
        }
        return value;
    }

    public static void main(String[] args) throws IOException {
        DataReader dataReader=new DataReader();
        //System.out.println(dataReader.readCell());
       // System.out.println(dataReader.getAllColumn("C:\\Users\\nchao\\Downloads\\Book1.xlsx","Sheet1",0,1));
       // System.out.println(dataReader.getValueForGivenHeaderAndKey("C:\\Users\\nchao\\Downloads\\Book1.xlsx","Sheet1","items","masks"));
       // System.out.println(dataReader.getEntireColumnForGivenHeader("C:\\Users\\nchao\\Downloads\\Book1.xlsx","Sheet1","prices"));
    }

}
