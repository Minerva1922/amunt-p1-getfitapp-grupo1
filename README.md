
# GetFitEasy

GetFitEasy es una **cadena de asesoramiento de salud y bienestar** donde se ofrece un espacio de máquinas y 
clases en el cual hemos creado una página web para gestionar el seguimiento de nuestros clientes.

## Cómo lanzar el proyecto en local

- Desde la carpeta `frontend` hacemos: 

```
npm install
npm run dev
```

Antes de lanzar la api de SpringBoot, necesitamos crear una base de datos en `localhost:5432/postgres`

- Desde la carpeta `backend` hacemos:
```
gradlew.bat bootRun
```



## **🔧 Competencias técnicas**

- Desarrollar un proyecto full stack con Kotlin, SpringBoot y Svelte
- Desarrollar componentes de acceso a los datos (Postgres)
- Desarrollar una interfaz de usuario web dinámica
- Pair programming

## 💡 Funcionalidades
- Una página web atractiva que muestra los servicios que ofrecen, 
una lista de actividades programadas, una sección
de quiénes somos, una lista de tips saludables y registrarse con Login
  (dueño de empresa y administradores de Madrid y Barcelona).

## 🏋  Planificando el trabajo
- Hemos hecho una propuesta de diseño.  
- Creamos las historias de usuario y definimos las tareas con
 ayuda de nuestros formadores: Gabriela Corotelo y Javi Sánchez.
- Comunicación activa con nuestro cliente: Ali Siam. 
- Desarrollamos en **Frontend** Svelte Routing y creamos componentes.
- En **Backend** creamos los tests.

## 🧑‍💻 Creando base de datos

- Éste proyecto se ejecuta (localhost) en el puerto 8080.
- API REST:

| Method | Path             | Descripción                         |
|--------|------------------|-------------------------------------|
| Get    |`/api./subscribers`| Devuelve una lista de subscriptores |


- Hemos creado una base de datos en **postgres** y luego hemos implementado desde
  **SpringBoot** en el file **data.sql**.
- Hemos agregado el método _fun findByAddressContaining(location: String)_
  para que nos devuelva las lista de Barcelona y Madrid previamente creadas
  en el file **data.sql**

 #### ❗IMPORTANTE: RECORDAR CAMBIAR EL PASSWORD EN _APLICATION.PROPERTIES PARA CARGAR LA BASE DE DATOS DE POSTGRES.❗

### 👭 Nuestro equipo
|[<img src="https://avatars.githubusercontent.com/u/126072279?v=4" width=115><br><sub>Jhoana Vicente</sub>](https://github.com/JhoanaVicente)| [<img src="https://avatars.githubusercontent.com/u/126028195?v=4" width=115><br><sub>Irina Ichim</sub>](https://github.com/Irina-Ichim) | [<img src="https://avatars.githubusercontent.com/u/126073882?v=4" width=115><br><sub>Maribel Telleria</sub>](https://github.com/mari19-83) |[<img src="https://avatars.githubusercontent.com/u/126767503?v=4" width=115><br><sub>Minerva Pedret</sub>](https://github.com/account)| 
|:------------------------------------------------------------------------------------------------------------------------------------------:|:----------------------------------------------------------------------------------:|:------------------------------------------------------------------------------------------------------------------------------------------:|:-------------------------------------------------------------------------------------------------------------------------------------------:|
