Algoritmo fecha3

		Definir dias Como Entero
		Definir mes Como Entero
		Definir a�o Como Entero
		Escribir "Introduzca un n�mero 1 y 31";
		Leer dias;
		Escribir "Introduzca un n�mero 1 y 12";
		Leer mes;
		Escribir "Introduzca un n�mero 0";
		Leer a�o;
		Si dias < 1 y dias >= 31 y mes < 1 y mes > 12 y a�o < 0 y a�o > 2022 Entonces 
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
					Escribir "0", dias ," de Enero de ", a�o 
				caso 2:
						Escribir "0", dias, " de Febrero de ", a�o 
				caso 3:
						Escribir "0", dias, " de Marzo de " , a�o
				caso 4:
					Escribir "0", dias, " de Abril de " , a�o
				caso 5:
					Escribir "0", dias, " de Mayo de ", a�o
				caso 6:
						Escribir "0",  dias, " de Junio de ", a�o
				caso 7:
					Escribir "0", dias, " de Julio de ", a�o
				caso 8:
					Escribir "0", dias, " de Agosto de ", a�o
				caso 9:
						Escribir "0", dias, " de Septiembre de ", a�o
				caso 10:
					Escribir "0", dias, " de Octubre de ", a�o
				caso 11:
						Escribir "0",  dias, " de Noviembre de ", a�o
				caso 12:
					Escribir "0" dias, "Diciembre", a�o
				De otro modo:
					Escribir " Mes no V�lido"
			FinSegun
		FinSI
	FinSi
	FINSI
		
	
FinAlgoritmo
