pipeline {
    agent {
        docker {
            image 'timovey/sspr4'
            reuseNode true
        }
    }
    stages {
        stage('Cloning Git') {
          steps {
              git([url: 'https://github.com/Timovey/SSPR.git', branch: 'master'])
          }
        }
        stage('Test') {
            steps {
                sh "./gradlew test"
            }
        }
    }
}