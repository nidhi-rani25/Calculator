
import java.io.File;
import java.io.IOException;
public class CreateFile {

	public static void main(String[] args) {
		try {
			File obj=new File("D:\\filef1.txt");
			if(obj.createNewFile()) {
				System.out.println("File Created: "+obj.getName());
			}
			else
			{
				System.out.println("File already exists.");
			}
		}
		catch(IOException e) {
			System.out.println("An error occured");
			e.printStackTrace();
		}
		// TODO Auto-generated method stub

	}

}
