# Oficina de desenvolvimento web com Spring Boot, VueJS e Docker

## Backend

### Criar projeto
Abrir site https://start.spring.io/, informar nome do pacote e projeto, depois selecionar dependências:
- Spring Data MongoDB
- Spring Web Starter

Clicar em Generate, realizar download e descompactar zip no local onde desejar. Abrir projeto no editor e correr pro abraço...

### Rodar mongo via docker
```
sudo docker run --rm -d -p 27017:27017 --name mongo mongo
```

### Rodar projeto
Dentro do editor, clicar com botão direito sobre a classe HandsonApplication e acionar a opção Debug

### Compilar projeto e gerar jar via comando
```
./mvnw clean package
```

## Frontend

### Criar projeto
Instalar vuejs cli:
```
npm install -g @vue/cli
```

Rodar comando para gerar código (rodar na pasta onde deseja manter os arquivos do projeto):
```
vue create frontend
```

### Rodar projeto
```
npm run serve -- --port 3000
```

### Compilar projeto e gerar jar via comando
```
npm run build
```

## Docker

### Buildar backend
```
sudo docker build -t backend .
```

### Buildar frontend
```
sudo docker build -t frontend .
```

### Rodar backend
```
sudo docker run -it --rm -p 8080:8080 --link mongo:mongo backend
```

### Rodar frontend
```
sudo docker run -it --rm -p 3000:80 frontend
```


## Referências
* [VueJS](https://vuejs.org)
* [Vue CLI](https://cli.vuejs.org)
* [Official Apache Maven documentation](https://maven.apache.org/guides/index.html)
* [Spring Boot Maven Plugin Reference Guide](https://docs.spring.io/spring-boot/docs/2.1.7.RELEASE/maven-plugin/)
* [Spring Data MongoDB](https://docs.spring.io/spring-boot/docs/{bootVersion}/reference/htmlsingle/#boot-features-mongodb)
* [Spring Web Starter](https://docs.spring.io/spring-boot/docs/{bootVersion}/reference/htmlsingle/#boot-features-developing-web-applications)
* [Accessing Data with MongoDB](https://spring.io/guides/gs/accessing-data-mongodb/)
* [Building a RESTful Web Service](https://spring.io/guides/gs/rest-service/)
* [Serving Web Content with Spring MVC](https://spring.io/guides/gs/serving-web-content/)
* [Building REST services with Spring](https://spring.io/guides/tutorials/bookmarks/)


