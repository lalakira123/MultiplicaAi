import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner input = new Scanner(System.in);
        int x;
			
				System.out.println("Escolha um número para tabuada");
				x = input.nextInt();

				String title = "Tabela de multiplicação de " + x; 
				System.out.println(title);

				for(int i = 1; i <= 10; i++) {
					int multiply = i * x;
					String description = x + " X " + i + " = " + multiply;

					System.out.println(description);
				}
    }
}
