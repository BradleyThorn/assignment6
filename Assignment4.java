
import acm.program.*;

public class Assignment4 extends ConsoleProgram
{
		
	 public void run() 
	 {
		 
		 //Continuously runs the addCommasToNumericString method until nothing is entered
		 while (true)
		 {
			String digits = readLine("Enter a numeric string: ");
			//if nothing is input, stop running
			if (digits.length() == 0) break;
			println(addCommasToNumericString(digits));
		 }
			 
		while (true)
		{
			//gets our string and char for the method
			String str = readLine("Enter a string: ");
			if (str.length() == 0) break;
			//I couldn't find a "readChar" like command, so I just took a string with conditions and cast as a char
			String readCh = readLine("Enter a character to remove from the string: ");
			//tests to make sure something was entered, as well as that only one char was entered 
			if ((readCh.length() == 0) || readCh.length() > 1)
			{
				System.out.println("Invalid entry for character");
				break;
			}
			//cast our string as a char
			char ch = readCh.charAt(0);
			println(removeAllOccurences(str, ch));
		}
		 
	 }
	 
	 //when the mouse is pressed down, it gets the x and y values of the click and makes a line starting there
	 private String addCommasToNumericString(String digits)
	 {
		 String result = "";
		 int iterations = 0;
		 for (int x = (digits.length() - 1); x >= 0; x--)
		 {
			 //goes through our string backwards and appends backwards, adding a comma every third iteration
			 //I didn't add the >0 case at the end at first, and print commas after the string was already done
			 result = digits.charAt(x) + result;
			 iterations++;
			 if ((iterations%3)==0 && (x > 0))
			 {
				 result = "," + result;
			 }
		 }
		return result;
	 }

	 //as soon as that mouse is clicked above, it moves to mouseDragged and constantly redraws the line ending at wherever the
	 //mouse is dragged too, ending when the mouse is no longer being dragged IE. click is released
	 public String removeAllOccurences(String str, char ch)
	 {
		 //This one is really simple. It just take the string, and checks every character in it and prints all of the ones
		 //that arent the char we ran the method with. So it doesn't reallllly remove them, it just make a new string
		 //without any of the unwanted chars
		 String result = "";
		 for (int x = 0; x <str.length(); x++)
		 {
			 if (str.charAt(x) != ch)
			 {
				 result += str.charAt(x);
			 }
		 }
		return result;
	 }
}
