pipeline {
    agent any
    environment{
        version="1.0"
        some_name="ramu"
    }
    stages {
        stage("Build"){
            when {
                allOf {
                    environment name: "version", value: "1.0"
                    environment name: "some_name", value: "ramu"
                }
            }
            steps {
                echo "${version} and ${some_name}"
            }
        }
    }
}
