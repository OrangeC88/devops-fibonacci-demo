pipeline {
  agent any
  tools {
        maven 'Maven'
    }
  stages {
    stage('Build') {
      steps {
        bat 'mvn clean package'
      }
    }

    stage('Test') {
      steps {
        bat 'mvn test'
      }
    }

    stage('Docker Build') {
      steps {
        bat 'docker build -t devops-fibonacci-demo .'
      }
    }

  }
}
