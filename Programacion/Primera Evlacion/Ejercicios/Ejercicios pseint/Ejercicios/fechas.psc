Algoritmo fechas
	Definir dias Como Entero
	Definir mes Como Entero
	Definir año Como Entero
	Escribir "Introduzca un número 1 y 31";
	Leer dias;
	Escribir "Introduzca un número 1 y 12";
	Leer mes;
	Escribir "Introduzca un número 0";
	Leer año;
	Si dias >=1 y dias <=31 y mes >=1 y mes <=12 y año >=0
	 
		Segun mes Hacer
		Caso 1:
			Escribir dias ," Enero de", año 
		caso 2:
		Si dias >=1 y dias <=28	
			Escribir dias, " Febrero", año 
		SiNo
			Escribir " Pon Fecha Valida"
		FinSi	
		caso 3:
		Si dias >=1 y dias <=30
			Escribir dias, " Marzo" , año
		SiNo
			Escribir " Pon Fecha Valida"
		FinSi	
		caso 4:
			Escribir dias, " Abril" , año
		caso 5:
			Escribir dias, " Mayo", año
		caso 6:
		Si dias >=1 y dias <=30	
			Escribir dias, " Junio", año
		SiNo
			Escribir " Pon Fecha Valida"
		FinSi		
		caso 7:
			Escribir dias, "Julio", año
		caso 8:
			Escribir dias, "Agosto", año
		caso 9:
		Si dias >=1 y dias <=30	
			Escribir dias, "Septiembre", año
		SiNo
			Escribir " Pon Fecha Valida"
		FinSi	
		caso 10:
			Escribir dias, "Octubre", año
		caso 11:
		Si dias >=1 y dias <=30	
			Escribir dias, "Noviembre", año
		SiNo
			Escribir " Pon Fecha Valida"
		FinSi		
		caso 12:
			Escribir dias, "Diciembre", año
		De otro modo:
			Escribir " Mes no Válido"
	FinSegun
SiNo
	Escribir "Fecha no válida"
	FinSI
FinAlgoritmo
