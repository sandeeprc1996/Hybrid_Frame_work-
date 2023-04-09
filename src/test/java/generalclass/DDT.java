package generalclass;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.WorkbookFactory;

public class DDT 
{
	public static String fretch_data(String sh,int r,int c) throws IOException
	{
		String value=null;
		FileInputStream fs= new FileInputStream("./Excel/Blg.xlsx");
		try {
			 value = WorkbookFactory.create(fs).getSheet(sh).getRow(r).getCell(c).toString();
		} catch (Exception e) {	
			System.out.println(e);
		}
		return value;
	}
}
