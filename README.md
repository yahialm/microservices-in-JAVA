# Rapport de TP : Architecture Microservices avec Spring Boot/Cloud

## Description
Ce projet illustre une architecture microservices implémentée à l'aide de **Spring Boot** et **Spring Cloud**. Il comprend plusieurs composants clés comme un **Eureka Server**, un **Config Server**, une **API Gateway**, et des microservices métiers (à savoir `service-one`, `service-two`, et `service-three`) qui interagissent entre eux via un mécanisme de découverte dynamique et de load balancing.

---

## Structure du projet

Voici la structure principale des composants :

- **Eureka Server** : Serveur de registre permettant la découverte dynamique des microservices.
- **Config Server** : Serveur centralisé de gestion des configurations.
- **API Gateway** : Point d'entrée unique pour toutes les requêtes client, avec routage dynamique.
- **Services métiers** :
  - `service-one`
  - `service-two`
  - `service-three`
- **Client REST** : Un microservice consommateur communiquant avec les autres services via RestTemplate.

---

## Technologies
Ce projet utilise les technologies suivantes :

- **Java 17**
- **Spring Boot**
- **Spring Cloud** (Eureka, Config Server, Gateway)
- **Maven** pour la gestion des dépendances
- **Postman** pour les tests d'API
- **Git** pour le suivi des versions

---

## Prérequis
Assurez-vous d'avoir les outils suivants installés sur votre machine :

- **Java 17**
- **Maven**
- **Git**
- Un IDE compatible Java (par exemple IntelliJ IDEA, Eclipse)

---

## Instructions pour exécuter le projet

### Cloner le dépôt
```bash
git clone https://github.com/yahialm/microservices-in-JAVA
```

### Lancer les microservices

1. **Lancer Eureka Server** :
   ```bash
   cd eureka-server
   mvn spring-boot:run
   ```

2. **Lancer Config Server** :
   ```bash
   cd config-server
   mvn spring-boot:run
   ```

3. **Lancer l'API Gateway** :
   ```bash
   cd api-gateway
   mvn spring-boot:run
   ```

4. **Lancer les services métiers** :
   Pour chaque service (`service-one`, `service-two`, `service-three`), exécutez :
   ```bash
   cd service-one
   mvn spring-boot:run
   ```

5. **Lancer le client REST** :
   ```bash
   cd client-rest
   mvn spring-boot:run
   ```

---

## Points à tester

1. **Tableau de bord Eureka** :
   Accédez à l'URL suivante pour vérifier que tous les services sont enregistrés :
   ```
   http://localhost:8761
   ```

2. **Configuration centralisée** :
   Les configurations de chaque service sont accessibles via le Config Server.
   Exemple :
   ```
   http://localhost:9999/service-one/default
   ```

3. **API Gateway** :
   Testez le routage dynamique via l'API Gateway. Exemple :
   ```
   http://localhost:8888/service-one/message
   ```

4. **Client REST** :
   Le microservice `client-rest` consomme les endpoints des autres services. Exemple :
   ```
   http://localhost:8081/get-service-message
   ```

---

## Ressources utiles

- [Spring Boot Documentation](https://spring.io/projects/spring-boot)
- [Spring Cloud Documentation](https://spring.io/projects/spring-cloud)
- [Spring Cloud Netflix (Eureka)](https://cloud.spring.io/spring-cloud-netflix/reference/html/)
- [Postman Documentation](https://www.postman.com/)

---

## Auteur
Rédigé par : Yahia LAMHAFAD
