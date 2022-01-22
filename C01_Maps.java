package day47_maps;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class C01_Maps {

	public static void main(String[] args) {
		/* 1- Bir map oluşturmadan önce, map a koyacağımız key ve value degerleri
		 * incelemeliyiz. Tüm degerleri koyabilmek icin key ve value için 
		 * object, object secebiliriz. Ama bu durumda map icerisinde elemanlara
		 * ait ilgilere ulaşmakta zorlamabiliriz. Data turunu secerken hem icine 
		 * koyacağımız tüm elemanları kapsayacak bir data turu secmeliyiz
		 * hem de icine koydugumuz tüm elemanları isleyebilecek şekilde basit
		 * data turu secmeliyiz.
		 * 
		 * 2- Map i oluştururken map in turune de karar vermeliyiz. 
		 */

		Map<Integer, String> sinif= new  HashMap<>();
		
		sinif.put(101, "Ali, Can, J.dev");
		sinif.put(102, "Veli, Yan, QA");
		sinif.put(103, "Ali, Yan, C#");
		
		int no=104;
		String isim ="Ayse";
		String soyisim="Can";
		String brans="QA";
		
		sinif.put(no, isim+", "+soyisim+", "+brans);
		
		System.out.println(sinif);
		//{101=Ali, Can, J.dev, 102=Veli, Yan, QA, 103=Ali, Yan, C#, 104=Ayse, Can, QA}
	
		System.out.println(sinif.get(102));//102 nolu ogrenci bilgileri
		System.out.println(sinif.get(104));
		
		System.out.println(sinif.keySet());//[101, 102, 103, 104] key değerler döner
		
		//map deki valueleri görmek icin
		System.out.println(sinif.values());		//[Ali, Can, J.dev, Veli, Yan, QA, Ali, Yan, C#, Ayse, Can, QA]
		
		// siniftaki ögrencilerin isimlerini bir listeye ekleyip yazdıralım
		List<String> valueList= new ArrayList<> (sinif.values());
		System.out.println(valueList);//[Ali, Can, J.dev, Veli, Yan, QA, Ali, Yan, C#, Ayse, Can, QA]
		
		System.out.println(valueList.size());//4
		
		List<String> isimListesi= new ArrayList<> ();
		String bilgiler[]= new String[3];
		
		for (int i = 0 ; i < valueList.size() ; i ++) {
			
			bilgiler=valueList.get(i).split(", ");
			isimListesi.add(bilgiler[0]);
		}
		
		System.out.println(isimListesi); //[Ali, Veli, Ali, Ayse]
		
		
		
		
		
		
	}

}
