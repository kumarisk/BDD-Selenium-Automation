pipeline {

agent any

tools {
    jdk 'JDK-21'
    maven 'Maven-3'
}

stages {

    stage('Verify Environment') {
        steps {
            bat 'echo JAVA_HOME=%JAVA_HOME%'
            bat 'where java'
            bat 'java -version'
            bat 'where mvn'
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
        junit allowEmptyResults: true,
              testResults: 'target/surefire-reports/*.xml'

        allure([
            results: [[path: 'allure-results']]
        ])
    }

    success {
        echo 'BDD tests completed successfully.'
    }

    failure {
        echo 'BDD tests failed.'
    }
}

}
