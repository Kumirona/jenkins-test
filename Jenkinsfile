pipeline {
    agent any

    stages {
        stage('Build') {
            steps {
                sh 'echo "Build"'
            }
        }
        stage('Test') {
            steps {
                sh 'mvn test'
            }
        }
        stage('Deploy') {
            steps {
                sh 'echo "Deploy"'
            }
        }
    }
}