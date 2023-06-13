# GetFitEasy

- Éste backend se ejecuta (localhost) en el puerto 8080.
- API REST:

| Method | Path             | Descripción                         |
|--------|------------------|-------------------------------------|
| Get    |`/api./subscribers`| Devuelve una lista de subscriptores |

### CREANDO BASE DE DATOS 
- Hemos creado una base de datos en **postgres** y luego hemos implementado desde
**SpringBoot** en el file **data.sql**.
- Hemos agregado el método _fun findByAddressContaining(location: String)_
para que nos devuelva las lista de Barcelona y Madrid previamente creadas
en el file **data.sql**