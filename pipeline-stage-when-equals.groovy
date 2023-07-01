pipeline{
    agent any
    environment {
        some_name="Ramu"
    }
    stages {
        stage("Build"){
            when {
                equals expected: "Ramu", actual: some_name
            }
            steps {
                echo "${some_name}"
                }
        }
    }
}
