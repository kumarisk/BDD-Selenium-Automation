pipeline {

    agent any

    tools {
        jdk 'JDK-21'
        maven 'Maven-3'
    }

    stages {

        stage('Checkout') {
            steps {
                checkout scm
            }
        }

        stage('Verify Environment') {
            steps {
                bat 'java -version'
                bat 'mvn -version'
            }
        }

        stage('Run BDD Tests') {
            steps {
                bat 'mvn clean test -Dbrowser=chrome -Dheadless=true'
            }
        }
    }

    post {

        always {
            junit 'target/surefire-reports/*.xml'
        }

        success {
            echo 'BDD tests completed successfully.'
        }

        failure {
            echo 'BDD tests failed.'
        }
    }
}