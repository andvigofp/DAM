//Escribir un Pseudoc�digo que calcule el �rea de un 
//tri�ngulo recibiendo como entrada el valor de base y 
//altura.
SubProceso area <- CalcularArea (base, altura)
	area <- (base*altura)/2;
Fin SubProceso

Proceso Modulo
	Definir Base Como Entero;
	Definir Altura Como Entero;
	Escribir "Ingrese la base del tri�ngulo: ";
	Leer Base;
	Escribir "Ingrese la altura del tri�ngulo: ";
	Leer Altura;
	Escribir "El �rea del tri�ngulo es ", CalcularArea(Base,Altura);
FinProceso