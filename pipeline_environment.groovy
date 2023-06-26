pipeline {
    agent any
    environment { 
        name1 = "SHAIK"
		name2 = "AASHI"
    }
    stages {
        stage('Build') {
            environment { 
                name3 = "ALI"

            }
            steps {
                echo "name1 ${name1}"
                echo "name2 ${name2}"
                echo "name3 ${name3}"
            }
        }
        stage('Test') {
            environment { 
                name3 = "ALI"

            }
            steps {
                echo "name1 ${name1}"
                echo "name2 ${name2}"
                echo "name3 ${name3}"
            }
        }
    }
}
