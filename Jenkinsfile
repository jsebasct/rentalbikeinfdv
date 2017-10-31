pipeline {
    agent { docker 'maven:3.3.3' }

    stages {
        stage('Build') {
            steps {
                echo 'Building..'
                sh 'mvn compile '
            }
        }
        stage('Test') {
            steps {
                echo 'Testing..'
                sh 'mvn test'
            }
        }
        stage('Deploy') {
            steps {
                echo 'Deploying....'
                sh 'mvn package'
            }
        }
    }
}
