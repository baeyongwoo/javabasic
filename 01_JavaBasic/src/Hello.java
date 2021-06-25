
public class Hello {

	public static void main(String[] args) {
		System.out.println("Hello java~");
	
		int dan =  5;
		char star = '*';
		char space = ' ';
		for(int i = 0 ; i < dan; i++) {
			
			for(int j = 0; j < dan - i -1; j++) {
				System.out.print(space);
			}
			for(int j = 0; j < i *2 + 1; j++) {
				System.out.print(star);
			}
			System.out.println();
			
			
		}
		
			
			
		
		
	}
}
