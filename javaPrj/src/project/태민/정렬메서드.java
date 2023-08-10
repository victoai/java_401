package project.태민;

public class 정렬메서드 {
/*	
	public static void sort(Object[] obj) {
		
		for(int i = 0; i<obj.length-1; i++) {			
			for(int j = i+1; j < obj.length; j++) {
				 System.out.println(i+ " =" +  obj[i]);
				
				InfoCompare m = (InfoCompare) obj[i];
				if(m.compareTo(obj[i])>0) {
					Object tmp;
					tmp = obj[i];
					obj[i] = obj[j];
					obj[j] = tmp;
				}
			}
		}
	}
	
	*/
	
	public static void sort(Object[] obj) {
		
		 System.out.println("확인 개수=" + obj.length);
		 System.out.println("확인=" + obj[49]);
		
		for( int i=0; i< obj.length-1 ; i++) {
			System.out.println( "i" + i  + " " + obj[i]);
			
			for( int j=i+1 ; j< obj.length; j++) {
				System.out.println( "j" + j  + " " + obj[j]);
				
				InfoCompare m = (InfoCompare) obj[i];
				if(m.compareTo(obj[j]) > 0 ) {
					Object tmp;
					tmp = obj[i];
					obj[i] = obj[j];
					obj[j] = tmp;
				}
			}
		}
	}
	
}

