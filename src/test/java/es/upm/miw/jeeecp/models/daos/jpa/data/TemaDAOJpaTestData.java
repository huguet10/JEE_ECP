package es.upm.miw.jeeecp.models.daos.jpa.data;

import java.util.Iterator;

import es.upm.miw.jeeecp.models.entities.TemaEntity;
import es.upm.miw.jeeecp.models.entities.utils.ArrayToListTransformer;

public class TemaDAOJpaTestData {

	private Integer[] id = { 1, 2, 3, 4 };

	private String[] nombre = { "Futbol", "Baloncesto", "Balonmano", "Natacion" };

	private String[] pregunta = { "Puntua de uno a diez",
			"Numero de jugadores", "Cuantas pelotas hay en el campo",
			"Cuantos estilos hay" };

	private String[][][] votos = {
			{ { "7", "192.168.1.1", "BACHILLERATO" },
					{ "2", "192.168.1.1", "BACHILLERATO" },
					{ "6", "192.168.1.5", "LICENCIADO" } },
			null,
			{ { "4", "192.168.1.2", "DIPLOMADO" },
					{ "9", "192.168.1.2", "BACHILLERATO" },
					{ "6", "192.168.1.2", "BACHILLERATO" },
					{ "3", "192.168.1.2", "DIPLOMADO" } },
			{ { "7", "192.168.1.1", "BACHILLERATO" } } };

	private Iterator<TemaEntity> temasIterator;

	private TemaEntity tema;

	public TemaDAOJpaTestData() {
		temasIterator = ArrayToListTransformer.transform(id, nombre, pregunta,
				votos);
		this.nextTema();
	}

	public boolean hasNextTemas() {
		return temasIterator.hasNext();
	}

	public void nextTema() {
		tema = temasIterator.next();
	}

	public TemaEntity getTema() {
		return tema;
	}

}
