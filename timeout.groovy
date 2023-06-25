pipeline {
    agent any
    stages {
        stage('Build') {
            steps {
                retry(3) {
                    timeout(time: 1, unit: ('SECONDS')) {
                            sleep 2
                    echo "inside timeout"
                    }
                    echo "after timeout"
                }
            }
        }
    }
}
