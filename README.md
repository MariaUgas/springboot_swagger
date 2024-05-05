# springboot_gradle
Pruebas de servicios web usando REST con : Java, Springboot, H2,  Junit4 

El proyecto cuenta con un endpoint

 * Funcionalidad: registrar usuario 
* Metodo HTTP: POST
* URL: http://localhost:8080/user
* JSON de prueba:
```
{
 	"name":"Maria",
 	"email": "maun42@gmail.com",
 	"password":"maun123",
 	"phones": [
 			{
 				"number":"123456",
 		    "citycode":"1",
 				"countrycode":"57"
 			}		
 	]
 }
```


# mejoras
   - Separa entidad y modelo
   - Encapsular los servicios
   - Agregar Pruebas unitarias
