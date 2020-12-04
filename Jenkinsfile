pipeline {
    agent any
    stages {
        stage('build') {
             sh "mvn -B -DskipTests clean package"
        }
    }
}
