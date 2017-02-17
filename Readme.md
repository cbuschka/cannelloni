# Cannelloni

#### A proof of concept for "cannelloni deployment".

A fat war with all services in. A single slice ("cannelloni") or sets of slices are activated via spring profiles.

## Build

```
mvn clean install
```

## Run with slice a, b or all
```
java -Dspring.profiles.active=all|a|b -jar target/cannelloni.war
```

## License

[MIT](LICENSE)
