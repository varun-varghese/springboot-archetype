# springboot-archetype
Creates a simple springboot maven project with a basic main class, test class and pom file with springboot as parent. Generates an empty application properties file.

## install
```bash
mvn install
```

## usage
```bash
# example
mvn archetype:generate -DgroupId=<YOUR-GROUP_ID> -DartifactId=<YOUR-ARTIFACT_ID> -DarchetypeArtifactId=springboot-archetype

# quick verbose example
mvn archetype:generate -DgroupId=org.learning.io -DartifactId=learning-io -DarchetypeArtifactId=springboot-archetype -e -X
```
