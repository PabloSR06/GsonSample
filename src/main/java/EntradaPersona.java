import java.util.Scanner;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;


public class EntradaPersona {

	public static void main(String[] args) {		
		Scanner in = new Scanner(System.in);
		
		Persona p = new Persona();
		
		p.nombre = in.nextLine();
		p.Apellidos = in.nextLine();
		p.Edad = in.nextInt();
		
		Gson gson = new GsonBuilder().setPrettyPrinting().create();
		String json = gson.toJson(p);
		System.out.println(json);
		
		
		
	}

}
