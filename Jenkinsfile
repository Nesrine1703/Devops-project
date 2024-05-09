pipeline {
    agent any
    tools {
        jdk 'OpenJDK 8'
    }
    stages {
        stage('GIT Checkout') {
            steps {
                // Récupération du code de la branche actuelle du git
                echo 'checking out code'
                git branch: 'Ameni', 
                url: 'https://github.com/Nesrine1703/Devops-project.git'
            }
        }

        stage('Build') {
            steps {
                echo 'cleaning and compiling code'
                sh """java -version"""
                // Lancement de la commande Maven pour nettoyer et compiler le projet
                sh 'mvn clean compile'
            }
        }
    }
}
