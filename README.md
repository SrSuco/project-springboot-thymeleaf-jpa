# **Project Spring Boot Thymeleaf JPA**

A project designed to learn and implement a complete system using **Spring Boot**, **Thymeleaf**, **JPA**, and best practices such as **design patterns** and **clean code**.

---

## **📚 Description**

This project is a **project and task management system (Kanban style)** inspired by tools like Trello. It includes features such as:

- Complete **CRUD** for Projects and Tasks.
- Web interface built with **Thymeleaf**.
- Real-time updates using **WebSockets**.
- Authentication and authorization with **Spring Security** (roles: `USER` and `ADMIN`).
- Clean code organization following **design patterns** and **clean code** practices.

---

## **🚀 Features**

- **Project Management**:
  - List projects.
  - Create, edit, and delete projects.
- **Task Management**:
  - Create, edit, and delete tasks.
  - Assign tasks to projects.
  - Update task status (To Do, In Progress, Done).
- **Authentication and Authorization**:
  - User registration with roles (`USER` and `ADMIN`).
  - Protect endpoints with role-based access control.
- **WebSockets**:
  - Real-time updates when tasks are created, edited, or deleted.
- **User-Friendly Web Interface**:
  - Built with Thymeleaf, using reusable templates.

---

## **🛠️ Technologies Used**

### Backend:
![Java](https://img.shields.io/badge/Java-17-007396?style=for-the-badge&logo=java&logoColor=white)
![Spring Boot](https://img.shields.io/badge/Spring_Boot-2.7.0-brightgreen?style=for-the-badge&logo=springboot&logoColor=white)

### Frontend:
![Thymeleaf](https://img.shields.io/badge/Thymeleaf-3.0.15-blueviolet?style=for-the-badge&logo=thymeleaf&logoColor=white)

### Database:
![H2 Database](https://img.shields.io/badge/H2_Database-1.4.200-lightblue?style=for-the-badge&logo=h2&logoColor=white)

### Others:
![WebSocket](https://img.shields.io/badge/WebSocket-Protocol-lightgreen?style=for-the-badge&logo=websocket&logoColor=white)
![Maven](https://img.shields.io/badge/Maven-3.8.5-C71A36?style=for-the-badge&logo=apachemaven&logoColor=white)

---

## **⚙️ Setup and Execution**

### **1. Prerequisites**
- JDK 17 installed.
- Maven installed.
- Your preferred IDE (IntelliJ, Eclipse, etc.).

### **2. Configure the Database**
By default, the project uses the H2 in-memory database. You can access the console at:
- URL: `http://localhost:8080/h2-console`
- Default settings in the `application.properties` file.

### **3. Run the Project**
Run the following commands in the terminal:
```bash
mvn clean install
mvn spring-boot:run
```

Access the application at:
```
http://localhost:8080
```

---

## **📂 Project Structure**

```plaintext
src/main/
├── java/com/project_springboot_thymeleaf_jpa/
│   ├── config/              # Configurations (WebSockets, Spring Security)
│   ├── controller/          # Controllers (Projects, Tasks, Authentication)
│   ├── entities/            # JPA Entities (User, Project, Task)
│   ├── repository/          # Repositories (JPA)
│   ├── service/             # Business Services (if needed)
├── resources/
│   ├── templates/           # Thymeleaf Templates
│   │   ├── layout/          # Base Layout
│   │   ├── project/         # Project Pages
│   │   ├── task/            # Task Pages
│   ├── application.properties # Spring Boot Configurations
```

---

## **📝 Features in Development**

- **Error Handling:** Display customized error messages.
- **Responsive Interface:** Improve usability on mobile devices.
- **File Upload:** Allow attachments to tasks.

---

## **🤝 Contributions**

Contributions are welcome! Feel free to open issues and submit pull requests.

---

## **📄 License**

This project is licensed under the **MIT License** - see the [LICENSE](LICENSE) file for details.

---

# **Versão PT/BR**

# **Projeto Spring Boot Thymeleaf JPA**

Um projeto para aprender e implementar um sistema completo utilizando **Spring Boot**, **Thymeleaf**, **JPA**, e boas práticas como **design patterns** e **clean code**.

---

## **📚 Descrição**

Este projeto é um sistema de **gerenciamento de projetos e tarefas (Kanban style)**, inspirado em ferramentas como Trello. Ele inclui funcionalidades como:

- **CRUD** completo de Projetos e Tarefas.
- Interface web criada com **Thymeleaf**.
- Atualizações em tempo real usando **WebSockets**.
- Autenticação e autorização com **Spring Security** (roles: `USER` e `ADMIN`).
- Organização limpa do código, seguindo boas práticas de **clean code** e **design patterns**.

---

## **🚀 Funcionalidades**

- **Gerenciamento de Projetos**:
  - Listar projetos.
  - Criar, editar e excluir projetos.
- **Gerenciamento de Tarefas**:
  - Criar, editar e excluir tarefas.
  - Associar tarefas a projetos.
  - Atualizar o status das tarefas (To Do, In Progress, Done).
- **Autenticação e Autorização**:
  - Registro de usuários com roles (`USER` e `ADMIN`).
  - Proteção de endpoints com controle de acesso baseado em roles.
- **WebSockets**:
  - Atualizações em tempo real ao criar, editar ou excluir tarefas.
- **Interface Web Amigável**:
  - Construída com Thymeleaf, seguindo uma estrutura de templates reutilizáveis.

---

## **🛠️ Tecnologias Utilizadas**

### Backend:
![Java](https://img.shields.io/badge/Java-17-007396?style=for-the-badge&logo=java&logoColor=white)
![Spring Boot](https://img.shields.io/badge/Spring_Boot-2.7.0-brightgreen?style=for-the-badge&logo=springboot&logoColor=white)

### Frontend:
![Thymeleaf](https://img.shields.io/badge/Thymeleaf-3.0.15-blueviolet?style=for-the-badge&logo=thymeleaf&logoColor=white)

### Banco de Dados:
![H2 Database](https://img.shields.io/badge/H2_Database-1.4.200-lightblue?style=for-the-badge&logo=h2&logoColor=white)

### Outros:
![WebSocket](https://img.shields.io/badge/WebSocket-Protocol-lightgreen?style=for-the-badge&logo=websocket&logoColor=white)
![Maven](https://img.shields.io/badge/Maven-3.8.5-C71A36?style=for-the-badge&logo=apachemaven&logoColor=white)

---

## **⚙️ Configuração e Execução**

### **1. Pré-requisitos**
- JDK 17 instalado.
- Maven instalado.
- IDE de sua preferência (IntelliJ, Eclipse, etc.).

### **2. Configurar o Banco de Dados**
Por padrão, o projeto usa o banco de dados H2 (em memória). Você pode acessar o console em:
- URL: `http://localhost:8080/h2-console`
- Configurações padrão no arquivo `application.properties`.

### **3. Rodar o Projeto**
Execute os seguintes comandos no terminal:
```bash
mvn clean install
mvn spring-boot:run
```

Acesse a aplicação em:
```
http://localhost:8080
```

---

## **📂 Estrutura do Projeto**

```plaintext
src/main/
├── java/com/project_springboot_thymeleaf_jpa/
│   ├── config/              # Configurações (WebSockets, Spring Security)
│   ├── controller/          # Controladores (Projetos, Tarefas, Autenticação)
│   ├── entities/            # Entidades JPA (User, Project, Task)
│   ├── repository/          # Repositórios (JPA)
│   ├── service/             # Serviços de Negócio (se necessário)
├── resources/
│   ├── templates/           # Templates Thymeleaf
│   │   ├── layout/          # Layout base
│   │   ├── project/         # Páginas de Projetos
│   │   ├── task/            # Páginas de Tarefas
│   ├── application.properties # Configurações do Spring Boot
```

---

## **📝 Funcionalidades em Desenvolvimento**

- **Tratamento de Erros:** Exibir mensagens de erro personalizadas.
- **Interface Responsiva:** Melhorar a usabilidade em dispositivos móveis.
- **Upload de Arquivos:** Permitir anexar arquivos às tarefas.

---

## **🤝 Contribuições**

Contribuições são bem-vindas! Sinta-se à vontade para abrir issues e enviar pull requests.

---

## **📄 Licença**

Este projeto está licenciado sob a **MIT License** - veja o arquivo [LICENSE](LICENSE) para mais detalhes.
