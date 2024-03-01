# TourGuide - Projet Etudiant

Ce projet vise non seulement à corriger les bugs, mais aussi à optimiser les performances d'une application, 
en particulier avec le multi-threading, tout en mettant en place une pipeline d'intégration continue.

Voici le lien vers le GitLab pour la pipeline d'intégration : 
[Gitlab-Ci](https://gitlab.com/projet7842505/p8)

## Contexte du Projet 

*TourGuide fournit des informations touristiques et des réductions sur les spectacles et l'hébergement. 
Elle connaît une croissance rapide du nombre d'utilisateurs, passant de quelques centaines à plus de 30 000 utilisateurs par jour, avec une prévision de 100 000 utilisateurs prochainement. En raison de cette croissance, l'application est devenue trop lente et a des problèmes de performance.*

## Technologies Utilisées

- **Java Spring**
- **Docker**
- **Gitlab-Ci**
- **Jacoco & JUnit**

## Prérequis

- Docker

## Installation

```bash
docker pull registry.gitlab.com/projet7842505/p8:master
```
```
docker run registry.gitlab.com/projet7842505/p8:master
```
