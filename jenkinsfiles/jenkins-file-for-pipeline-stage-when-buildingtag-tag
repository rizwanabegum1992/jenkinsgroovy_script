pipeline {
    agent any

    stages {
        stage('Build') {
                    when {
                          buildingTag()
                    }
                    steps {
                        echo 'Helo world building tag'
                    }
        }
    }
}
