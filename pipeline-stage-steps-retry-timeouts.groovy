pipeline {
    agent any
    stages {
        stage ("Build") {
            steps {
                timeout (time: 1, unit: 'SECONDS') // DAYS,HOURS,MICTOSECONDS, ,MILLISECONDS , MINUTES , MINUTES , NANOSECONDS , SECONDS
                {
                    echo "sleeping in timeout"
                    sleep 2
                }
            }
        }
    }
}
