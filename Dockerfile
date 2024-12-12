# Java 17
FROM openjdk:17-jdk-slim

# directorio de trabajo
WORKDIR /app

# Copiado del archivo JAR al contenedor
COPY out/artifacts/product_microservice_jar/product-microservice.jar app.jar

# Exponer el puerto que usa la aplicación
EXPOSE 8080

# Comando para ejecutar la aplicación
CMD ["java", "-jar", "app.jar"]
