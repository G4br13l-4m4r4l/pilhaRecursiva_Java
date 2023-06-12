
public class Pilha {
	public static void main(String[] args) {
		
		System.out.println(Pilha.fatorial(6));
	}
	
	public static int fatorial(int x) {
		if(x == 1) {
			return 1;
		}else {
			return x * fatorial(x-1);
		}
	}
}
