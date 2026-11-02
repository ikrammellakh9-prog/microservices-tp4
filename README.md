# TP 4 : Hibernate et Persistance des Données

**Auteure :** Ikram Mellakh  
**Module :** Architecture Microservices : Conception, Déploiement et Orchestration  
**Dépôt GitHub :** [https://github.com/ikrammellakh9-prog/microservices-tp4.git](https://github.com/ikrammellakh9-prog/microservices-tp4.git)  

---

## 🎯 Objectifs
- Configuration d'Hibernate 6 avec `hibernate.cfg.xml`.
- Mapping objet-relationnel de l'entité `Article`.
- Implémentation du pattern DAO (`IArticleDao` / `ArticleDaoImpl`) avec gestion des transactions Hibernate.
- Validation avec base de données H2 en mémoire et tests unitaires JUnit 5.

---

## 🚀 Exécution

```bash
# Compilation et tests
mvn clean test

# Démonstration
mvn exec:java -Dexec.mainClass="ma.ikram.tp4.presentation.PresentationHibernate"
```
