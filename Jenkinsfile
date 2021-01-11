pipeline {
    agent any
     tools {
            maven 'Maven 3.6.3'
            jdk 'jdk8'
        }
    stages {
        stage("initialize"){
            steps{
              sh '''
                echo "PATH = ${PATH}"
                echo "M2_HOME = ${M2_PATH}"
              '''
            }
        }
        stage("build") {
            steps {
                sh "mvn clean install"
            }
        }
        stage("Test") {
            steps {
                sh "mvn test"
            }
            post {
                always {
                    junit 'target/test-reports/*.xml'
                }
            }
        }

    }
}