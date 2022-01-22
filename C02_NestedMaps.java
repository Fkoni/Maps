package day47_maps;

import java.util.HashMap;
import java.util.Map;

public class C02_NestedMaps {

	public static void main(String[] args) {
		// icice map oluşturacaksak en icerdekinden başlamamız tavsiye olunur
		
		Map<String, String> ogr1Map=new HashMap<>();
		ogr1Map.put("isim", "Veli");
		ogr1Map.put("Soyisim", "Yan");
		ogr1Map.put("brans", "QA");
		
		Map<String, String> ogr2Map=new HashMap<>();
		ogr2Map.put("isim", "Hayri");
		ogr2Map.put("Soyisim", "Kan");
		ogr2Map.put("brans", "C#");
		
		Map<String, String> ogr3Map=new HashMap<>();
		ogr3Map.put("isim", "Ayşe");
		ogr3Map.put("Soyisim", "Aslan");
		ogr3Map.put("brans", "B.Analist");
		
		Map<String, String> ogr4Map=new HashMap<>();
		ogr4Map.put("isim", "Aslı");
		ogr4Map.put("Soyisim", "Aslan");
		ogr4Map.put("brans", "B.Analist");
		
		System.out.println("1. ogrenci : " + ogr1Map);//1. ogrenci : {Soyisim=Yan, brans=QA, isim=Veli}
		System.out.println("2. ogrenci : " + ogr2Map);//2. ogrenci : {Soyisim=Kan, brans=C#, isim=Hayri}
		System.out.println("3. ogrenci : " + ogr3Map);//3. ogrenci : {Soyisim=Aslan, brans=B.Analist, isim=Ayşe}
		System.out.println("4. ogrenci : " + ogr4Map);//4. ogrenci : {Soyisim=Aslan, brans=B.Analist, isim=Aslı}
	
		Map<Integer, Map> sinifMap=new HashMap<>();
		sinifMap.put(101, ogr1Map);
		sinifMap.put(102, ogr2Map);
		sinifMap.put(103, ogr3Map);
		sinifMap.put(104, ogr4Map);
		
		System.out.println(sinifMap);
//{101={Soyisim=Yan, brans=QA, isim=Veli}, 102={Soyisim=Kan, brans=C#, isim=Hayri}, 103={Soyisim=Aslan, brans=B.Analist, isim=Ayşe}, 104={Soyisim=Aslan, brans=B.Analist, isim=Aslı}}

	}

}
