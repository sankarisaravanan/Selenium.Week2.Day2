package week2.Day2;

public class RemoveDuplicates {

	public static void main(String[] args) {
		String text = "We learn java basics as part of java sessions in java week1";
		int count=0;
		
		String[] words=text.split(" ");
		for(int i=0;i<words.length;i++) {
			for(int j=1;j<words.length;j++) {
			if(words[i].equals(words[j]))
				count++;
			if(count>1) {
				words[j]="";
				count=0;
			}	
			}
			count=0;						
		}
		System.out.println("Given String : "+text);
		System.out.print("Given String after removing the duplicates : ");
		for(int i=0;i<words.length;i++)
			System.out.print(words[i]+ " ");
	}

}
