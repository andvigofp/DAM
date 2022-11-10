//Escribir un Pseudoc�digo que calcule la suma 
//de los N primeros n�meros enteros positivos
SubProceso suma <- CalcularSumaMientras (N)
	Definir aux como Entero;
	aux<-N;
	suma<-0;
	Mientras (aux>0)
		suma<-suma+aux;
		aux<-aux-1;
	FinMientras
Fin SubProceso

SubProceso suma <- CalcularSumaRepetir (N)
	Definir aux como Entero;
	aux<-N;
	suma<-0;
	Repetir
		suma<-suma+aux;
		aux<-aux-1;		
	Hasta Que (aux=0)
Fin SubProceso

SubProceso suma <- CalcularSumaPara (N)
	Definir aux como Entero;
	suma<-0;
	Para aux<-1 Hasta N
		suma<-suma+aux;
	FinPara
Fin SubProceso

Proceso SumaEnteros
	Definir Num Como Entero;
	Escribir "Ingrese el n�mero: ";
	Leer Num;
	Escribir "La suma de los ", Num, " primeros n�meros enteros es: ", CalcularSumaMientras(Num);
FinProceso