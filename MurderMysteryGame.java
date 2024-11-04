package criminalGame;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class MurderMysteryGame {
	public static void main(String[] args) {
		ArrayList<Suspect> suspects = new ArrayList<Suspect>();
		suspects.add(new Suspect("鈴木"));
		suspects.add(new Suspect("田中"));
		suspects.add(new Suspect("斎藤"));
		suspects.add(new Suspect("山田"));
		suspects.add(new Suspect("伊藤"));
		Random random = new Random();
		int guiltyIndex = random.nextInt(suspects.size());
		Suspect culprit = suspects.get(guiltyIndex);
		culprit.setAsGuilty();
			
			System.out.println("洋館に集められた7人、突然の台風により外に出ることができない中で、Aさんが殺害されました。");
			System.out.println("あなたはアリバイの有無と凶器を探し、犯人を当てましょう。");
			
			Scanner scanner = new Scanner(System.in);
			
			for(int i = 0; i < 3; i++) {
				System.out.println("\n-捜索フェーズ" + (i + 1) + "-");
				System.out.println("容疑者の名前を入力して部屋を捜索してください。");
				
				String suspectName = scanner.nextLine();
				Suspect selectedSuspect = null;
				
				for (Suspect suspect : suspects) {
					if(suspect.getName().equals(suspectName)) {
						selectedSuspect = suspect;
						break;
					}	
			}
				if(selectedSuspect != null) {
					if(selectedSuspect == culprit) {
						System.out.println("凶器アリ:" + selectedSuspect.getName() + "が犯人の可能性が高いです。");
					}else {
						System.out.println("凶器ナシ:" + selectedSuspect.getName() + "は無実のようです。");
					}
				}else {
					System.out.println("その名前の容疑者はいません。もう一度入力してください。");
				}
			}
			System.out.println("\n捜索が終了しました。犯人を特定してください。");
			System.out.println("犯人だと思う容疑者の名前を入力してください。");
			
			String finalGuess = scanner.nextLine();
			
			if(finalGuess.equals(culprit.getName())) {
				System.out.println("おめでとうございます！" + culprit.getName() + "が犯人でした！");
			}else {
				System.out.println("残念！犯人は" + culprit.getName() + "でした。");
			}
			
			scanner.close();
	}

}
