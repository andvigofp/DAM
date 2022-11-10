//Algoritmo que pida números hasta que se introduzca un cero. 
//Debe imprimir la suma y la media de todos los números introducidos.
SubProceso ObtenerMediaSuma ()	
	Definir num Como Entero;
	Definir contNum Como Entero;
	Definir sumaNum Como Entero;
	sumaNum<-0;
	contNum<-0;
	Repetir
		Escribir "Introduzca número: (0 para salir)";
		Leer num;
		sumaNum<-sumaNum+num;
		//Si num <>0
		//	contNum<-contNum+1;
		//FinSi
	Hasta Que num=0;
	Escribir "La suma de los números introducidos es: ", sumaNum, " y la media: ", sumaNum/(contNum-1) ;
Fin SubProceso

Proceso MediaSuma
	ObtenerMediaSuma();
FinProceso
