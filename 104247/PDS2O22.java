
import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintStream;
import java.text.SimpleDateFormat;
import java.util.Date;

// Notas:
// Não altere o código apresentado na alinea 1
// Deve completar o código das alineas 2 e 3
// Pode comentar código para garantir que vai executando parcialmente

public class PDS2O22 {

	public static void main(String[] args) throws FileNotFoundException {
		String suser = System.getProperty("user.dir");
		String[] logFiles = new File(suser).list((d, s) -> {return s.equals("src");}); 
		String sp=""; if(logFiles.length>0) sp = logFiles[0]+"/";
		PrintStream fl = new PrintStream(new File(sp+"PDS2O22.txt"));
		fl.println(suser + "\n" + new SimpleDateFormat("yyyy/MM/dd HH:mm:ss").format(new Date()));

		test(System.out); // executa e escreve na consola
		test(fl); // executa e escreve no ficheiro

		fl.close();
	}

	private static void test(PrintStream out) {
		question1(out);
		 
		//question2(out);
		//question3(out);
		
	}

	private static void question1(PrintStream out) {
		out.println("\nQuestion 1) ----------------------------------\n");
		ToShare market = new ToShare();
		Product[] cars = {
			new Car("ZA11ZB", "Tesla, Grey, 2021", 100),
			new Van("AA22BB", "Chevrolet Chevy, 2020", 180),
			new Motorcycle("ZA33ZB", "Touring, 750, 2022", 85),
			new Car("BB44ZB", "Ford Mustang, Red, 2021", 150), 
		};
		for (Product item : cars) 
			market.add(item);
		out.println("--- All Products ---\nTotal: "+market.totalProducts());
		for (Product item : market.getProducts())
			out.println("\t"+item);		
		
		Client u1 = new Client("187", "Peter Pereira");
		Client u2 = new Client("957", "Anne Marques");
		Client u3 = new Client("826", "Mary Monteiro");
		market.share("ZA11ZB", u1);
		market.share(cars[2], u2);
		market.share("BB44ZB", u3);
		out.println("--- Shared Products ---\n" + market.sharedProducts());	
		market.giveBack(cars[0]);
		market.giveBack("BB44ZB");
		out.println("--- Shared Products ---\n" + market.sharedProducts());
		
		market.remove("ZA11ZB");
		OldJeep oj = new OldJeep("JJ0011;Some old SUV;88.5"); // assume "code;description;points"
		market.add(new Jeep(oj));
		/* 
		out.println("--- All Products ---");
		for (Product item : market)
			out.println(item);	
		*/
	}

	private static void question2(PrintStream out){
		out.println("\nQuestion 2 (output example) ----------------------------------\n");
		ToShare market = new ToShare();
		Product[] cars = {
			new Car("ZA11ZB", "Tesla, Grey, 2021", 100),
			new Van("AA22BB", "Chevrolet Chevy, 2020", 180),
			new Motorcycle("ZA33ZB", "Touring, 750, 2022", 85),
			new Car("BB44ZB", "Ford Mustang, Red, 2021", 150), 
		};
		for (Product item : cars) 
			market.add(item);
		out.println("--- All Products ---\nTotal: "+market.totalProducts());
		for (Product item : market.getProducts())
			out.println("\t"+item);
		File f = new File("diversos.txt");
		market.readfile(f);
		for (Product item : market.getProducts())
			out.println("\t"+item);		
		

	}

	private static void question3(PrintStream out) {
		out.println("\nQuestion 3) ----------------------------------\n");
		// Completar
	}


}
