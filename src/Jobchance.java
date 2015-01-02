import java.io.*;
import java.util.Scanner;


public class Jobchance {

	public static void main(String[] args) throws FileNotFoundException {
		String para = "Paragraph.txt";
		File file = new File(para);
		Scanner input = new Scanner(file);
		String words2[] = new String [100];
		int count = 0;
		double average;
		
		//Reads the paragraph from the file.
		String sentence = input.nextLine();
		
		//Splits the paragraph in words and stores them in an array
		String words[] = sentence.split(" ");
	
		
		for (int i = 0; i< words.length; i++){
			//checks to see how many periods there are in a sentence
			if (words[i].endsWith(".")){
				count++;
			}
		}
		
		
		average = (double)words.length/count; 
		
		System.out.println("There are " + words.length + " words in the paragraph.");
		System.out.println("There are " + count + " sentences in the paragraph.");
		System.out.println("The average number of words per sentence is:  "
							+ average);
		
		
	}
}
	
