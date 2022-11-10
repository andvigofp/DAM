SubProceso resultado <- TextoParImpar (num)
	Definir resultado como Cadena;
	Si num % 2 = 0 Entonces
		resultado <- "par"
	SiNo
		resultado <- "impar"
	FinSi
Fin SubProceso

Proceso Modulo
	Escribir "Ingrese el numero: ";
	Leer N;
	Escribir "el número introducido es ", TextoParImpar(N);
FinProceso
