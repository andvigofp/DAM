//Escribir un Pseudocódigo que lea 3 números los cuales significan 
//una fecha (día, mes, año). Comprobar que sea válida la fecha, si no es valido 
//que imprima un mensaje de error, y si es válida imprimir el mes con su nombre.
Algoritmo ComprobarFecha
	Definir dia Como Entero;
	Definir mes Como Entero;
	Definir anho Como Entero;
	Escribir "Ingrese el día: ";
	Leer dia;
	Escribir "Ingrese el mes: ";
	Leer mes;
	Escribir "Ingrese el anho: ";
	Leer anho;
	
	Si dia>31 o dia<1 o mes<1 o mes>12 o anho<0 Entonces
		Escribir "La fecha no es válida";
	SiNo
		Si (mes=4 o mes=6 o mes=9 o mes=11) y dia>30 Entonces
			Imprimir "Error de dia";
		SiNo
			Si mes=2 y dia>28
				Escribir "Febrero no puede tener más de 28 días"
			SiNo
				Segun mes
					Caso 1: 
						Escribir dia, " de Enero de ", anho
					Caso 2: 
						Escribir dia, " de Febrero de ", anho
					Caso 3: 
						Escribir dia, " de Marzo de ", anho
					Caso 4: 
						Escribir dia, " de Abril de ", anho
					Caso 5: 
						Escribir dia, " de Mayo de ", anho
					Caso 6: 
						Escribir dia, " de Junio de ", anho
					Caso 7: 
						Escribir dia, " de Julio de ", anho
					Caso 8: 
						Escribir dia, " de Agosto de ", anho
					Caso 9: 
						Escribir dia, " de Septiembre de ", anho
					Caso 10: 
						Escribir dia, " de Octubre de ", anho
					Caso 11: 
						Escribir dia, " de Noviembre de ", anho
					Caso 12: 
						Escribir dia, " de Diciembre de ", anho
				FinSegun
			FinSi
		FinSi
	FinSi
FinAlgoritmo
