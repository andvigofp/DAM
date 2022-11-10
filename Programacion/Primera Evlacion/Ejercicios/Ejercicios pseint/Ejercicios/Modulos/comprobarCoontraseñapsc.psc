SubProceso res <- ComprobarContrasenha ()
	Definir Contraseña Como Entero;
	Definir Password Como Entero;
	
	Hacer 
		
	Hasta Que 
Fin SubProceso

Proceso Compropassword
	Si ComprobarContraseña()
		Escribir "La contraseña es correcta"
	FinSi
	
FinProceso
	