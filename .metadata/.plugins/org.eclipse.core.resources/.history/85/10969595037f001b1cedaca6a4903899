import java.io.*;
import java.util.*;

public class ReadWriteFile {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
				System.out.println("Enter your choice, select 1 for Write or Append, 2 for read");
		int n=sc.nextInt();
		switch(n)
		{
		case 1:
			try {
				FileWriter writer=new FileWriter("D:\\filef1.txt");
				writer.write("Hello! My name is Nidhi Rani");
				writer.close();
				System.out.println("successfully wrote to the file.");
			}
			catch(IOException e) {
				System.out.println("An error occurred");
				e.printStackTrace();
			}
			break;
		case 2:
			try {
				File obj=new File("D:\\filef1.txt");
				Scanner Reader=new Scanner(obj);
				while(Reader.hasNextLine()) {
					String data=Reader.nextLine();
				System.out.println(data);
			}
				Reader.close();
			}
			catch (FileNotFoundException e) {
			System.out.println("An error occurred.");
			e.printStackTrace();
			}
		
			
			}
	}
			
		}
		// TODO Auto-generated method stub


