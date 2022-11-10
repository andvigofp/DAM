//Escribir un Pseudocódigo que calcule el área de un 
//triángulo recibiendo como entrada el valor de base y 
//altura.
SubProceso area <- CalcularArea (base, altura)
	area <- (base*altura)/2;
Fin SubProceso

Proceso Modulo
	Definir Base Como Entero;
	Definir Altura Como Entero;
	Escribir "Ingrese la base del triángulo: ";
	Leer Base;
	Escribir "Ingrese la altura del triángulo: ";
	Leer Altura;
	Escribir "El área del triángulo es ", CalcularArea(Base,Altura);
FinProceso