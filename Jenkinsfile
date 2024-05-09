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

        stage('Compile') {
            steps {
                echo 'cleaning and compiling code'
                sh """java -version"""
                // Lancement de la commande Maven pour nettoyer et compiler le projet
                sh 'mvn clean compile'
            }
        }
        stage('Build') {
            steps {
                echo 'Package the project '
                sh 'mvn clean package -DskipTests'
            }
        }
        stage('Nexus'){
            steps{
                echo 'starting nexus deployment'
                sh 'mvn deploy  -DskipTests' 
            }
        }
        stage('Docker image'){
            steps{
                echo 'starting docker image build'
                sh 'sudo docker build -t amenibenjeddou/achat:1.0.0 .'  
                echo 'Push Docker image to Docker Hub'
                sh 'sudo docker push amenibenjeddou/achat:1.0.0'
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
