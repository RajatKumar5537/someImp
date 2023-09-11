package ImportantQS;

public class ReverseTheSentence {

	public static void main(String[] args) {
		String s="All the best";
		String s1="for your interview";
		String []str=s.split(" ");
		String []str1=s1.split(" ");
		for (int i=str.length-1;i>=0;i--) {

			System.out.print(str[i]+" ");

		}
		for (int i=str1.length-1;i>=0;i--) {
			System.out.print(str1[i]+" ");
		}
	}

}
