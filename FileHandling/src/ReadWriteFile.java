import java.io.*;
import java.util.*;

public class ReadWriteFile {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
				System.out.println("Enter your choice\n1 for Write\n2 for Append\n3 for Read");
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
			
			try
			{
				File obj=new File("D://filef1.txt");
				FileWriter writer=new FileWriter(obj,true);
				BufferedWriter br= new BufferedWriter(writer);
				br.write("\nAppended the content of the file successfully");
				br.close();
				System.out.println("Append done successfully");
			}
			catch(FileNotFoundException e)
			{
				System.out.println("File not Found!");
			}
			catch(IOException e)
			{
				System.out.println("An error occurred");
				e.printStackTrace();
			}
			break;
			
		case 3:
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


