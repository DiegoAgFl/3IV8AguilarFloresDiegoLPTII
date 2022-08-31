Algoritmo calificaciones
	escribir "Desarrolle un algotritmo que permita convertir calificaciones numericas a Letras"
	nota <- 0
	
	Repetir
		escribir "ingresa calificación en múmeros"
		leer nota
			Si nota >20 Entonces
			Escribir "no se aceptan numeros mayores a 20"
		SiNo
			Si nota >=19 y nota <=20  Entonces
				Escribir "tu nota es A"
			SiNo
				Si nota >=16 y nota <=18 Entonces
					escribir "Tu nota es B"
				SiNo
					Si nota>=13  y  nota <=15 Entonces
						escribir "Tu nota es C"
					SiNo
						Si nota>=10 y nota <=12 Entonces
							escribir "Tu nota Es de"
						SiNo
							Si nota >=1 y nota <= 9 Entonces
								escribir "tu nota es E"
							SiNo
								Escribir "no negativos"
							Fin Si
						Fin Si
					Fin Si
				Fin Si
			Fin Si
		Fin Si
		
	Hasta Que nota = 0
FinAlgoritmo

	
	
	
	
