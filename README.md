## INSTRUÇÕES PARA EXECUÇÃO

 Todas operações precisam ser feitas dentro dos containers.

1. Certifique se a conexão entre as máquinas cliente e servidor está livre. Para isso, teste o ping sobre as duas perspectivas (ping cliente para servidor e depois servidor para cliente).

2. No arquivo do código cliente (Cliente.java), atualize o endereço IP para o do servidor atual.

3. Faça a compilação do programa tanto no Cliente como no Servidor através do comando:

```javac *.java```

4. Comando para criação dos stubs. Após a execução do comando será criado o arquivo (ServidorMat_Stub.class):

```rmic ServidorMat```

5. Inicie o Servidor:

```java ArrancaServidor```

6. Inicie o Cliente:

```java Cliente```



