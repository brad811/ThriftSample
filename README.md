# How to build:

### Generate source
Format: `thrift --gen <language> <Thrift filename>`
```shell
thrift --gen java arithmetic.thrift
```

### Use ant to build
```shell
ant
```

### Run the server
```shell
java -cp "./:../lib/*" Server
```

### Run the client
```shell
java -cp "./:../lib/*" ArithmeticClient
```
