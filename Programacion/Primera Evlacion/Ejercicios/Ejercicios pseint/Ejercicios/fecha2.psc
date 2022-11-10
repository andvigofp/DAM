Algoritmo fecha3

		Definir dias Como Entero
		Definir mes Como Entero
		Definir año Como Entero
		Escribir "Introduzca un número 1 y 31";
		Leer dias;
		Escribir "Introduzca un número 1 y 12";
		Leer mes;
		Escribir "Introduzca un número 0";
		Leer año;
		Si dias < 1 y dias >= 31 y mes < 1 y mes > 12 y año < 0 y año > 2022 Entonces 
			Escribir "La Fecha no es Valida"
		SiNo
			Si  (mes=4 o mes=6 o mes=9 o mes=11) y dias > 30 Entonces
				Escribir " Error de dia "
		SINO
					Si mes = 2 y dias > 28 Entonces
						Escribir " Febero tiene que tener 28 dias"
			SINO
			Segun mes Hacer
				Caso 1:
					Escribir "0", dias ," de Enero de ", año 
				caso 2:
						Escribir "0", dias, " de Febrero de ", año 
				caso 3:
						Escribir "0", dias, " de Marzo de " , año
				caso 4:
					Escribir "0", dias, " de Abril de " , año
				caso 5:
					Escribir "0", dias, " de Mayo de ", año
				caso 6:
						Escribir "0",  dias, " de Junio de ", año
				caso 7:
					Escribir "0", dias, " de Julio de ", año
				caso 8:
					Escribir "0", dias, " de Agosto de ", año
				caso 9:
						Escribir "0", dias, " de Septiembre de ", año
				caso 10:
					Escribir "0", dias, " de Octubre de ", año
				caso 11:
						Escribir "0",  dias, " de Noviembre de ", año
				caso 12:
					Escribir "0" dias, "Diciembre", año
				De otro modo:
					Escribir " Mes no Válido"
			FinSegun
		FinSI
	FinSi
	FINSI
		
	
FinAlgoritmo
