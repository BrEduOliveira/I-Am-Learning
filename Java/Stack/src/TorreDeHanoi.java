import java.util.Stack;

public class TorreDeHanoi {

	static int cont=1;
	
	public static void main(String[] args) {
		
		Stack<Integer> ori = new Stack<>();
		Stack<Integer> dest = new Stack<>();
		Stack<Integer> aux = new Stack<>();
		
		ori.push(3);
		ori.push(2);
		ori.push(1);
		
		int mov = (int)Math.pow(2,ori.size()) -1; 
		
		System.out.println("---- Posição Inicial ----\n");
		System.out.println("Original: "+ori);
		System.out.println("Auxiliar: "+aux);
		System.out.println("Destino: "+dest);
		System.out.println("\nMovimentos minimos: "+mov);
		System.out.println();
		
		torreHanoi(ori.size(), ori, aux, dest);
		
	}
	
	public static void torreHanoi(int n,Stack<Integer> ori,Stack<Integer> aux,Stack<Integer> dest) {
		
		if(n>0) {
			torreHanoi(n-1, ori, dest, aux);
			dest.push(ori.pop());
			System.out.println("---------\n  "+cont+" ªvez\n---------");
			System.out.println("Original: "+ori);
			System.out.println("Auxiliar: "+aux);
			System.out.println("Destino: "+dest);
			cont++;
			
			torreHanoi(n-1, aux, ori, dest);
		}
		
	}

}
