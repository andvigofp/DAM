//Escribir un Pseudoc�digo que pida una contrase�a (3 intentos m�ximo)
// hasta que la clave sea 111, 222 o 333
SubProceso res <- ComprobarContrasenha ()	
	Definir password Como Entero;
	Definir numIntentos Como Entero;
	numIntentos<-1;
	Hacer
		Escribir "Ingrese la contrase�a: ";
		Leer password;
		numIntentos=numIntentos+1;
	Hasta Que password=333 o password=222 o password=111 o numIntentos>3
	
	Si numIntentos>3 y password<>333 y password<>222 y password<>111
		//Escribir "Demasiados intentos err�neos"
		res<-Falso;
	SiNo
		//Escribir "Clave correcta"
		res<-Verdadero;
	FinSi
Fin SubProceso

Proceso ComprobarPassword
	Si ComprobarContrasenha()
		Escribir "La contrase�a es correcta"
	SiNo
		Escribir "Clave err�nea. Intentos agotados"
	FinSi
FinProceso