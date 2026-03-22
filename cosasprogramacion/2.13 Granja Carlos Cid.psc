Algoritmo sin_titulo
	Escribir "¿Cuantos animales tienes?"
	Leer numAnimales
	Escribir "¿Cuántos kilos de comida necesita de media los animales animales?"
	Leer kilosPorAnimal
	Escribir "¿Cuántos kilos de comida has comprado?"
	Leer comidaDiaria
	Si numAnimales <= 0 | kilosPorAnimal <= 0 Entonces
		Escribir "Error: el número de animales y los kilos por animal deben ser mayores que cero."
	SiNo
		comidaNecesaria = numAnimales * kilosPorAnimal
		Si comidaDiaria >= comidaNecesaria Entonces
			Escribir "Hay suficiente comida para todos los animales."
		SiNo
			Escribir "No hay suficiente comida."
			racionPorAnimal = comidaDiaria / numAnimales
			Escribir "Cada animal recibira: " racionPorAnimal "kg de comida."
		Fin Si
	Fin Si
FinAlgoritmo
