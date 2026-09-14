# PC Mania - Projeto em Java

Aluno: Maria Eduarda de Oliveira Sanches
Matrícula: 9900

Este projeto foi desenvolvido para atender ao exercício prático do PDF C06_EX1_PCMania, referente à disciplina de Programação Orientada a Objetos.

## Objetivo

O sistema simula uma loja de computadores PC Mania. O cliente escolhe uma promoção de PC, e ao final o sistema mostra os dados do cliente, os computadores comprados e o total do pedido.

## Uso de IA

A IA foi utilizada como apoio para organização, revisão e estruturação inicial do código. O uso foi limitado à ajuda na escrita, organização do projeto e correção de detalhes de sintaxe.

## Ajustes para seguir o PDF

Para reduzir o risco de divergência com o enunciado, o projeto foi simplificado para manter apenas os conceitos explicitamente solicitados:

- encapsulamento com atributos privados;
- uso de construtores para inicializar os atributos;
- organização em pacotes;
- classes separadas por responsabilidade;
- uso de array simples, sem bibliotecas prontas como ArrayList;
- entrada de dados do usuário apenas na parte de compra;
- processamento do pedido com a classe ProcessarPedido.

Foi removida a estrutura que utilizava conceitos mais elaborados que não eram obrigatórios na atividade, como abstração/herança/polimorfismo em excesso e muitas operações de alteração de atributos por setters desnecessários.

## Estrutura do projeto

- [src/com/pcmania/Main.java](src/com/pcmania/Main.java): entrada do programa e fluxo de compra
- [src/com/pcmania/model/Cliente.java](src/com/pcmania/model/Cliente.java): dados do cliente
- [src/com/pcmania/model/Computador.java](src/com/pcmania/model/Computador.java): dados do computador
- [src/com/pcmania/model/HardwareBasico.java](src/com/pcmania/model/HardwareBasico.java): processador, memória RAM e HD
- [src/com/pcmania/model/MemoriaUSB.java](src/com/pcmania/model/MemoriaUSB.java): memória USB
- [src/com/pcmania/model/SistemaOperacional.java](src/com/pcmania/model/SistemaOperacional.java): nome e arquitetura do sistema
- [src/com/pcmania/service/ProcessarPedido.java](src/com/pcmania/service/ProcessarPedido.java): processamento do pedido e cálculo do total

## Como executar

1. Instale o JDK 17 ou superior.
2. Abra o terminal na pasta do projeto.
3. Execute:

```powershell
$jdk = Get-ChildItem 'C:\Program Files\Microsoft\jdk*' -ErrorAction SilentlyContinue | Sort-Object LastWriteTime -Descending | Select-Object -First 1
$javac = Join-Path $jdk.FullName 'bin\javac.exe'
$java = Join-Path $jdk.FullName 'bin\java.exe'

cd 'C:\Users\Usuario\Desktop\ProjJava'
& $javac -d out (Get-ChildItem -Recurse -Filter *.java | Select-Object -ExpandProperty FullName)
& $java -cp out com.pcmania.Main
```

## Observação final

A implementação foi ajustada para seguir o enunciado do PDF com foco em POO básica e no que foi explicitamente solicitado, sem introduzir conceitos adicionais que pudessem ser interpretados como excesso ou desvio do exercício.

