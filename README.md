
## Run
`docker-compose up`

`mvn spring-boot:run`

##Applicacion 
[http://localhost:8080](http://localhost:8080).

##Swagger 

`http://localhost:8080/swagger-ui.html`

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
`ng build --outputPath ../resources/static`

#Troubleshooting

`docker exec -it sql-server-db sqlcmd
ALTER LOGIN sa WITH PASSWORD='Pa$$word',CHECK_POLICY=OFF
go`