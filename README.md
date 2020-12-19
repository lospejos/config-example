# Jooby configuration example

## Steps

1) Start project with parameter value overriding via ENV_VAR

```shell
gradle -PDB_SERVER=mysrv1 run 
``` 

2) Check that application configuration parameter `db_server` has correct value

```shell
curl -v http://localhost:8080/param/app.db_server

mysrv1
```

3) Check that application configuration parameter `db_url` (includes value from `db_server`) has correct value
```shell
curl -v http://localhost:8080/param/app.db_url
```
It should not contain placeholder `${db_server}` and should have `mysrv1` in its value. 
