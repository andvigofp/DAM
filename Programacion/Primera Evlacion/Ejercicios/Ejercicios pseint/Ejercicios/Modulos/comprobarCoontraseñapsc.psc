SubProceso res <- ComprobarContrasenha ()
	Definir Contrase�a Como Entero;
	Definir Password Como Entero;
	
	Hacer 
		
	Hasta Que 
Fin SubProceso

Proceso Compropassword
	Si ComprobarContrase�a()
		Escribir "La contrase�a es correcta"
	FinSi
	
FinProceso
	