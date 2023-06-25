pipeline {
    agent any
    
    stages {
        stage ('Build') {
            tools {
                maven 'maven3_9_2'
            }
            steps {
                sh 'mvn --version'
            }
        }
    }
}
