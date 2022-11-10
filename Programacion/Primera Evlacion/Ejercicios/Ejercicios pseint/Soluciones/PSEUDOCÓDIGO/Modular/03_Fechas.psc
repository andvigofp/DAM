//Escribir un Pseudocódigo que lea 3 números los cuales significan 
//una fecha (día, mes, año). Comprobar que sea válida la fecha, si no es valido 
//que imprima un mensaje de error, y si es válida imprimir el mes con su nombre.
SubProceso ComprobarFecha(d, m, a)
	Si d>31 o d<1 o m<1 o m>12 o a<0 Entonces
		Escribir "La fecha no es válida";
	SiNo
		Si (m=4 o m=6 o m=9 o m=11) y d>30 Entonces
				Imprimir "Error de dia";
		SiNo
			Si m=2 y d>28
				Escribir "Febrero no puede tener más de 28 días"
			SiNo
				Segun m
					Caso 1: 
						Escribir d, " de Enero de ", a
					Caso 2: 
						Escribir d, " de Febrero de ", a
					Caso 3: 
						Escribir d, " de Marzo de ", a
					Caso 4: 
						Escribir d, " de Abril de ", a
					Caso 5: 
						Escribir d, " de Mayo de ", a
					Caso 6: 
						Escribir d, " de Junio de ", a
					Caso 7: 
						Escribir d, " de Julio de ", a
					Caso 8: 
						Escribir d, " de Agosto de ", a
					Caso 9: 
						Escribir d, " de Septiembre de ", a
					Caso 10: 
						Escribir d, " de Octubre de ", a
					Caso 11: 
						Escribir d, " de Noviembre de ", a
					Caso 12: 
						Escribir d, " de Diciembre de ", a
				FinSegun
			FinSi
		FinSi
	FinSi
Fin SubProceso

Proceso Fecha
	Definir dia Como Entero;
	Definir mes Como Entero;
	Definir anho Como Entero;
	Escribir "Ingrese el día: ";
	Leer dia;
	Escribir "Ingrese el mes: ";
	Leer mes;
	Escribir "Ingrese el anho: ";
	Leer anho;
	ComprobarFecha(dia,mes,anho);
FinProceso