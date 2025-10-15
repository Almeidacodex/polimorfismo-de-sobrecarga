# 🐾 Polimorfismo de Sobrecarga em Java

Este projeto foi desenvolvido com o objetivo de praticar **Polimorfismo de Sobrecarga**, um dos pilares da **Programação Orientada a Objetos (POO)**.  
Foram criadas classes que representam uma hierarquia simples de animais, demonstrando como métodos com o mesmo nome podem ter **comportamentos diferentes** dependendo dos **parâmetros recebidos**.

---

## 📚 Conceitos aplicados

- **Herança:** compartilhamento de atributos e métodos entre classes.
- **Polimorfismo de Sobrecarga:** uso de vários métodos com o mesmo nome, mas diferentes assinaturas (tipos ou quantidade de parâmetros).
- **Encapsulamento:** controle de acesso a atributos com getters e setters.
- **Sobrescrita de métodos:** especialização de comportamentos em classes filhas.

---

## 🧩 Estrutura do projeto

```
├── Animal.java
├── Mamifero.java
├── Lobo.java
├── Cachorro.java
└── Sobrecarga.java
```

Cada classe tem uma função específica:
- **Animal:** classe base com métodos genéricos.  
- **Mamifero:** herda de `Animal` e adiciona comportamentos próprios.  
- **Lobo:** representa um tipo específico de mamífero com sons característicos.  
- **Cachorro:** demonstra a **sobrecarga de métodos `reagir()`**, variando conforme o tipo e número de parâmetros.  
- **Sobrecarga.java:** classe principal usada para testar o comportamento das classes.

---

## 💡 O que aprendi

- A diferença entre **sobrecarga** e **sobrescrita** de métodos.  
- Como o polimorfismo facilita a reutilização e a manutenção do código.  
- Que organizar uma hierarquia de classes torna o sistema mais flexível e fácil de expandir.

---

## 🖥️ Tecnologias utilizadas

- Java 11+
- NetBeans IDE

---

## 🚀 Execução

1. Clone o repositório:
   ```bash
   git clone https://github.com/SEU_USUARIO/polimorfismo-sobrecarga-java.git
   ```
2. Abra o projeto em sua IDE (NetBeans, IntelliJ, Eclipse etc.).
3. Execute o arquivo `Sobrecarga.java` para ver o funcionamento.

---

## 📸 Exemplo de saída

```
Cachorro reagindo com alegria!
Cachorro rosnando!
Cachorro balançando o rabo!
```

---

## 🧠 Autor

Desenvolvido por **Gabriel Almeida** 🧩  
📌 Projeto de estudo para fixação de conceitos de **POO em Java**.

---

### 🏷️ Tags
`Java` `POO` `Polimorfismo` `Sobrecarga` `Herança` `Estudos` `Back-End`
