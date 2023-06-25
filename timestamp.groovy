pipeline {
    agent any
     stages {
         stage ('Build') {
             options {
                 timestamps()
             }
             steps{
                echo "Hello world in Build"
                echo "Hello worls in Build agian"
             }
         }
         stage('Test') {
             steps {
                 echo "Hello world in Test"
                 echo "Hello world in Test again"
             }
         }
     }
}
