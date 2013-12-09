# How to build:

# Generate source
# thrift --gen <language> <Thrift filename>
thrift --gen java arithmetic.thrift

# Use ant to build
ant

# Run the server:
java -cp "./:../lib/*" Server

# Run the client:
java -cp "./:../lib/*" ArithmeticClient
