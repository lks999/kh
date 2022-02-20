package ncs.test3;

public class TvTest {
	
	public static void main(String[] args) {
		Tv tvArray[] = new Tv[3];
		
		tvArray[0] = new Tv("INFINIA", 1500000, "LED TV");
		tvArray[1] = new Tv("XCANVAS", 1000000, "LCD TV");
		tvArray[2] = new Tv("CINEMA", 2000000, "3D TV");
		
		for(int i = 0; i<tvArray.length; i++)
		{
			System.out.println(tvArray[i]);
		}
		
		int pricemax = 0, pricemin = 0;; 
		
		for(int i = 0; i < tvArray.length; i++) {
			if(tvArray[pricemin].getPrice() > tvArray[i].getPrice()) {
				pricemin = i;
			}
			if(tvArray[pricemax].getPrice() < tvArray[i].getPrice()) {
				pricemax = i;
			}
		}
		
		System.out.printf("가격이 가장 비싼 제품: %s%n",tvArray[pricemax].getName());
		System.out.printf("가격이 가장 저렴한 제품: %s%n",tvArray[pricemin].getName());
	}

}
