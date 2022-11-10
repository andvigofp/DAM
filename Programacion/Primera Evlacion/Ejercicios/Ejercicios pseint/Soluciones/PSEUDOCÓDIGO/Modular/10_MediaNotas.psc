//Calcular la media aritmética de 7 notas
//numéricas introducidas por teclado
SubProceso ObtenerMediaNotas ()	
	Definir nota Como Entero;
	Definir contNotas Como Entero;
	Definir sumaNotas Como Entero;
	sumaNotas<-0;
	Para contNotas<-1 Hasta 7
		Escribir "Introduzca nota: ";
		Leer nota;
		sumaNotas<-sumaNotas+nota;
	FinPara
	Escribir "La nota de la asignatura es: ", sumaNotas/7;
Fin SubProceso

Proceso MediaNotas
	ObtenerMediaNotas();
FinProceso
