import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Random;
import java.util.Scanner;

public class GreWords {

	public static void main(String[] args) {
		Map<String,String> wordMap = Words.uploadMapData();
		Boolean cont = true;
		Scanner sc = new Scanner(System.in);
		while(cont){
			System.out.println("Enter number of words u want to revise:"+"(Total words:"+wordMap.size()+")");
			int numWords = sc.nextInt();
			System.out.println("Remove same words:");
			String removeWords = sc.next();
			if(numWords>wordMap.size() || numWords<1){
				System.out.println("Wrong Entry");
			}else{
				for(int i=0;i<numWords;i++){
					List<String> keysAsArray = new ArrayList<String>(wordMap.keySet());
					Random r = new Random();
					String word = keysAsArray.get(r.nextInt(keysAsArray.size()));
					System.out.println();
					System.out.print(word);
					try {
						System.in.read();
					} catch (IOException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
					System.out.println(wordMap.get(word));
					if("yes".equalsIgnoreCase(removeWords)){
						wordMap.remove(word);
					}
				}
			}
			System.out.println("Do you wish to continue:");
			String ans = sc.next();
			if("no".equalsIgnoreCase(ans))
				cont = false;
		}
	}

}
