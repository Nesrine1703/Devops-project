pipeline {
    agent any
    tools {
        jdk 'JAVA_HOME'
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
                stage('SonarQube'){
            steps{
                echo 'starting sonarqube'
                sh 'mvn sonar:sonar  -Dsonar.host.url=http://192.168.89.176:9000  -Dsonar.login=admin -Dsonar.password=Lemonade2023' 
            }
        }
    }
}
