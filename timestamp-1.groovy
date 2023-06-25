pipeline{
    agent any
    stages{
        stage('Build'){
            steps{
                timestamps {
                echo "hello world from build"
                echo "hello world from build again"
                }
            }
        }
        stage("test"){
            steps{
                echo "hello world from the test"
            }
        }
    }
}
