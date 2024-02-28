Azure COSMOSDB examples

Add certificate
https://stackoverflow.com/questions/21076179/pkix-path-building-failed-and-unable-to-find-valid-certification-path-to-requ

c:\Program Files\Java\jdk-11.0.10\lib\security>"c:\Program Files\Java\jdk-11.0.10\bin\keytool.exe" -list -keystore cacerts

c:\Program Files\Java\jdk-17\bin>keytool -importcert -alias example -keystore "c:\Program Files\Java\jdk-17\lib\security\cacerts" -file c:\dev_other\!del\cosmosDB\cosmos_local.crt

https://www.baeldung.com/import-cer-file-into-truststore

Azure Cosmos DB emulator
https://learn.microsoft.com/en-us/azure/cosmos-db/how-to-develop-emulator?tabs=windows%2Cjavascript&pivots=api-nosql

Azure SDK for Java
https://learn.microsoft.com/en-us/java/api/com.azure.cosmos.cosmoscontainer?view=azure-java-stable

Trainig
https://learn.microsoft.com/en-us/training/modules/build-cosmos-db-java-app/1-introduction

Reactor pattern guide
https://github.com/Azure-Samples/azure-cosmos-java-sql-api-samples/blob/main/reactor-pattern-guide.md

https://learn.microsoft.com/en-us/azure/cosmos-db/nosql/quickstart-java?pivots=devcontainer-codespace
https://www.baeldung.com/spring-data-cosmos-db
https://learn.microsoft.com/ru-ru/azure/cosmos-db/how-to-develop-emulator?tabs=docker-linux%2Ccsharp&pivots=api-nosql
