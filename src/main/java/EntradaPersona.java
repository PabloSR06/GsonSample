import java.util.Scanner;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;


public class EntradaPersona {

	public static void main(String[] args) {		
		Scanner in = new Scanner(System.in);
		
		Persona p = new Persona();
		
		System.out.println("Nombre: ");
		p.nombre = in.nextLine();
		System.out.println("Apellidos: ");
		p.Apellidos = in.nextLine();
		System.out.println("Edad: ");
		p.Edad = in.nextInt();
		
		Gson gson = new GsonBuilder().setPrettyPrinting().create();
		String json = gson.toJson(p);
		System.out.println(json);
		
		
		
	}

}
