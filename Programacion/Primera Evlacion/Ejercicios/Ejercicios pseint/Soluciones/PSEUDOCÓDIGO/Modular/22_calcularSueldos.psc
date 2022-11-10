//  A un trabajador le descuentan de su sueldo el 10% hasta los 1000 euros,
// si cobra entre 1000 y 2000 , a mayores el 5% del adicional, y por encima 
// de 2000 el 3% del adicional (sobre 2000). Calcular el descuento y sueldo neto que recibe el 
// trabajador dado su sueldo.

SubProceso calculoSueldo (s)
	Definir descuento Como Entero;
	Si (s <= 1000) Entonces
		descuento = s * 0.1;	
	SiNo
		Si (s > 1000 y s <= 2000) Entonces
			descuento = 1000 * 0.1 + (s - 1000) * 0.05;
		SiNo
			descuento = 1000 * 0.1 + (s - 1000) * 0.03;
		FinSi
	FinSi
	Escribir "Descuento: ", descuento;
	Escribir "Sueldo neto: ", s - descuento;
FinSubProceso

Proceso calcularSueldos
	Escribir "Introduzca sueldo"
	Leer sueldo;
	calculoSueldo(sueldo);
FinProceso
