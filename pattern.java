public class pattern{
	public static void main(String args[]){
		int i, j;
		
		i = 99;
		while(i > 0){
			j = 0;
			while(j < 11){
				System.out.printf("i: %d j: %d\n", i, j);
				i--;
				j++;
			}
			i = i - 18;
		}
	}
}