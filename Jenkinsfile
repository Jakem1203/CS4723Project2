pipeline {
    agent any
    stages {
        stage('build') {
             mvn -B -DskipTests clean package
        }
    }
}
