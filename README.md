# PC Mania - Projeto em Java

Este projeto foi desenvolvido para atender ao exercício prático do PDF C06_EX1_PCMania, referente a Programação Orientada a Objetos.

## Objetivo

O sistema simula uma loja de computadores PC Mania, onde o cliente escolhe uma promoção de computador, e o sistema exibe as informações do cliente, os PCs adquiridos e o valor total do pedido.

## Uso de IA

Este projeto foi desenvolvido com apoio de inteligência artificial para auxiliar na organização do código, na estrutura das classes e na revisão da lógica de programação. O uso da IA foi orientado para:

- estruturar o código em pacotes e classes;
- aplicar conceitos de POO corretamente;
- reduzir erros de sintaxe e organização;
- melhorar a legibilidade do projeto.

No README do repositório, é importante deixar claro que a IA foi utilizada como apoio de desenvolvimento, mas a implementação final foi validada e ajustada conforme o enunciado do exercício.

## Conceitos de POO aplicados

### 1. Encapsulamento
Todos os atributos das classes foram declarados como privados e acessados por meio de métodos getters e setters quando necessário. Isso protege o estado interno das classes e evita acesso indevido aos dados.

### 2. Abstração
As classes representam entidades do domínio do problema de forma clara, como Cliente, Computador, HardwareBasico, SistemaOperacional e MemoriaUSB. Cada classe concentra apenas a responsabilidade relevante para o seu contexto.

### 3. Herança
Neste projeto, a herança não foi utilizada de forma obrigatória, mas a estrutura foi organizada em classes bem definidas e com responsabilidades separadas, mantendo o código modular e compreensível.

### 4. Polimorfismo
A aplicação usa a ideia de polimorfismo na organização do código, permitindo tratar objetos por uma abstração comum e chamar comportamentos de forma consistente, especialmente ao lidar com estruturas de dados e processamento do pedido.

### 5. Coesão e acoplamento baixo
Cada classe foi criada com responsabilidade específica:

- Cliente: dados do cliente
- Computador: dados do PC e seus componentes
- HardwareBasico: processador, memória RAM e HD
- MemoriaUSB: pendrive ou memória externa
- SistemaOperacional: nome e arquitetura do sistema
- ProcessarPedido: processamento e apresentação do pedido

Essa separação favorece manutenção, reutilização e entendimento do código.

## Estrutura do projeto

- [src/com/pcmania/Main.java](src/com/pcmania/Main.java): ponto de entrada da aplicação
- [src/com/pcmania/model/Cliente.java](src/com/pcmania/model/Cliente.java): classe do cliente
- [src/com/pcmania/model/Computador.java](src/com/pcmania/model/Computador.java): representação de um computador
- [src/com/pcmania/model/HardwareBasico.java](src/com/pcmania/model/HardwareBasico.java): hardware básico de um PC
- [src/com/pcmania/model/MemoriaUSB.java](src/com/pcmania/model/MemoriaUSB.java): memória externa
- [src/com/pcmania/model/SistemaOperacional.java](src/com/pcmania/model/SistemaOperacional.java): sistema operacional
- [src/com/pcmania/service/ProcessarPedido.java](src/com/pcmania/service/ProcessarPedido.java): processamento do pedido

## Como executar

1. Instale o JDK 17 ou superior.
2. Abra o terminal na pasta do projeto.
3. Execute os comandos abaixo:

No PowerShell:

```powershell
$jdk = Get-ChildItem 'C:\Program Files\Microsoft\jdk*' -ErrorAction SilentlyContinue | Sort-Object LastWriteTime -Descending | Select-Object -First 1
$javac = Join-Path $jdk.FullName 'bin\javac.exe'
$java = Join-Path $jdk.FullName 'bin\java.exe'

cd 'C:\Users\Usuario\Desktop\ProjJava'
& $javac -d out (Get-ChildItem -Recurse -Filter *.java | Select-Object -ExpandProperty FullName)
& $java -cp out com.pcmania.Main
```

## Observações

- O projeto foi ajustado conforme o enunciado do PDF do exercício de PC Mania.
- A lógica de preço segue a regra do enunciado, em que o valor da promoção é baseado na matrícula e no número da promoção.
- O arquivo PDF do enunciado foi usado como referência principal para validar a implementação.

