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
		sh "printenv"
            }
        }
    }
}
Positive Example 1
------------------
pipeline {
    agent any
    environment { 
        name1 = "Jeff"
		name2 = "John"
    }
    stages {
        stage('Build') {
            environment { 
                name3 = "Jamie"

            }
            steps {
                echo "name1 ${name1}"
                echo "name2 ${name2}"
                echo "name3 ${name3}"
            }
        }
    }
}

Negative Example 2
------------------
pipeline {
    agent any
    environment { 
        name1 = "Jeff"
		name2 = "John"
    }
    stages {
        stage('Build') {
            environment { 
                name3 = "Jamie"
            }
            steps {
                echo "name1 ${name1}"
                echo "name2 ${name2}"
                echo "name3 ${name3}"
            }
        }

        stage('Test') {
            steps {
                echo "name1 ${name1}"
                echo "name2 ${name2}"
                echo "name3 ${name3}"
            }
        }		
    }
}

Positive Example 3
------------------
pipeline {
    agent any
    environment { 
        name1 = "Jeff"
		name2 = "John"
    }
    stages {
        stage('Build') {
            environment { 
				name2 = "Mike"
                name3 = "Jamie"

            }
            steps {
                echo "name1 ${name1}"
                echo "name2 ${name2}"
                echo "name3 ${name3}"
            }
        }
    }
}

Positive Example 4
------------------
pipeline {
    agent any
    environment { 
        name1 = "Jeff"
		name2 = "John"
    }
    stages {
        stage('Build') {
            environment { 
                name3 = "Jamie"
            }
            steps {
                echo "name1 ${name1}"
                echo "name2 ${name2}"
                echo "name3 ${name3}"
                sh "printenv"
            }
        }
    }
}



Positive example 5
-------------------

pipeline {
    agent any

    stages {
        stage('Build') {
            environment { 
                SOME_USERNAME_PASSWORD = credentials('some_username_password') 
                SOME_SECRET = credentials('some_secret') 
            }
            steps {
				echo "SOME_USERNAME_PASSWORD ${SOME_USERNAME_PASSWORD}" //SOME_USERNAME_PASSWORD is in the format of username:password
                echo "SOME_USERNAME_PASSWORD_USR ${SOME_USERNAME_PASSWORD_USR}"
                echo "SOME_USERNAME_PASSWORD_PSW ${SOME_USERNAME_PASSWORD_PSW}"
                echo "SOME_SECRET ${SOME_SECRET}"
            }
        }
    }
}
