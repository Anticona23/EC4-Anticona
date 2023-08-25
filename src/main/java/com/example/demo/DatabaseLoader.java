package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class DatabaseLoader implements CommandLineRunner {

	private final LibroRepository repositoryI;
	private final AutorRepository repositoryM;
	private final BibliotecaRepository repositoryB;
	private final IntegranteRepository repositoryN;

	@Autowired
	public DatabaseLoader(
		LibroRepository repositoryI,
		AutorRepository repositoryM,
		BibliotecaRepository repositoryB,
		IntegranteRepository repositoryN
		) {
		this.repositoryI = repositoryI;
		this.repositoryM = repositoryM;
		this.repositoryB = repositoryB;
		this.repositoryN = repositoryN;
	}

	@Override
	public void run(String... strings) throws Exception {
		
		this.repositoryI.save(new Libro("Guitarra", "Cuerda", "de madera, con caja de resonancia, 6 cuerdas templadas"));
		this.repositoryI.save(new Libro("Ukelele","Cuerda","de madera, con caja de resonancia pequeña, 4 cuerdas templadas"));
		this.repositoryI.save(new Libro("Melódica","Viento","teclado pequeño de 2 octavas, sonorizado por soplido"));
		
		Libro iVoz = new Libro("Voz","Viento",".");
		this.repositoryI.save(iVoz);
		
		Libro iGuitarraElectrica = new Libro("Guitarra Electrica","Electrónico", ".");
		this.repositoryI.save(iGuitarraElectrica);
		
		this.repositoryI.save(new Libro("Batería","Percusión","."));

		this.repositoryM.save(new Autor("Daniel F"));

		Autor mFreddy = new Autor("Freddy");
		this.repositoryM.save(mFreddy);

		Autor mBrian = new Autor("Brian");
		this.repositoryM.save(mBrian);

		Biblioteca bQueen = new Biblioteca("Queen");
		this.repositoryB.save(bQueen);

		this.repositoryN.save(new Integrante(bQueen, mFreddy, iVoz));
		this.repositoryN.save(new Integrante(bQueen, mBrian, iGuitarraElectrica));
	}
}