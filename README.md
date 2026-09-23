# Sistema Solar

Simulacao visual 2D do Sistema Solar, desenvolvida em Java com AWT e Swing.

## Requisitos

- JDK instalado (Java 8 ou superior)

Verifique o ambiente com:

```bash
java -version
javac -version
```

## Executar pelo terminal

Na raiz do projeto, compile os arquivos em `src` para `bin`:

```bash
rm -rf bin
mkdir bin
javac -d bin $(find src -type f -name '*.java')
java -cp bin Simulacao
```

O comando `java -cp bin Simulacao` abre a janela da simulacao. Em um ambiente
sem interface grafica, como um servidor Linux sem display, a janela nao podera
ser aberta.

## Estrutura

- `src`: codigo-fonte Java
- `bin`: classes compiladas
- `lib`: dependencias adicionais, caso sejam necessarias

## Autor

Desenvolvido por [psppGui](https://github.com/psppGui).
