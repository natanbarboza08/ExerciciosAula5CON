FROM eclipse-temurin:21-jdk

WORKDIR /app

# Copia os arquivos para dentro de uma pasta chamada Ex2 no contêiner
COPY . ./Ex2

# Compila os arquivos apontando para a pasta correta
RUN javac Ex2/*.java

# Executa o Java chamando o pacote completo
CMD ["java", "Ex2.Main"]
