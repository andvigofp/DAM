Algoritmo fechas
	Definir dias Como Entero
	Definir mes Como Entero
	Definir a�o Como Entero
	Escribir "Introduzca un n�mero 1 y 31";
	Leer dias;
	Escribir "Introduzca un n�mero 1 y 12";
	Leer mes;
	Escribir "Introduzca un n�mero 0";
	Leer a�o;
	Si dias >=1 y dias <=31 y mes >=1 y mes <=12 y a�o >=0
	 
		Segun mes Hacer
		Caso 1:
			Escribir dias ," Enero de", a�o 
		caso 2:
		Si dias >=1 y dias <=28	
			Escribir dias, " Febrero", a�o 
		SiNo
			Escribir " Pon Fecha Valida"
		FinSi	
		caso 3:
		Si dias >=1 y dias <=30
			Escribir dias, " Marzo" , a�o
		SiNo
			Escribir " Pon Fecha Valida"
		FinSi	
		caso 4:
			Escribir dias, " Abril" , a�o
		caso 5:
			Escribir dias, " Mayo", a�o
		caso 6:
		Si dias >=1 y dias <=30	
			Escribir dias, " Junio", a�o
		SiNo
			Escribir " Pon Fecha Valida"
		FinSi		
		caso 7:
			Escribir dias, "Julio", a�o
		caso 8:
			Escribir dias, "Agosto", a�o
		caso 9:
		Si dias >=1 y dias <=30	
			Escribir dias, "Septiembre", a�o
		SiNo
			Escribir " Pon Fecha Valida"
		FinSi	
		caso 10:
			Escribir dias, "Octubre", a�o
		caso 11:
		Si dias >=1 y dias <=30	
			Escribir dias, "Noviembre", a�o
		SiNo
			Escribir " Pon Fecha Valida"
		FinSi		
		caso 12:
			Escribir dias, "Diciembre", a�o
		De otro modo:
			Escribir " Mes no V�lido"
	FinSegun
SiNo
	Escribir "Fecha no v�lida"
	FinSI
FinAlgoritmo
