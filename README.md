# mal2json

This project requires at least Java 10.

## Build

```sh
mvn package
cp target/mal2json-1.0.0-jar-with-dependencies.jar mal2json.jar
```

## Run

Generate JSON for a mal specification:
```sh
java -jar mal2json.jar path/to/mal_specification.mal > output_mal.json
```

Generate JSON for a mal specification spread over multiple files:
```sh
java -jar mal2json.jar path/to/fist.mal path/to/second.mal > output_mal.json
```

Generate JSON for a mal specification spread over multiple files within
a directory:
```sh
java -jar mal2json.jar path/to/*.mal > output_mal.json
```

Another example that can be tested within this repository to convert the
`corelang` MAL specification to json could be:
```sh
java -jar mal2json.jar tests/coreLang/*.mal > corelang.json
```

