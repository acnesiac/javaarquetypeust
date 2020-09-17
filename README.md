
## Usage
`mvn spring-boot:run`
La aplicacion corre en  [http://localhost:8080](http://localhost:8080).
Consola de H2 [http://localhost:8080/h2-console](http://localhost:8080/h2-console):
```
Admin - admin:admin
User - user:password
Disabled - disabled:password (this user is deactivated)
```

```
/api/authenticate - 
/api/user - regresa informacion del usuario
/api/persons - endpoint restingido por el rol 'ROLE_USER' (valido JWT token debe estar presente en el header)
/api/hiddenmessage - endpoint restringido por la authority 'ROLE_ADMIN' (valido JWT token debe estar presente en el header)
```

#FrontEnd

ng build --outputPath ../resources/static