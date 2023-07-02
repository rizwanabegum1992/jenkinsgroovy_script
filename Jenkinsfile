pipeline {
    agent any
    stages {
        stage ("Build Master") {
            when {
                branch 'main'
            }
            steps {
                echo 'Building Master'
            }
        }
        stage ("Build Dev") {
            when {
                branch 'dev'
            }
            steps {
                echo 'Building dev'
            }
        }
    }
}
