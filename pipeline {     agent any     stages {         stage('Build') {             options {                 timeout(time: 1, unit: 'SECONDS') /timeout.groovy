pipeline {
    agent any
    stages {
        stage('Build') {
            options {
                timeout(time: 1, unit: 'SECONDS') //values: NANOSECONDS, MICROSECONDS, MILLISECONDS, SECONDS, MINUTES, HOURS, DAYS
            }
            steps {
                echo 'hello world'
                sleep 2
                echo 'slept for 2 seconds'
            }
        }
    }
}
