pipeline {
    agent any
    environment{
        some_name="Ramu"
    }
    stages{
        stage("Build") {
            when{
                not{
                    equals expected: "Jeff", actual: some_name
                }
            }
            steps{
                echo "${some_name}"
            }
        }
    }
}
