

package gramer;


import java.util.Scanner;

public class Gramer {
    	 public static boolean dizideVarMı (String word, String[] array) {
	        for (String item : array) {
	            if (item.equals(word)) {
	                return true;
	            }
	        }
	        return false;
	    }

	public static void main(String[] args) {
		
		String özne[]= {"Ben", "Sen", "Hasan", "Nurşah", "Elif", "Abdulrezzak", "Şehribanu", "Zeynelabidin", "Naki"};
		String nesne[]= {"Bahçe", "Okul", "Park", "Sınıf", "Yarın", "Pazartesi", "Salı", "Çarşamba", "Perşembe", "Cuma",
				"Cumartesi", "Pazar", "Merkez", "Ev", "Kitap", "Defter", "Güneş", "Beydağı"};
		String yüklem[]= {"Gitmek", "Gelmek", "Okumak", "Yazmak", "Yürümek", "Görmek"};		
		Scanner input=new Scanner(System.in);
		System.out.println("Cumle Giriniz: ");
		String cumle=input.nextLine().trim();
                
		String dizi[] = cumle.split("\\s+");
		
			
		boolean sırakontrolu = false;
        for (int i = 0; i < dizi.length - 2; i++) {
            if (dizideVarMı (dizi[i], özne) && dizideVarMı (dizi[i + 1], nesne) && dizideVarMı (dizi[i + 2], yüklem)) {
                sırakontrolu = true;
                break;
            }
        }
        if (sırakontrolu) {
            System.out.println("EVET");
        } else {
            System.out.println("HAYIR");
        }
	}

}
